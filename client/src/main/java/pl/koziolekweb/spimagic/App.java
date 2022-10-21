package pl.koziolekweb.spimagic;

import pl.koziolekweb.spimagic.spi.Wrapper;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Wrapper wrapper = WrapperProviderSpi.load().orElseThrow(() -> new RuntimeException("No impl provided"));
        List<Long> list = wrapper.get();
        Object size = wrapper.sizeOf(list);
        System.out.println(size.getClass());
        Long o = list.get(0);
        System.out.println(o.getClass());
    }

}
