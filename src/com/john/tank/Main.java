package com.john.tank;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        TankFrame tf = TankFrame.INSTANCE;
        tf.setVisible(true);

//        for (int i = 0; i < Dir.values().length; i++) {
//            System.out.println(Dir.values()[i]);
//        }


        for (;;) {
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tf.repaint();
        }


    }
}
