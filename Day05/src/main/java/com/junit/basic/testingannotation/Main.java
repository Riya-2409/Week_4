package com.junit.basic.testingannotation;

public class Main {

    public static void main(String args[]){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
        System.out.println("Is database connected? " + databaseConnection.isConnected());

        databaseConnection.disconnect();
        System.out.println("Is database connected? " + databaseConnection.isConnected());

    }
}
