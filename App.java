package LatihanPBO.Polymorphism.Tugas;

public class App {
    public static void main(String[] args) {
        System.out.print("\nTugas Polymorphism" + "\nNama: Selma Mutiari Andini" + 
        "\nNIM: 225150600111033" + "\nKelas: PTI-C");
        System.out.println("\n----------------------------------------------------------------------------");

        Hero hero1 = new Hero("Hero 1: Batman");
        Enemy enemy1 = new Enemy("Enemy 1: Venom");

        System.out.println("Static Polymorphism yang ada pada class Hero dan Enemy");
        hero1.move();
        hero1.move("Selatan");

        enemy1.move();
        enemy1.move(10);

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Dynamic Polymorhism sebuah referensi dari class Character ke objek class");
        Character karakter1 = new Character("Karakter: Naruto");
        Character hero2 = new Hero("Hero 2: Sasuke");
        Character enemy2 = new Enemy("Enemy 2: Joker");
        Character witch1 = new Witch("Witch 1: Wanda");
        Character figther1 = new Fighter("Fighter 1: Saitama");

        karakter1.move();
        hero2.move();
        enemy2.move();
        witch1.move();
        figther1.move();

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Dynamic Polymorphism sebuah referensi dari Class Character ke objek Witch yang di-cast menjadi objek Fighter");
        Character witch2 = new Witch("Nenek Lampir");
        try {
            ((Fighter)witch2).move();
        } catch (Exception e) {
           System.out.println("error:" + e.getMessage());
        }
    }
}
