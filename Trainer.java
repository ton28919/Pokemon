import java.util.ArrayList;

public class Trainer {
	ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

	public String showStatus(ArrayList<Pokemon> pokemons,int member){
        String name = "############################ Status ########################### \n"+"Name: "+ pokemons.get(member).getName();
        String hp = "\nHealth: "+pokemons.get(member).getHealth() + "/" + pokemons.get(member).getMaxHealth();
        String weight = "\nWeight: " + pokemons.get(member).getWeight() + " kg";  
        String feeling = "\nFeeling: " + pokemons.get(member).getFeeling() + " points";
        String energy = "\nEnergy: " + pokemons.get(member).getEnergy() + " %";
        return name+hp+weight+energy+feeling;
    }
	
	public void eatBerry(int member){
        Berry berry = new Berry(0);
        pokemons.get(member).eat(berry);
	}
	
	public void eatGoldBerry(int member){
        Berry berry = new Berry(1);
        pokemons.get(member).eat(berry);
	}
	
	public void eatMysteryBerry(int member){
        Berry berry = new Berry(2);
        pokemons.get(member).eat(berry);
	}
	
	public void exercise(int member) {
		pokemons.get(member).exercise();
	}
	
	public void sleep(int member) {
		pokemons.get(member).sleep();
	}
	
	public double getFeeling(int member) {
		return pokemons.get(member).getFeeling();
	}
	
	public void goodFeeling(int member) {
		pokemons.get(member).goodFeeling();
	}
	
	public void badFeeling(int member) {
		pokemons.get(member).badFeeling();
	}
	
	public double getEnergy (int member) {
		return pokemons.get(member).getEnergy();
	}
	
}