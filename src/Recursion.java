public class Recursion {

    // Calculate the Factorial no.
    static int fact = 1;

    public static void main(String[] args) {
        int no = 5;
        Recursion ob = new Recursion();
        ob.calcFact(no);
        System.out.println("Factorial of "+no+" is "+fact);
    }
    void calcFact(int no)
    {
        if (no>=1)
        {
            fact=fact*no;
            calcFact(no-1);
        }
    }
}
