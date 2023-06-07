package stack;

public class Stack {

    int counter = 0;

    public void pop(){
        counter--;


    }

    public void push(String element){
        counter++;
    }

    public int checkStack(){
        return counter;
    }
}
