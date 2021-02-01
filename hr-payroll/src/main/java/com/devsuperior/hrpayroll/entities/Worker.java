package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;

public class Worker implements Serializable {
	
	private static final long serialVersionUID = 1L;
		
		private Long id;
		private String name;
		private Double dailyIncome;
		
		public Worker() {
		}

		public Worker(Long id, String name, Double dailyincome) {
			super();
			this.id = id;
			this.name = name;
			this.dailyIncome = dailyincome;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getDailyIncome() {
			return dailyIncome;
		}

		public void setDailyincome(Double dailyincome) {
			this.dailyIncome = dailyincome;
		}

}
