package br.com.taok.collector.api;

import java.math.BigDecimal;
import java.util.List;

import br.com.taok.collector.api.model.Provider;
import br.com.taok.collector.api.model.standard.CollectedLaunch;
import br.com.taok.collector.api.model.standard.Search;

/**
 * 
 * Class that will standardize the data collect
 * 
 * */
public interface Collector {

	/**
	 * 
	 * Trigger the data collect
	 * 
	 * @param {@link Search}
	 * 
	 * */
	public Collector collectNow(Search search);
	
	/**
	 * 
	 * get all launches collected 
	 * 
	 * */
	public List<CollectedLaunch> launches();
	
	/**
	 * 
	 * return all {@link Provider} found in launches collected
	 * 
	 * */
	public List<Provider> providers();
	
	
	/**
	 * 
	 * total value of launches
	 * 
	 * */
	public BigDecimal amount();
}
