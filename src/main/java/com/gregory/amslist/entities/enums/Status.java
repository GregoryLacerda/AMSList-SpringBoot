package com.gregory.amslist.entities.enums;

public enum Status {
	WATCHING(1),
	READING(2),
	COMPLETED(3),
	PLAN_TO_READ(4),
	PLAN_TO_WATCH(5),
	DROPPED(6);
	
	private int code;

	private Status(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	public static Status valueOf(int code) {
		for (Status value : Status.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Ivalid Status code");
	}
	
}
