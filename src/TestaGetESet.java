
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(24226, 1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("222.222.222-22");
	
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
	}

}
