public class Main {
    public static void main(String[] args) {

        Line line1 = new Line(new Point(1, 3), new Point(5, 8));
        Line line2 = new Line(new Point(10, 11), new Point(15, 19));
        Line line3 = new Line(line1.getEnd(), line2.getStart());

        System.out.println("До изменения: " + line3);

        line3.getStart().setX(7);
        line3.getStart().setY(9);
        line3.getEnd().setX(13);
        line3.getEnd().setY(17);

        System.out.println("После изменения: " + line3);
        System.out.println(line1);
        System.out.println(line2);

        double totalLength = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Суммарная длина всех линий: " + totalLength);
    }
}