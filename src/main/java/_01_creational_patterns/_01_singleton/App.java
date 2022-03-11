package _01_creational_patterns._01_singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class App {

    public static void main(String[] args) throws Exception {

        SettingsV1 settingsV1 = SettingsV1.getInstance();

        //리플렉션 사용하기
        Constructor<SettingsV1> constructor = SettingsV1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SettingsV1 newInstance = constructor.newInstance();

        //직렬화 & 역직렬화 사용하기
        SettingsV1 serializableSettingsV1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settingsV1.obj"))) {
            out.writeObject(settingsV1);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            serializableSettingsV1 = (SettingsV1) in.readObject();
        }
    }
}
