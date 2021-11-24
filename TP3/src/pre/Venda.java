package pre;

import teste.tp3;

public class Venda {

    private Cliente clienteVenda;
    private static Produto produtoVenda;
    private float precoVenda;

    public Venda(Cliente clienteVenda, Produto produtoVenda, float precoVenda) {
        this.clienteVenda = clienteVenda;
        Venda.produtoVenda = produtoVenda;
        this.precoVenda = precoVenda;
    }

    public Cliente getClienteVenda() {
        return clienteVenda;
    }

    public void setClienteVenda(Cliente clienteVenda) {
        this.clienteVenda = clienteVenda;
    }
    
    public Produto getProdutoVenda() {
        return produtoVenda;
    }

    public void setProdutoVenda(Produto produtoVenda) {
        Venda.produtoVenda = produtoVenda;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public static void cadastrarVenda() {
    	int aux = 0;
    	float precoProd = 0;
    	float precoTotal = 0;
    	
        Cliente.visualizarCliente();

        System.out.println("Digite o número do cliente que realizou a compra");
        int menuCliente = tp3.sc.nextInt();

        System.out.println("O cliente comprou algum perfume?\n1-Sim\n2-Não");
        int verfPerfume = tp3.sc.nextInt();
        if(verfPerfume == 1) {
        	 Perfume.visualizarPerfume();
             
             do {
     	        System.out.println("Digite o número do perfume comprado");
     	        int menuPerfume = tp3.sc.nextInt();

     	        precoProd = precoProd+tp3.perfume.get(menuPerfume).getPrecoProduto();
             
     	        System.out.println("O cliente comprou mais perfume?\n1-Sim\n2-Não");
     	        aux = tp3.sc.nextInt();
     	        tp3.sc.nextLine();
             } while (aux != 2);
        }
        
        System.out.println("O cliente comprou algum desodorante?\n1-Sim\n2-Não");
        int verfDesodorante = tp3.sc.nextInt();
        if(verfDesodorante == 1) {
        	Desodorante.visualizarDesodorante();
            do {
    	        System.out.println("Digite o número do desodorante comprado");
    	        int menuDesodorante = tp3.sc.nextInt();

    	        precoProd = precoProd+tp3.desodorante.get(menuDesodorante).getPrecoProduto();
    	        
    	        System.out.println("O cliente comprou mais desodorante?\n1-Sim\n2-Não");
    	        aux = tp3.sc.nextInt();
    	        tp3.sc.nextLine();
            } while (aux != 2);
        }
        
        System.out.println("O cliente comprou algum creme?\n1-Sim\n2-Não");
        int verfCreme = tp3.sc.nextInt();
        if(verfCreme == 1) {
        	Desodorante.visualizarDesodorante();
            do {
    	        System.out.println("Digite o número do creme comprado");
    	        int menuCreme = tp3.sc.nextInt();

    	        precoProd = precoProd+tp3.hidratante.get(menuCreme).getPrecoProduto();
    	        
    	        System.out.println("O cliente comprou mais creme?\n1-Sim\n2-Não");
    	        aux = tp3.sc.nextInt();
    	        tp3.sc.nextLine();
            } while (aux != 2);
        }

        Cliente clienteVenda = tp3.cliente.get(menuCliente);

        Venda venda = new Venda(clienteVenda, produtoVenda, (precoProd + precoTotal));
        tp3.venda.add(venda);

    }

    public static void listarVenda() {
        for (int i = 0; i < tp3.venda.size(); i++) {
            System.out.print(i + " - ");
            System.out.println(tp3.venda.get(i));
            System.out.println("---------------");
        }

    }

    public static void editarVenda() {
        System.out.println("Digite o número da venda que deseja editar: ");
        int i = tp3.sc.nextInt();
        tp3.sc.nextLine();
        while (i > tp3.cliente.size()) {
            System.out.println("Opcao invalida!\\nTente novamente");
            i = tp3.sc.nextInt();
            tp3.sc.nextLine();
        }

        int aux = 0;
    	float precoProd = 0;
    	float precoTotal = 0;
    	
        Cliente.visualizarCliente();

        System.out.println("Digite o número do cliente que realizou a compra");
        int menuCliente = tp3.sc.nextInt();

        System.out.println("O cliente comprou algum perfume?\n1-Sim\n2-Não");
        int verfPerfume = tp3.sc.nextInt();
        if(verfPerfume == 1) {
        	 Perfume.visualizarPerfume();
             
             do {
     	        System.out.println("Digite o número do perfume comprado");
     	        int menuPerfume = tp3.sc.nextInt();

     	        precoProd = precoProd+tp3.perfume.get(menuPerfume).getPrecoProduto();
             
     	        System.out.println("O cliente comprou mais perfume?\n1-Sim\n2-Não");
     	        aux = tp3.sc.nextInt();
     	        tp3.sc.nextLine();
             } while (aux != 2);
        }
        
        System.out.println("O cliente comprou algum desodorante?\n1-Sim\n2-Não");
        int verfDesodorante = tp3.sc.nextInt();
        if(verfDesodorante == 1) {
        	Desodorante.visualizarDesodorante();
            do {
    	        System.out.println("Digite o número do desodorante comprado");
    	        int menuDesodorante = tp3.sc.nextInt();

    	        precoProd = precoProd+tp3.desodorante.get(menuDesodorante).getPrecoProduto();
    	        
    	        System.out.println("O cliente comprou mais desodorante?\n1-Sim\n2-Não");
    	        aux = tp3.sc.nextInt();
    	        tp3.sc.nextLine();
            } while (aux != 2);
        }
        
        System.out.println("O cliente comprou algum creme?\n1-Sim\n2-Não");
        int verfCreme = tp3.sc.nextInt();
        if(verfCreme == 1) {
        	Desodorante.visualizarDesodorante();
            do {
    	        System.out.println("Digite o número do creme comprado");
    	        int menuCreme = tp3.sc.nextInt();

    	        precoProd = precoProd+tp3.hidratante.get(menuCreme).getPrecoProduto();
    	        
    	        System.out.println("O cliente comprou mais creme?\n1-Sim\n2-Não");
    	        aux = tp3.sc.nextInt();
    	        tp3.sc.nextLine();
            } while (aux != 2);
        }
        

        Cliente clienteVenda = tp3.cliente.get(menuCliente);

        Venda venda = new Venda(clienteVenda, produtoVenda, (precoProd + precoTotal));
        tp3.venda.set(i, venda);
    }

    public static void deletarVenda() {
        listarVenda();
        System.out.println("Digite o número da venda que deseja deletar");
        int i = tp3.sc.nextInt();
        tp3.sc.nextLine();
        tp3.venda.remove(i);
        System.out.println("Venda removida!\n");
    }

    @Override
public String toString() {
        return "Venda \n"+ clienteVenda + "Preço total:" + precoVenda + " reais";
    }
}