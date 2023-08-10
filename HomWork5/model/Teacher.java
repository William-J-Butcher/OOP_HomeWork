package HomWork5.model;

public class Teacher extends User{
    private int teacherID;

    public Teacher(String lastName, String firstName, String secondName, int teacherID) {
        super(lastName, firstName, secondName);
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                '}';
    }
}