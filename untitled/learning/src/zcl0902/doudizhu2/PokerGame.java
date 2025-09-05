package zcl0902.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {

    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();


    static{
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int serialNumber = 1;
        for(String n : numbers) {
            for(String c : colors) {
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                ++serialNumber;
            }
        }
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        hm.put(++serialNumber, "大王");
        list.add(serialNumber);
        System.out.println(hm);
        System.out.println(list);

    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            int serialNumber = list.get(i);
            if(i <= 2) {
                lord.add(serialNumber);
            }
            else if(i % 3 == 0) {
                player1.add(serialNumber);
            }
            else if(i % 3 == 1) {
                player2.add(serialNumber);
            }
            else {
                player3.add(serialNumber);
            }
        }
        //看牌
        lookPoker("底牌",lord);
        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);

    }
    public void lookPoker(String name, TreeSet<Integer> ts) {
        System.out.println(name + ":");
        for (Integer t : ts) {
            System.out.print( hm.get(t));
        }
        System.out.println();
    }
}
