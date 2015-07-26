package com.piyush.domain.jackson;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class CheckJsonSerialization {

    private Employee buildObject() {
        Employee employee = new Employee();
        employee.setName("Piyush");
        employee.setCompany("Thermofisher Scientific");
        return employee;
    }

    private String jsonSerializing(Employee employee) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setVisibility(JsonMethod.FIELD, JsonAutoDetect.Visibility.ANY);
        String jsonString = objectMapper.writeValueAsString(buildObject());
        System.out.println(jsonString);
        return jsonString;
    }

    private ProxyEmployee jsonDeserialization(String serializedString) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(serializedString, ProxyEmployee.class);
    }

    public static void main(String[] args) throws IOException {
        CheckJsonSerialization obj = new CheckJsonSerialization();
        System.out.println("The serialization of the object is ::::");
        String serializedString = obj.jsonSerializing(obj.buildObject());
        System.out.println("The deserialization of the object is ::::");
        System.out.println(obj.jsonDeserialization(serializedString));
    }
}
