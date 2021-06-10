import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1, num2;
		num1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro número:"));
		num2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo número:"));
		
		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "O maior número é: "+num1);
		} else if (num1 < num2){
			JOptionPane.showMessageDialog(null, "O maior número é: "+num2);
		} else {
			JOptionPane.showMessageDialog(null, "Os números são iguais.");
		}
		
	}

}
