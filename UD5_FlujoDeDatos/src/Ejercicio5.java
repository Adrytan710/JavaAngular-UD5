import javax.swing.JOptionPane;

public class Ejercicio5 {

	//  @author Adrián Rodriguez
	
	public static void main(String[] args) {
		String text_num1 = JOptionPane.showInputDialog("Introduce el número que quieras");
		int num1 = Integer.parseInt(text_num1);
		
		if (num1%2==0) {
			System.out.println("El resultado es divisible entre 2");
		} else {
			System.out.println("El resultado no es divisible entre 2");
		}
	}
}
