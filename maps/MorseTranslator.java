package com.qa.maps;

import java.util.Arrays;
import java.util.HashMap;

public class MorseTranslator {
    private HashMap<String, String> translations = new HashMap<>(); // Morse Code, English

    public MorseTranslator(){
        translations.put("-----","0");
        translations.put(".----","1");
        translations.put("..---","2");
        translations.put("...--","3");
        translations.put("....-","4");
        translations.put(".....","5");
        translations.put("-....","6");
        translations.put("--...","7");
        translations.put("---..","8");
        translations.put("----.","9");
        translations.put(".-","a");
        translations.put("-...","b");
        translations.put("-.-.","c");
        translations.put("-..","d");
        translations.put(".","e");
        translations.put("..-.","f");
        translations.put("--.","g");
        translations.put("....","h");
        translations.put("..","i");
        translations.put(".---","j");
        translations.put("-.-","k");
        translations.put(".-..","l");
        translations.put("--","m");
        translations.put("-.","n");
        translations.put("---","o");
        translations.put(".--.","p");
        translations.put("--.-","q");
        translations.put(".-.","r");
        translations.put("...","s");
        translations.put("-","t");
        translations.put("..-","u");
        translations.put("...-","v");
        translations.put(".--","w");
        translations.put("-..-","x");
        translations.put("-.--","y");
        translations.put("--..","z");
    }

    public String translate(String morseCode){
        StringBuilder sb = new StringBuilder();
        String[] morseWords = morseCode.split("/");

        for (String morseWord: morseWords) {
            String[] morseChars = morseWord.split(" ");

            for (String morseChar: morseChars){
                String translated = translations.get(morseChar);
                if (translated != null)
                    sb.append(translated);
            }

            sb.append(" ");
        }
        return sb.toString();
    }
}
