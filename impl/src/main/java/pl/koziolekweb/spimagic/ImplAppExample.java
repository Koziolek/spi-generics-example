package pl.koziolekweb.spimagic;

import pl.koziolekweb.spimagic.spi.Wrapper;

public class ImplAppExample {

    public Wrapper getWrapper(){
        return WrapperProviderSpi.load().orElseThrow(()-> new RuntimeException("Something went wrong"));
    }
}
