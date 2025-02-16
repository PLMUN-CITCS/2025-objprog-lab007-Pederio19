public class BooleanExpressionsDemo {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean hasClouds = false;

        int temperature = 25;
        int windSpeed = 15;

        boolean isHot = temperature > 30;
        boolean isBreezy = windSpeed <= 20;

        boolean goodWeather = isSunny && !hasClouds;
        boolean okWeather = isSunny || isBreezy;
        boolean isCloudy = !isSunny;
        boolean variableWeather = isSunny ^ hasClouds;

        System.out.println("Is Java fun? " + isSunny);
        System.out.println("Is homework tiring? " + hasClouds);
        System.out.println("Is 'a' greater than 'b'? " + isHot);
        System.out.println("Are 'a' and 'b' equal? " + (temperature == 25));
        System.out.println("Both conditions (isSunny && !hasClouds): " + goodWeather);
        System.out.println("Either condition (isSunny || isBreezy): " + okWeather);
        System.out.println("Logical NOT of isSunny: " + isCloudy);
        System.out.println("Exclusive OR (isSunny ^ hasClouds): " + variableWeather);
    }
}