/*
 * Created on 3 nov. 2014 ( Date ISO 2014-11-03 - Time 12:06:17 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package fr.emn.eventmanager.persistence;

/**
 * Persistence configuration  
 * 
 * @author Telosys Tools
 *
 */
public class PersistenceConfig {

	
	/**
	 * Different types of implementation
	 */
	public final static int FAKE = 0 ;
	public final static int JPA  = 1 ;
	public final static int LPA  = 2 ;
	

	/**
	 * Current implementation to be used
	 */
	//public static final int PERSISTENCE_IMPLEMENTATION_TYPE = FAKE ;
	public static final int PERSISTENCE_IMPLEMENTATION_TYPE = JPA ;
	
	
	/**
	 * JPA Persistence Unit name defined in "persistence.xml" file
	 */
	public static final String JPA_PERSISTENCE_UNIT_NAME = "persistence-unit1";
	

}
