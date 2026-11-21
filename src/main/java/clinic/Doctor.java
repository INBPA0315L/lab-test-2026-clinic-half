package clinic;

import java.util.List;

public class Doctor {

    String name;

    Department department;

    int experience;

    String room;

    boolean onCall;

    List<Patient> patients;

    public static class Patient {

        long insuranceNumber;

        String name;

        int age;
    }

    public enum Department {
        CARDIOLOGY,
        NEUROLOGY,
        PEDIATRICS,
        ORTHOPEDICS,
        DERMATOLOGY
    }
}
