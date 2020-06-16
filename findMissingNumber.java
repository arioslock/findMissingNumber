package LoopsII;

import java.util.Arrays;

public class findMissingNumber {
    public static int findMissingNumber(int[] numbers) {
        boolean minusOne = false;
        boolean plusOne = false;
        int max = Arrays.stream(numbers).max().getAsInt();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + "i");
            minusOne = false;
            plusOne = false;
            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i] - 1== numbers[j]){
                    minusOne = true;
                }if (numbers[i] + 1== numbers[j]){
                    plusOne = true;
                }if (minusOne && plusOne){
                    break;
                }

            }if (numbers[i] == max){
                plusOne = true;
            }if (numbers[i] - 1== 0){
                plusOne = true;
                minusOne = true;
            }if (plusOne == false){
                System.out.println(numbers[i] + 1);
                return numbers[i] + 1;
            }if (minusOne == false){
                System.out.println(numbers[i] - 1);
                return  numbers[i] - 1;
            }
                

        }

        return 0;
    }

    public static void main(String[] args) {
        int [] arry = new  int[]{1,2,3,4,6,7,8};
        findMissingNumber(arry);
    }
}
