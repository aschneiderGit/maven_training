package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void mult_works() {
        int a = 4;
        int b = 3;
        int res = new Sample().op(Sample.Operation.MULT,a,b);
        Assertions.assertThat(res).as("multiple of 4*3").isEqualTo(12);
    }

    @Test
    void addition_work() {
        int a = 10;
        int b = 2;
        int res = new Sample().op(Sample.Operation.ADD,a,b);

        Assertions.assertThat(res).as("additon of 10 + 2").isEqualTo(12);
    }
}
