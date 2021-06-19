import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Pessoa {

	private String nome;
	private LocalDate dataNascimento;
	private float altura;
	
	public int calcularIdade () {
		LocalDate atual = LocalDate.now();
		
		if (atual.getMonthValue() < dataNascimento.getMonthValue()) {
			return atual.getYear() - dataNascimento.getYear() - 1;
		} else if (atual.getMonthValue() == dataNascimento.getMonthValue()) {
			if (atual.getDayOfMonth() < dataNascimento.getDayOfMonth()) {
				return atual.getYear() - dataNascimento.getYear() - 1;
			}
			
		}
		return atual.getYear() - dataNascimento.getYear();
		
	}
	
	public void imprimirDados () {
		JOptionPane.showMessageDialog(null, toString());
	}
	
	public String getDataFormatada() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	    return dataNascimento.format(formato);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		
		return "Pessoa [nome=" + nome + ", data de nascimento=" + getDataFormatada() + ", idade=" + calcularIdade() + ", altura=" + altura + "]";
	}
	
}
