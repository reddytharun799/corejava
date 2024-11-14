package enumAbstractMethods;

public class TrafficLightTest {

    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            light.displayMessage();
            System.out.println(light+  "  messages  "  +light.getDuration() + " seconds\n");


        }

    }
}
