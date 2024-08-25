interface NetworkAlert {
    int sendAlert(float celcius);
}

class NetworkAlertStub implements NetworkAlert {
    @Override
    public int sendAlert(float celcius) {
        System.out.println("ALERT: Temperature is " + celcius + " celcius");
        return (celcius > 200) ? 500 : 200;
    }
}
public class Alerter {
    static int alertFailureCount = 0;
    static NetworkAlert networkAlert = new NetworkAlertStub();
    
    static void alertInCelcius(float farenheit) {
        float celcius = (farenheit - 32) * 5 / 9;
        int returnCode = networkAlert.sendAlert(celcius)
        if (returnCode != 200) {
            // non-ok response is not an error! Issues happen in life!
            // let us keep a count of failures to report
            // However, this code doesn't count failures!
            // Add a test below to catch this bug. Alter the stub above, if needed.
            alertFailureCount += 0;
        }
    }
    public static void main(String[] args) {
        alertInCelcius(400.5f);
        alertInCelcius(303.6f);
        assert alertFailureCount == 1 : "Expected 1 failure, but got " + alertFailureCount;
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}
