package pl.koziolekweb.spimagic.impl;

import pl.koziolekweb.spimagic.spi.Wrapper;

import java.util.List;

public class WrapperImpl implements Wrapper {
    @Override
    public List<Integer> get() {
        return List.of(1, 2, 3, 4);
    }

    @Override
    public Integer sizeOf(List<Integer> list) {
        return list.size();
    }
}
