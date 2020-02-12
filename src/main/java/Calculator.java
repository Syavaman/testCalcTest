


public class Calculator {


       public int numbers[] = {5,3};


    public int sum (int a, int b){
        return a+b;
    }
    public int sub (int a, int b){
        return a-b;
    }
    public int div (int a, int b){
        return a/b;
    }
    public int mult (int a, int b){
        return a*b;
    }

    public int sum (int[] array){
        int sum = 0;
        int i;
        for (i = 0; i < array.length; i++)
            sum +=  array[i];
        return sum;
    }


}
