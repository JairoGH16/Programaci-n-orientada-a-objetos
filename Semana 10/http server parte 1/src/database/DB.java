package database;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.*;

public abstract class DB {
    private static final String dataFilePath = "C:\\Users\\Jairo\\Desktop\\server\\src\\database\\data.json";
    public static JSONObject data = new JSONObject();

    public static void loadData() throws IOException {
        File file = new File(dataFilePath);
        if(file.exists()){
            InputStream inputStream = new FileInputStream(file);
            String jsontext = IOUtils.toString(inputStream, "UTF-8");
            data = new JSONObject(jsontext);
        }
    }

    public static void saveData() throws IOException{
        File file = new File(dataFilePath);
        FileOutputStream outputStream = new FileOutputStream(file);
        String jsontext = data.toString();
        outputStream.write(jsontext.getBytes());
        outputStream.close();
    }
}
