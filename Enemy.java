package LatihanPBO.Polymorphism.Tugas;

public class Enemy extends Character {
   
   public Enemy(String nama){
    super(nama);
   }

   @Override
   public void move(){
    System.out.println(nama + " menghilang seperti ninja.");
}
public void move(int step){
    System.out.println(nama + " bergerak " + step + " langkah.");
}
}
