package pl.koziolekweb.spimagic;

import pl.koziolekweb.spimagic.spi.Wrapper;

public class App {

    public static void main(String[] args) {
        Wrapper wrapper = WrapperProviderSpi.load().orElseThrow(() -> new RuntimeException("No impl provided"));
        Object o = wrapper.sizeOf(wrapper.get());
        System.out.println(o.getClass());
    }

}
