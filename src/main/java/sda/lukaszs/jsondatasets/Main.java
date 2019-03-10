package sda.lukaszs.jsondatasets;

import com.fasterxml.jackson.databind.ObjectMapper;
import sda.lukaszs.jsondatasets.model.meteorites.Meteorite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Meteorite> meteorites = getMeteoritesFromJSON();
        for(Meteorite m : meteorites){
            System.out.println(m);
        }
    }

    private static List<Meteorite> getMeteoritesFromJSON(){
        File file = new File("jsonData/meteoryty.json");
        ObjectMapper mapper = new ObjectMapper();
        List<Meteorite> meteorites = new ArrayList<>();
        Meteorite[] outArray;
        try{
            outArray = mapper.readValue(file,Meteorite[].class);
            meteorites = Arrays.asList(outArray);
        }catch(IOException e) {
            e.printStackTrace();
        }
        return meteorites;
    }
}
