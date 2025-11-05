package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercise {
    public static void main(String[] args) {
        try (InputStream inputStream = Exercise.class.getResourceAsStream("/lorem.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error leyendo el archivo.");
        }


    }
}
