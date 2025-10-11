package com.phone;

import com.phone.parts.Screen;

public class Phone {

    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.size = 8.8;
        screen.price = 2999;
        System.out.println(screen);
    }
}
