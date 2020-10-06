package com.tom;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        Person p = new Person();
        p.hello();
        int age = 19;
        Integer age2 = 19;
        //用"參照物件型態"的Integer類型，代表將它視為一個物件，就可以使用java裡的功能
        //如age2.byteValue()
        //這種又稱作 Wrapper Class 包裝型態
        char c = '我';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Andrei";
        //Reference data type參照資料型態，首字大寫，如String, Integer等
    }
}
