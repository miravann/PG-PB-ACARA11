package com.example.acara10.model;


import com.google.gson.annotations.SerializedName;
public class Data {
    @SerializedName("nama_surveyor")
    private String namaSurveyor;

    @SerializedName("Usia")
    private String usia;

    @SerializedName("jenis_kelamin")
    private String jeniskelamin;

    @SerializedName("pekerjaan")
    private String pekerjaan;

    @SerializedName("id_desa")
    private String idDesa;

    @SerializedName("nama_desa")
    private String namaDesa;

    @SerializedName("Latitude")
    private String Latitude;

    @SerializedName("Longitude")
    private String Longitude;

    public String getNamaSurveyor(){
        return namaSurveyor;
    }

    public String getUsia(){
        return usia;
    }

    public String getJeniskelamin(){
        return jeniskelamin;
    }

    public String getPekerjaan(){
        return pekerjaan;
    }

    public String getIdDesa(){
        return idDesa;
    }

    public String getNamaDesa(){
        return namaDesa;
    }

    public String getLatitude(){
        return Latitude;
    }

    public String getLongitude(){
        return Longitude;
    }

}