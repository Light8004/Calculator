import java.util.Scanner;  // Import the Scanner class

class basic{

int answer; 

public static void main(String[] args) {

Scanner myObj = new Scanner(System.in);

    System.out.println("\n 1 Add \n 2 Subtract \n 3 Multiply \n 4 Divide \n 5 Complex Functions");
    // Numerical input
    int input = myObj.nextInt();

    if(input==1){
    System.out.println("What numbers would you like to add?");
    int a = myObj.nextInt();
    int b = myObj.nextInt();
    
    System.out.println(a+" + "+b+ " = " + addition(a,b));
    

    }
    if(input==2){
    System.out.println("Please input your initial value and the value of which you would like to subtract from it.");
    int a = myObj.nextInt();
    int b = myObj.nextInt();
    System.out.println(a+" - "+b+ " = " + subtraction(a,b));
    }

    if(input==3){
    System.out.println("Please input your initial value and the value of which you would like to multiply it by.");
    int a = myObj.nextInt();
    int b = myObj.nextInt();
    System.out.println(a+" * "+b+ " = " + multiplication(a,b));
    }

    if(input==4){
    System.out.println("Please input your initial value and the value of which you would like to divide it by.");
    int a = myObj.nextInt();
    int b = myObj.nextInt();
    System.out.println(a+" / "+b+ " = " + division(a,b));
    }

    if(input==5){
        System.out.println("Please choose a subject by it's corresponding number; \n 1.Algebra 1 \n");
        int subject = myObj.nextInt();
        if(subject==1){
            System.out.println("Please choose your Algebra 1 service: \n 1.Find the slope");
            int service = myObj.nextInt();
           
                if(service==1){
                System.out.println("Please type the x value of point 1.");
                double x1 =  myObj.nextDouble(); 
                System.out.println("Please type the y value of point 1.");
                double y1 =  myObj.nextDouble(); 
                System.out.println("Please type the x value of point 2.");
                double x2 =  myObj.nextDouble(); 
                System.out.println("Please type the y value of point 2.");
                double y2 =  myObj.nextDouble(); 
                System.out.println("The slope of this line is: "+ slope(x1,y1,x2,y2)); 

            }
        }
        
    }





    myObj.close();
}

    public static int addition(int a, int b){
    return a+b;
    }

    public static int subtraction(int a, int b){

        return a-b; 
    }

    public static int division(int a, int b){

        return a/b; 
    }

    public static int multiplication(int a, int b){
        return a*b; 
    }


    public static double slope(double x1, double y1, double x2, double y2){

        double rslope= (y2-y1)/(x2-x1);

        return rslope; 
    }

}