
/*
 * Created on 3 nov. 2014 ( Time 14:40:50 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package fr.emn.eventmanager.mock;

import java.util.LinkedList;
import java.util.List;

import fr.emn.eventmanager.bean.Event;
import fr.emn.eventmanager.mock.tool.MockValues;

public class EventMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public Event createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextInteger() );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public Event createInstance( Integer eventId ) {
		Event entity = new Event();
		// Init Primary Key fields
		entity.setEventId( eventId) ;
		// Init Data fields
		entity.setEventName( mockValues.nextString(50) ) ; // java.lang.String 
		entity.setEventLocation( mockValues.nextString(50) ) ; // java.lang.String 
		entity.setEventStartDatetime( mockValues.nextDate() ) ; // java.util.Date 
		entity.setEventEndDatetime( mockValues.nextDate() ) ; // java.util.Date 
		// Init Link fields (if any)
		// setCustomer( TODO ) ; // Customer 
		// setListOfCustomer( TODO ) ; // List<Customer> 
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<Event> createList(int count) {
		List<Event> list = new LinkedList<Event>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
