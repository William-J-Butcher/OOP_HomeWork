package HomWork3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentsGroup>, Comparable<Stream> {
    private List<StudentsGroup> streamStudents;

    public Stream(List<StudentsGroup> streamStudents){
        this.streamStudents = streamStudents;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "streamStudents=" + streamStudents +
                '}';
    }
    public void addGroup(StudentsGroup studentsGroup) {
        if (studentsGroup != null) {
            this.streamStudents.add(studentsGroup);
        }
    }
    @Override
    public int compareTo(Stream o) {
        Integer size = streamStudents.size();
        int i;
        i = o.getCountGroups().compareTo(size);
        return i;
    }
    @Override
    public Iterator<StudentsGroup> iterator() {
        return new StreamIterator(streamStudents);
    }

    public <T> Comparable<T> getCountGroups() {
        return null;
    }
}
