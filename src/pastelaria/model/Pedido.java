package pastelaria.model;

public class Pedido extends NotaFiscal{
	
	private int numeroPedido;

	public Pedido( String servico, String destinatario,float valor,int id,int numeroPedido) {
		super( servico, destinatario, valor,id);
		this.numeroPedido=numeroPedido;
		// TODO Auto-generated constructor stub
	}
	public void visualizar() {
		super.visualizar();
		
	}
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

}
