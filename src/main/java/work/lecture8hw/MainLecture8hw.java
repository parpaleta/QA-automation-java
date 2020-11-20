package work.lecture8hw;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
@Slf4j

public class MainLecture8hw {

    public static void main(String[] agrs){
        Teacher teacher = new Teacher("Ivanov", 47, "MALE", "TU Sofia", "Computer science");
        List<String> teacherClasses = new ArrayList<String>();
        teacherClasses.add("Math part 1");
        teacherClasses.add("Math part 2");
        teacherClasses.add("Programming basics Java");

        List<Integer> studentsInEachClass = new ArrayList<Integer>();
        studentsInEachClass.add(50);
        studentsInEachClass.add(88);
        studentsInEachClass.add(120);


        teacher.setStudentsInClass(studentsInEachClass);
        teacher.setClasses(teacherClasses);
        System.out.println(teacher.toString());
        System.out.println(teacher.getClasses());

        teacher.printClasses(teacher.getClasses());
        teacher.studentInTheClasses(160);
        teacher.numberOfStudentsInTheClass(teacherClasses,studentsInEachClass);
        teacher.toRetire(70, TeachersGenger.MALE);
        teacher.toRetire(50, TeachersGenger.MALE);
        teacher.toRetire(70, TeachersGenger.FEMALE);
        teacher.toRetire(50, TeachersGenger.FEMALE);



    }



}
