package _02_structural_patterns._07_bridge.after;

import _02_structural_patterns._07_bridge.before.Champion;

public class DefaultChampion implements Champion {

    private Skin skin;

    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move\n",skin.getName(), this.name);
    }

    @Override
    public void sillQ() {
        System.out.printf("%s %s Q\n",skin.getName(), this.name);
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s W\n",skin.getName(), this.name);
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s E\n",skin.getName(), this.name);
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s R\n",skin.getName(), this.name);
    }
}
