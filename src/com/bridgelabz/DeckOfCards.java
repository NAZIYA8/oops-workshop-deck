/**
 * ****************************************************************************
 * Purpose: This class all the methods used to initialize, shuffle, distribute
 * print cards received by the players. This class helps the main method
 * to call these methods any number of times.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 17-06-2021
 * ****************************************************************************
 */


package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    String[] ranks = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] suites = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};

    List<Card> Cards;

    /**
     * This class is used to setup the initial game with deck of cards
     * and making sure we have unique cards. The number of cards are 52.
     */
    public void initialize() {
        Cards = new ArrayList<Card>();
        for (int i = 0; i < suites.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                Cards.add(new Card(suites[i], ranks[j]));
            }
        }
    }
}
