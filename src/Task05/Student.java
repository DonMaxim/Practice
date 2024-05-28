package Task05;

import java.util.Objects;

public class Student extends FacultyYear{
    private String name;

    public Student(String name, String faculty, int year) {
        super(faculty, year);
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Student student)) return false;
        if (!super.equals(object)) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    public String getName() {
        return name;
    }
}
