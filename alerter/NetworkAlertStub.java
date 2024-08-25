package testing;

public class NetworkAlertStub implements NetworkAlert {
    @Override
    public int sendAlert(float celcius) {
        System.out.println("ALERT: Temperature is " + celcius + " celcius");
        return (celcius > 200) ? 500 : 200;
    }
}
