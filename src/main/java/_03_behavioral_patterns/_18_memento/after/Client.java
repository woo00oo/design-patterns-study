package _03_behavioral_patterns._18_memento.after;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave save = game.save();
        game.setBlueTeamScore(12);
        game.setRedTeamScore(22);

        game.restore(save);
        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());
    }
}

/*
    메멘토 패턴
    > 캡슐화를 유지하면서 객체 내부 상태를 외부에 저장하는 방법.

    장점
    - 캡슐화를 지키면서 객체 상태 스냅샷을 만들 수 있다.
    - 객체 상태 저장하고 또는 복원하는 역할을 CareTaker에게 위임할 수 있다.
    - 객체 상태가 바뀌어도 클라이언트 코드는 변경되지 않는다.

    단점
    - 많은 정보를 저장하는 Mementor를 자주 생성하는 경우 메모리 사용량에 많은 영향을 줄 수 있다.
 */