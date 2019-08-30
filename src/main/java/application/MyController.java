package application;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.annotation.Nullable;

@Controller
public class MyController {
    @Get("/call{?obj*}")
    public String call(@Nullable Pojo obj) {
        return obj.toString();
    }
}
