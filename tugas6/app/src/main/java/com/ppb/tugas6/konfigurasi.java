package com.ppb.tugas6;

public class konfigurasi {

    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://192.168.1.11/Android/pegawai/tambahpegawai.php";
    public static final String URL_GET_ALL = "http://192.168.1.11/Android/pegawai/tampilsemuapegawai.php";
    public static final String URL_GET_EMP = "http://192.168.1.11/Android/pegawai/tampilpegawai.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.1.11/Android/pegawai/updatepegawai.php";
    public static final String URL_DELETE_EMP = "http://192.168.1.11/Android/pegawai/hapuspegawai.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_JABATAN = "desg"; //desg itu variabel untuk JABATAN
    public static final String KEY_EMP_GAJI = "salary"; //salary itu variabel untuk gajih

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_JABATAN = "desg";
    public static final String TAG_GAJI = "salary";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
