# Taok-Collector-Api

---

It is an API to be used in the "taok-collector" project. This module will help create a pattern to help java developers contribute.



### Collector

This is main class to any implementation, any implementation should return a `CollectedLaunch` List using this interface.  

```java
public interface Collector {

	public List<CollectedLaunch> collectNow(Search search);
}
```

## Standard

Exist same Class that we will used by default, this classes will create in standard package.

> br.com.taok.collector.api.model.standard

### CollectedLaunch

This is an class that will represent the a `Launch`, any API of `Portal da Transparencia` must return data that can be used to create this Object.  

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

Decription

### Search

Description   

```java
public class Search {

	private LocalDate startDate;
	private LocalDate endDate;
	private Provider provider;
	private PublicCompany publicCompany;
}
```
#### Attributes

- *startDate*

  Description  

- *endDate*

  Description