import Models.Character;
import Models.Enums.Gender;
import Models.Enums.Status;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        Character myFirstCharacter = new Character(1, "Jairo", Status.Alive, Gender.Male, "Human", "Human", "Earth", new String[]{"https://rickandmortyapi.com/api/episode/23"});
        System.out.println(myFirstCharacter.getId());
        System.out.println(myFirstCharacter.getName());
        System.out.println(myFirstCharacter.getStatus());
        System.out.println(myFirstCharacter.getGender());
        System.out.println(myFirstCharacter.getSpecies());
        System.out.println(myFirstCharacter.getType());
        System.out.println(myFirstCharacter.getOrigin());
        System.out.println(myFirstCharacter.getEpisode());

        String url = "https://rickandmortyapi.com/api/character";
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject responseBody = new JSONObject(response.body());
            JSONArray results = responseBody.getJSONArray("results");
            System.out.println(results);
            for(int i = 0; i < results.length(); i++) {
                JSONObject character = results.getJSONObject(i);
                int id = character.getInt("id");
                String name = character.getString("name");
                Status status = Status.valueOf(character.getString("status").substring(0, 1).toUpperCase() + character.getString("status").substring(1).toLowerCase());
                Gender gender = Gender.valueOf(character.getString("gender"));
                String species = character.getString("species");
                String type = character.getString("type");
                JSONArray episodes = character.getJSONArray("episode");
                String origin = character.getJSONObject("origin").getString("name");
                Character newCharacter = new Character(id, name, status, gender, species, type, origin, new String[]{episodes.getString(0)});
                System.out.println(newCharacter.getId() + " " + newCharacter.getName() + " " + newCharacter.getStatus() + " " + newCharacter.getGender() + " " + newCharacter.getSpecies() + " " + newCharacter.getType() + " " + newCharacter.getOrigin() + " " + newCharacter.getEpisode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}