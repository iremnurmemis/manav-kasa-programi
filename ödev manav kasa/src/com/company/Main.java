package com.company;

import java.util.Scanner;

/* Manav Kasa Programı
 kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/
public class Main {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,patlican=5,muz=0.95,armut_kg,elma_kg,domates_kg,muz_kg,patlican_kg,total;
        Scanner inp=new Scanner(System.in);

        System.out.print("armut kac kg:");
        armut_kg= inp.nextDouble();
        System.out.print("elma kac kg:");
        elma_kg= inp.nextDouble();
        System.out.print("domates kac kg:");
        domates_kg= inp.nextDouble();
        System.out.print("muz kac kg:");
        muz_kg= inp.nextDouble();
        System.out.print("patlican kac kg:");
        patlican_kg= inp.nextDouble();

        total=(armut*armut_kg)+(elma*elma_kg)+(domates*domates_kg)+(muz*muz_kg)+(patlican*patlican_kg);
        System.out.print("total ücret:"+total);
    }
}
