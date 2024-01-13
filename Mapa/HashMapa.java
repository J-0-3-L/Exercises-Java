package Mapa;

import java.util.HashMap;
import java.util.Map;
public class HashMapa {
    public static void main(String[] args) {
        Map<String, String> trackList = new HashMap<>();
        trackList.put("Light Up the Sky", "When I'm feeling all alone...");
        trackList.put("Moments Like This", "Here we are on top of the stars...");
        trackList.put("Broken Hallelujah", "Here's my broken hallelujah...");
        trackList.put("Say It Now", "Can ,We work this out?...");

        String titulo = "Moments Like This";
        String letra = trackList.get(titulo);
        System.out.println("La letra de la cancion " + titulo + ": " + letra);

        System.out.println("\nLista de canciones:");
        for (String track : trackList.keySet()) {
            String lyrics = trackList.get(track);
            System.out.println(track + " --- " + lyrics);
        }
    }
}