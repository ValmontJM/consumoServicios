package com.example.consumoservicios;

import org.json.JSONException;
import org.json.JSONObject;

public class Multa {

    String placa, descripcion, estado, fecha, valor, cedula, id, modelo;

    public Multa (JSONObject obj) throws JSONException {
        this.placa = obj.getString("placa");
        this.descripcion = obj.getString("descripcion");
        this.estado = obj.getString("estado");
        this.fecha = obj.getString("fecha");
        this.valor = obj.getString("cedula");
        this.cedula = obj.getString("cedula");
        this.id = obj.getString("id");
        this.modelo = obj.getString("modelo");

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
