package HomWork3;

import java.util.List;
import java.util.Collections;
public class StreamService {
    private List<Stream> streamList;

    public void sortStreams(List<Stream> streamList) {
        this.streamList = streamList;
        Collections.sort(streamList);
    }
}
