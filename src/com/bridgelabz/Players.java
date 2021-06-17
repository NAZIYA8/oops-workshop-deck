/**
 * ****************************************************************************
 * Purpose: This is a Players class which is used to consider the number of
 *          players to play.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 17-06-2021
 * ****************************************************************************
 */

package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class Players {

    private static List<String> players = new ArrayList<String>();

    public static void add(String name) {
        if (players.size() > 4) {
            System.out.println("Max. of 4 players allowed to play.");
            return;
        }
        players.add(name);
    }

    public static int numberOfPlayers() {
        return players.size();
    }

}
