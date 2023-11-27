package pastelaria.model;

public class Pedido extends NotaFiscal{
	private float CFOP = 1.102f;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;

	public Pedido( String servico, String destinatário,String emissor, float valor, int id) {
		super( servico, destinatário, emissor, valor);
		this.id=id;
		// TODO Auto-generated constructor stub
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("id do pedido: " + this.getId());
		
	}

}
