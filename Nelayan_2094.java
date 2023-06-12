package com.maulana_rafi.pbo.pewarisan;

public class Nelayan_2094 extends Penduduk_2094
{
    private int jmlBeratIkan2094;
    private int jmlSolar2094;
    private double totalPendapatan2094;

    public Nelayan_2094()
    {
        this.jmlBeratIkan2094 = jmlBeratIkan2094;
        this.jmlSolar2094 = jmlSolar2094;
        this.totalPendapatan2094 = totalPendapatan2094;
    }

    public void inputDataNelayan_2094()
    {
        super.inputDataPenduduk_2094();
        System.out.println("Masukkan Jumlah Berat Ikan : ");
        jmlBeratIkan2094 = input.nextInt();
        System.out.println("Masukkan Jumlah Solar : ");
        jmlSolar2094 = input.nextInt();
    }

    public void tampilkanDataNelayan_2094()
    {
        super.tampilkanDataPenduduk_2094();
        System.out.println("Jumlah Berat Ikan : " + jmlBeratIkan2094 + " Kg");
        System.out.println("Jumlah Solar : " + jmlSolar2094 + " Liter");
        totalPendapatan2094 = (jmlBeratIkan2094 * 8000) - (jmlSolar2094 * 10000);
        System.out.println("Total Pendapatan : Rp." + totalPendapatan2094);
    }

    public void setJmlBeratIkan2094(int jmlBeratIkan2094)
    {
        this.jmlBeratIkan2094 = jmlBeratIkan2094;
    }

    public int getJmlBeratIkan2094()
    {
        return jmlBeratIkan2094;
    }

    public void setJmlSolar2094(int jmlSolar2094)
    {
        this.jmlSolar2094 = jmlSolar2094;
    }

    public int getJmlSolar2094()
    {
        return jmlSolar2094;
    }

    public void setTotalPendapatan2094(double totalPendapatan2094)
    {
        this.totalPendapatan2094 = totalPendapatan2094;
    }

    public double getTotalPendapatan2094()
    {
        return totalPendapatan2094;
    }

}
