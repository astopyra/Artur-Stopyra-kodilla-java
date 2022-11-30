package com.kodilla.good.patterns.challenges;

import java.util.*;

import static java.util.stream.Collectors.joining;

public class MovieStore {

    public static void main(String[] args) {
        System.out.println(getAllTitles());
    }

    private static String getAllTitles(){
        return getMovies().values().stream()
                .flatMap(Collection::stream)
                .collect(joining("!"));
    }

    private static Map<String, List<String>> getMovies(){
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }
}
