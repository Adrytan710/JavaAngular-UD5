import javax.swing.JOptionPane;

public class Ejercicio11 {

	//  @author Adri�n Rodriguez
	
	public static void main(String[] args) {
		
		String diaSemana = new String(JOptionPane.showInputDialog("Introduce un d�a de la semana"));
        diaSemana = diaSemana.toLowerCase();

        switch (diaSemana) {
            case "lunes": 
            case "martes": 
            case "miercoles": 
            case "jueves":
            case "viernes": 
            	diaSemana = "Laboral";
            	break;
            case "sabado": 
            case "domingo":  
            	diaSemana = "No Laboral";
            	break;
            default: diaSemana = "Dia inv�lido";
                break;
        }
        System.out.println(diaSemana);
    }
}
