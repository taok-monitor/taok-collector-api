# Taok-Collector-Api


It is an API to be used in the "taok-collector" project. This module will help create a pattern to help java developers contribute.



### Collector

This is main Component to any implementation, any implementation should return a `CollectedLaunch` **List** using this interface.  

```java
public interface Collector {

	public List<CollectedLaunch> collectNow(Search search);
}
```

## Standard

Exist some Classes that we will used by default, this classes will create in: 

> br.com.taok.collector.api.model.standard

### CollectedLaunch

This is a class that will represent the a `Launch`, any API of `Portal da Transparencia` must return data that can be used to create this Object.  

```java
public class CollectedLaunch {

	private String identify;
	private City city;
	private PublicCompany publicCompany;
	private Provider provider;
	private LocalDate date;
	private BigDecimal value;
}
```
#### Attributes

- identity

This field will represent the identity launch in your API, can be a 'Código do Empenho' 

### NormalizeLaunch

```java
public interface NormalizeLaunch {

	public List<CollectedLaunch> normalize(List<String[]> datas);
}

```
Each implementation must implement this interface to normalize its data before persisting into the database. 


### Search   

```java
public class Search {

	private LocalDate startDate;
	private LocalDate endDate;
	private Provider provider;
	private PublicCompany publicCompany;
}
```

This class we'll to send filter to be used for collector implementation, the implementation can used any attribute this class.