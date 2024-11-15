package com.curudAPI.controller;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTest {
    public static void main(String[] args) {


        String jsonString = """
                [
                    {
                        "id": 1,
                        "name": "Alice",
                        "role": "Developer"
                    },
                    {
                        "id": 2,
                        "name": "Bob",
                        "role": "Manager"
                    },
                    {
                        "id": 3,
                        "name": "Charlie",
                        "role": "Tester"
                    }
                ]
                """;
        JSONArray jsonArray = new JSONArray(jsonString);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            int id = jsonObject.getInt("id");
            String name = jsonObject.getString("name");
            String role = jsonObject.getString("role");
            System.out.println(id);
            System.out.println(name);
            System.out.println(role);
        }
    }
}
