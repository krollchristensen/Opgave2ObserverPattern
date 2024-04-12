public class Main {
    public static void main(String[] args) {
        // Opretter et WeatherStation objekt
        WeatherStation station = new WeatherStation();

        // Opretter og tilføjer flere display-enheder som observers
        TemperatureDisplay display1 = new TemperatureDisplay("Indoor");
        TemperatureDisplay display2 = new TemperatureDisplay("Outdoor");

        station.addObserver(display1);
        station.addObserver(display2);

        // Ændrer temperaturen, hvilket vil trigge en opdatering til alle tilknyttede displays
        station.setTemperature(22.5f); // Skal udskrive temperaturændringen på begge displays
        station.setTemperature(24.0f); // Skal igen udskrive den nye temperatur på begge displays
    }
}
