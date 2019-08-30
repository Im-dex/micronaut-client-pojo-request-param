package application;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

import javax.annotation.Nullable;

@Client("/")
public interface MyClient {
    @Get("/call{?obj*}")
    String call(@Nullable Pojo obj);
}
