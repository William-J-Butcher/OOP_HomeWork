package HomWork3;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentsGroup> {
    private List<StudentsGroup> studentsGroupList;
    private int counter2;
    public StreamIterator(List<StudentsGroup> studentsGroupList) {
        this.studentsGroupList = studentsGroupList;
        this.counter2 = 0;
    }
    @Override
    public boolean hasNext() {
        return counter2 < studentsGroupList.size() -1;
    }

    @Override
    public StudentsGroup next() {
        if (!hasNext()) {
            return null;
        }
        counter2++;
        return studentsGroupList.get(counter2);
    }
    @Override
    public void remove() {
        studentsGroupList.remove(counter2);
    }

    @Override
    public String toString() {
        return "StreamIterator{" +
                "studentsGroupList=" + studentsGroupList +
                ", counter =" + counter2 +
                '}';
    }
}
