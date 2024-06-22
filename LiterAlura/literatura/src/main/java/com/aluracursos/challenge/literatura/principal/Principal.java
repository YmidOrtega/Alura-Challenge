package com.aluracursos.challenge.literatura.principal;

import com.aluracursos.challenge.literatura.services.API;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;

public class  Principal {

    private Scanner input;
    private API api;

    public Principal() throws IOException, InterruptedException {
        input = new Scanner(System.in);
        api = new API();
    }


    public void menu() throws UnsupportedEncodingException {
        var option = 0;
        while (option != 6) {
            System.out.println("""
                    ¡Bienvenido a la literatura!
                                    
                    1. Buscar libro por su nombre
                    2. Historial de libros buscados
                    3. Autores registrados
                    4. Buscar autores registrados por un año determinado
                    5. Libros por idioma
                                    
                    6. Salir del programa
                    """);
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Ingrese el nombre del libro: ");
                    String bookName = input.nextLine();
                    searchBook(bookName);
                    break;
                case 2:
                    //searchHistory();
                    break;
                case 3:
                    //searchAuthors();
                    break;
                case 4:
                    System.out.println("Ingrese el año: ");
                    int year = input.nextInt();
                    //searchAuthorsByYear(year);
                    break;
                case 5:
                    System.out.println("Ingrese el idioma: ");
                    String language = input.nextLine();
                    //searchBooksByLanguage(language);
                    break;
                case 6:
                    System.out.println("Cerranndo programa... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }



    }

    private void searchBook(String bookName) throws UnsupportedEncodingException {
        api.setUrl(api.getUrlBase() + "/books?search=" + URLEncoder.encode(bookName, "UTF-8"));
        System.out.println(api.url);
        System.out.println(api.getJson());
    }
}
