package pl.koziolekweb.spimagic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ImplAppExampleTest {

    @Test
    void shouldAnswerWithTrue() {
        Assertions.assertThat(new ImplAppExample().getWrapper()).isNotNull();
    }

}
