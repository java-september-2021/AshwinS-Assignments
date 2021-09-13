public class Bat extends Mammal{
    public Bat(){
        super(300);
    }
    public void Fly(){
        System.out.println("Whhoooooooshhh!");
        reduceEnergyLevel(50);
    }

    public void eatHumans(){
        increaseEnergyLevel(25);
    }

    public void attackTown(){
        System.out.println("AHHHHH The Town is under attack!!!");
        reduceEnergyLevel(100);
    }
}