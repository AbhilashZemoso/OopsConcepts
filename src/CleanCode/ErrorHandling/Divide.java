package CleanCode.ErrorHandling;

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
