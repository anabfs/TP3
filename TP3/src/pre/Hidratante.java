package pre;

import java.util.ArrayList;

import teste.tp3;

public class Hidratante extends Produto {
	private String familiaHidratante;
	private String tipoHidratante;
	private String descricaoHidratante;

	public Hidratante(String nomeProduto, String linhaProduto, int tamanhoProduto, String marcaProduto, float precoProduto,
		String familiaHidratante, String tipoHidratante, String descricaoHidratante) {
		super(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto);
		this.familiaHidratante = familiaHidratante;
		this.tipoHidratante = tipoHidratante;
		this.descricaoHidratante = descricaoHidratante;
	}

	public static void cadastrarHidratante() {
		System.out.println("Digite o nome do Hidratante: ");
		String nomeProduto = tp3.sc.nextLine();

		System.out.println("Digite a linha do Hidratante: ");
		String linhaProduto = tp3.sc.nextLine();
		tp3.sc.nextLine();

		System.out.println("Digite o tamanho do Hidratante: ");
		int tamanhoProduto = tp3.sc.nextInt();
		tp3.sc.nextLine();

		System.out.println("Digite a marca do Hidratante: ");
		String marcaProduto = tp3.sc.nextLine();

		System.out.println("Digite o preco do Hidratante: ");
		float precoProduto = tp3.sc.nextFloat();

		System.out.println("Digite o familia indicado do Hidratante: ");
		String familiaHidratante = tp3.sc.nextLine();

		System.out.println("Digite o tipo do Hidratante: ");
		String tipoHidratante = tp3.sc.nextLine();

		System.out.println("Digite a descricao do Hidratante: ");
		String descricaoHidratante = tp3.sc.nextLine();

		tp3.sc.nextLine();

		Hidratante hidratante = new Hidratante(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto,
				familiaHidratante, tipoHidratante, descricaoHidratante);
		tp3.hidratante.add(hidratante);
	}

	public static void listarHidratante() {
		for (int i = 0; i < tp3.hidratante.size(); i++) {
			System.out.print(i + " - ");
			System.out.println(tp3.hidratante.get(i));
			System.out.println("---------------\n");
		}
	}

	public static void editarHidratante(ArrayList<Hidratante> Hidratante) {

		System.out.println("Digite o número do Hidratante que deseja editar: ");
		int i = tp3.sc.nextInt();
		tp3.sc.nextLine();
		while (i > Hidratante.size()) {
			System.out.println("Opcao invalida!\nTente novamente");
			i = tp3.sc.nextInt();
			tp3.sc.nextLine();
		}

		System.out.println("Digite o nome do Hidratante: ");
		String nomeProduto = tp3.sc.nextLine();

		System.out.println("Digite a linha do Hidratante: ");
		String linhaProduto = tp3.sc.nextLine();
		tp3.sc.nextLine();

		System.out.println("Digite o tamanho do Hidratante: ");
		int tamanhoProduto = tp3.sc.nextInt();
		tp3.sc.nextLine();

		System.out.println("Digite a marca do Hidratante: ");
		String marcaProduto = tp3.sc.nextLine();

		System.out.println("Digite o preco do Hidratante: ");
		float precoProduto = tp3.sc.nextFloat();

		System.out.println("Digite o familia indicado do Hidratante: ");
		String familiaHidratante = tp3.sc.nextLine();

		System.out.println("Digite o tipo do Hidratante: ");
		String tipoHidratante = tp3.sc.nextLine();

		System.out.println("Digite a descricao do Hidratante: ");
		String descricaoHidratante = tp3.sc.nextLine();

		tp3.sc.nextLine();

		Hidratante Hidratantes = new Hidratante(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto,
				familiaHidratante, tipoHidratante, descricaoHidratante);
		Hidratante.set(i, Hidratantes);
		System.out.println("Hidratante editado!\n");

	}

	public static void visualizarHidratante() {
		for (int i = 0; i < tp3.hidratante.size(); i++) {
			System.out.print(i + " - ");
			System.out.println(tp3.hidratante.get(i).getNomeProduto());
			System.out.println("---------------\n");
		}
	}

	public static void deletarHidratante(ArrayList<Hidratante> hidratante) {
		System.out.println("Digite o número do Hidratante que deseja editar");
		int i = tp3.sc.nextInt();
		tp3.sc.nextLine();

		hidratante.remove(i);
		System.out.println("Hidratante removido!\n");
	}

	public static void buscarHidratante(ArrayList<Hidratante> hidratante) {
		System.out.println("Digite o nome do Hidratante");
		String nome = tp3.sc.nextLine();
		try {
			for (Hidratante h : hidratante) {
				if (h.getNomeProduto().toUpperCase().equals(nome.toUpperCase())) {
					System.out.println("---------------");
					System.out.println(h);
					System.out.println("---------------");
				}
			}
		}
		catch (Exception e) {
			System.out.println("Hidratante não encontrado");
		}
		return;
	}

	public String getfamiliaHidratante() {
		return familiaHidratante;
	}

	public void setfamiliaHidratante(String familiaHidratante) {
		this.familiaHidratante = familiaHidratante;
	}

	public String getTipoHidratante() {
		return tipoHidratante;
	}

	public void setTipoHidratante(String tipoHidratante) {
		this.tipoHidratante = tipoHidratante;
	}

	public String getdescricaoHidratante() {
		return descricaoHidratante;
	}

	public void setdescricaoHidratante(String descricaoHidratante) {
		this.descricaoHidratante = descricaoHidratante;
	}


	@Override
		public String toString() {
		return "Hidratante\nNome: " + nomeProduto + "\nLinha: " + linhaProduto + "\nTamanho: " 
		+ tamanhoProduto + " ml\n"+ "\nMarca: " + marcaProduto + "\nPreco: R$ "	+ precoProduto 
		+ "\nFamilia olfativa: " + familiaHidratante + "\nTipo: " + tipoHidratante
		+ "\nDescricao: " + descricaoHidratante;
	}

}