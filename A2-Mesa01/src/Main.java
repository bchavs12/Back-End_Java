import model.CardapioAdulto;
import model.CardapioInfantil;
import model.CardapioVegano;
import model.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       CardapioInfantil infantil = new CardapioInfantil(25,10);
       CardapioVegano veganos = new CardapioVegano(30,20);

       infantil.prepararVender();

       veganos.prepararVender();

    }
}