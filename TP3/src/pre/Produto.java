package pre;

public abstract class Produto {
	protected String nomeProduto;
	protected String linhaProduto;
	protected int tamanhoProduto;
	protected String marcaProduto;
	protected float precoProduto;
	

	public Produto(String nomeProduto, String linhaProduto, int tamanhoProduto, String marcaProduto, float precoProduto) {
		this.nomeProduto = nomeProduto;
		this.linhaProduto = linhaProduto;
		this.tamanhoProduto = tamanhoProduto;
		this.marcaProduto = marcaProduto;
		this.precoProduto = precoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public String getLinhaProduto() {
		return linhaProduto;
	}

	public void setLinhaProduto(String linhaProduto) {
		this.linhaProduto = linhaProduto;
	}

	public int getTamanhoProduto() {
		return tamanhoProduto;
	}

	public void setTamanhoProduto(int tamanhoProduto) {
		this.tamanhoProduto = tamanhoProduto;
	}	

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}	
	
	public float getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}
}