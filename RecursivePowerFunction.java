/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursivepowerfunction;

/**
 *
 * @author lilli
 */
public class RecursivePowerFunction {

    public static int recursivePower(int a, int b){
        if (b ==0){ //base case
            return 1; //any number to the 0 power is 1
        }
        return a * recursivePower(a,b-1); //recursive step
    }
    
    public static int bonusPoints(int a, int b){ //function for the bonus points
        if (b==0){ //base case
            return 1;
        }
        int half = bonusPoints(a, b/2); //recursive function
        if (b%2 ==0 ){ //if exponent is even
            return half *half;
        } else { //if exponent is odd
            return a*half*half;
        }
    }
    
    
    public static void main(String[] args) {
        System.out.println("6 to the power of 5 is "+ recursivePower(6,5));
        System.out.println("6 to the power of 5 is "+ bonusPoints(6,5));
    }
    
}
