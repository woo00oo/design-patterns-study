package _03_behavioral_patterns._20_state.after;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);

}
