package pastelaria.model;

public abstract class NotaFiscal {
	
	

	private float CFOP = 1.102f;
	private String servico;
	private String destinatario;
	private String emissor = "rua dos pastel";
	private float Valor;
	
	public float getCFOP() {
		return CFOP;
	}
	
	public String getServico() {
		return servico;
	}
	
	public void setServico(String servico) {
		this.servico = servico;
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public String getEmissor() {
		return emissor;
	}
	
	public float getValor() {
		return Valor;
	}
	
	public void setValor(float valor) {
		Valor = valor;
	}
	
	public NotaFiscal(String servico, String destinatario, String emissor, float valor) {
		super();
		this.servico = servico;
		this.destinatario = destinatario;
		this.emissor = emissor;
		Valor = valor;
	}
	public void visualizar() {
		System.out.println("\n\n***************************************");
		System.out.println("Dados da nota fiscal");
		System.out.println("***************************************");
		System.out.println("Código Fiscal de Operações e Prestações: " + this.getCFOP());
		System.out.println("o tipo de servico e: " + this.getServico());
		System.out.println("o destinatário e: " + this.getDestinatario());
		System.out.println("o emissor e: " + getEmissor());
		System.out.println("o valor e: " + this.getValor());
	}
}
