package utils;

public class Validation {
    
    public static double getinput(String input) throws NumberFormatException{
        double num = Double.parseDouble(input);
        
        if(num <= 0){
            throw new NumberFormatException();
        }
        return num;
    }

    public static boolean checkValidShape(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

}