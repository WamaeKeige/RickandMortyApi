package rest;

import model.CharacterResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("character/")
    Call<CharacterResponse> getCharacters();

    @GET("character/{id}")
    Call<CharacterResponse> getCharacterDetail(@Path("id") int id);
}