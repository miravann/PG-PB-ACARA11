package com.example.acara10.network;

import com.example.acara10.model.Data;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {
    @GET("6409")
    Call<List<Data>> getAllUsers();
}
