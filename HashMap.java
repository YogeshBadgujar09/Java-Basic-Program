package com.yogesh.listinterface;

import java.util.Map;

public class HashMap {

    public static void main(String[] args) {

        Map<String,String> teamPlayer = new java.util.HashMap<>();

        teamPlayer.put("Virat","RCB");
        teamPlayer.put("Rohit","MI");
        teamPlayer.put("Dhoni","CSK");
        teamPlayer.put("Rahul","LSG");

        System.out.println(teamPlayer.get("Virat"));

        teamPlayer.put("Virat","India");





        System.out.println(teamPlayer.keySet());
        System.out.println(teamPlayer.values());

    }
}
