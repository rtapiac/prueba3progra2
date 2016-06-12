/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import accesodato.Coneccion;


public class Nacionalidad {
    
    //SE CREA LA CAPA DE NEGOCIO USUARIO CON TODOS LOS CAMPOS DE LA TABLA Y SUS METODOS SET Y GET
    private int nacionalidad_id;
    private String nombre_nacionalidad;
    private String clave;
    private String estado;
    private String fecha_nacimiento;
    
    //SE CREA LA CONECCION PARA QUE AL MOMENTO DE CREAR EL OBJETO SEA ESTABLECIDA LA CONECCION CON LA BDD
Coneccion con;
  public Nacionalidad(){
        con=new Coneccion();
    }
    public int getNacionalidad_id() {
        return nacionalidad_id;
    }

    public void setNacionalidad_id(int nacionalidad_id) {
        this.nacionalidad_id = nacionalidad_id;
    }

    public String getNombre_nacionalidad() {
        return nombre_nacionalidad;
    }

    public void setNombre_nacionalidad(String nombre_nacionalidad) {
        this.nombre_nacionalidad = nombre_nacionalidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
 
    
    
    //SE CREAR EL METODO CREAR PARA HACER UN INSERT UTILIZANDO LOS METODOS GET DE LA CLASE
    public void crear(){
       con.setInsertar("insert into Nacionalidades(nombre_nacionalidad,estado) values('"+this.getNombre_nacionalidad()+"','activo')");
    }
    //SE CREAR EL METODO ELIMINAR PARA HACER UN INSERT UTILIZANDO LOS METODOS GET DE LA CLASE
    public void eliminar(){
      con.setInsertar("update Nacionalidades set estado='pasivo' where nacionalidad_id='"+this.getNacionalidad_id()+"'");
    }
    //SE CREAR EL ACTUALIZAR CREAR PARA HACER UN INSERT UTILIZANDO LOS METODOS GET DE LA CLASE
    public void actualizar(){
      con.setInsertar("update Nacionalidades set nombre_nacionalidad='"+this.getNombre_nacionalidad()+"',Estado='"+this.getEstado()+"',fecha_nacimiento='"+"' where nacionalidad_id='"+this.nacionalidad_id+"'");
    }
   
    
    
}
