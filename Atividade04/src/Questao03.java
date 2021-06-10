import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, maior, menor;
		//String str = "";
		Scanner scan = new Scanner(System.in);
		//num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
		//num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
		System.out.println("Informe o primeiro número: ");
		num1 = scan.nextInt();
		System.out.println("Informe o segundo número: ");
		num2 = scan.nextInt();
		
		if (num1 > num2) {
			maior = num1;
			menor = num2;
		} else {
			maior = num2;
			menor = num1;
		}
		
		if (maior == menor) {
			//JOptionPane.showMessageDialog(null, "Os números são iguais.");
			System.out.println("Os números são iguais.");
		} else {
			//JOptionPane.showMessageDialog(null, "Os numeros entre "+menor+" e "+maior+" são: ");
			System.out.println("Os numeros entre "+menor+" e "+maior+" são: ");
			for (int i = menor+1; i < maior; i++) {
				//str.concat(String.valueOf(i)+";");
				System.out.print(i+"; ");
			}
			//System.out.println(str);
			//JOptionPane.showMessageDialog(null, str);
		}
		scan.close();	
	}

}
