package JavaLibsPractice;

import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        String input = (String) JOptionPane.showInputDialog(null,
                "Digite seu nome: ",
                "Questionário",
                 3,
                 null,
                 null,
                 "Digite aqui.");
                         System.out.println("Meu nome é " + input);
                         
                         
        String input2 = (String) JOptionPane.showInputDialog(null,
        "Digite sua idade: ",
        "Questionário",
        3,
        null,
        null,
        "Digite aqui.");
            System.out.println("Minha idade é " + input2);
            
            
        String input3 = (String) JOptionPane.showInputDialog(null,
        "Digite o Estado onde você mora: ",
        "Questionário",
        3,
        null,
        null,
        "Digite aqui.");
            System.out.println("Moro em  " + input3);
            
            
            
        String input4 = (String) JOptionPane.showInputDialog(null,
        "Digite a cidade onde você mora: ",
        "Questionário",
        3,
        null,
        null,
        "Digite aqui.");
            System.out.println("Moro em  " + input4);
            
            
         String input5 = (String) JOptionPane.showInputDialog(null,
        "Digite sua área de atuação: ",
        "Questionário",
        3,
        null,
        null,
        "Digite aqui.");
            System.out.println("Atuo como  " + input5);   
                          
                         
     
    }   
}