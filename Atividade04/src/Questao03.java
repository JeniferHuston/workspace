import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, maior, menor;
		StringBuffer str = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
		
		if (num1 > num2) {
			maior = num1;
			menor = num2;
		} else {
			maior = num2;
			menor = num1;
		}
		
		if (maior == menor) {
			JOptionPane.showMessageDialog(null, "Os números são iguais.");
		} else {
			for (int i = menor+1; i < maior; i++) {
				str.append(String.valueOf(i)+"; ");
			}
			JOptionPane.showMessageDialog(null, "Os numeros entre "+menor+" e "+maior+" são: "+str);
		}
		scan.close();	
	}

}
