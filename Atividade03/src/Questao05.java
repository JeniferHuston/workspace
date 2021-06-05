import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float horas = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:"));
		float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora:"));
		JOptionPane.showMessageDialog(null, "O salário do funcionário é: "+ (horas*valorHora)+".");
	}

}
