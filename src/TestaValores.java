
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 244226);
		System.out.println(Conta.getTotal());
		Conta conta2 = new Conta(2337, 25326);
		System.out.println(Conta.getTotal());
		System.out.println(conta.getAgencia());
		System.out.println(conta2.getAgencia());
		
	}
}
