package com.coderscampus.week14a.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaData {
	@JsonProperty("2. Symbol")
private String symbol;
@JsonProperty("1. Information")
private String information;
@JsonProperty("4. Output Size")
private String outputSize;
@JsonProperty("5. Time Zone")
private String timeZone;
@JsonProperty("3. Last Refreshed")
private String lastRefreshed;
public String getSymbol() {
	return symbol;
}
public void setSymbol(String symbol) {
	this.symbol = symbol;
}
public String getInformation() {
	return information;
}
public void setInformation(String information) {
	this.information = information;
}

public String getOutputSize() {
	return outputSize;
}
public void setOutputSize(String outputSize) {
	this.outputSize = outputSize;
}
public String getTimeZone() {
	return timeZone;
}
public void setTimeZone(String timeZone) {
	this.timeZone = timeZone;
}
public String getLastRefreshed() {
	return lastRefreshed;
}
public void setLastRefreshed(String lastRefreshed) {
	this.lastRefreshed = lastRefreshed;
}

}
