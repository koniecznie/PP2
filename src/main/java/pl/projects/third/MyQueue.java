package pl.projects.third;

public class MyQueue {

    private int[] numbers;
    private int setValue = 0;
    private int getValue = 0;

    public MyQueue(int count) {
        numbers = new int[count];
    }
    public void addValue(int a){
        if(setValue == numbers.length)
            setValue = 0;

        for (int n = setValue; n < numbers.length; n++){
            if(numbers[n] == 0){
                System.out.println("Value added: " + a + " | " + n);
                numbers[n] = a;
                setValue++;
                break;
            }
        }
    }

    public int getValue(){
        if(getValue == numbers.length)
            getValue = 0;

        for (int n = getValue; n < numbers.length; n++){
            if(numbers[n] != 0){
                int num = numbers[n];
                numbers[n] = 0;
                getValue++;

                System.out.println("Get value: " + num + " | " + n);
                return num;
            }
        }
        return 0;
    }

}
