package LatihanPBO.Polymorphism.Tugas;

public class Hero extends Character {
    public Hero (String nama){
        super(nama);
    }

    @Override
    public void move(){
        System.out.println(nama + " sedang berjalan.");
    }
    public void move(String direction){
        System.out.println(nama + " berjalan ke " + direction);
    }
}
