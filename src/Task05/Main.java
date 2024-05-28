package Task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Max", "Java", 2024));
        students.add(new Student("Gena", "Java", 2024));
        students.add(new Student("Nikita", "Repair", 2020));
        students.add(new Student("Denya", "Repair", 2021));
        students.add(new Student("Antoha", "Production", 2020));
        students.add(new Student("Shkaf", "Production", 2021));
        Map<FacultyYear, List<Student>> facultyYearListMap = createMapStudents(students);
        // printMap(facultyYearListMap);
        // addNewStudent(new Student("Max", "Java", 2024), facultyYearListMap);
        addNewStudent(new Student("Valek", "Java", 2024), facultyYearListMap);
        // printMap(facultyYearListMap);
        // deleteStudent(new Student("Valek", "Java", 2024), facultyYearListMap);
        // deleteStudent(new Student("Valek", "Java", 2024), facultyYearListMap);
        printStudentsFromFacultyYear(new FacultyYear("Java", 2024), facultyYearListMap);
    }

    public static Map<FacultyYear, List<Student>> createMapStudents(List<Student> students) {
        Map<FacultyYear, List<Student>> result = new HashMap<>();
        for (Student student : students) {
            FacultyYear facultyYear = new FacultyYear(student.getFaculty(), student.getYear());
            if (result.containsKey(facultyYear)) {
                result.get(facultyYear).add(student);
            } else {
                result.put(facultyYear, new ArrayList<>());
                result.get(facultyYear).add(student);
            }
        }
        return result;
    }
    public static void addNewStudent(Student student, Map<FacultyYear, List<Student>> mapStudents) {
        FacultyYear facultyYear = new FacultyYear(student.getFaculty(), student.getYear());
        if (mapStudents.containsKey(facultyYear)) {
            if (mapStudents.get(facultyYear).contains(student)) {
                System.out.println("This student has already exists in the map");
            } else {
                mapStudents.get(facultyYear).add(student);
                System.out.println("Student added successfully for existing FacultyYear");
            }
        } else {
            mapStudents.put(facultyYear, new ArrayList<>());
            mapStudents.get(facultyYear).add(student);
            System.out.println("Student added successfully for new FacultyYear");
        }
    }
    public static void printMap(Map<FacultyYear, List<Student>> mapStudents) {
        for (Map.Entry<FacultyYear, List<Student>> facultyYearListEntry : mapStudents.entrySet()) {
            System.out.println("Faculty: " + facultyYearListEntry.getKey().getFaculty() + " Year: " + facultyYearListEntry.getKey().getYear());
            for (Student o : facultyYearListEntry.getValue()) {
                System.out.println(o.getName());
            }
        }
    }
    public static void deleteStudent(Student student, Map<FacultyYear, List<Student>> mapStudents) {
        FacultyYear facultyYear = new FacultyYear(student.getFaculty(), student.getYear());
        if (mapStudents.containsKey(facultyYear)) {
            if (mapStudents.get(facultyYear).contains(student)) {
                mapStudents.get(facultyYear).remove(student);
                System.out.println("This student successfully removed");
            } else {
                System.out.println("Student doesn't exist in the map, but FacultyYear is correct");
            }
        } else {
            System.out.println("Student and even FacultyYear don't exist in the map");
        }
    }
    public static void printStudentsFromFacultyYear(FacultyYear facultyYear, Map<FacultyYear, List<Student>> mapStudents) {
        if (mapStudents.containsKey(facultyYear)) {
            System.out.println("Faculty: " + facultyYear.getFaculty() + " Year: " + facultyYear.getYear());
            for (Student student : mapStudents.get(facultyYear)) {
                System.out.println(student.getName());
            }
        }
    }
}
