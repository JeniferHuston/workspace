import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		JOptionPane.showMessageDialog(null, "Os números vizinhos são: "+ (num-1)+" e "+(num+1)+".");
	}

}
