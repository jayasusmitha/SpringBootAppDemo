package com.howtodoinjava.demo.model;

public class Result {
	public Result() {
	}
	
	public Result(Integer result) {
		super();
		this.result = result;
	}
	
	private Integer result;

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Result [result=" + result + "]";
	}
	
}
