
//Program about enter the roll number of student to get the group they belong
import java.util.*;

class Group {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter Your Roll No. ");  
        int a= sc.nextInt();
        Sapphire(a);
        Perl(a);
        Ruby(a);
        Emerald(a);
    }
    
    public static void Sapphire(int a){
        for (int i = 1; i < 100; i+=4) {
            if(a==i){
                System.out.println(a+" is in Sapphire group");
            }
        }
    }
    public static void Perl(int a){
        for (int i = 2; i < 100; i+=4) {
            if(a==i){
                System.out.println(a+" is in Perl group");
            }
        }
    }
    public static void Ruby(int a){
        for (int i = 3; i < 100; i+=4) {
            if(a==i){
                System.out.println(a+" is in Ruby group");
            }
        }
    }
    public static void Emerald(int a){
        for (int i = 4; i < 100; i+=4) {
            if(a==i){
                System.out.println(a+" is in Emerald group");
            }
        }
    }
}