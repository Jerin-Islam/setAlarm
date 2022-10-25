public class Test {

    public static void main(String[] args) {

// creating a Clock with current time

        Clock clock = new Clock();

        WorldClock worldClock = new WorldClock(12);

        System.out.println(clock.getTime());

        System.out.println(worldClock.getTime());

    }


    }

