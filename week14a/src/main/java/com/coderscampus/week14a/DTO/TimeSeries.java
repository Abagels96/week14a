package com.coderscampus.week14a.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimeSeries {
	@JsonProperty("2025-04-17")
	 private StockData stockData1;

	public StockData getStockData1() {
		return stockData1;
	}

	public void setStockData1(StockData stockData1) {
		this.stockData1 = stockData1;
	}

}
