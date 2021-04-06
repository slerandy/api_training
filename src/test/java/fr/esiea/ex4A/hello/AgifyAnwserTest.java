package fr.esiea.ex4A.hello;

import fr.esiea.ex4A.api.AgifyAnwser;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AgifyAnwserTest {
    @Test
    public void agifyAnwserTest(){
        // Given
        String name = "tom";
        String country_id = "US";
        int age = 35;

        // When
        AgifyAnwser anwser = new AgifyAnwser(name, country_id, age, 0);

        // Then
        assertThat(anwser.name).isEqualTo(name);
        assertThat(anwser.age).isEqualTo(age);
        assertThat(anwser.country_id).isEqualTo(country_id);
        assertThat(anwser.count).isEqualTo(0);
    }
}
