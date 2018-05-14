
public class Main {
public static void main(String [] args) throws InterruptedException {
   String str = "Марян Тупий";
    for(int i = 1;i<2004;i++){
            for(int j = 0; j <str.length();j++){
                Thread.sleep(500);
                System.out.print(str.charAt(j));

            }



   }
}

}
