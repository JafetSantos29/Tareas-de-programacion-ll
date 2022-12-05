//Suponiendo que x = 5 y y = 8, se produce la siguiente salida:
//@@@@@

public class elsesuelto2{
    public static void main(String[] args) {
        int x=5;
        int y=8;
        
        if (y==8){
            if (x==5){
                System.out.println("@@@@@");
            }
        }
        else{
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    }
}