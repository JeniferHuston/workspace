import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		JOptionPane.showMessageDialog(null, "A soma entre os números "+num1+" e "+num2+" é: "+ (num1+num2)+".");

	}

}
