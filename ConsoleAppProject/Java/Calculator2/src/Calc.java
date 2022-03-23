
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 100157578
 */
      
class Calc 
{ 
    int a,b;
    
    
    public Calc(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    
    /*
    
    */
    public int add()
    {
        return a+b;
    }
    public int sub()
    {
        return a-b;
    }        
    public int mul()
    {
        return a*b;
    }        
    public int div ()
    {
        return a/b;
    }
    
    /*
    Main Program
    */
    public static void main(String args[])
    {
        Scanner sr=new Scanner(System.in);
        System.out.print("Enter a : ");
        int a=sr.nextInt();
        System.out.print("Enter b : ");
        int b=sr.nextInt();
        System.out.print("Enter the operation (+,-,*,/) : ");
        String op=sr.next();
        int c=0;
        Calc obj=new Calc(a,b);
        switch(op){
            case "+": c=obj.add(); break;
            case "-": c=obj.sub(); break;
            case "*": c=obj.mul(); break;
            case"/": c=obj.div(); break;
            default: System.out.println("Invalid operation code!!!");
        
        }
        System.out.println(a + op + b + "=" + c);
         
    }
    
    
}
