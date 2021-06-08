package com.cibertec.ejercicio04.api;

import com.cibertec.ejercicio04.entity.Libro;

import java.util.List;
import java.util.Optional;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface ServiceLibroApi {

    @GET("libro")
    public abstract Call<List<Libro>> listaLibro();



}
