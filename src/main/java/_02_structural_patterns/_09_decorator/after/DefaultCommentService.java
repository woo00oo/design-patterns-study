package _02_structural_patterns._09_decorator.after;

public class DefaultCommentService implements CommentService{
    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
