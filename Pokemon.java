
class Pokemon{
	public final double maxHealth;
	protected double health,weight;
	protected String name;
	protected double feeling, energy;

	public Pokemon(String name, double maxHealth,double weight, double feel){
		this.name      = name;
		this.health    = maxHealth;
		this.maxHealth = maxHealth;
        this.weight    = weight;
        this.feeling   = feel;
        this.energy    = 100;
	}
        
    public double getWeight(){
    	return this.weight;
    }
    
    public double getEnergy(){
    	return this.energy;
    }
    
	public double getHealth(){
		return this.health;
	}
	
	public double getMaxHealth(){
		return this.maxHealth;
	}

	public String getName(){
		return this.name;
	}
	
	public double getFeeling(){
		return this.feeling;
	}
	
	public void eat(Berry berry){
		this.health += berry.getRestoreValue();
		this.weight += (0.5)*berry.getRestoreValue();
		this.energy -= 1;
		if(this.health > this.maxHealth)
			this.health = this.maxHealth;
		if(this.energy < 0)
			this.energy = 0;
	}
	
	public void exercise() {
		this.weight -= 1;
		this.energy -= 3;
		this.health -= 1;
		if(this.weight <= 1)
			this.weight = 1;
		if(this.energy < 0)
			this.energy = 0;
		if(this.health < 0)
			this.health = 0;
	}
	
	public void sleep( ) {
		this.energy += 5;
		if(this.energy > 100)
			this.energy = 100;
	}

	public void goodFeeling() {
		this.feeling += 10;
	}
	
	public void badFeeling( ) {
		this.feeling -= 5 ;
		if(this.feeling < 0)
			feeling = 0;
	}

}