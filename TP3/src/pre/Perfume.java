package pre;

import java.util.ArrayList;

import teste.tp3;

public class Perfume extends Produto {
	private String generoPerfume;
	private String familiaPerfume;
	private String subPerfume;
	private String consenPerfume;

	public Perfume(String nomeProduto, String linhaProduto, int tamanhoProduto, String marcaProduto, float precoProduto,
		String generoPerfume, String familiaPerfume, String subPerfume, String consenPerfume) {
		super(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto);
		this.generoPerfume = generoPerfume;
		this.familiaPerfume = familiaPerfume;
		this.subPerfume = subPerfume;
		this.consenPerfume = consenPerfume;
	}

	public static void cadastrarPerfume() {
		System.out.println("Digite o nome do perfume: ");
		String nomeProduto = tp3.sc.nextLine();

		System.out.println("Digite a linha do perfume: ");
		String linhaProduto = tp3.sc.nextLine();

		System.out.println("Digite o tamanho do perfume: ");
		int tamanhoProduto = tp3.sc.nextInt();
		tp3.sc.nextLine();
		

		System.out.println("Digite a marca do perfume: ");
		String marcaProduto = tp3.sc.nextLine();

		System.out.println("Digite o preco do perfume: ");
		float precoProduto = tp3.sc.nextFloat();
		tp3.sc.nextLine();

		System.out.println("Digite o genero indicado do perfume: ");
		String generoPerfume = tp3.sc.nextLine();

		System.out.println("Digite a familia olfativa do perfume: ");
		String familiaPerfume = tp3.sc.nextLine();

		System.out.println("Digite a subfamilia do perfume: ");
		String subPerfume = tp3.sc.nextLine();

		System.out.println("Digite a consentracao do perfume: ");
		String consenPerfume = tp3.sc.nextLine();

		Perfume perfume = new Perfume(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto,
				generoPerfume, familiaPerfume, subPerfume, consenPerfume);
		tp3.perfume.add(perfume);
	}

	public static void listarPerfume() {
		for (int i = 0; i < tp3.perfume.size(); i++) {
			System.out.print(i + " - ");
			System.out.println(tp3.perfume.get(i));
			System.out.println("---------------\n");
		}
	}

	public static void editarPerfume(ArrayList<Perfume> perfume) {

		System.out.println("Digite o número do perfume que deseja editar: ");
		int i = tp3.sc.nextInt();
		tp3.sc.nextLine();
		while (i > perfume.size()) {
			System.out.println("Opcao invalida!\nTente novamente");
			i = tp3.sc.nextInt();
			tp3.sc.nextLine();
		}

		System.out.println("Digite o nome do perfume: ");
		String nomeProduto = tp3.sc.nextLine();

		System.out.println("Digite a linha do perfume: ");
		String linhaProduto = tp3.sc.nextLine();
		tp3.sc.nextLine();

		System.out.println("Digite o tamanho do perfume: ");
		int tamanhoProduto = tp3.sc.nextInt();
		tp3.sc.nextLine();

		System.out.println("Digite a marca do perfume: ");
		String marcaProduto = tp3.sc.nextLine();

		System.out.println("Digite o preco do perfume: ");
		float precoProduto = tp3.sc.nextFloat();

		System.out.println("Digite o genero indicado do perfume: ");
		String generoPerfume = tp3.sc.nextLine();

		System.out.println("Digite a familia olfativa do perfume: ");
		String familiaPerfume = tp3.sc.nextLine();

		System.out.println("Digite a subfamilia do perfume: ");
		String subPerfume = tp3.sc.nextLine();

		System.out.println("Digite a consentracao do perfume: ");
		String consenPerfume = tp3.sc.nextLine();
		tp3.sc.nextLine();

		Perfume perfumes = new Perfume(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto,
				generoPerfume, familiaPerfume, subPerfume, consenPerfume);
		perfume.set(i, perfumes);
		System.out.println("Perfume editado!\n");

	}

	public static void visualizarPerfume() {
		for (int i = 0; i < tp3.perfume.size(); i++) {
			System.out.print(i + " - ");
			System.out.println(tp3.perfume.get(i).getNomeProduto());
			System.out.println("---------------\n");
		}
	}

	public static void deletarPerfume(ArrayList<Perfume> perfume) {
		System.out.println("Digite o número do perfume que deseja editar");
		int i = tp3.sc.nextInt();
		tp3.sc.nextLine();

		perfume.remove(i);
		System.out.println("Perfume removido!\n");
	}

	public static void buscarPerfume(ArrayList<Perfume> perfume) {
		System.out.print("Digite o nome do perfume: ");
		String nome = tp3.sc.nextLine();
		try {
			for (Perfume p : perfume) {
				if (p.getNomeProduto().toUpperCase().equals(nome.toUpperCase())) {
					System.out.println("---------------");
					System.out.println(p);
					System.out.println("---------------");
				}
			}
		}
		catch (Exception e) {
			System.out.println("Perfume não encontrado");
		}
		return;
	}
	
	public static void buscarFamPerfume(ArrayList<Perfume> perfume) {
		System.out.print("Digite o nome da familia olfativa: ");
		String nome = tp3.sc.nextLine();
		try {
			for (Perfume f : perfume) {
				if (f.getFamiliaPerfume().toUpperCase().equals(nome.toUpperCase())) {
					System.out.println("---------------");
					System.out.println(f);
					System.out.println("---------------");
				}
			}
		}
		catch (Exception e) {
			System.out.println("Perfume não encontrado");
		}
		return;
	}

	public String getGeneroPerfume() {
		return generoPerfume;
	}

	public void setGeneroPerfume(String generoPerfume) {
		this.generoPerfume = generoPerfume;
	}

	public String getFamiliaPerfume() {
		return familiaPerfume;
	}

	public void setFamiliaPerfume(String familiaPerfume) {
		this.familiaPerfume = familiaPerfume;
	}

	public String getSubPerfume() {
		return subPerfume;
	}

	public void setSubPerfume(String subPerfume) {
		this.subPerfume = subPerfume;
	}

	public String getConsenPerfume() {
		return consenPerfume;
	}

	public void setConsenPerfume(String consenPerfume) {
		this.consenPerfume = consenPerfume;
	}

	@Override
		public String toString() {
		return "Perfume \nNome: " + nomeProduto + "\nLinha: " + linhaProduto + "\nTamnho: " + tamanhoProduto 
				+ " ml\n"+ "\nMarca: " + marcaProduto + "\nPreco: R$ "
				+ precoProduto + "\nGenero indicado: " + generoPerfume + "\nFamilia olfativa: " + familiaPerfume
				+ "\nSub familia: " + subPerfume + "\nConsentracao: " + consenPerfume;
	}

}