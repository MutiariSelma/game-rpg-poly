package LatihanPBO.Polymorphism.Tugas;

public class Character {
    protected String nama;
    
    public Character(String nama){
        this.nama = nama;
    }
    
    public void move(){
        System.out.println(this.nama + " sedang bergerak.");
    }
}
