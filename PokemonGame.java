import java.io.*;
import java.util.Scanner;

public  class PokemonGame {
    public static void main(String[] args) {
        int ele;
        Scanner Sc = new Scanner(System.in  );
        Pokemon Monters = new Pokemon();
        System.out.println("Pokemon");
        do{
            System.out.println("1.Fire 2.Water 3.Grass 4.Soil");
            System.out.println("What your element ?");
            ele = Sc.nextInt();
            
            if(ele == 1){
                Monters.showStatusFire();
            }
            else if(ele == 2){
                Monters.showStatusWater();
            }
            else if(ele == 3){
                Monters.showStatusGrass();
            }
            else if(ele == 4){
                Monters.showStatusSoil();
            }
            else if(ele >= 5){
                Monters.errorElement();
            }
        }while(ele != 0);
    }
}