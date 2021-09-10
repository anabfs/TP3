package pre;

	import teste.tp3;
	import java.util.ArrayList;

public class Cliente {
	
	private String nomeCliente;
	private String emailCliente;
    private String enderecoCliente;    
    private String telefoneCliente; 
    
    public Cliente(String nomeCliente, String emailCliente, String enderecoCliente, String telefoneCliente) {
    	this.nomeCliente = nomeCliente;
    	this.emailCliente = emailCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
 
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }


    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }


    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public static void cadastCliente() {
		
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = tp3.sc.nextLine();
        
        System.out.println("Digite o email do cliente: ");
        String emailCliente = tp3.sc.nextLine();

        System.out.println("Digite o endereco do cliente: ");
        String enderecoCliente = tp3.sc.nextLine();

        System.out.println("Digite o telefone do cliente: \n(Somente numeros EX.: DDNNNNNNNN)");
        String telefoneCliente = tp3.sc.nextLine();

        Cliente cliente = new Cliente(nomeCliente, emailCliente, enderecoCliente, telefoneCliente);
        tp3.cliente.add(cliente);
	}
    
    public static void listarClientes() {
    	for (int i = 0; i < tp3.cliente.size(); i++) {
    	            System.out.print(i + " - ");
    	            System.out.println(tp3.cliente.get(i));
    	            System.out.println("__");
    	        }
    }
    public static void editarCliente(ArrayList<Cliente> clientes) {
    	
    	System.out.println("Digite o número do cliente desejado");
		int i = tp3.sc.nextInt();
		tp3.sc.nextLine();
		while (i > clientes.size()) {
			System.out.println("Opcao invalida!\nDigite um novo número");
			i = tp3.sc.nextInt();
			tp3.sc.nextLine();
		}
    	
		System.out.println("Digite o nome do cliente: ");
        String nomeCliente = tp3.sc.nextLine();
        
        System.out.println("Digite o email do cliente: ");
        String emailCliente = tp3.sc.nextLine();

        System.out.println("Digite o endereco do cliente: ");
        String enderecoCliente = tp3.sc.nextLine();

        System.out.println("Digite o telefone do cliente: \n(Somente numeros EX.: DDDNNNNNNNN)");
        String telefoneCliente = tp3.sc.nextLine();

        Cliente cliente = new Cliente(nomeCliente, emailCliente, enderecoCliente, telefoneCliente);
        clientes.set(i, cliente);
        System.out.println("Cliente editado\n");
        }
    
    public static void visualizarCliente() {
        for (int i = 0; i < tp3.cliente.size(); i++) {
            System.out.print(i + " - ");
            System.out.println(tp3.cliente.get(i).getNomeCliente());
            System.out.println("___");
        }
    }
    public static void deletarCliente(ArrayList<Cliente> cliente) {
    	
    	System.out.println("Digite o número do cliente que deseja deletar: ");
		int i = tp3.sc.nextInt();
		tp3.sc.nextLine();
    	
    	cliente.remove(i);
        System.out.println("Cliente removido!\n");
        
    }
	public static void buscarCliente(ArrayList<Cliente> cliente) {
		System.out.print("Digite o nome do cliente: ");
		String nome = tp3.sc.nextLine();
		try {
			for (Cliente c : cliente) {
				if (c.getNomeCliente().toUpperCase().equals(nome.toUpperCase())) {
					System.out.println("---------------");
					System.out.println(c);
					System.out.println("---------------");
				}
			}
		}
		catch (Exception e) {
			System.out.println("Perfume não encontrado");
		}
		return;
	}

    @Override
    public String toString() {
        return "Cliente \nNome do cliente = " + nomeCliente + "\nEmail do cliente = " + emailCliente + "\nEndereco do cliente = " + enderecoCliente 
                + "\nTelefone do cliente = " + telefoneCliente + "\n";
    }      	          	 
}

