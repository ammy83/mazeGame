package mazegame.entity;

public class NonPlayerCharacter extends Character {
	private Boolean hostile;
	private String conversation;
	private Inventory inventory;


    public NonPlayerCharacter()
    {
    }

    public NonPlayerCharacter(String name, int agility, int lifepoints, int strength,Boolean hostile) {

        super(name);
        this.hostile = hostile;
        super.setStrength(strength);
        super.setAgility(agility);
        super.setLifePoints(lifepoints);
        inventory = new Inventory();

    }
    public String getName(){
        return super.getName();
    }

    public boolean getHostile () {
    	return this.hostile;
    }
    
    public void setHostile (boolean hostile) {
    	this.hostile = hostile;
    }

    @Override
    public int getStrength() {
        return super.getStrength();
    }

    @Override
    public int getAgility() {
        return super.getAgility();
    }

    @Override
    public int getLifePoints() {
        return super.getLifePoints();
    }

    @Override
    public String toString() {
        String hostility;
        if (hostile){
            hostility = "Yes";
        }
        else {
            hostility = "No";
        }
        return "NonPlayerCharacter\n**********************\n" +
                "Character name :: " + getName()+
                "\n**********************\nhostile? ::" + hostility +
                "\n**********************\n";
    }

    public String getConversation() {
        return conversation;
    }

    public void setConversation(String conversation) {
        this.conversation = conversation;
    }

}
