/**
 * 
 */
package it.unibo.oop.lab.enum2;
import static it.unibo.oop.lab.enum2.Place.*;
/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
    BASKET (INDOOR, 5,"Basket"),
    VOLLEY (INDOOR, 6, "volley"),
    TENNIS (OUTDOOR, 1,"tennis"),
    F1 (OUTDOOR, 1, "F1"),
    BIKE (OUTDOOR, 1,"bike"),
    MOTOGP (OUTDOOR, 1, "motogp"),
    SOCCER (OUTDOOR, 11,"soccer");
    
    
   
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
    
    private final Place p;
    private final String sportName ;
    private final int teamMates ;
    
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
    

    Sport(Place p, int teamMetes, String sportName) {
	// TODO Auto-generated constructor stub
	this.p = p;
	this.teamMates = teamMetes;
	this.sportName = sportName;
    }

   

 

    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
    public boolean isIndividualSport() {
	return this.teamMates == 1;
    }
    
    public boolean isIndoorSport() {
	return this.p == INDOOR;
    }
    
    public Place getPlace() {
    return this.p;
    }
    
    public String toString() {
	return "sport name : "+ this.sportName +" place : "+ this.p + " number of members :"+ this.teamMates;
    }
}
