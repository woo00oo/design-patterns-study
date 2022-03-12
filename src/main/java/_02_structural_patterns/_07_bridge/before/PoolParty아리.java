package _02_structural_patterns._07_bridge.before;

public class PoolParty아리 implements Champion {

    @Override
    public void move() {
        System.out.println("PoolParty move");
    }

    @Override
    public void sillQ() {
        System.out.println("PoolParty Q");
    }

    @Override
    public void skillW() {
        System.out.println("PoolParty W");
    }

    @Override
    public void skillE() {
        System.out.println("PoolParty E");
    }

    @Override
    public void skillR() {
        System.out.println("PoolParty R");
    }
}
