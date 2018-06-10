package libraryAPI2;


import libraryAPI2.api.LibraryAPIv2;
import libraryAPI2.api.LibraryAPIv2Impl;
import libraryAPI2.api.LibraryAPI;
import libraryAPI2.api.LibraryAPIImpl;

public class Main {

    public static void main(String[] args) {

        User user = new User("Paweł", "Cwik", "32131212");

        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();

        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);

        BookConnector connector = new BookConnector(user, apiAdapter);

        connector.checkAviability("Harry Potter i Zakon Feniksa");
    }
}