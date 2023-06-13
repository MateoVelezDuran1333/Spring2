package com.platzi.market.persistence.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class  Categoria {
    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;

    private String descripcion;

    private boolean estado;

    //Ahora tenemos que cerrar la conexión entre categorias y productos, con el cual vamos a usar el @OnetoMany
    // En este caso usaremos el mapped by, donde le pasaremos como parametro lo que construye esta conexión,
    // en este caso sería productos, porque creamos un objetos de tipo productos en producto para hacer la
    // conexión
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
