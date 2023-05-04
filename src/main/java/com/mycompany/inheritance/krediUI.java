/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author melek
 */
public class krediUI{ //managerde yazdığımız kodları arayüzde çağırmamızı sağlayan class
    //basekredimanager öğretmenin de tarımın da referans tipidir
    
    public void KrediHesapla(baseKrediManager baseKrediManager){ //arayüze parametre olarak miras alınan manager sınıfını ver
         baseKrediManager.hesapla();
    };
    
    
}
