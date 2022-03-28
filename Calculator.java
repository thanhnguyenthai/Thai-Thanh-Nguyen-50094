package pl.vistula;
public class Calculator implements SimpleCalculator


        public static void main(String[] args)
        {
        Scanner in = new Scanner(System.in);
            double a, b, c = 0.0;

        System.out.print("Enter a: ");
        a = in.nextDouble();
        System.out.print("Enter b: ");
        b = in.nextDouble();
    
    System.out.print("The operation  " +
                "\n1.Addition" +
        		"\n2.Subtraction" +
        		"\n3.Multiplication" +
        		"\n4.Division" +
        		"\n5.Power" +
        		"\n#Please enter the number of operation \n");
        double x = in.nextDouble();
        double add = 1;
        double sub = 2;
        double mul = 3;
        double div = 4 ;

            public double add(double a, double b){
                x = add;
                c = a + b;
                System.out.println("Print solution: " + c );
            }

            public double sub(double a, double b){
                x = sub;
                c = a - b;
                System.out.println("Print solution: " + c );
            }

            public double mul(double a, double b){
                x = mul;
                c = a * b;
                System.out.println("Print solution: " + c );
            }

            public double div(double a, double b){
                x = div;     
                c = a / b;
                if ( b = 0 )
                    {
                    System.out.println("Can not calculator " );
                    }
                else ( b > 0 )
                    {
                    System.out.println("Print solution: " + c );
                    }
            }
        }
}
