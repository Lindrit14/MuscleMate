package com.fhcampuswien.MuscleMate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ExerciseService {

//    @Value("${exercise.url}")
    private static String URL = "https://exercisedb.p.rapidapi.com/exercises";

//    @Value("${exercise.apiKey}")
    private static String API_KEY = "4408a65727msha0928411da1b7e2p131262jsn0b98ffbdd584";

//    @Value("${exercise.host}")
    private static String HOST = "exercisedb.p.rapidapi.com";


    @Autowired
    private RestTemplate restTemplate;

    //function for  making GET request for a specific endpoint.
    private ResponseEntity<String> makeGETRequest(String endpoint) {
        try {
            // Set the headers
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-RapidAPI-Key", API_KEY);
            headers.set("X-RapidAPI-Host", HOST);

            // Make a GET request to the API
            ResponseEntity<String> response = restTemplate.exchange(endpoint, HttpMethod.GET, new HttpEntity<>(headers), String.class);

            System.out.println("Output from the API: " + response.getBody());

            return response;
        } catch (Exception e) {
            System.err.println("Something went wrong while getting value from the API");
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
                    "Exception while calling the API endpoint", e);
        }
    }


    public Object getAllExercises() {
        ResponseEntity<String> response = makeGETRequest(URL);
        return response.getBody();
    }


    public Object getAllBodyParts() {
        ResponseEntity<String> response = makeGETRequest(URL + "/bodyPartList");
        return response.getBody();
    }


    public Object getAllMuscles() {
        ResponseEntity<String> response = makeGETRequest(URL + "/targetList");
        return response.getBody();
    }


    public Object getAllEquipment() {
        ResponseEntity<String> response = makeGETRequest(URL + "/equipmentList");
        return response.getBody();
    }


    public Object getExerciseByID(String id) {
        ResponseEntity<String> response = makeGETRequest(URL + "/exercise/" + id);
        return response.getBody();
    }

    public Object getExerciseByName(String name) {
        ResponseEntity<String> response = makeGETRequest(URL + "/name/" + name);
        return response.getBody();
    }

    public Object getExerciseByMuscle(String targetMuscle) {
        ResponseEntity<String> response = makeGETRequest(URL + "/target/" + targetMuscle);
        return response.getBody();
    }

    public Object getExerciseByBodyPart(String targetBodyPart) {
        ResponseEntity<String> response = makeGETRequest(URL + "/bodyPart/" + targetBodyPart);
        return response.getBody();
    }


    public Object getExerciseByEquipment(String equipment) {
        ResponseEntity<String> response = makeGETRequest(URL + "/equipment/" + equipment);
        return response.getBody();
    }
}
