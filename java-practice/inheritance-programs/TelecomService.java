public class TelecomService {

    // single inheritance program
    public static void main(String[] args) {

         Jio object = new Jio();
         object.jioFeature();
         object.showProvider();
         object.call();
         object.sms();

        }

    }

    class Telecom {

        String serviceName = " Telecom service";

        void call() {
            System.out.println("This is the calling function");
        }

        void sms() {
            System.out.println("SMS Service is available");
        }

    }

    class Jio extends Telecom {

        String providerName = " Jio ";

        void showProvider() {
            System.out.println("Provider: " + providerName);
        }

        void jioFeature() {
            System.out.println("Jio offers free OTT subscriptions");
        }


    }


