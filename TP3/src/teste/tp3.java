package teste;

	import java.util.ArrayList;
	import java.util.Scanner;
	
	import pre.Perfume;	
	import pre.Desodorante;
	import pre.Hidratante;
	import pre.Cliente;
	import pre.Venda;
	
public class tp3 {

	public static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<Perfume> perfume;
	public static ArrayList<Desodorante> desodorante;
	public static ArrayList<Hidratante> hidratante;
	public static ArrayList<Venda> venda;
	public static ArrayList<Cliente> cliente;

	public static void main(String[] args) {
		int op = 0;
	
		perfume = new ArrayList<Perfume>();
		desodorante = new ArrayList<Desodorante>();
		hidratante = new ArrayList<Hidratante>();
		venda = new ArrayList<Venda>();
		cliente = new ArrayList<Cliente>();

		cliente.add(new Cliente("Ana", "ana@gmail.com", "Brasília", "61123456789"));
		cliente.add(new Cliente("Jefferson", "jefferson@gmail.com", "Gama", "61987654321"));

		perfume.add(new Perfume("ZAAD", "Santal", 95, "Zaad", (float) 249.90, "Masculino", "Amadeirado", "Amadeirado", "Eau de Parfum Eau de Cologne"));
		perfume.add(new Perfume("Elysée Succés", "Succés", 50, "Elysée", (float) 249.90, "Feminino", "Chipre Especiado", "Amadeirado", "Eau de Parfum"));

		desodorante.add(new Desodorante("Desodorante Antitranspirante Aerossol Floratta L'Amore", "L'Amore", 125, "Floratta", (float) 28.90, "Feminino", "Aerossol", "O Desodorante Antitranspirante Aerossol Floratta L’Amore tem duplo benefício, pois além de proteger as axilas dos maus odores da transpiração por até 48 horas, garante também a inibição da transpiração. É mais liberdade para você aproveitar o dia."));
		desodorante.add(new Desodorante("Desodorante Antitranspirante Aerossol Malbec", "Tradicional", 125, "Malbec", (float) 29.90, "Masculino", "Aerossol", "O Malbec Desodorante Antitranspirante Aerosol oferece 48 horas de proteção, mantendo a pele hidratada e perfumada. Com secagem rápida e toque seco, o desodorante antitranspirante possui nova fórmula com óleos essenciais e mentol que proporcionam uma sensação refrescante e perfumação intensiva. Sua válvula com ângulo mais fechado ajuda na ampliação de vazão e jato mais direcionado, devendo ser aplicado a 15cm de distancia."));
		
		hidratante.add(new Hidratante("Loção Nutritiva Corporal Nativa Spa Orgânico", "Orgânico", 400, "Nativa SPA", (float) 76.90, "Não informado", "Todos os tipos", "Enriquecida com ingredientes nutritivos e hidratantes, a Loção Nutritiva Corporal Nativa Spa Orgânico melhora a saúde da pele. Sua fórmula traz ingredientes naturais cuidadosamente selecionados da agricultura orgânica e livres de componentes químicos agressivos."));
		hidratante.add(new Hidratante("Óleo Hidratante Desodorante Corporal Nativa SPA Ameixa", "Ameixa", 200, "Nativa SPA", (float) 64.90, "Floriental Ambarada", "Todos os tipos", "Oferecendo hidratação profunda, aumento na produção de colágeno e prevenção da perda de elasticidade da pele, o Óleo Desodorante Hidratante Corporal Nativa SPA Ameixa não pode faltar na sua rotina de cuidados pessoais. Além das propriedades hidratantes e nutritivas do extrato de Ameixa, a sua fórmula desenvolvida com Óleo 100% Vegetal, Extrato de Girassol e gotas purificadas de Quinoa, que devolvem a vitalidade da pele aumentando essa produção de Colágeno. O óleo hidratante potencializa a hidratação e desodorização da pele."));

		do {
			menuInicial();
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				Perfume.cadastrarPerfume();
				break;
				
			case 2:
				Perfume.listarPerfume();
				break;
				
			case 3:
				Perfume.visualizarPerfume();
				Perfume.editarPerfume(perfume);
				break;

			case 4:
				Perfume.visualizarPerfume();
				Perfume.deletarPerfume(perfume);
				break;

			case 5:
				Desodorante.cadastrarDesodorante();
				break;

			case 6:
				Desodorante.listarDesodorante();
				break;

			case 7:
				Desodorante.visualizarDesodorante();
				Desodorante.editarDesodorante(desodorante);
				break;

			case 8:
				Desodorante.visualizarDesodorante();
				Desodorante.deletarDesodorante(desodorante);
				break;

			case 9:
				Hidratante.cadastrarHidratante();
				break;

			case 10:
				Hidratante.listarHidratante();
				break;

			case 11:
				Hidratante.visualizarHidratante();
				Hidratante.editarHidratante(hidratante);
				break;

			case 12:
				Hidratante.visualizarHidratante();
				Hidratante.deletarHidratante(hidratante);
				break;

			case 13:
				Cliente.cadastCliente();
				break;

			case 14:
				Cliente.listarClientes();
				break;

			case 15:
				Cliente.visualizarCliente();
				Cliente.editarCliente(cliente);
				break;

			case 16:
				Cliente.visualizarCliente();
				Cliente.deletarCliente(cliente);
				break;

			case 17:
				Venda.cadastrarVenda();
				break;

			case 18:
				Venda.listarVenda();
				break;

			case 19:
				Venda.listarVenda();
				Venda.editarVenda();
				break;
				
			case 20:
				Venda.listarVenda();
				Venda.deletarVenda();
				break;
				
			case 21:
				Perfume.buscarPerfume(perfume);
				break;
				
			case 22:
				Desodorante.buscarDesodorante(desodorante);				
				break;
				
			case 23:
				Hidratante.buscarHidratante(hidratante);
				break;
				
			case 24:
				Cliente.buscarCliente(cliente);
				break;
				
			case 25:
				Perfume.buscarFamPerfume(perfume);
				break;
				
			case 26:
				System.out.println("Saindo.");
				break;
				
			default:
				System.out.println("Opcao invalida!\nTente novamente");
			}
		} while (op != 26);

		sc.close();
	}

	public static void menuInicial() {
		System.out.println("Escolha uma opção do menu:\n");
		System.out.println("1 - Cadastra novo perfume");
		System.out.println("2 - Visualizar perfumes");
		System.out.println("3 - Editar perfume");
		System.out.println("4 - Deletar perfume");
		System.out.println("5 - Cadastra novo desodorante");
		System.out.println("6 - Visualizar desodorante");
		System.out.println("7 - Editar desodorante");
		System.out.println("8 - Deletar desodorante");
		System.out.println("9 - Cadastra novo creme hidratante");
		System.out.println("10 - Visualizar creme hidratante");
		System.out.println("11 - Editar creme hidratante");
		System.out.println("12 - Deletar creme hidratante");
		System.out.println("13 - Cadastra novo cliente");
		System.out.println("14 - Visualizar cliente");
		System.out.println("15 - Editar cliente");
		System.out.println("16 - Deletar cliente");		
		System.out.println("17 - Cadastra nova venda");
		System.out.println("18 - Visualizar venda");
		System.out.println("19 - Editar venda");
		System.out.println("20 - Deletar venda");
		System.out.println("21 - Buscar pelo nome do perfume");
		System.out.println("22 - Buscar pelo nome do desodorante");
		System.out.println("23 - Buscar pelo nome do creme hidratante");
		System.out.println("24 - Buscar pelo nome do cliente");
		System.out.println("25 - Buscar perfume pelo nome da familia olfativa");
		System.out.println("26 - Sair");
	}

}

