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

	public Collector collectNow(Search search);
	public List<CollectedLaunch> launchs();
	public List<Provider> providers();
	public BigDecimal amount();
}
