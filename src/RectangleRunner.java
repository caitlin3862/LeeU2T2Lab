public class RectangleRunner {
    public static void main(String[] args){
        Rectangle plot1 = new Rectangle(150,200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        plot1.setWidth(75);
        plot2.setWidth(75);
        plot2.setWidth(75);
        plot3.setLength(75);

        int area1 = plot1.calculateArea();
        int area2 = plot2.calculateArea();
        int area3 = plot3.calculateArea();

        System.out.println("These three plots requires " + (area1 + area2 + area3) + " square feet of seed");

    }
}
