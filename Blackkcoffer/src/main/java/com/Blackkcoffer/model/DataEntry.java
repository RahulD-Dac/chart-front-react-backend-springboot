package com.Blackkcoffer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class DataEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column 
    private int endYear;
    @Column
    private String cityLng;
    @Column
    private String cityLat;
    private int intensity;
    private String sector;
    private String topic;
    private String insight;
    private String SWOT;
    private String url;
    private String region;
    private String startYear;
    private String impact;
    private String added;
    private String published;
    private String city;
    private String country;
    private int relevance;
    private String PESTLE;
    private String source;
    private String title;
    private int likelihood;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEndYear() {
		return endYear;
	}
	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}
	public String getCityLng() {
		return cityLng;
	}
	public void setCityLng(String cityLng) {
		this.cityLng = cityLng;
	}
	public String getCityLat() {
		return cityLat;
	}
	public void setCityLat(String cityLat) {
		this.cityLat = cityLat;
	}
	public int getIntensity() {
		return intensity;
	}
	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getInsight() {
		return insight;
	}
	public void setInsight(String insight) {
		this.insight = insight;
	}
	public String getSwot() {
		return SWOT;
	}
	public void setSwot(String swot) {
		this.SWOT = SWOT;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getStartYear() {
		return startYear;
	}
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	public String getImpact() {
		return impact;
	}
	public void setImpact(String impact) {
		this.impact = impact;
	}
	public String getAdded() {
		return added;
	}
	public void setAdded(String added) {
		this.added = added;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getRelevance() {
		return relevance;
	}
	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}
	public String getPestle() {
		return PESTLE;
	}
	public void setPestle(String pestle) {
		this.PESTLE = pestle;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLikelihood() {
		return likelihood;
	}
	public void setLikelihood(int likelihood) {
		this.likelihood = likelihood;
	}

    
}
