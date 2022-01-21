public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator=1;
        denominator=1;
    }

    public Fraction(int x, int y) {
        if(y<0){
            if(x>=0){
                numerator=x*-1;
                denominator=y*-1;
            }
        }
        if(y<0){
            if(x<0) {
                numerator=x*-1;
                denominator=x*-1;
            }
        }
        else {
            numerator=x;
            denominator=y;
        }
        int divisor = GCD(x, y);
        numerator/=divisor;
        denominator/=divisor;



    }

    public static int GCD(int x, int y) {
        while(x%y!=0){
            int om=x;
            int on=y;
            x=on;
            y=om%on;
        }
        return Math.abs(y);
    }

    public static Fraction add(Fraction a, Fraction b) {
        int x = a.numerator * b.denominator;
        int x2 = a.denominator * b.denominator;
        int y = b.numerator * a.denominator;
        int y2 = b.denominator * a.denominator;
        int x3 = x + y;
        Fraction f3 = new Fraction(x3, x2);
        return f3;
    }

    public static Fraction subtract(Fraction a, Fraction b){
        int x = a.numerator * b.denominator;
        int x2 = a.denominator * b.denominator;
        int y = b.numerator * a.denominator;
        int y2 = b.denominator * a.denominator;
        int x3 = x - y;
        Fraction f3 = new Fraction(x3, x2);
        return f3;
    }

    public static Fraction multiply(Fraction a, Fraction b){
        int x = a.numerator * b.numerator;
        int y = a.denominator * b.denominator;
        Fraction f3 = new Fraction(x, y);
        return f3;
    }

    public static Fraction divide(Fraction a, Fraction b){
        int x = a.numerator * b.denominator;
        int y = a.denominator * b.numerator;
        Fraction f3 = new Fraction(x, y);
        return f3;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public String toString(){
            if(numerator>denominator){
                int x = numerator/denominator;
                int y = numerator%denominator;
                return "" + x + " " + y + "/" + denominator;

            }
            else {
                return "" + numerator + "/" + denominator;
            }


    }
}







