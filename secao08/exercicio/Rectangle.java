package secao08.exercicio;

public class Rectangle {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return (width * 2) + (height * 2);
    }

    public double diagonal(){
        return Math.sqrt((width * width) + (height * height));
        // d² = b² + h²
    }

    @Override
    public String toString() {
        return
                "AREA: " + area() + "\n" +
                "PERIMETER: " + perimeter() + "\n" +
                "DIAGONAL: " + diagonal() + "\n";
    }
}
