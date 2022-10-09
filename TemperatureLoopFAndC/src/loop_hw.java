public class loop_hw {
    public static void main(String[] args) {
        double c;
            for (int f = 0; f <= 100;f++) {
                c = (f - 32) * (0.55555555555);
                System.out.println("Fahrenheit "+f);
                System.out.println("Temperature in Celsius: " + c);
            }
    }
}
/*
Fahrenheit 0
Temperature in Celsius: -17.7777777776
Fahrenheit 1
Temperature in Celsius: -17.22222222205
Fahrenheit 2
Temperature in Celsius: -16.6666666665
Fahrenheit 3
Temperature in Celsius: -16.111111110950002
Fahrenheit 4
Temperature in Celsius: -15.555555555400002
Fahrenheit 5
Temperature in Celsius: -14.99999999985
Fahrenheit 6
Temperature in Celsius: -14.4444444443
Fahrenheit 7

//here's 98-100
Fahrenheit 98
Temperature in Celsius: 36.6666666663
Fahrenheit 99
Temperature in Celsius: 37.222222221850004
Fahrenheit 100
Temperature in Celsius: 37.777777777400004
 */