package Models;

import Models.Enums.Gender;
import Models.Enums.Status;

public class Character {
    private int id;
    private String name;
    private Status status;
    private Gender gender;
    private String species;
    private String type;
    private String origin;
    private String[] episode;

    public Character(int id, String name, Status status, Gender gender, String species, String type, String origin, String[] episode) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.gender = gender;
        this.species = species;
        this.type = type;
        this.origin = origin;
        this.episode = episode;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Status getStatus() {
        return this.status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Gender getGender() {
        return this.gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public String getSpecies() {
        return this.species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getOrigin() {
        return this.origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String[] getEpisode() {
        return this.episode;
    }
    public void setEpisode(String[] episode) {
        this.episode = episode;
    }
}