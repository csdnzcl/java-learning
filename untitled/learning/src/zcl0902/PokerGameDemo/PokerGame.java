package zcl0902.PokerGameDemo;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    static ArrayList<String> list = new ArrayList<>();
    //静态代码块
    //特点：随着类的加载而加载，且只加载一次
    static{
        //准备牌
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for(String c : colors) {
            for(String n : numbers) {
                list.add(c + n);
            }
        }
        list.add("小王");
        list.add("大王");
    }
    public PokerGame(){
        //洗牌
        Collections.shuffle(list);

        //发牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> lord = new ArrayList<>();

        //遍历牌盒得到每一张牌
        String poker;
        for(int i = 0; i < list.size(); ++i) {
            poker = list.get(i);
            if(i >= list.size() - 3) {
                lord.add(poker);
            }else if(i % 3 == 0) {
                player01.add(poker);
            }else if(i % 3 == 1) {
                player02.add(poker);
            }else{
                player03.add(poker);
            }
        }

        //看牌
        lookPoker("玩家1", player01);
        lookPoker("玩家2", player02);
        lookPoker("玩家3", player03);
        lookPoker("底牌", lord);

    }
    /*
    参数一：玩家名称
    参数二：玩家牌
     */
    public void lookPoker (String name, ArrayList<String> list) {
        System.out.println(name + ":");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
