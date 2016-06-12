/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import accesodato.Coneccion;

/**
 *
 * @author ricardotoledo
 */
public class Director {
    
    //SE CREA LA CAPA DE NEGOCIO USUARIO CON TODOS LOS CAMPOS DE LA TABLA Y SUS METODOS SET Y GET
    private int director_id;
    private String nombre_director;
    private String apepat;
    private String apemat;
    private String estado;
    private String fecha_nacimiento;
    
    //SE CREA LA CONECCION PARA QUE AL MOMENTO DE CREAR EL OBJETO SEA ESTABLECIDA LA CONECCION CON LA BDD
Coneccion con;
  public Director(){
        con=new Coneccion();
    }

    public int getDirector_id() {
        return director_id;
    }

    public void setDirector_id(int director_id) {
        this.director_id = director_id;
    }

    public String getNombre_director() {
        return nombre_director;
    }

    public void setNombre_director(String nombre_director) {
        this.nombre_director = nombre_director;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Coneccion getCon() {
        return con;
    }

    public void setCon(Coneccion con) {
        this.con = con;
    }
    
  
    //SE CREAR EL METODO CREAR PARA HACER UN INSERT UTILIZANDO LOS METODOS GET DE LA CLASE
    public void crear(){
       con.setInsertar("insert into Directores(nombre_director,apepat,apemat,estado,fecha_nacimiento) values('"+this.getNombre_director()+"','"+this.getApepat()+"','"+this.getApemat()+"','activo','"+this.getFecha_nacimiento()+"')");
    }
    //SE CREAR EL METODO ELIMINAR PARA HACER UN INSERT UTILIZANDO LOS METODOS GET DE LA CLASE
    public void eliminar(){
      con.setInsertar("update Directores set estado='pasivo' where usuario_id='"+this.getDirector_id()+"'");
    }
    //SE CREAR EL ACTUALIZAR CREAR PARA HACER UN INSERT UTILIZANDO LOS METODOS GET DE LA CLASE
    public void actualizar(){
      con.setInsertar("update Directores set nombre_director='"+this.getNombre_director()+"',apepat='"+this.getApepat()+"',apemat='"+this.getApemat()+"',Estado='"+this.getEstado()+"',fecha_nacimiento='"+this.getFecha_nacimiento()+"' where director_id='"+this.director_id+"'");
    }
   
    
    
}
