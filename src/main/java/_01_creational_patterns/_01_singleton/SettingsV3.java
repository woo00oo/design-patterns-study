package _01_creational_patterns._01_singleton;

public class SettingsV3 {

    private static SettingsV3 INSTANCE = new SettingsV3();

    private SettingsV3() {}

    public static SettingsV3 getInstance() {
        return INSTANCE;
    }
}

/**
 * 이른 초기화(eager initialization) 사용하기
 *
 * 클래스 로딩 시점에 초기화.
 * 만약, 해당 인스턴스를 생성하는데 많은 리소스가 들어갔지만, 런타임 시 해당 인스턴스를 사용하지 않은 경우에는 불필요한 리소스가 소모됨.
 */
