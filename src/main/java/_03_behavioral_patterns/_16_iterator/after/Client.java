package _03_behavioral_patterns._16_iterator.after;


import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

        // TODO 들어간 순서대로 순회하기
        List<Post> posts = board.getPosts();
        Iterator<Post> iterator = posts.iterator();
        System.out.println(iterator.getClass());

        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        // TODO 가장 최신 글 먼저 순회하기
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while(recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }
    }

}

/*
    이터레이터 패턴
    > 집합 객체 내부 구조를 노출시키지 않고 순회하는 방법을 제공하는 패턴

    장점
    - 집합 객체가 가지고 있는 객체들에 손쉽게 접근할 수 있다.
    - 일관된 인터페이스를 사용해 여러 형태의 집합 구조를 순회할 수 있다.

    단점
    - 클래스가 늘어나고 복잡도가 증가한다.
 */