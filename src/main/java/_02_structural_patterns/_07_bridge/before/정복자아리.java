package _02_structural_patterns._07_bridge.before;

public class 정복자아리 implements Champion {
    @Override
    public void move() {
        System.out.println("정복자 아리 move");
    }

    @Override
    public void sillQ() {
        System.out.println("정복자 아리 Q");
    }

    @Override
    public void skillW() {
        System.out.println("정복자 아리 W");
    }

    @Override
    public void skillE() {
        System.out.println("정복자 아리 E");
    }

    @Override
    public void skillR() {
        System.out.println("정복자 아리 R");
    }
}
/*
    확장성이 떨어진다. 새로운 스킨, 새로운 챔피언이 나올때마다 추가해야하는 코드량이 많아진다.
 */