package org.formacion.srp;

import java.util.List;
import java.util.stream.Collectors;

public class Utilidad {

    public static String toCSV (List<Pelicula> peliculas) {
        return peliculas
                .stream()
                .map(p -> String.format("%s,%s,%s", p.getTitulo(), p.getDirector(), p.getGenero()))
                .collect(Collectors.joining("\n"));
    }

}
