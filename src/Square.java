public class Square extends Figure implements Print {
    private double side;
    private double area;
    private double perimeter;
    public Square(double s){
        if(s <=0 ) {
            throw new IllegalArgumentException("Parametr musi być większy od 0!\n");
        }
        side = s;
    }
    @Override
    public double calculateArea(){//pole
        area = side * side;
        return area;
    }
    @Override
    public double calculatePerimeter(){//obwod
        perimeter = side * 4;
        return perimeter;
    }
    @Override
    public void print(){
        System.out.print("Bok kwadratu ma: "+ side + ". Obwod wynosi: " + calculatePerimeter() + ". Pole: " + calculateArea()+ "\n");
    }
}
