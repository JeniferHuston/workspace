import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = JOptionPane.showInputDialog("Digite a palavra de acesso: ");
		for (int i = 5; i > 0; i--) {
			if (str.equals("Java-2021")) {
				JOptionPane.showMessageDialog(null, "Permissão: aprovada.");
				break;
			} else {
				if (i > 1) {
					JOptionPane.showMessageDialog(null, "Permissão: reprovada. Tente novamente. "+(i-1)+" tentativa(s) restante(s)");
					str = JOptionPane.showInputDialog("Digite a palavra de acesso novamente: ");
				} else {
					JOptionPane.showMessageDialog(null, "Permissão: reprovada. Nenhuma tentativa restante");
				}
			}
		}
	}

}
