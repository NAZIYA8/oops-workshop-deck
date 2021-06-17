/**
 * ****************************************************************************
 * Purpose: This is a card class having suits and ranks.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 17-06-2021
 * ****************************************************************************
 */

package com.bridgelabz;

public class Card {
    private String suite;
    private String rank;

    public Card(String suite, String rank) {
        this.suite = suite;
        this.rank = rank;
    }

    public String getSuite() {
        return suite;
    }

    public String getRank() {
        return rank;
    }
}