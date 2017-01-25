/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validaremail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author carlosjoseanguiano
 */
public class ValidarEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Objeto para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        //Email que queremos validar
        String email = "c.joseanguiano@gmail.com";
        //String email = "com";

        Matcher mather = pattern.matcher(email);

        //Validamos si lo que estamos buscando en la variable mather existe
        if (mather.find() == true) {
            System.out.println("El email ingresado SI es correcto");
        } else {
            System.out.println("El email ingresado NO es incorrecto");
        }
    }

}
