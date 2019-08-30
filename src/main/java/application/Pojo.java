package application;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Pojo {
    private final int num;
    private final String str;

    public Pojo(int num, String str) {
        this.num = num;
        this.str = str;
    }

    @Override
    public String toString() {
        return "Pojo{" +
            "num=" + num +
            ", str='" + str + '\'' +
            '}';
    }
}
