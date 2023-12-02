package builder;

public class Patient {

    String name;
    int age;
    String location;
    String ache;
    String phoneNumber;
    Patient() {}

    public static Builder Helper(String phoneNumber) {
        return new Builder(phoneNumber);
    }

    static class Builder {

        private Patient patient; // null
        Builder(String phoneNumber) {
            patient = new Patient();
            patient.phoneNumber = phoneNumber;
        }

        Builder setName(String name) {
            patient.name = name;
            return this;
        }

        Builder setAge(int age) {
            patient.age = age;
            return this;
        }

        Builder setLocation(String location) {
            patient.location = location;
            return this;
        }

        Builder setAche(String ache) {
            patient.ache = ache;
            return this;
        }

        Patient build() {
            return patient;
        }


    }
    @Override
    public String toString() {
        return "name-> " + this.name + "\nphoneNumber -> " + this.phoneNumber + "\n" +
                "ache -> " + this.ache + "\n"
                + "age -> " + this.age + "\n" + "location -> " + this.location;
    }
}


class MainBuilder {
    public static void main(String[] args) {
        Patient patient = Patient
                .Helper("+998776547777")
                .setName("Kahhogi")
                .build();

        System.out.println(patient.toString());
    }
}
