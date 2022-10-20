package pl.koziolekweb.spimagic;

import pl.koziolekweb.spimagic.spi.Wrapper;

import java.util.Optional;
import java.util.ServiceLoader;

public class WrapperProviderSpi {

    public static Optional<Wrapper> load() {
        ServiceLoader<Wrapper> wrappers = ServiceLoader.load(Wrapper.class);
        return wrappers
                .findFirst();
    }
}
