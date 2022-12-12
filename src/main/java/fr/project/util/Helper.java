package fr.project.util;

import java.util.UUID;

public class Helper {
    public static boolean isNullOrEmpty (String s){
        if((s == null) || (s.isEmpty())){
            return true;
        }else{
            return false;
        }
    }

    public static String generateName(){
        return UUID.randomUUID().toString();
    }

    public static String generateId() {
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        return id;
    }
}