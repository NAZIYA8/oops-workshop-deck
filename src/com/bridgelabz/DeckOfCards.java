package com.bridgelabz;

public class DeckOfCards {
    private static String[] suits = {"Clubs", "Diamonds", "hearts", "Spades"};
    private static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static String array[][] = new String[4][13];


    public static void deck() {
        
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = ranks[i] + " " + suits[j];
            }
        }
    }

    public static void main(String[] args) {
        deck();
    }
}