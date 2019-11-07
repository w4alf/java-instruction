package business;

public class DndCharacter {

	private int id;
	private String name;
	private String dndClass;
	private int level;
	private int strength;
	private int intelligence;
	private int wisdom;
	private int dexterity;
	private int constitution;
	private int charisma;
	private int goldPieces;
	private int expPoints;
	private int armorClass;
	private String armor;
	private int hitPoints;

	public DndCharacter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DndCharacter(int id, String name, String dndClass, int level, int strength, int intelligence, int wisdom,
			int dexterity, int constitution, int charisma, int goldPieces, int expPoints, int armorClass, String armor,
			int hitPoints) {
		super();
		this.id = id;
		this.name = name;
		this.dndClass = dndClass;
		this.level = level;
		this.strength = strength;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.charisma = charisma;
		this.goldPieces = goldPieces;
		this.expPoints = expPoints;
		this.armorClass = armorClass;
		this.armor = armor;
		this.hitPoints = hitPoints;
	}

	public DndCharacter(String name, String dndClass, int level, int strength, int intelligence, int wisdom,
			int dexterity, int constitution, int charisma, int goldPieces, int expPoints, int armorClass, String armor,
			int hitPoints) {
		super();
		this.name = name;
		this.dndClass = dndClass;
		this.level = level;
		this.strength = strength;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.charisma = charisma;
		this.goldPieces = goldPieces;
		this.expPoints = expPoints;
		this.armorClass = armorClass;
		this.armor = armor;
		this.hitPoints = hitPoints;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dndClass
	 */
	public String getDndClass() {
		return dndClass;
	}

	/**
	 * @param dndClass the dndClass to set
	 */
	public void setDndClass(String dndClass) {
		this.dndClass = dndClass;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	/**
	 * @return the wisdom
	 */
	public int getWisdom() {
		return wisdom;
	}

	/**
	 * @param wisdom the wisdom to set
	 */
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	/**
	 * @return the dexterity
	 */
	public int getDexterity() {
		return dexterity;
	}

	/**
	 * @param dexterity the dexterity to set
	 */
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	/**
	 * @return the constitution
	 */
	public int getConstitution() {
		return constitution;
	}

	/**
	 * @param constitution the constitution to set
	 */
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	/**
	 * @return the charisma
	 */
	public int getCharisma() {
		return charisma;
	}

	/**
	 * @param charisma the charisma to set
	 */
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	/**
	 * @return the goldPieces
	 */
	public int getGoldPieces() {
		return goldPieces;
	}

	/**
	 * @param goldPieces the goldPieces to set
	 */
	public void setGoldPieces(int goldPieces) {
		this.goldPieces = goldPieces;
	}

	/**
	 * @return the expPoints
	 */
	public int getExpPoints() {
		return expPoints;
	}

	/**
	 * @param expPoints the expPoints to set
	 */
	public void setExpPoints(int expPoints) {
		this.expPoints = expPoints;
	}

	/**
	 * @return the armorClass
	 */
	public int getArmorClass() {
		return armorClass;
	}

	/**
	 * @param armorClass the armorClass to set
	 */
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}

	/**
	 * @return the armor
	 */
	public String getArmor() {
		return armor;
	}

	/**
	 * @param armor the armor to set
	 */
	public void setArmor(String armor) {
		this.armor = armor;
	}

	/**
	 * @return the hitPoints
	 */
	public int getHitPoints() {
		return hitPoints;
	}

	/**
	 * @param hitPoints the hitPoints to set
	 */
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", dndClass=" + dndClass + ", level=" + level
				+ ", strength=" + strength + ", intelligence=" + intelligence + ", wisdom=" + wisdom + ", dexterity="
				+ dexterity + ", constitution=" + constitution + ", charisma=" + charisma + ", goldPieces=" + goldPieces
				+ ", expPoints=" + expPoints + ", armorClass=" + armorClass + ", armor=" + armor + ", hitPoints="
				+ hitPoints;
	}

	
	
}