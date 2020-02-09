import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Pokemon{
    int hp_fire, hp_water, hp_grass, hp_soil ;
    int att_fire, att_water, att_greass, att_soil  ;
    int element ;
   
    public Pokemon(){
        hp_fire = 75 ;
        hp_grass = 90 ;
        hp_soil = 100 ;
        hp_water = 80 ;
        
        att_fire = 120 ;
        att_greass = 85 ;
        att_soil = 75 ;
        att_water = 100 ;
    }
    
    //Show status charecter
    public String showStatusFire(){
        System.out.println("MY STATUS POINT");
        System.out.println("My element is Fire " );
        System.out.println("My Health point "+hp_fire+"  Point");
        System.out.println("My attack "+att_fire+"  Point");
        
        return "";
    }
    public String showStatusWater(){
        System.out.println("MY STATUS POINT");
        System.out.println("My element is Water");
        System.out.println("My Health point : "+hp_water+"  Point");
        System.out.println("My Experience ( exp ) : "+att_water+"  Point");
        
        return "";
    }
    public String showStatusGrass(){
        System.out.println("MY STATUS POINT");
        System.out.println("My element is Grass" );
        System.out.println("My Health point : "+hp_grass+"  Point");
        System.out.println("My Experience ( exp ) : "+att_greass+"  Point");
        
        return "";
    }
    public String showStatusSoil(){
        System.out.println("MY STATUS POINT");
        System.out.println("My element is Soil");
        System.out.println("My Health point : "+hp_soil+"  Point");
        System.out.println("My Experience ( exp ) : "+att_soil+"  Point");
        
        return "";
    }
    
    public String errorElement(){
        System.out.println("Error!!");
        System.out.println("What your new element ?");
        return "";
   }
}