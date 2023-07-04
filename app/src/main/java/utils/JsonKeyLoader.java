package utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

public class JsonKeyLoader {
    private final static String FILEPATH = "../app/src/main/resources/properties/keys_%s.json";
    private final static String LANG = System.getProperty("lang", "EN");


    public static Map<String, Object> loadJsonFromFile() throws IOException {


        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(String.format(FILEPATH, LANG)));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        bufferedReader.close();
        String jsonString = stringBuilder.toString();
        Gson gson = new Gson();
        Type mapType = new com.google.gson.reflect.TypeToken<Map<String, Object>>() {
        }.getType();
        return gson.fromJson(jsonString, mapType);
    }

    public static JsonObject readJsonFile() {
        try {
            JsonParser parser = new JsonParser();
            JsonElement jsonElement = parser.parse(new FileReader(String.format(FILEPATH, LANG)));
            return jsonElement.getAsJsonObject();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getStringValue(String collection, String key) {
        return readJsonFile().getAsJsonObject(collection).get(key).getAsString();
    }
    public static Boolean getBooleanValue(String collection, String key) {
        return readJsonFile().getAsJsonObject(collection).get(key).getAsBoolean();
    }
    public static int getIntValue(String collection, String key) {
        return readJsonFile().getAsJsonObject(collection).get(key).getAsInt();
    }
}
