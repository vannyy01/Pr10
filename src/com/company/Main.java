package com.company;

import javax.swing.*;

public class Main {

    private static String changeLetter(String sentence, String equalLetter, String chLetter) {
        if (sentence.length() < 1 || equalLetter.length() < 1 || chLetter.length() < 1)
            throw new IllegalArgumentException("Некоректно введені параметри функції.");
        char letterArray[] = sentence.toCharArray();
        String result = "";
        for (int i = 0; i < letterArray.length; i++) {
            if (letterArray[i] == equalLetter.charAt(0))
                letterArray[i] = chLetter.charAt(0);
            result += letterArray[i];
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            String sentence = JOptionPane.showInputDialog("Введіть речення");
            String equalLetter, chLetter;
            sentence = sentence.trim();
            if (sentence.length() > 0) {
                equalLetter = JOptionPane.showInputDialog("Введіть літеру яку потрібно замінити").trim();
                chLetter = JOptionPane.showInputDialog("Введіть літеру на яку потрібно замінити").trim();
                if (equalLetter.length() == 1 && chLetter.length() == 1)
                    JOptionPane.showMessageDialog(null, changeLetter(sentence, equalLetter, chLetter));
            }
            throw new IllegalAccessException("Введені неправильні параметри.");
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
