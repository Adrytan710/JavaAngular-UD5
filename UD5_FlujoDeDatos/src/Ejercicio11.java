import javax.swing.JOptionPane;

public class Ejercicio11 {

	//  @author Adrián Rodriguez
	
	public static void main(String[] args) {
		
		String diaSemana = new String(JOptionPane.showInputDialog("Introduce un día de la semana"));
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
            default: diaSemana = "Dia inválido";
                break;
        }
        System.out.println(diaSemana);
    }
}
