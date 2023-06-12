package com.maulana_rafi.pbo.pewarisan;

public class Main
{
    public static void main(String[] args)
    {
        Nelayan_2094[] nelayan = new Nelayan_2094[2];
        Dokter_2094[] dokter = new Dokter_2094[2];

        for (int i = 0; i < nelayan.length; i++)
        {
            nelayan[i] = new Nelayan_2094();
            System.out.println("=== " + " Masukkan Data Nelayan " + + (i + 1) + " ===");
            nelayan[i].inputDataNelayan_2094();
            System.out.println();


        }

        for (int i = 0; i < dokter.length; i++)
        {
            dokter[i] = new Dokter_2094();
            System.out.println("=== " + " Masukkan Data Dokter " + + (i + 1) + " ===");
            dokter[i].inputDataDokter_2094();
            System.out.println();
        }

        System.out.println("=== Data Nelayan ===");
        nelayan[0].tampilkanDataNelayan_2094();
        System.out.println();
        nelayan[1].tampilkanDataNelayan_2094();
        System.out.println();

        System.out.println("=== Data Dokter ===");
        dokter[0].tampilkanDataDokter_2094();
        System.out.println();
        dokter[1].tampilkanDataDokter_2094();
        System.out.println();

    }
}

