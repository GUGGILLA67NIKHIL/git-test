import java.util.Optional;

public class Student {
    private String name;
    private int roll;
    private String address;


    public Student(String name, int roll, String address) {
        this.name = name;
        this.roll = roll;
        this.address = address;

    }
        public Optional<String> getAddress() {
            return Optional.ofNullable(address);
        }

        public String getName() {
            return name;
        }

        public int getRoll() {
            return roll;
        }

    }
