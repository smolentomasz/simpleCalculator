public class Triangle extends Figure implements Print{
    private double area;
    private double perimeter;
    private double a;
    private double b;
    private double c;
    public Triangle(double a1, double b1, double c1){
        if(a1 <= 0 || b1 <=0 || c1 <= 0 ) {
            throw new IllegalArgumentException("Przynajmniej jeden z boków jest mniejszy bądź równy 0!\n");
        }
        if(a1 >= (b1 + c1) || b1 >= (a1 + c1) || c1 >= (a1 + b1)) {
            throw new IllegalArgumentException("Długości boków nie spełniają warunku trójkąta!\n");
        }
        a = a1;
        b = b1;
        c = c1;
    }
    @Override
    public double calculateArea(){//pole
        double p;
        p = 0.5 * (a + b + c);
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        return area;
    }
    @Override
    public double calculatePerimeter(){//obwod
        perimeter = a + b + c;
        return perimeter;
    }
    @Override
    public void print(){
    System.out.print("Dla bokow: " + a + ", " + b + ", " + c + " obwod wynosi: " + calculatePerimeter() + ". Pole: " + calculateArea() +"\n");
    }
}
