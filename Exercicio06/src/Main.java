import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p = new Pessoa();
		int d, m, a;
		
		p.setNome(JOptionPane.showInputDialog("Informe o nome da pessoa:"));
		p.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Informe a altura da pessoa:")));
		d = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de nascimento da pessoa: "));
		m = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês de nascimento da pessoa: "));
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento da pessoa: "));
		LocalDate lD = LocalDate.of(a, m, d);
		p.setDataNascimento(lD);
		
		p.imprimirDados();
		
	}

}
