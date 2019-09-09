package br.com.taok.collector.api.model.standard;

import java.util.List;

public interface NormalizeLaunch {

	public List<CollectedLaunch> normalize(List<String[]> datas);
}
