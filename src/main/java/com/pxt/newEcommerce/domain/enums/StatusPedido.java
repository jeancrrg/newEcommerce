package com.pxt.newEcommerce.domain.enums;

public enum StatusPedido {

	PROCESSANDO(1),
	AGUARDANDO_PAGAMENTO(2),
	ANALISE(3),
	RESERVADO(4),
	ROTEIRIZADO(5),
	FATURADO(6), 
	CANCELADO(7),
	FINALIZADO(8);
	 
	private Integer codigo;
	
	private StatusPedido(Integer codigo) {
		this.codigo = codigo;
	}
	
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public static StatusPedido retornarStatus(Integer codigo) {
		for(StatusPedido status : StatusPedido.values()) {
			if(status.getCodigo() == codigo) {
				return status;
			}
		}
		throw new IllegalArgumentException("Código de status inválido! ");
	}
}
