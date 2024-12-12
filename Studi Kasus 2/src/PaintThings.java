import java.text.DecimalFormat;
public class PaintThings {
    public static void main(String[] args){
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        Shape deck = new Rectangle(20, 35);
        Shape BigBall = new Sphere(15);
        Shape tank = new Cylinder(30, 10);

        double deckAmt, ballAmt, tankAmt;

        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(BigBall);
        tankAmt = paint.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("Number of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("BigBall " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));

    }
}
