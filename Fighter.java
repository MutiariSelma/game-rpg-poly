package LatihanPBO.Polymorphism.Tugas;

public class Fighter extends Hero {
   public Fighter(String nama){
    super(nama);
   }

   @Override
   public void move(){
    System.out.println(nama + " sedang menggunakan sepeda.");
   }

   public void move(String direction){
    System.out.println(nama + " sedang bergerak cepat kearah " + direction);
   }
}

