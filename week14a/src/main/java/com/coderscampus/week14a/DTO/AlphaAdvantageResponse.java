package com.coderscampus.week14a.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlphaAdvantageResponse {
	@JsonProperty("Meta Data")
	private MetaData metaData;
	@JsonProperty("Time Series (Daily)")
	private TimeSeries timeSeries;
	public MetaData getMetaData() {
		return metaData;
	}
	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}
	public TimeSeries getTimeSeries() {
		return timeSeries;
	}
	public void setTimeSeries(TimeSeries timeSeries) {
		this.timeSeries = timeSeries;
	}
	
	

}
