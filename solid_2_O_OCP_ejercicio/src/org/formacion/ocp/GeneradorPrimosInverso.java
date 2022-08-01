package org.formacion.ocp;

import java.util.List;
import java.util.stream.Collectors;

public class GeneradorPrimosInverso implements GeneradorPrimos {

    @Override
    public List<Integer> primos (int limit) {
        return GeneradorPrimos.super
                .primos(limit)
                .stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());
    }

}
