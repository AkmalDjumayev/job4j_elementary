package ru.job4j.array;

public class JavaNameValidator {

     public static boolean isNameValid(String name) {
        boolean rsl = false;
         if (name.isEmpty() || (isUpperLatinLetter(name.charAt(0)))
                 || (Character.isDigit(name.charAt(0)))) {
             return rsl;
         }
         for (int i = 1; i < name.length(); i++) {
             int sim = name.charAt(i);
             rsl = ((isSpecialSymbol(sim)) || (isUpperLatinLetter(sim))
                     || (isLowerLatinLetter(sim) || (Character.isDigit(sim))));
             if (!rsl) {
                 break;
             }
         }
         return rsl;
     }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36) || (code == 95);
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }
}