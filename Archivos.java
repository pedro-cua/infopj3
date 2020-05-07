import java.io.File;
import java.io.IOException;

public class Archivos{
    /*public static void main(String[] args){
        String pathtxt = args[0];
        Archivos txtafd = new Archivos(pathtxt);
    }*/

    File conversion;

    public Archivos(String pathtxt){
        try{
            this.conversion = new File(pathtxt + "/prueba.afd");
            //this.afn = new File(pathtxt);
            if(conversion.createNewFile()){
                System.out.print("Se creo el archivo txt: \n" );
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}