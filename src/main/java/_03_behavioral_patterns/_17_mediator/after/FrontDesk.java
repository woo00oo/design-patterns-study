package _03_behavioral_patterns._17_mediator.after;

import java.time.LocalDateTime;

public class FrontDesk {

    private CleaningService cleaningService = new CleaningService();

    private Restaurant restaurant = new Restaurant();

    public void getTowers(Guest guest, int numberOfTowers) {
        cleaningService.getTowers(guest.getId(), numberOfTowers);
    }

    public String getRoomNumberFor(Integer guestId) {
        return "1111";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        this.restaurant.dinner(guest.getId(), dateTime);
    }
}

/*
    중재자 패턴
    > 여러 객체들이 소통하는 방법을 캡슐화하는 패턴.

    장점
    - 컴포넌트 코드를 변경하지 않고 새로운 중재자를 만들어 사용할 수 있다.
    - 각각의 컴포넌트 코드를 보다 간결하게 유지할 수 있다.

    단점
    - 중재자 역할을 하는 클래스의 복잡도와 결합도가 증가한다.
 */