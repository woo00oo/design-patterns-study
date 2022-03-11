package _01_creational_patterns._01_singleton;

public class SettingsV2 {

    private static SettingsV2 instance;

    private SettingsV2() {}

    public static synchronized SettingsV2 getInstance() {
        if (instance == null) {
            instance = new SettingsV2();
        }
        return instance;
    }
}

/**
 * synchronized 블럭
 *
 * 해당 블럭은 하나의 쓰레드만 접근 할 수 있다. 여러 쓰레드가 동시에 접근하지 못한다.
 *
 * 하지만, getInstance() 호출할 때마다 동기화 매커니즘 작동하기 때문에 성능 부하가 생길 수 있다.
 */
