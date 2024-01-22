package com.iesam.avillaEnTapas;

import com.iesam.avillaEnTapas.features.tapas.domain.Tapa;
import com.iesam.avillaEnTapas.features.tapas.presentation.MainTapa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Que quieres hacer: \n1- Imprimir la lista de tapas. \n2- Imprimir una Tapa en concreto (necesario un id) \n3- Crea una Tapa nueva. \n4- Actualiza la informacion de una Tapa (necesario id). \n5- Elimina una Tapa (necesario id). \n6- salir.");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        switch (numero) {
            case 1:
                MainTapa.printTapas();
                break;
            case 2:
                String id = sc.nextLine();
                MainTapa.printTapa(id);
                break;
            case 3:
                System.out.println("Dame el id de la tapa que quieras crear");
                String id2 = sc.nextLine();
                System.out.println("Dame el nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Dame el establecimiento: ");
                String establecimiento = sc.nextLine();
                System.out.println("Dame el total de puntos: ");
                String totalDePuntos = sc.nextLine();
                System.out.println("Dame la media de votos: ");
                String mediaVotos = sc.nextLine();
                System.out.println("Dame el numero de participantes: ");
                String numeroParticipantes = sc.nextLine();
                System.out.println("Dame el total de votos: ");
                String totalVotos = sc.nextLine();
                System.out.println("Dame los ingedientes: ");
                String ingredientes = sc.nextLine();
                System.out.println("Dame la url de la imagen: ");
                String urlImagen = sc.nextLine();
                Tapa newTapa = new Tapa (id2, nombre, establecimiento, totalDePuntos, mediaVotos, numeroParticipantes, totalVotos, ingredientes, urlImagen);
                MainTapa.createTapa(newTapa);
                break;
            case 4:
                System.out.println("Dame el id de la tapa que quieras actualizar su informacion");
                String id3 = sc.nextLine();
                System.out.println("Dame el nombre: ");
                String nombre2 = sc.nextLine();
                System.out.println("Dame el establecimiento: ");
                String establecimiento2 = sc.nextLine();
                System.out.println("Dame el total de puntos: ");
                String totalDePuntos2 = sc.nextLine();
                System.out.println("Dame la media de votos: ");
                String mediaVotos2 = sc.nextLine();
                System.out.println("Dame el numero de participantes: ");
                String numeroParticipantes2 = sc.nextLine();
                System.out.println("Dame el total de votos: ");
                String totalVotos2 = sc.nextLine();
                System.out.println("Dame los ingedientes: ");
                String ingredientes2 = sc.nextLine();
                System.out.println("Dame la url de la imagen: ");
                String urlImagen2 = sc.nextLine();
                Tapa updateTapa = new Tapa (id3, nombre2, establecimiento2, totalDePuntos2, mediaVotos2, numeroParticipantes2, totalVotos2, ingredientes2, urlImagen2);
                MainTapa.updateTapa(updateTapa);
                break;
            case 5:
                String id4 = sc.nextLine();
                MainTapa.deleteTapa(id4);
                break;
            case 6:
                break;
            default:
                System.out.println("Esa opcion no es valida");



        }
        sc.close();
        //MainTapa.printTapas();
        //Tapa newTapa = new Tapa("3","Belice fusión","Gastro Cervecería Selva","0","0.0","13","0","arroz, cerdo","https://Belice_fusion");
        //MainTapa.createTapa(newTapa);
        //MainTapa.deleteTapa("3");
        //MainTapa.printTapa("2");
        //Tapa updateTapa = new Tapa("3","Cambio","Gastro Cervecería Selva","0","0.0","41","0","arroz, pollo","https://Cambio");
        //MainTapa.updateTapa(updateTapa);

    }
}