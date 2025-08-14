public class Uchiha extends Ninja {
    public Uchiha() {
        this.name = "Sasuke Uchiha";
        this.age = 16;
        this.clan = "Uchiha";
    }
    public void apresentar() {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Clã: " + clan);
        System.out.println("Jutsu: Chidori");
        System.out.println("Habilidade: Sharingan");    
        System.out.println("Objetivo: Vingar o clã Uchiha");
           System.out.println();
    }
}