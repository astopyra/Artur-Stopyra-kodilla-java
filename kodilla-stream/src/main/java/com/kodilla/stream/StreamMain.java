package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String txt = "  <Text to beautify>  ";

        poemBeautifier.beautify(txt, text -> text + "ABC" );
        poemBeautifier.beautify(txt, text -> text.toUpperCase() );
        poemBeautifier.beautify(txt, text -> text.trim() );
        poemBeautifier.beautify(txt, text -> "!!" + text + "!!" );


    }
}
