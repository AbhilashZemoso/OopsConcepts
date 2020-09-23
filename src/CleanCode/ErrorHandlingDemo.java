package CleanCode;

import java.util.logging.FileHandler;

class Divide{
    void operation(String fileName) throws Exception{
        try{
            int a = 1/0;
        }
        catch (Exception e){
            throw new CannotDivideByZero();
        }
    }
}

class CannotDivideByZero extends Exception{
    CannotDivideByZero(){
    }
}


class ErrorHandlingDemo {
    public static void main(String args[]) throws Exception{
        new Divide().operation("invalid");
    }
}
