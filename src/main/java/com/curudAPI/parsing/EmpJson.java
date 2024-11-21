package com.curudAPI.parsing;

import org.json.JSONArray;
import org.json.JSONObject;

public class EmpJson {
    public static void main(String[] args) {

        String jsonString = " {\n" +
                "          \"employees\": [\n" +
                "            {\n" +
                "              \"name\": \"John Doe\",\n" +
                "              \"id\": 123,\n" +
                "              \"skills\": [\"Java\", \"Spring\", \"Hibernate\"]\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"Jane Smith\",\n" +
                "              \"id\": 456,\n" +
                "              \"skills\": [\"Python\", \"Django\", \"AWS\"]\n" +
                "            }\n" +
                "          ]\n" +
                "        }";

        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray jsonArray = jsonObject.getJSONArray("employees");

        for (int i = 0; i < jsonArray.length(); i++) {
            // Get each employee object
            JSONObject employee = jsonArray.getJSONObject(i);

            // Access fields
            String name = employee.getString("name");
            int id = employee.getInt("id");
            JSONArray skills = employee.getJSONArray("skills");

            // Print details
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.print("Skills: ");
            for (int j = 0; j < skills.length(); j++) {
                System.out.print(skills.getString(j) + " ");
            }
            System.out.println("\n");
        }
    }
}
