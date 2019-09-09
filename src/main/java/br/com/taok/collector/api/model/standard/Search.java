package br.com.taok.collector.api.model.standard;

import java.time.LocalDate;

import br.com.taok.collector.api.model.Provider;
import br.com.taok.collector.api.model.PublicCompany;

public class Search {

	private LocalDate startDate;
	private LocalDate endDate;
	private Provider provider;
	private PublicCompany publicCompany;

	public Search() {}
	
	public Search(LocalDate startDate, LocalDate endDate, Provider provider, PublicCompany publicCompany) {

		this.startDate = startDate;
		this.endDate = endDate;
		this.provider = provider;
		this.publicCompany = publicCompany;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public Provider getProvider() {
		return provider;
	}
	public PublicCompany getPublicCompany() {
		return publicCompany;
	}
}
