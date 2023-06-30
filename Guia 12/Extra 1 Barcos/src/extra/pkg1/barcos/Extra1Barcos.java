//En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
//nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
//amarre y el barco que lo ocupará.
//Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
//Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
//• Número de mástiles para veleros.
//• Potencia en CV para barcos a motor.
//• Potencia en CV y número de camarotes para yates de lujo.
//Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
//alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
//multiplicando por 10 los metros de eslora).
//En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
//sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
//en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
//el número de camarotes.
//Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
//métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
//precio final de su alquiler.

package extra.pkg1.barcos;
 
import extra.pkg1.barcos.entidades.Alquiler;
import extra.pkg1.barcos.entidades.Barco;
import extra.pkg1.barcos.entidades.BarcoAMotor;
import extra.pkg1.barcos.entidades.Velero;
import extra.pkg1.barcos.entidades.YateDeLujo;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Extra1Barcos {

    public static void main(String[] args) {
       
        Barco barco = new Barco(123, 100, 2020);
        BarcoAMotor motor = new BarcoAMotor(500, 123, 100, 2020);
        YateDeLujo yate = new YateDeLujo(5, 1000, 123, 100, 2020);
        Velero velero = new Velero(4, 123, 100, 2020);
        
        Alquiler a = new Alquiler("Barco", 44296063L, LocalDate.of(2022, 6, 10), LocalDate.of(2023, 6, 1), 1, barco);
        Alquiler b = new Alquiler("Motor", 44296064L, LocalDate.of(2022, 6, 15), LocalDate.of(2023, 7, 1), 2, motor);
        Alquiler c = new Alquiler("Yate", 44296065L, LocalDate.of(2022, 6, 20), LocalDate.of(2023, 8, 1), 3, yate);
        Alquiler d = new Alquiler("Velero", 44296066L, LocalDate.of(2022, 6, 25), LocalDate.of(2023, 9, 1), 4, velero);
        
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        
        do {
            String opc = JOptionPane.showInputDialog(null, "¿Qué tipo de barco desea alquilar?\n"
                    + "1. Barco normal. " + "\n"
                    + "2. Barco a motor." + "\n"
                    + "3. Yate de lujo." + "\n"
                    + "4. Velero." + "\n"
                    + "5. Salir. " + "\n", "Menú", JOptionPane.PLAIN_MESSAGE);

            int num = Integer.parseInt(opc);

            switch (num) {

                case 1:
                    JOptionPane.showMessageDialog(null, barco.toString()+"\n> Precio final del alquiler: $ " + a.calcularPrecioAlquiler(), "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, motor.toString()+"\n> Precio final del alquiler: $ " + b.calcularPrecioAlquiler(), "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, yate.toString()+"\n> Precio final del alquiler: $ " + c.calcularPrecioAlquiler(), "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, velero.toString()+"\n> Precio final del alquiler: $ " + d.calcularPrecioAlquiler(), "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "¡Saludos!", "Información", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta. Vuelva a intentarlo.", "Error", JOptionPane.INFORMATION_MESSAGE);
                    break;
                    
            }
            
        } while (true);
        
    }
    
}
