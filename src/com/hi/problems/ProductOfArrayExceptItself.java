package com.hi.problems;

public class ProductOfArrayExceptItself {
    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        ProductOfArrayExceptItself pa = new ProductOfArrayExceptItself();
        int arr[] = { 10, 3, 5, 6, 2 };
        int n = arr.length;
        System.out.println("input :: "+java.util.Arrays.toString(arr));
        //int[] productOutput = pa.productArray(arr, n);
        int[] productOutput = pa.productArrayWithOneOutputArray(arr, n);

        System.out.println("output :: "+java.util.Arrays.toString(productOutput));
    }

    /* Brute force solution using nested loops */
    int[] productArray(int[] input, int inputLength){
        int[] product = new int[inputLength];
        for(int i=0; i<inputLength; i++){
            int prodExclCurr = 1;
            for(int j=0; j<inputLength; j++){
                if(i == j){
                    continue;
                }else{
                    prodExclCurr = prodExclCurr * input[j];
                }
            }
            product[i]=prodExclCurr;
        }
        return product;
    }

    /* Using extra space and loop : left and right product array */
    int[] productArrayWithleftAndRightProducts(int[] input, int inputLength){
        int[] output = new int[inputLength];
        int[] left_products = new int [inputLength];
        int[] right_products = new int [inputLength];

        left_products[0] = 1;
        right_products[inputLength - 1] = 1;

        for (int i=1; i < inputLength; i++){
            left_products[i] = input[i-1] * left_products[i-1];
        }
        System.out.println("Left Product :: "+java.util.Arrays.toString(left_products));
        for (int i=inputLength-2; i >=0; i--){
            right_products[i] = input[i+1] * right_products[i+1];
        }
        System.out.println("Right Product :: "+java.util.Arrays.toString(right_products));
        for (int i=0; i < inputLength; i++){
            output[i] = left_products[i] * right_products[i];
        }
        return  output;
    }

    /* Efficient in-place solution using single array */
    int[] productArrayWithOneOutputArray(int[] input, int inputLength){
        int[] output = new int[inputLength];
        output[0] = 1;

        for (int i=1; i < inputLength; i++){
            output[i] = input[i-1] * output[i-1];
        }
        System.out.println("Left Product :: "+java.util.Arrays.toString(output));
        int r = 1;
        for (int i=inputLength-1; i >=0; i--){
            output[i] = r * output[i];
            r = r * input[i];
        }

        return  output;
    }
}
