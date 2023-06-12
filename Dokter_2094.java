package com.maulana_rafi.pbo.pewarisan;

public class Dokter_2094 extends Penduduk_2094
{
    private int jmlPasien2094;
    private int jmlObat2094;
    private double totalPendapatan2094;

    public Dokter_2094()
    {
        this.jmlPasien2094 = jmlPasien2094;
        this.jmlObat2094 = jmlObat2094;
        this.totalPendapatan2094 = totalPendapatan2094;
    }


    public void inputDataDokter_2094()
    {
        super.inputDataPenduduk_2094();
        System.out.println("Masukkan Jumlah Pasien : ");
        jmlPasien2094 = input.nextInt();
        System.out.println("Masukkan Jumlah Obat : ");
        jmlObat2094 = input.nextInt();
    }

    public void tampilkanDataDokter_2094()
    {
        super.tampilkanDataPenduduk_2094();
        System.out.println("Jumlah Pasien : " + jmlPasien2094 + " Orang");
        System.out.println("Jumlah Obat : " + jmlObat2094 + " Bungkus");
        totalPendapatan2094 = (jmlPasien2094 * 50000) + (jmlObat2094 * 10000);
        System.out.println("Total Pendapatan : Rp." + totalPendapatan2094);
    }

    public void setJmlPasien2094(int jmlPasien2094)
    {
        this.jmlPasien2094 = jmlPasien2094;
    }

    public int getJmlPasien2094()
    {
        return jmlPasien2094;
    }

    public void setJmlObat2094(int jmlObat2094)
    {
        this.jmlObat2094 = jmlObat2094;
    }

    public int getJmlObat2094()
    {
        return jmlObat2094;
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
