class NegativeNumberException extends Exception{
    
    @Override
    public String toString(){
        return "Negative Number Exception Occured...";
    }

    @Override
    public String getMessage(){
        return "Negative Number Exception Occured. Please Fix the Exception.";
    }
}

public class oop18_custom_exception_class {

    public static int rectArea(int length,int width)throws NegativeNumberException{
        if(length <=0 || width <=0){
            throw new NegativeNumberException();
        }
        else{
            return length*width;
        }
    }
    public static void main(String[] args) {
        try{
            int area = rectArea(0, 4);
            System.out.println(area);
        }
        catch(NegativeNumberException ne){
            System.out.println(ne.toString());
            System.out.println(ne.getMessage());
        }
    }
}
