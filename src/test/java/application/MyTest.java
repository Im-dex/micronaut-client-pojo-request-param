package application;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class MyTest {
    @Inject
    MyClient client;

    @Test
    void test() {
        final Pojo pojo = new Pojo(42, "42");
        final String response = client.call(pojo);
        assert response.equals(pojo.toString());
    }
}
