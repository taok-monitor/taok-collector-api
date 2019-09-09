package br.com.taok.collector.api.model.standard;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.taok.collector.api.model.City;
import br.com.taok.collector.api.model.Provider;
import br.com.taok.collector.api.model.PublicCompany;

public class CollectedLaunch {

	private String identify;
	private City city;
	private PublicCompany publicCompany;
	private Provider provider;
	private LocalDate date;
	private BigDecimal value;
	public String getIdentify() {
		return identify;
	}
	public void setIdentify(String identify) {
		this.identify = identify;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public PublicCompany getPublicCompany() {
		return publicCompany;
	}
	public void setPublicCompany(PublicCompany publicCompany) {
		this.publicCompany = publicCompany;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identify == null) ? 0 : identify.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollectedLaunch other = (CollectedLaunch) obj;
		if (identify == null) {
			if (other.identify != null)
				return false;
		} else if (!identify.equals(other.identify))
			return false;
		return true;
	}
}
