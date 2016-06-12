/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import accesodato.Coneccion;


public class Usuario {
    
    //SE CREA LA CAPA DE NEGOCIO USUARIO CON TODOS LOS CAMPOS DE LA TABLA Y SUS METODOS SET Y GET
    private int usuario_id;
    private String nombre_usuario;
    private String clave;
    private String estado;
    private String fecha_nacimiento;
    
    //SE CREA LA CONECCION PARA QUE AL MOMENTO DE CREAR EL OBJETO SEA ESTABLECIDA LA CONECCION CON LA BDD
Coneccion con;
  public Usuario(){
        con=new Coneccion();
    }
    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
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
   
   
    
    
    
    //SE CREAR EL METODO CREAR PARA HACER UN INSERT UTILIZANDO LOS METODOS GET DE LA CLASE
    public void crear(){
       con.setInsertar("insert into Usuarios(nombre_usuario,clave,estado,fecha_nacimiento) values('"+this.getNombre_usuario()+"','"+this.getClave()+"','activo','"+this.getFecha_nacimiento()+"')");
    }
    //SE CREAR EL METODO ELIMINAR PARA HACER UN INSERT UTILIZANDO LOS METODOS GET DE LA CLASE
    public void eliminar(){
      con.setInsertar("update Usuarios set estado='pasivo' where usuario_id='"+this.getUsuario_id()+"'");
    }
    //SE CREAR EL ACTUALIZAR CREAR PARA HACER UN INSERT UTILIZANDO LOS METODOS GET DE LA CLASE
    public void actualizar(){
      con.setInsertar("update Usuarios set nombre_usuario='"+this.getNombre_usuario()+"',clave='"+this.getClave()+"',Estado='"+this.getEstado()+"',fecha_nacimiento='"+this.getFecha_nacimiento()+"' where usuario_id='"+this.usuario_id+"'");
    }
   
    
    
}
