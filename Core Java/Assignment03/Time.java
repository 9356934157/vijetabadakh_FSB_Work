class Time {
    int hr, min, sec;

    // Constructor
    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        normalizeTime();
    }

    // Default constructor
    Time() {
        this(0, 0, 0);
    }

    // Normalize time to maintain 24-hour format
    void normalizeTime() {
        if (sec >= 60) {
            min += sec / 60;
            sec = sec % 60;
        }
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
        }
        hr = hr % 24; // wrap around 24 hours
    }

    // Overloaded method: Add two Time objects
    Time add(Time t) {
        Time result = new Time();
        result.hr = this.hr + t.hr;
        result.min = this.min + t.min;
        result.sec = this.sec + t.sec;
        result.normalizeTime();
        return result;
    }

    // Overloaded method: Add integer representing seconds
    Time add(int seconds) {
        Time result = new Time(this.hr, this.min, this.sec + seconds);
        result.normalizeTime();
        return result;
    }

    // Overloaded method: Add integer with type (hour/min/sec)
    Time add(int value, String type) {
        Time result = new Time(this.hr, this.min, this.sec);
        switch (type.toLowerCase()) {
            case "hour":
            case "hours":
                result.hr += value;
                break;
            case "minute":
            case "minutes":
                result.min += value;
                break;
            case "second":
            case "seconds":
                result.sec += value;
                break;
            default:
                System.out.println("Invalid type! Use hours/minutes/seconds.");
        }
        result.normalizeTime();
        return result;
    }

    // Display time in hh:mm:ss format
    void display() {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }

    // Main method for testing
    public static void main(String[] args) {
        Time t1 = new Time(10, 45, 50);
        Time t2 = new Time(2, 30, 20);

        System.out.println("Adding two Time objects:");
        Time t3 = t1.add(t2);
        t3.display(); // Output: 13:16:10

        System.out.println("Adding Time object and seconds (integer):");
        Time t4 = t1.add(75);
        t4.display(); // Output: 10:47:05

        System.out.println("Adding 2 hours to Time object:");
        Time t5 = t1.add(2, "hours");
        t5.display(); // Output: 12:45:50
    }
}