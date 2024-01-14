/*
* File: Convert.java
* Author: Csajbók-Reményi László Forked by Sallai András
* Copyright: 2024, Csajbók-Reményi László
* Group: Szoft II/I/E
* Date: 2024/01/14
* Github: https://github.com/Geolidth/paclient.git
* Licenc: GNU GPL
*/

import java.util.ArrayList;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Convert {

    public Convert() {
    }

    public static <T> ArrayList<T> toListObject(String json, Class<T> type) {
        Type collType = TypeToken.getParameterized(ArrayList.class, type).getType();
        Gson gson = new Gson();
        return gson.fromJson(json, collType);
    }

    public static <T> T toObject(String json, Class<T> type) {
        Gson gson = new Gson();
        return gson.fromJson(json, type);
    }

    public static <T> String listToJson(ArrayList<T> list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }

    public static <T> String toJson(T object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }

}
