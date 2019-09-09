package br.com.taok.collector.api;

import java.util.List;

import br.com.taok.collector.api.model.standard.CollectedLaunch;
import br.com.taok.collector.api.model.standard.Search;

public interface Collector {

	public List<CollectedLaunch> collectNow(Search search);
}
