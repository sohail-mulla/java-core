public class ExceptionHandling {

    public static void main(String[] args) {                  // <----------- practice code written by me

      int a = 5;
      int b = 0;
        System.out.println(divideNums(a,b));
        checkAge(16);
    }

    static int divideNums(int a, int b)  {
       try {
           return (a/b);
       }
       catch(ArithmeticException e){
           System.out.println("Error :" + e.getMessage());
           System.out.println(e.toString());
           e.printStackTrace();
           return -1;
        }
    }

    static void checkAge(int age){

      if(age < 18){
          throw new IllegalArgumentException("Age must be 18+ ");
      }
      else {
          System.out.println(" Eligible ");
      }

    }
}

//-----------------------------------------------------------------------------------------------------------------------------------

 class ExceptionHandling2 {

    public static void main(String[] args) {        //  <------------ AI code
                                                    // generally or in real - world applications the try-catch block is
        int a = 5;                                  // handled in main method()
        int b = 0;

        try {
            System.out.println(divideNums(a, b));   //  A single try block can only handle one exception at a time
        } catch (Exception e) {
            System.out.println("Handled: " + e.getMessage());
        }
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println("Handled: " + e.getMessage());
        }



    }

    static int divideNums(int a, int b) {
        return a / b;  // let it throw
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18+");
        } else {
            System.out.println("Eligible");
        }
    }
}