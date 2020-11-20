package work.lecture8hw;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Getter
@Setter
@Slf4j

public class Teacher extends Person{
    private String name;
    private String age;
    private String university;
    private String faculty;

    private List<String> classes;
    private List<Integer> studentsInClass;

    public Teacher(String name, int age, String maleFemale, String university, String faculty) {
        super(name, age, maleFemale);
        this.name = name;
        this.university = university;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", faculty='" + faculty + '\'' +
                ", classes=" + classes +
                '}';
    }

    public void toRetire(int age, TeachersGenger gender){
        String manWoman;
        int yearsToWork;
        if(gender.equals(TeachersGenger.MALE)){
            manWoman = "MAN";
            yearsToWork = 68 - age;
        }else{
            manWoman = "WOMAN";
            yearsToWork = 65 - age;
        }
        if (age > 68 && gender.equals(TeachersGenger.MALE)){
//            System.out.println("You are a " + manWoman + " at age greater than 68 and you need to retire.");
            log.info("You are a {} at age greater than 68 and you need to retire.", manWoman );
        }else if(age > 65 && gender.equals(TeachersGenger.FEMALE)){
//            System.out.println("You are a " + manWoman + " at age greater than 65 and you need to retire.");
            log.info("You are a {} at age greater than 65 and you need to retire.", manWoman );
        }else {
//            System.out.println("You have to work " + yearsToWork + " to retire.");
            log.info("You have to work {} to retire.", yearsToWork);
        }
    }

    public void numberOfStudentsInTheClass(List teacherClasses, List studentsInClass){
        for(int i = 0; i < teacherClasses.size(); i++){
//            System.out.println("The number of students in class \"" + teacherClasses.get(i) + "\" is " + studentsInClass.get(i) + ".");
            log.info("The number of students in class \" {} \" is {}", teacherClasses.get(i), studentsInClass.get(i));
        }
    }

    public void printClasses(List teacherClasses){
//        for(int i = 0; i < teacherClasses.size(); i++){
//            System.out.println(teacherClasses.get(i));
//        }

//        for (Object i : teacherClasses) {
//            System.out.println(i);
//        }

        teacherClasses.forEach(System.out::println);
    }

    public void studentInTheClasses(int numberOfStudents){
        if(numberOfStudents > 150){
//            System.out.println("Too many students. You need help.");
            log.info("Too many students. You need help.");
        }else{
//            System.out.println("Normal work.");
            log.info("Normal work.");
        }
    }

}
