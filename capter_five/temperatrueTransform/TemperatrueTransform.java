public class TemperatrueTransform{
    public static void main(String[] args){
        System.out.println("Celsius         Fahrenheit");
        for(double celsius = 40.0;celsius > 30;celsius-=1.0){
            System.out.printf("%4.1f\t\t%4.1f\n",celsius,celsiusToFahrenheit(celsius));
        }
        System.out.println("Fahrenheit      Celsius");
        for(double fahrenheit=120.0;fahrenheit>20.0;fahrenheit-=10.0){
            System.out.printf("%4.1f\t\t%4.2f\n",fahrenheit,fahrenheitTocelsius(fahrenheit));
        }
    }

    public static double celsiusToFahrenheit(double celsius){
        return (9.0/5)*celsius+32;
    }
    public static double fahrenheitTocelsius(double fahrenheit){
        return (fahrenheit-32)*5/9.0;
    }
}
