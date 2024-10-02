import java.util.Scanner;

class TemperatureOutOfRangeException extends Exception {
    public TemperatureOutOfRangeException(String messege) {
        super(messege);
    }
}

class CheckTemperature {
    double temp;

    CheckTemperature(double temp) {
        this.temp = temp;
    }

    void generateAlarm() {
        try {
            if (temp > 300) {
                throw new TemperatureOutOfRangeException("Alarm: Temperature is above 300 degree celcius");
            } else if (temp < 100) {
                throw new TemperatureOutOfRangeException("Alarm:Temperature is below 100 degree celcius");
            } else {
                throw new TemperatureOutOfRangeException("Temperature is normal no alarm");
            }
        } catch (TemperatureOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class TemperaturerangeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature");
        double temp = sc.nextDouble();
        CheckTemperature c = new CheckTemperature(temp);
        c.generateAlarm();
    }


}
