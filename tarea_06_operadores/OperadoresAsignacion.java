package tarea.operadoresasignacion;

/**
 *
 * @author Federico Bernardo Soria
 * 1.Diseña un proyecto nuevo en Java con el nombre OperadoresAsignación. El ejercicio se
 * debe realizar utilizando los operadores de asignación. Las operaciones descritas a continuación
 * seregistran en la variable saldo.
 * 
 */
public class OperadoresAsignacion {

    public static void main(String[] args) {
        //2. Se crea una variable con el nombre saldo, con un saldo inicial de 100,50 euros. Muestra
        //por pantalla este valor.
        double saldo = 100.5;
        System.out.printf("saldo = %.2f \n", saldo);
        
        //3. Recibes un abono de 27.50.
        saldo += 27.50;
        
        //4. Hay una promoción en la entidad bancaria, se duplican tus ingresos.
        saldo *= 2;
        
        //5. Tienes una avería en casa, tu saldo se divide entre 2.
        saldo /= 2;
        
        //6. Recibes un ingreso en tu cuenta, de 250,38
        saldo += 250.38;
        
        //7. Te acaban de cargar en la cuenta la compra del sábado, - 55,37.
        saldo -= 55.37;
        
        //8. Recibes el abono de la nómina, 1200,96
        saldo += 1200.96;
        
        //9. Muestra el valor de la variable Saldo.
        System.out.printf("Saldo = %.2f \n", saldo);
        
        //10. Finalmente hay un cargo de la cena de ayer, -85,23.
        saldo -= 85.23;
        
        //11. Muestra el valor del saldo
        System.out.printf("Saldo final = %.2f \n", saldo);
        
    }
}
