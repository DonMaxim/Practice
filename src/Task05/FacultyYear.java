package Task05;

import java.util.Objects;

public class FacultyYear {
    private String faculty;
    private int year;

    public FacultyYear(String faculty, int year) {
        this.faculty = faculty;
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof FacultyYear that)) return false;
        return year == that.year && Objects.equals(faculty, that.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculty, year);
    }

    public String getFaculty() {
        return faculty;
    }

    public int getYear() {
        return year;
    }
}
