package com.monstermaster;

import com.monstermaster.models.ServerRequest;
import com.monstermaster.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("developer/monstermaster-api/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
