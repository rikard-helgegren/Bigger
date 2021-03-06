import java.util.LinkedList;


/*
 *  These are the main directions that a location can be added.
 *  To enter an area either type the short as written below or type "enter" followed by the location name.
 *  
 *   ________ _______ _______
 *   I       I       I       I 
 *   I  NW   I   N   I  NE   I
 *   I_______I_______I_______I
 *   I       I Up/   I       I 
 *   I  W    I Down/ I  E    I
 *   I       I Stay  I       I 
 *   I_______I_______I_______I
 *   I       I       I       I
 *   I  SW   I   S   I  SE   I
 *   I_______I_______I_______I   
 * 
 */


public class Location extends GameObject{

	private LinkedList<Passageway> passageways = new LinkedList<Passageway>();  //path, road, Window, doors, hidden door
	private LinkedList<Item> ThingsPressent = new LinkedList<Item>();
	private LinkedList<NPC> NpcPressent = new LinkedList<NPC>(); //The player excluded

	public Location(String name){//Initiating a new location
		super(name);

	}

	public Location(String name, String direction, Location currentLocation){//Initiating a new location
		super(name);
		Passageway main = new Passageway(this, currentLocation);
		passageways.add(main);

	}
	public void  inspectLocation() {
		getDescription();
		getPassageways();
		getThingsPressent();
		getNpcPressent();
	}

	public LinkedList<Passageway> getPassageways() {
		return passageways;
	}

	public void setPassageways(LinkedList<Passageway> passageways) {
		this.passageways = passageways;
	}

	public LinkedList<Item> getThingsPressent() {
		return ThingsPressent;
	}

	public void setThingsPressent(LinkedList<Item> thingsPressent) {
		ThingsPressent = thingsPressent;
	}

	public LinkedList<NPC> getNpcPressent() {
		return NpcPressent;
	}

	public void setNpcPressent(LinkedList<NPC> npcPressent) {
		NpcPressent = npcPressent;
	}
}
