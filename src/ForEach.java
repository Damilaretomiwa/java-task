import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        String[] Array = {"tomiwa","sunday","sunday","sunday","emma","emma","john"};
        for(String name:Array){
            if (name.equals("sunday"))
            System.out.println("seen");
            else
                System.out.println("not found ");


        }


    }


}
