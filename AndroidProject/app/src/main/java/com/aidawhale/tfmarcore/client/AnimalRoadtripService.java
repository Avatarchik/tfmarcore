package com.aidawhale.tfmarcore.client;

import com.aidawhale.tfmarcore.room.Game;
import com.aidawhale.tfmarcore.room.Survey;
import com.aidawhale.tfmarcore.room.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface AnimalRoadtripService {

    @GET("api/user/{userId}")
    Call<User> getUserById(
            @Path("userId") String userId
    );

    @GET("api/survey/today/{userId}")
    Call<Survey> getTodaysSurvey(
            @Path("userId") String userId
    );

    @POST("api/user/new/")
    Call<User> createUser(
            @Body User user
    );

    @POST("api/survey/new/")
    Call<Survey> createSurvey(
            @Body Survey survey
    );

    @POST("api/game/new/")
    Call<Game> createGame(
            @Body Game game
    );
}
