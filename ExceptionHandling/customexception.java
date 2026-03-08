class InvalidageException extends Exception{

    InvalidageException(String message){
        super(message);
    }
}

public class customexception {

    static void checkAge(int age) throws InvalidageException{
        if(age<18){
            throw new InvalidageException("Age must be 18+");
        }
        System.out.println("Valid age");
    }

    public static void main(String[] args){
        try{
            checkAge(15);
        }
        catch(InvalidageException e){
            System.out.println(e.getMessage());
        }
    }
}
