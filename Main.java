public class Main {
  public static void main(String[] args) {
    Main m = new Main();
     
     
      long start=System.nanoTime();
     Main.findNemo(new String[] { "Dory", "Nemo" });
     long end=System.nanoTime();
     System.out.println(end-start);

     start=System.nanoTime();
    Main.findNemo(new String[] { "Dory","Bob","Patrick","Spongebob","Squidward","Timon","Pumba", "Nemo" });
    end=System.nanoTime();
     System.out.println(end-start);
     
  }

  public static void findNemo(String[] array) {
    
    for (int i = 0; i < array.length; i++) {
       if(array[i].equals("Nemo")){
        System.out.println(array[i]);
      }
    }
    
    
  }


}