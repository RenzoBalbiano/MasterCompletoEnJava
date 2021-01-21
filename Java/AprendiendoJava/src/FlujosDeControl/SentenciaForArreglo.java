package FlujosDeControl;

import javax.swing.JOptionPane;

public class SentenciaForArreglo {

    public static void main(String[] args) {
        
        String[] nombres = {"Renzo","Cecilia","Juan","Alicia","Franco","Luciano","Zeus","Ediseo"};
        
        int count = nombres.length;

        for(int i = 0;i < count;i++){
            System.out.println(i + ".- " +nombres[i]);
        }

        System.out.println(" ");
        for(int i = 0;i < count;i++){
            if(nombres[i].equalsIgnoreCase("rEnZo") ||
                nombres[i].equalsIgnoreCase("ceCiliA")){
                continue;
                }
            System.out.println(i + ".- " +nombres[i]);
        }

        System.out.println(" ");
        for(int i = 0;i <= count -1;i++){ //esto es necesario para evitar el out of bound.
            if(nombres[i].equalsIgnoreCase("rEnZo") ||
                nombres[i].equalsIgnoreCase("ceCiliA")){
                continue;
                }
            System.out.println(i + ".- " +nombres[i]);
        }

        //similar a arriba pero con contains. Debe ser exacto o igual o usar toLower...
        System.out.println(" ");
        for(int i = 0; i < count;i++){
            if(nombres[i].toLowerCase().contains("Renzo".toLowerCase()) ||
                nombres[i].toLowerCase().contains("CECILIA".toLowerCase())){
                continue;
                }
            System.out.println(i + ".- " +nombres[i]);
        }
        System.out.println(" ");

        String  buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Renzo\" o \"Cecilia\": ");
        System.out.println("Término ingresado: " + buscar);

        boolean encontrado = false;

        for(int i = 0; i < count;i++){ // i debe ser menor a count. Entonces entra, si es 0 no es mayor a count, no se cumple la condición y no entra.
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println(" ");
            System.out.println("i vale " + i);
            System.out.println("nombre = " + nombres[i]);
            System.out.println(" ");
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        }else{
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema.");
        }
    }    
}
