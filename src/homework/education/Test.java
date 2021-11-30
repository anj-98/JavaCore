package homework.education;

import java.util.Scanner;

public class Test {

    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";   //(պետք է նույն անունով երկու տարբեր դասընթաց չունենանք)
    private static final String ADD_STUDENT = "2";    //(պետք է նույն իմեյլով երկու ուսանող չունենանք)
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSONS_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    private static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " for add lesson");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_STUDENTS + " for print students");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for for print student by lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print lesson");
        System.out.println("please input " + DELETE_LESSONS_BY_NAME + " for delete lesson by name");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for delete student by email");

    }

    public static void main(String[] args) {

        studentStorage.add(new Student("Anjela", "Vartanova", 23, "vartanova.98@mail.ru", "098092704", "Java"));
        studentStorage.add(new Student("Poxos", "Poxosayan", 26, "poxos@mail.ru", "098454645", "Java"));
        studentStorage.add(new Student("Martiros", "Martirosyan", 10, "martirosyan@mail.ru", "098979695", "Phyton"));


        lessonStorage.add(new Lesson("Java",45,"Poxos",35000));
        lessonStorage.add(new Lesson("C++",50,"Petros",25000));
        lessonStorage.add(new Lesson("Java",45,"Anjela",30000));

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case DELETE_LESSONS_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("Invalid command!");
            }

        }
    }

    private static void deleteStudentByEmail() {
        studentStorage.print();
        System.out.println("--------");
        System.out.println("please choose student email");
        System.out.println("--------");
        String studentEmail=scanner.nextLine();
        Student student= studentStorage.getByEmail(studentEmail);
        if (student!=null){
            studentStorage.deleteByEmail(student);
        }else {
            System.err.println("Student with this Email does not exists");

        }
    }

    private static void deleteLessonByName() {
        lessonStorage.print();
        System.out.println("--------");
        System.out.println("please choose lesson name");
        System.out.println("--------");
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(lessonName);
        if (lesson != null) {
            lessonStorage.deleteByName(lesson);
        } else {
            System.err.println("Lesson with Lesson Name does not exists");
        }
    }


    private static void printLesson() {
    }

    private static void printStudentByLesson() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printByLesson(lessonName);

    }

    private static void printStudent() {
        System.out.println("-----------");
        studentStorage.print();
        System.out.println("-----------");
    }


    private static void addStudent() {
        System.out.println("please input student's name,surname,age,email,phone,lesson");
        String studentDataStr = scanner.nextLine();
        String[] studentData = studentDataStr.split(",");
        if (studentData.length == 6) {
            int age = Integer.parseInt(studentData[2]);
            Student student = new Student(studentData[0], studentData[1], age, studentData[3], studentData[4], studentData[5]);

            if (studentStorage.getByEmail(student.getEmail()) != null) {
                System.err.println("Invalid email. Student with this email already exists");
            } else {
                studentStorage.add(student);
                System.out.println("Thank you, student was added");
            }
        } else {
            System.err.println("invalid data");
        }
    }

    private static void addLesson() {
        System.out.println("Please input lesson name,lesson duration,lectureName,lesson price");
        String lessonDataStr = scanner.nextLine();
        String[] lessonData = lessonDataStr.split(",");
        if (lessonData.length == 4) {
            String name = lessonData[0];
            int duration = Integer.parseInt(lessonData[1]);
            String lectureName = lessonData[2];
            int price = Integer.parseInt(lessonData[3]);
            Lesson lesson = new Lesson(name, duration, lectureName, price);

            if (lessonStorage.getByName(lesson.getName()) != null) {
                System.err.println("Invalid name. Lesson with this name already exists");
            } else {
                lessonStorage.add(lesson);
                System.out.println("Thank you, lesson was added");
            }
        } else {
            System.err.println("invalid data");
        }
    }
}

        






