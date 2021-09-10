package pre;

import java.util.ArrayList;

import teste.tp3;

public class Desodorante extends Produto {
	private String generoDesodorante;
	private String tipoDesodorante;
	private String descricaoDesodorante;

	public Desodorante(String nomeProduto, String linhaProduto, int tamanhoProduto, String marcaProduto, float precoProduto,
		String generoDesodorante, String tipoDesodorante, String descricaoDesodorante) {
		super(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto);
		this.generoDesodorante = generoDesodorante;
		this.tipoDesodorante = tipoDesodorante;
		this.descricaoDesodorante = descricaoDesodorante;
	}

	public static void cadastrarDesodorante() {
		System.out.println("Digite o nome do Desodorante: ");
		String nomeProduto = tp3.sc.nextLine();

		System.out.println("Digite a linha do Desodorante: ");
		String linhaProduto = tp3.sc.nextLine();
		tp3.sc.nextLine();

		System.out.println("Digite o tamanho do Desodorante: ");
		int tamanhoProduto = tp3.sc.nextInt();
		tp3.sc.nextLine();

		System.out.println("Digite a marca do Desodorante: ");
		String marcaProduto = tp3.sc.nextLine();

		System.out.println("Digite o preco do Desodorante: ");
		float precoProduto = tp3.sc.nextFloat();

		System.out.println("Digite o genero indicado do Desodorante: ");
		String generoDesodorante = tp3.sc.nextLine();

		System.out.println("Digite o tipo do Desodorante: ");
		String tipoDesodorante = tp3.sc.nextLine();

		System.out.println("Digite a descricao do Desodorante: ");
		String descricaoDesodorante = tp3.sc.nextLine();

		tp3.sc.nextLine();

		Desodorante desodorante = new Desodorante(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto,
				generoDesodorante, tipoDesodorante, descricaoDesodorante);
		tp3.desodorante.add(desodorante);
	}

	public static void listarDesodorante() {
		for (int i = 0; i < tp3.desodorante.size(); i++) {
			System.out.print(i + " - ");
			System.out.println(tp3.desodorante.get(i));
			System.out.println("---------------\n");
		}
	}

	public static void editarDesodorante(ArrayList<Desodorante> desodorante) {

		System.out.println("Digite o número do Desodorante que deseja editar: ");
		int i = tp3.sc.nextInt();
		tp3.sc.nextLine();
		while (i > desodorante.size()) {
			System.out.println("Opcao invalida!\nTente novamente");
			i = tp3.sc.nextInt();
			tp3.sc.nextLine();
		}

		System.out.println("Digite o nome do Desodorante: ");
		String nomeProduto = tp3.sc.nextLine();

		System.out.println("Digite a linha do Desodorante: ");
		String linhaProduto = tp3.sc.nextLine();
		tp3.sc.nextLine();

		System.out.println("Digite o tamanho do Desodorante: ");
		int tamanhoProduto = tp3.sc.nextInt();
		tp3.sc.nextLine();

		System.out.println("Digite a marca do Desodorante: ");
		String marcaProduto = tp3.sc.nextLine();

		System.out.println("Digite o preco do Desodorante: ");
		float precoProduto = tp3.sc.nextFloat();

		System.out.println("Digite o genero indicado do Desodorante: ");
		String generoDesodorante = tp3.sc.nextLine();

		System.out.println("Digite o tipo do Desodorante: ");
		String tipoDesodorante = tp3.sc.nextLine();

		System.out.println("Digite a descricao do Desodorante: ");
		String descricaoDesodorante = tp3.sc.nextLine();

		tp3.sc.nextLine();

		Desodorante desodorantes = new Desodorante(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto,
				generoDesodorante, tipoDesodorante, descricaoDesodorante);
		desodorante.set(i, desodorantes);
		System.out.println("Desodorante editado!\n");

	}

	public static void visualizarDesodorante() {
		for (int i = 0; i < tp3.desodorante.size(); i++) {
			System.out.print(i + " - ");
			System.out.println(tp3.desodorante.get(i).getNomeProduto());
			System.out.println("---------------\n");
		}
	}

	public static void deletarDesodorante(ArrayList<Desodorante> desodorante) {
		System.out.println("Digite o número do Desodorante que deseja editar");
		int i = tp3.sc.nextInt();
		tp3.sc.nextLine();

		desodorante.remove(i);
		System.out.println("Desodorante removido!\n");
	}

	public static void buscarDesodorante(ArrayList<Desodorante> desodorante) {
		System.out.println("Digite o nome do Desodorante");
		String nome = tp3.sc.nextLine();
		try {
			for (Desodorante d : desodorante) {
				if (d.getNomeProduto().toUpperCase().equals(nome.toUpperCase())) {
					System.out.println("_______________");
					System.out.println(d);
					System.out.println("_______________");
				}
			}
		}
		catch (Exception e) {
			System.out.println("Desodorante não encontrado");
		}
		return;
	}

	public String getGeneroDesodorante() {
		return generoDesodorante;
	}

	public void setGeneroDesodorante(String generoDesodorante) {
		this.generoDesodorante = generoDesodorante;
	}

	public String getTipoDesodorante() {
		return tipoDesodorante;
	}

	public void setTipoDesodorante(String tipoDesodorante) {
		this.tipoDesodorante = tipoDesodorante;
	}

	public String getdescricaoDesodorante() {
		return descricaoDesodorante;
	}

	public void setdescricaoDesodorante(String descricaoDesodorante) {
		this.descricaoDesodorante = descricaoDesodorante;
	}


	@Override
		public String toString() {
		return "Desodorante\nNome: " + nomeProduto + "\nLinha: " + linhaProduto+ " \nTamanho = " + tamanhoProduto 
				+ " ml\n"+ "\nMarca = " + marcaProduto + "\nPreco: R$ " + precoProduto + "\nGenero indicado: " 
				+ generoDesodorante + "\nTipo: " + tipoDesodorante + "\nDescricao: " + descricaoDesodorante;
	}

}