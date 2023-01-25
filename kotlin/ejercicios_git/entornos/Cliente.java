/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos;
/**
 *Representa informacion de un cliente con dni sueldo y cuenta
 * @author ismael
 * @see entornos.Cuenta
 * @version 2023
 */
import java.util.Scanner;


public class Cliente {
    private int dni;
    private double sueldo;
    protected Cuenta cuentaCliente;
    //private static int  numeroscuenta=1;
    /**
     * Creamos las variables que va a tener la clase Cliente
     */
    public Cliente(int nDni, double nSueldo, double nSaldo){
        dni=nDni;
        sueldo=nSueldo;
        //Cuenta(double Nsaldo,int Nnumcuenta,int Ncontra){
        cuentaCliente=new Cuenta(nSaldo,nDni,nDni);

    }

    /**
     * datos cliente
     */
    public Cliente(){
        dni=0;
        sueldo=0.0;
        cuentaCliente=new Cuenta();

    }

    /**
     * Actualiza el sueldo
     * @param nSueldo nuevo valor de sueldo debe ser mayor que 0
     */
    public double getSueldo(){
        return sueldo;
    }

    /**
     * Obtener DNI
     * @return
     */
    public int getDni(){
        return dni;
    }

    /**
     * Indicar sueldo
     * @param nSueldo tiene que ser mayor a 0
     */
    public void setSueldo(double nSueldo ){
        if (nSueldo>0)
            sueldo=nSueldo;
    }

    /**
     * Actualiza el DNI
     * @param nDni valores entre 1000000 y 99999999
     */
    public void setDni(int nDni ){
        if(nDni>=10000000 && nDni<=99999999 )
            dni=nDni;
    }

    /**
     * que ingrese el sueldo del cliente en la
     * cuenta
     */
    public void ingresar_nómina(){
        cuentaCliente.modificar_saldo(sueldo);
    }

    /**
     * Actualiza el saldo de la cuenta sacando lo que se pida por teclado
     * @param dniRecibido recibe dni para comprobar si es valido
     * @param contraRecibida recibe contraseña para comprobar si es valido
     *
     */
    public void sacar_dinero( int dniRecibido, int contraRecibida){

        if (dniRecibido==dni && cuentaCliente.validar_contraseña(contraRecibida)){
            Scanner CS = new Scanner(System.in);
            System.out.println("introduce la cantidad a sacar");
            double cantidadScar = CS.nextDouble();
            cantidadScar=-1*cantidadScar;//sacar no ingresar
            cuentaCliente.modificar_saldo(cantidadScar);



        }

    }




}