package fr.esiea.ex4A.hello;

import fr.esiea.ex4A.api.AgifyAnwser;
import fr.esiea.ex4A.api.AgifyClient;
import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Test;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AgifyClientIT {
    @Test
    public void getAgeTest(){
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        // Given
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.agify.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();
        AgifyClient client = retrofit.create(AgifyClient.class);

        Call<AgifyAnwser> callSync = client.getUser("tom", "FR");
        try {
            Response<AgifyAnwser> response = callSync.execute();
            AgifyAnwser user = response.body();
            assertNotNull(user);
            assertEquals(user.age, 55);
            assertEquals(user.name, "tom");
            assertEquals(user.country_id, "FR");
        }catch (Exception e){
            System.err.println(e);
        }
    }
}
