/*
 * Created on 28 oct. 2014 ( Time 22:18:22 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package fr.emn.eventmanager.persistence.service.fake;

import java.util.List;
import java.util.Map;

import fr.emn.eventmanager.bean.Customer;
import fr.emn.eventmanager.persistence.common.fake.GenericFakeService;
import fr.emn.eventmanager.persistence.service.CustomerPersistence;

/**
 * Fake persistence service implementation ( entity "Customer" )
 *
 * @author Telosys Tools Generator
 */
public class CustomerPersistenceFake extends GenericFakeService<Customer> implements CustomerPersistence {

	public CustomerPersistenceFake () {
		super(Customer.class);
	}
	
	protected Customer buildEntity(int index) {
		Customer entity = new Customer();
		// Init fields with mock values
		entity.setCustomerId( nextLong() ) ;
		entity.setCustomerEmail( nextString() ) ;
		entity.setCustomerPassword( nextString() ) ;
		entity.setCustomerFirstname( nextString() ) ;
		entity.setCustomerLastname( nextString() ) ;
		entity.setCustomerCompany( nextString() ) ;
		return entity ;
	}
	
	
	public boolean delete(Customer entity) {
		log("delete ( Customer : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( Long customerId ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(Customer entity) {
		log("insert ( Customer : " + entity + ")" ) ;
	}

	public Customer load( Long customerId ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<Customer> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<Customer> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<Customer> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public Customer save(Customer entity) {
		log("insert ( Customer : " + entity + ")" ) ;
		return entity;
	}

	public List<Customer> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

	@Override
	public long countAll() {
		return 0 ;
	}

}