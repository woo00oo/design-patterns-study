package _02_structural_patterns._07_bridge.after;

import _02_structural_patterns._07_bridge.before.Champion;

public class App {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.sillQ();
        kda아리.skillR();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillR();
        poolParty아리.skillW();
    }

}
