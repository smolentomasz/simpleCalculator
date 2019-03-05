public class Circle extends Figure implements Print {
    private double radius;
    private double area;
    private double perimeter;
    public Circle(double r){
        if(r <=0 ) {
            throw new IllegalArgumentException("Parametr musi być większy od 0!\n");
        }
        radius = r;
    }
    @Override
    public double calculateArea(){//pole
        area = Math.PI * Math.pow(radius,2);
        return area;
    }
    @Override
    public double calculatePerimeter(){//obwod
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    @Override
    public void print(){
        System.out.print("Promien koła ma: "+ radius + ". Obwod wynosi: " + calculatePerimeter() + ". Pole: " + calculateArea() + "\n");
    }
}
