/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import com.weatherlibraryjava.*;
import java.util.ArrayList;
import org.json.simple.JSONArray;

/**
 *
 * @author jsb98
 */
public class App {
    private static final String KEY = "1e88145a18b241f68b7150325182603";
    private static Repository r = new Repository();

    /**
    @param cidade a ser consultada
    * @return o valor da temperatura em celcius
    * @throws java.lang.Exception exception da API
    */

    public static String getTemperaturaCelsius(String cidade) throws Exception {
       
      double t = r.GetWeatherData(KEY, RequestBlocks.GetBy.Metar.CityName, cidade.trim().toLowerCase().replace(' ', '_')).getCurrent().getTempC();
       return ("A temperatura em " + cidade + " eh: " + String.valueOf(t) + " graus Celcius");
    }

    /**
     * @param cidade
     * @return o valor da temperatura em farenheitt
     * @throws java.lang.Exception exception da API
     */
    */

     public static String getTemperaturaFarenheitt(String cidade) throws Exception {
        double t = r.GetWeatherData(KEY, RequestBlocks.GetBy.Metar.CityName, cidade.trim().toLowerCase().replace(' ', '_')).getCurrent().getTempF();
        return ("A temperatura em " + cidade + " eh: " + String.valueOf(t) + " graus Farenheitt");
    }
     
     /**
      * @param cidade
      * @return arraylist de Strings com todas as informações sobre determinada cidade
      * @throws Exception exception da API
      */
     
     public static ArrayList<String> getInformation(String cidade) throws Exception{
         ArrayList<String> current = new ArrayList<String>();
  
        
         current.add("Nome: " + r.GetWeatherData(KEY, RequestBlocks.GetBy.Metar.CityName, cidade.trim().toLowerCase().replace(' ', '_')).getLocation().getName());
         current.add("Regiao: " + r.GetWeatherData(KEY, RequestBlocks.GetBy.Metar.CityName, cidade.trim().toLowerCase().replace(' ', '_')).getLocation().getRegion());
         current.add("Pais: " + r.GetWeatherData(KEY, RequestBlocks.GetBy.Metar.CityName, cidade.trim().toLowerCase().replace(' ', '_')).getLocation().getCountry());
         current.add("Hora: " + r.GetWeatherData(KEY, RequestBlocks.GetBy.Metar.CityName, cidade.trim().toLowerCase().replace(' ', '_')).getLocation().getLocaltime());
         current.add("Temp C: " + String.valueOf(r.GetWeatherData(KEY, RequestBlocks.GetBy.Metar.CityName, cidade.trim().toLowerCase().replace(' ', '_')).getCurrent().getTempC()));
         current.add("Sesacao Termica C: " + String.valueOf(r.GetWeatherData(KEY, RequestBlocks.GetBy.Metar.CityName, cidade.trim().toLowerCase().replace(' ', '_')).getCurrent().getFeelslikeC()));
         current.add("Temp F: " + String.valueOf(r.GetWeatherData(KEY, RequestBlocks.GetBy.Metar.CityName, cidade.trim().toLowerCase().replace(' ', '_')).getCurrent().getTempF()));
         current.add("Sensacao Termica F: " + String.valueOf(r.GetWeatherData(KEY, RequestBlocks.GetBy.Metar.CityName, cidade.trim().toLowerCase().replace(' ', '_')).getCurrent().getFeelslikeF()));
         current.add("Vento Kph: " + String.valueOf(r.GetWeatherData(KEY, RequestBlocks.GetBy.Metar.CityName, cidade.trim().toLowerCase().replace(' ', '_')).getCurrent().getWindKph()));
         current.add("Vento Mph: " + String.valueOf(r.GetWeatherData(KEY, RequestBlocks.GetBy.Metar.CityName, cidade.trim().toLowerCase().replace(' ', '_')).getCurrent().getWindMph()));
         current.add("Direcao Vento: " + String.valueOf(r.GetWeatherData(KEY, RequestBlocks.GetBy.Metar.CityName, cidade.trim().toLowerCase().replace(' ', '_')).getCurrent().getWindDir()));
         current.add("Humidade Relativa: " + String.valueOf(r.GetWeatherData(KEY, RequestBlocks.GetBy.Metar.CityName, cidade.trim().toLowerCase().replace(' ', '_')).getCurrent().getHumidity()));
         
         return current;
     }
}
