public class Bit {
    public static void main(String[] args){
        // Set Bit
        int n =5;
        int position =2;
        int bitMask= 1<<position;
        if( (bitMask & n)==0){
            System.out.println("the number is 0");
        }
            else
            {
                System.out.println("number is 1");
            }
        
        
    }

    
}
