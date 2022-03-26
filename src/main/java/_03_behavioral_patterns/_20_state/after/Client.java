package _03_behavioral_patterns._20_state.after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("whiteship");
        Student keesun = new Student("keesun");

        onlineCourse.addStudent(student);
        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("hello", student);
        keesun.addPrivate(onlineCourse);
        onlineCourse.addStudent(keesun);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());
    }
}
