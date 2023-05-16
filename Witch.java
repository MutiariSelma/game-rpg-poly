package LatihanPBO.Polymorphism.Tugas;

public class Witch extends Enemy {
    public Witch(String nama){
      super(nama);
    }

    @Override
    public void move(){
      System.out.println(nama + " sedang terbang menggunakan karpet.");
  }

  public void move(int step){
    System.out.println(nama + " sedang berjalan" + step + " langkah.");
  }
 
}
