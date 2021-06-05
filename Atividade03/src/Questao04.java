import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da conta:"));
		double porcentagemGarcom = (0.1*valor);
		JOptionPane.showMessageDialog(null, "10% do garçom: "+ (porcentagemGarcom)+" e Total: "+(porcentagemGarcom+valor)+".");
	}

}
