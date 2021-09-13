public class Mammal{
    private int EnergyLevel;

    public Mammal(int EnergyLevel){
        this.EnergyLevel = EnergyLevel;
    }

    public int getEnergyLevel(){
        return EnergyLevel;
    }

    public void setEnergyLevel(int EnergyLevel){
        this.EnergyLevel = EnergyLevel;
    }

    public void reduceEnergyLevel(int number){
        this.EnergyLevel -= number;
    }

    public void increaseEnergyLevel(int number){
        this.EnergyLevel += number;
    }

    public int displayEnergy(){
        System.out.println(EnergyLevel);
        return EnergyLevel;
    }
}
