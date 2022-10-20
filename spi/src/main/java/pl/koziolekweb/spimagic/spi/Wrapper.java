package pl.koziolekweb.spimagic.spi;

import java.util.List;

public interface Wrapper {

    List<Integer> get();

    Long sizeOf(List<Integer> list);
}
