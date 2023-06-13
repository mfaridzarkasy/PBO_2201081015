/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faridz040423;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ACER
 */
public class ContohArray1 {
    public static void main(String[] args){
        int angka[] = new int[10];
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.print("Input nilai ke = ");
            angka[0] = Integer.parseInt(dataIn.readLine());
        }catch(Exception ex) {
        };
        System.out.print("Nilai ke = "+angka[0]);
        
    }
}
