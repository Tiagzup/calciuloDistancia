package aula.java.velociade;

import java.text.MessageFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       
     
       double kmPorLitro = 12;
       
       System.out.println("tempo de viagem?");
       double tempo = scan.nextDouble();
    		   
       System.out.println("a velocidade");
       double velocidade = scan.nextDouble();
       
       
       double distancia = tempo * velocidade;
       double litroUsado = distancia/kmPorLitro;
       
       String texto = MessageFormat.format("A distancia "
       		+ "percorrida foi de {0}. A gasolina gasta foi {1}", distancia, litroUsado);
       System.out.println(texto);
       
				
	}

}
