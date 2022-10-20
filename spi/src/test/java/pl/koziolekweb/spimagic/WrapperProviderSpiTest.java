package pl.koziolekweb.spimagic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WrapperProviderSpiTest {

    @Test
    void notFindAnyImpl() {
        assertThat(WrapperProviderSpi.load()).isEmpty();
    }

}
