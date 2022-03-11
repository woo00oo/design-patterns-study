package _01_creational_patterns._01_singleton;

import java.io.Serializable;

public class SettingsV1 implements Serializable {

    private static SettingsV1 instance;

    private SettingsV1() {}

    public static SettingsV1 getInstance() {
        if (instance == null) {
            instance = new SettingsV1();
        }
        return instance;
    }
}

/**
 * 멀티 쓰레드 환경에서 인스턴스가 여러개 생성될 수 있음.
 */
