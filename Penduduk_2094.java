package com.maulana_rafi.pbo.pewarisan;

import java.util.Scanner;
public class Penduduk_2094
{
    Scanner input = new Scanner(System.in);
    private String nik2094;
    private String nama2094;
    private int umur2094;
    private String alamat2094;

    private String pekerjaan2094;

    public Penduduk_2094()
    {
        this.nik2094 = nik2094;
        this.nama2094 = nama2094;
        this.umur2094 = umur2094;
        this.alamat2094 = alamat2094;
        this.pekerjaan2094 = pekerjaan2094;
    }

    public void inputDataPenduduk_2094()
    {
        System.out.println("Masukkan NIK : ");
        nik2094 = input.nextLine();
        System.out.println("Masukkan Nama : ");
        nama2094 = input.nextLine();
        System.out.println("Masukkan Umur : ");
        umur2094 = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan Pekerjaan : ");
        pekerjaan2094 = input.nextLine();
        System.out.println("Masukkan Alamat : ");
        alamat2094 = input.nextLine();
    }

    public void tampilkanDataPenduduk_2094()
    {
        System.out.println("NIK : " + nik2094);
        System.out.println("Nama : " + nama2094);
        System.out.println("Umur : " + umur2094);
        System.out.println("Pekerjaan : " + pekerjaan2094);
        System.out.println("Alamat : " + alamat2094);
    }

    public void setNik2094(String nik2094)
    {
        this.nik2094 = nik2094;
    }

    public String getNik2094()
    {
        return nik2094;
    }

    public void setNama2094(String nama2094)
    {
        this.nama2094 = nama2094;
    }

    public String getNama2094()
    {
        return nama2094;
    }

    public void setUmur2094(int umur2094)
    {
        this.umur2094 = umur2094;
    }

    public int getUmur2094()
    {
        return umur2094;
    }

    public void setAlamat2094(String alamat2094)
    {
        this.alamat2094 = alamat2094;
    }

    public String getAlamat2094()
    {
        return alamat2094;
    }

    public void setPeran2094(String peran2094)
    {
        this.pekerjaan2094 = pekerjaan2094;
    }

    public String getPeran2094()
    {
        return pekerjaan2094;
    }

}

