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
public class Pelicula {
    
    //SE CREA LA CAPA DE NEGOCIO USUARIO CON TODOS LOS CAMPOS DE LA TABLA Y SUS METODOS SET Y GET
    private int pelicula_id;
    private String fecha_estreno;
    private String duracion;
    private String titulo;
    private String estado;
    
    //SE CREA LA CONECCION PARA QUE AL MOMENTO DE CREAR EL OBJETO SEA ESTABLECIDA LA CONECCION CON LA BDD
Coneccion con;
  public Pelicula(){
        con=new Coneccion();
    }

    public int getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(int pelicula_id) {
        this.pelicula_id = pelicula_id;
    }

    public String getNombre_pelicula() {
        return fecha_estreno;
    }

    public void setNombre_pelicula(String fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public Coneccion getCon() {
        return con;
    }

    public void setCon(Coneccion con) {
        this.con = con;
    }
    
  
    //SE CREAR EL METODO CREAR PARA HACER UN INSERT UTILIZANDO LOS METODOS GET DE LA CLASE
    public void crear(){
       con.setInsertar("insert into Peliculas(fecha_estreno,duracion,titulo,estado) values('"+this.getNombre_pelicula()+"','"+this.getDuracion()+"','"+this.getTitulo()+"','activo')");
    }
    //SE CREAR EL METODO ELIMINAR PARA HACER UN INSERT UTILIZANDO LOS METODOS GET DE LA CLASE
    public void eliminar(){
      con.setInsertar("update Peliculas set estado='pasivo' where usuario_id='"+this.getPelicula_id()+"'");
    }
    //SE CREAR EL ACTUALIZAR CREAR PARA HACER UN INSERT UTILIZANDO LOS METODOS GET DE LA CLASE
    public void actualizar(){
      con.setInsertar("update Peliculas set fecha_estreno='"+this.getNombre_pelicula()+"',duracion='"+this.getDuracion()+"',titulo='"+this.getTitulo()+"',Estado='"+this.getEstado()+"', where pelicula_id='"+this.pelicula_id+"'");
    }
   
    
    
}
