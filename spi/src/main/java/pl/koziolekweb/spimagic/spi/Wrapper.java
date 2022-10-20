package pl.koziolekweb.spimagic.spi;

import java.util.List;

public interface Wrapper {

    List<Integer> get();

    Integer sizeOf(List<Integer> list);
}
