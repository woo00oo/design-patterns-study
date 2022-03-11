package _01_creational_patterns._01_singleton;

public class SettingsV5 {

    private SettingsV5() {}

    private static class SettingsHolder {
        private static final SettingsV5 INSTANCE = new SettingsV5();
    }

    public static SettingsV5 getInstance() {
        return SettingsHolder.INSTANCE;
    }

    // 역직렬화 대응 방안
    protected Object readResolve() {
        return getInstance();
    }
}

/**
 * static inner 클래스 사용하기
 * Thread-safe 하고, Lazy Loading이 가능함.
 */
