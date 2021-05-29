/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIZakat;

/**
 *
 * @author Ivan
 */
public class Hitung {
    int c=15000;
    public String maal(int a){
        String x;
        x=Integer.toString(a/1000*25);
        return x;
    }
    public String fitrah(int a){
        String x;
        x=Double.toString(a*2.5*c);
        return x;
    }
    public String pertanian(int a, int b){
        String x = null;
        if(b==0){
            x=Integer.toString(a*1/10*c);
        }
        else{
            x=Integer.toString(a*5/100*c);
        }
        return x;
    }
}
