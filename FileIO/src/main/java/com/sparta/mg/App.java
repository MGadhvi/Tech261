package com.sparta.mg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader (new FileReader("src/main/resources/employees-corrupted.csv"))){

            bufferedReader.readLine();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("In finally block");
        }
    }
}
