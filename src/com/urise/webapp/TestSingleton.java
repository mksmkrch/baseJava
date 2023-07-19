package com.urise.webapp;

import com.urise.webapp.model.SectionType;

import java.util.HashMap;
import java.util.Map;

public class TestSingleton {
    private static TestSingleton instance;

    public static TestSingleton getInstance() {
        if (instance == null) {
            instance = new TestSingleton();
        }
        return instance;
    }

    private TestSingleton() {
    }

    public static void main(String[] args) {
        TestSingleton.getInstance().toString();
        Singleton instance = Singleton.valueOf("INSTANCE");
        System.out.println(instance.ordinal());

        for (SectionType type: SectionType.values()) {
            System.out.println(type.getTitle());
        }
        Map<SectionType, String> contacts = new HashMap<>();
        contacts.put(SectionType.OBJECTIVE, "lala");
        contacts.put(SectionType.ACHIEVEMENT, "lolo");
        for (SectionType type : SectionType.values()) {
        System.out.println(type.getTitle() + " " + contacts.get(type));}
        System.out.println(SectionType.ACHIEVEMENT.getTitle() + contacts.get(SectionType.ACHIEVEMENT));
    }


    public enum Singleton {
        INSTANCE
    }
}
