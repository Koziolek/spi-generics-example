package pl.koziolekweb.spimagic.spi;

import java.util.List;

public interface Wrapper {

    List<Long> get();

    Integer sizeOf(List<Long> list);
}
