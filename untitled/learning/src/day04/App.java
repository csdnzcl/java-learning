package day04;

import day04.UI.GameJFrame;
import day04.UI.LoginJFrame;
import day04.UI.RegisterJFrame;

public class App {
    public static void main(String[] args) {

        //表示程序的启动入口
        new LoginJFrame();

        new RegisterJFrame();

        new GameJFrame();
    }
}
