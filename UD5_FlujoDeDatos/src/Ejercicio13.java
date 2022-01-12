import javax.swing.JOptionPane;

public class Ejercicio13 {

	//  @author Adrián Rodriguez
	
	public static void main(String[] args) {
        double operando1;
        double operando2;
        double resultado = 0;
        String textoOperandos = JOptionPane.showInputDialog("Escribe el operando 1");
        operando1 = Integer.parseInt(textoOperandos);
        String operacion = JOptionPane.showInputDialog("Escribe el símbolo de operación");
        String textoOperandos2 = JOptionPane.showInputDialog("Escribe el operando 2");
        operando2 = Integer.parseInt(textoOperandos2);
 
        switch (operacion){
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1*operando2;
                break;
            case "/":
                resultado = operando1/operando2;
                break;
            case "^":
                resultado = (int)Math.pow(operando1, operando2);
                break;
            case "%":
                resultado = operando1%operando2;
                break;
        }
        JOptionPane.showMessageDialog(null, operando1 + " " + operacion + " " + 
        							  operando2 + " = " + resultado);

    }
}