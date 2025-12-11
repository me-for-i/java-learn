public class KeyInstanceof {
}

interface Shape {}

class Round {}

class Ring extends Round {}

class Circle extends Ring implements Shape {}

class Test {

    public static void main(String[] args) {
        Ring ring = new Ring();
        boolean isRingInstanceofRound = ring instanceof Round;
        System.out.println(isRingInstanceofRound);
        boolean isRingInstanceofShape = ring instanceof Shape;
        System.out.println(isRingInstanceofShape);

        Circle circle = new Circle();
        boolean isCircleInstanceofRound = circle instanceof Round;
        System.out.println(isCircleInstanceofRound);
        boolean isCircleInstanceofShape = circle instanceof Shape;
        System.out.println(isCircleInstanceofShape);

        System.out.println(ring instanceof Circle);
    }
}
