public class Maryland extends State {
        public static void main(String[] args) {
            Region east = new State();
            Maryland md = new Maryland();
            Object obj = new Place();
            Place usa = new Region();

            md.printMe();
            east.printMe();
            ((Place) obj).printMe();
            obj = md;
            ((Maryland) obj).printMe();
            obj = usa;
            ((Place) obj).printMe();
            usa = md;
            ((Place) usa).printMe();
        }
    }

    class State extends Region {
        public void printMe() {
            System.out.println("Ship it.");
        }
    }

    class Region extends Place {
        public void printMe() {
            System.out.println("Box it.");
        }
    }

    class Place extends Object {
        public void printMe() {
            System.out.println("Buy it.");
        }
    }

