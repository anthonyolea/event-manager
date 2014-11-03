/*
 * Created on 3 nov. 2014 ( Time 14:40:50 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
// This Bean has a composite Primary Key  


package fr.emn.eventmanager.bean;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

/**
 * Persistent class for entity stored in table "PARTICIPANT"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="PARTICIPANT", schema="APP" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="Participant.countAll", query="SELECT COUNT(x) FROM Participant x" )
} )
public class Participant implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( EMBEDDED IN AN EXTERNAL CLASS )  
    //----------------------------------------------------------------------
	@EmbeddedId
    private ParticipantKey compositePrimaryKey ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public Participant() {
		super();
		this.compositePrimaryKey = new ParticipantKey();       
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE COMPOSITE KEY 
    //----------------------------------------------------------------------
    public void setParticipantEventId( Integer participantEventId ) {
        this.compositePrimaryKey.setParticipantEventId( participantEventId ) ;
    }
    public Integer getParticipantEventId() {
        return this.compositePrimaryKey.getParticipantEventId() ;
    }
    public void setParticipantCustomerId( Integer participantCustomerId ) {
        this.compositePrimaryKey.setParticipantCustomerId( participantCustomerId ) ;
    }
    public Integer getParticipantCustomerId() {
        return this.compositePrimaryKey.getParticipantCustomerId() ;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        if ( compositePrimaryKey != null ) {  
            sb.append(compositePrimaryKey.toString());  
        }  
        else {  
            sb.append( "(null-key)" ); 
        }  
        sb.append("]:"); 
        return sb.toString(); 
    } 

}
