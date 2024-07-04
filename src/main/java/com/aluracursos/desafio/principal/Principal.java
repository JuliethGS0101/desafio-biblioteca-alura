package com.aluracursos.desafio.principal;

import com.aluracursos.desafio.service.ConsumoAPI;
import com.aluracursos.desafio.service.ConvierteDatos;

public class Principal {

    //private Scanner teclado = new Scanner(System.in);
    private static final String URL_BASE = "https://api.jikan.moe/v4/anime";
    //https://wiki.anidb.net/HTTP_API_Definition?ref=public_apis
    //private  final String API_KEY = "&apikey=716b5b12";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();

    public void muestraElMenu(){
        //var nombreSerie = teclado.nextLine();
        var json = consumoAPI.obtenerDatos(URL_BASE /*+ nombreSerie.replace(" ", "+") + API_KEY*/);
        System.out.println(json);
    }
}