package Operadores;
public class OperadoresAsignacion {
    
    public static void main(String[] args) {
        
        int i = 5; 
        System.out.println(i);
        int j = i + 4; 

        i += 2; //i = i + 2;  

        System.out.println(j);
        System.out.println(i);

        i += 5; //i = i + 2;  

        System.out.println(i);

        j -= 4;
        System.out.println(j);

        j *= 3; 
        System.out.println(j);      
        
        String sqlString = "select * from clientes as c";

        sqlString += " where c.nombre='Renzo'";
        sqlString += " and c.activo=1";

        System.out.println(sqlString);
    }
}
