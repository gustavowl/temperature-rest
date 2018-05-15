/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientetemperature;
import static java.lang.System.in;
import java.util.Scanner;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

/**
 *
 * @author jsb98
 */
public class ClienteTemperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        Scanner sc = new Scanner(in);
        
        
        Response response = client.target("http://186.236.205.73:49152/TemperatureServer/temperatura/" + sc.nextLine() + "/" + sc.nextLine()).request().get();
        System.out.println(response.readEntity(String.class));
              
    }
    
}
