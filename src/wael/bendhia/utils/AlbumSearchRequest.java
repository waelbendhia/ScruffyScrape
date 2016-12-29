package wael.bendhia.utils;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "albumSearchRequest")
public class AlbumSearchRequest {
	private String name;
	private int yearLower;
	private int yearHigher;
	private float ratingLower;
	private float ratingHigher;
	private boolean includeUnknown;
	private int page;
	private int numberOfResults;
	
	public AlbumSearchRequest(){}
	
	public AlbumSearchRequest(String name, int yearLower, int yearHigher, float ratingLower, float ratingHigher, boolean includeUnknown, int page, int numberOfResults) {
		this.name = name;
		this.yearLower = yearLower;
		this.yearHigher = yearHigher;
		this.ratingLower = ratingLower;
		this.ratingHigher = ratingHigher;
		this.includeUnknown = includeUnknown;
		this.page = page;
		this.numberOfResults = numberOfResults;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public int getYearLower() {
		return yearLower;
	}

	public void setYearLower(int yearLower) {
		this.yearLower = yearLower;
	}

	@XmlElement
	public int getYearHigher() {
		return yearHigher;
	}

	public void setYearHigher(int yearHigher) {
		this.yearHigher = yearHigher;
	}

	@XmlElement
	public float getRatingLower() {
		return ratingLower;
	}

	public void setRatingLower(float ratingLower) {
		this.ratingLower = ratingLower;
	}

	@XmlElement
	public float getRatingHigher() {
		return ratingHigher;
	}

	public void setRatingHigher(float ratingHigher) {
		this.ratingHigher = ratingHigher;
	}

	@XmlElement
	public boolean isIncludeUnknown() {
		return includeUnknown;
	}

	public void setIncludeUnknown(boolean includeUnknown) {
		this.includeUnknown = includeUnknown;
	}

	@XmlElement
	public int getPage() {
		return page;
	}

	public void setLimit(int page) {
		this.page = page;
	}

	@XmlElement
	public int getNumberOfResults() {
		return numberOfResults;
	}

	public void setNumberOfResults(int numberOfResults) {
		this.numberOfResults = numberOfResults;
	}

}
