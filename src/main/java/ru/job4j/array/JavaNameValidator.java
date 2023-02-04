package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean rsl = true;
        if (name.isEmpty() || (isUpperLatinLetter(name.charAt(0)) == true)
                || (Character.isDigit(name.charAt(0)) == true)) {
            return false;
        } else if ( for (int i = 0; i < name.length(); i++) {
            if ((isSpecialSymbol(name.charAt(i)) != true) || (isUpperLatinLetter(name.charAt(i)) != true) ||
                    (isLowerLatinLetter(name.charAt(i)) != true)
                    || (Character.isDigit(name.charAt(i)) != true)){
                return false;
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