public class TravelTime {

    public static void main(String args[]) {

        //присваиваем переменной значение расстояния от дома до офиса:
        int distanceInKilometersFromHomeToOffice = 10;
        System.out.println("Расстояние от дома до офиса - " + distanceInKilometersFromHomeToOffice + " км." );

        // присваиваем переменной значение средней скорости:
        float averageTaxiSpeed = 50;
        System.out.println("Средняя скорость такси - " + averageTaxiSpeed + " км/ч.");

        //рассчитываем время за которое тестировщик добирается от дома до офиса:
        float timeFromHomeToOffice = (distanceInKilometersFromHomeToOffice / averageTaxiSpeed)*60;
        System.out.println("Время, за которое тестировщик добирается от дома до офиса - " + timeFromHomeToOffice + " минут");

        //присваиваем переменной значение коэффициента замедления:
        double coefficientOfDecelerationOfTransportInEvening = 1.5;
        System.out.println("Коэффициент замедления транспорта вечером: " + coefficientOfDecelerationOfTransportInEvening);

        //рассчитываем время, за которое тестировщик добирается на такси с работы домой:
        double taxiTimeFromWorkToHome = timeFromHomeToOffice * coefficientOfDecelerationOfTransportInEvening;
        System.out.println("Время, за которое тестировщик добирается на такси с работы домой - " + taxiTimeFromWorkToHome + " минут");

    }
}
