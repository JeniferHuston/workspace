import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota:"));
		JOptionPane.showMessageDialog(null, "A média entre as notas "+nota1+" e "+nota2+" é: "+ ((nota1+nota2)/2)+".");
	}

}
