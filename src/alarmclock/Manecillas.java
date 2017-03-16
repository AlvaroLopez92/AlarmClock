/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmclock;

/**
 *
 * @author alopezcobo
 */
public class Manecillas {
    //En esta clase se encuentran los botones para cambiar la hora de la alarma del reloj. El siguiente switch
    //sirve para elegir entre los botones.
    
                switch (boton) {
        
            case 1:  boton = get.incrementarMinutos();
                     break;
            case 2:  boton = get.incrementarHora();
                     break;
        }
    public int hora=0;
    
    public int minutos=0;
    
    public int horasyminutos=(hora+":"+minutos);

    }
    
    public int incrementarMinutos(minutos){

    return (minutos+1)
    }
    //Este método incrementa el minuto en el que suena la alarma.
    public int incrementarHora(){ 

    return (hora+1)
    }
    //Este método incrementa la hora en la que suena la alarma.
    
    public int vueltas();
    if minutos>59{
    hora+1
}
}
