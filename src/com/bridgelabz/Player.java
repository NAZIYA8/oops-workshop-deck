/**
 * ****************************************************************************
 * Purpose: This is a Players class which is used to get name of the player.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 17-06-2021
 * ****************************************************************************
 */

package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public String name;
    List<Card> cards = new ArrayList<Card>();

    public Player(String name) {
        this.name = name;
    }

}