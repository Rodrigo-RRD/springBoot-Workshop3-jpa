package com.rodrigo.course.entities.enums;

public enum OrderStatus {
	//o java atribui para cada tipo enumerado um numero para aparecer no banco, comeca em 0
WAITING_PAYMENT(1),
PAID(2),
SHIPPED(3),
DELIVERED(4),
CANCELED(5);
	
	private int code;
	private OrderStatus(int code) {
		this.code = code;
	}
	public int getCode() {
		return code;
	}
	public static OrderStatus valueOf(int code) {
		//percorrer todos os valores possiveis do orderStatus que sao os cinco de cima e pra cada um dele vai 
		//testar se o codigo é o codigo correspondente se for retorna o codigo
		for(OrderStatus value : OrderStatus.values()) { 
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
