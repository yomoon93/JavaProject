public class Errors {
    public static void main(String[] args) {


     int[] num = new int[8];
        String[] arr = new String[4];
        arr[0] = "Kevin";
        arr[1] = "Shabrina";
        arr[2] = "Brooke";
        arr[3] = "Blake";
     try{

         arr[4] = "Conor";

         for(int i = 0; i < num.length; i++){
            num[i] = i;
             System.out.println(num);
         }
     }catch(ArrayIndexOutOfBoundsException e){
         System.err.println("You're outside the length of the array can't add more to the array" );
        }


    }

}
