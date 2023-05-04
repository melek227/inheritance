package com.mycompany.inheritance;


//projelerin farklı veritabanalrını desteklemesi için de inheritance kullanılır


public class Inheritance {

    public static void main(String[] args) {
        krediUI krediUI=new krediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        
       
    }
}
