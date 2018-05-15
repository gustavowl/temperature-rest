/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import Entidades.App;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 *
 * @author jsb98
 */
@Path("/farenheitt")
public class TemperaturaFarenheitt {

	/**
     * consultar temperatura em F
     * @param param1 cidade
     * @return temperatura em F
     * @throws Exception exception da api
     */
    
    @GET
    @Path("{param1}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTemperaturaCelcius(@PathParam("param1") String param1) throws Exception{
       return App.getTemperaturaFarenheitt(param1);
    }
    

}
