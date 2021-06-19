/**
 * ****************************************************************************
 * Purpose: This is a Players class which is used to consider the number of
 * players to play.
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

    private static List<Player> _players = new ArrayList<Player>();

    public static void add(String name){
        if(_players.size() > 4){
            System.out.println("Max. of 4 players allowed to play.");
            return;
        }
        _players.add(new Player(name));
    }

    public static int numberOfPlayers(){
        return _players.size();
    }

    public static Player getPlayer(int index){
        return _players.get(index);
    }

    public static void Sequence(Player[] players){
        for(int i=0; i< players.length; i++){
            _players.set(i,players[i]);
            System.out.println("Player " + (i+1) +": " + players[i].name);
        }
    }


}