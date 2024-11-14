package enumAbstractMethods;

public enum TrafficLight {


    RED(60) {
        @Override
        public void displayMessage() {
            System.out.println("you have to wait until 60 seconds");

        }
    },GREEN(60) {
        @Override
        public void displayMessage() {
            System.out.println("Everyone have to go 60 seconds");

        }
    },YELLOW(5) {
        @Override
        public void displayMessage() {
            System.out.println("try to get Action mode ");

        }
    };

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }
    public abstract void displayMessage();

    public int getDuration() {
        return duration;
    }
}
