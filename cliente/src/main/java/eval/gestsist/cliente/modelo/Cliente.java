package eval.gestsist.cliente.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
	@Column(name = "Codigo", nullable=true, length = 10)
	private String Codigo;
	@Column(name = "NombreCompleto", nullable=true, length = 200)
	private String NombreCompleto;
	
	@Column(name = "NombreCorto", nullable=true, length = 40)
	private String NombreCorto;
	
	@Column(name = "Abreviatura", nullable=true, length = 40)
	private String Abreviatura;
	
	@Column(name = "Ruc", nullable=true, length = 11)
	private String Ruc;
	
	@Column(name = "Estado", nullable=true, length = 1)
	private char Estado;
	
	@Column(name = "GrupoFacturacion", nullable=false, length = 100)
	private String GrupoFacturacion;
	
	@Column(name = "InactivoDesde", nullable=false)
	private Date InactivoDesde;
	
	@Column(name = "CodigoSAP", nullable=false, length = 20)
	private String CodigoSAP;

	public Cliente(String codigo, String nombreCompleto, String nombreCorto, String abreviatura, String ruc,
			char estado, String grupoFacturacion, Date inactivoDesde) {
		super();
		Codigo = codigo;
		NombreCompleto = nombreCompleto;
		NombreCorto = nombreCorto;
		Abreviatura = abreviatura;
		Ruc = ruc;
		Estado = estado;
		GrupoFacturacion = grupoFacturacion;
		InactivoDesde = inactivoDesde;
	}
	public Cliente(String codigo, String nombreCompleto, String nombreCorto, String abreviatura, String ruc,
			char estado, String grupoFacturacion) {
		super();
		Codigo = codigo;
		NombreCompleto = nombreCompleto;
		NombreCorto = nombreCorto;
		Abreviatura = abreviatura;
		Ruc = ruc;
		Estado = estado;
		GrupoFacturacion = grupoFacturacion;
	}
	public Cliente(String codigo, String nombreCompleto, String nombreCorto, String abreviatura, String ruc,
			char estado) {
		super();
		Codigo = codigo;
		NombreCompleto = nombreCompleto;
		NombreCorto = nombreCorto;
		Abreviatura = abreviatura;
		Ruc = ruc;
		Estado = estado;
	}
	public Cliente(String codigo, String nombreCompleto, String nombreCorto, String abreviatura, String ruc
			) {
		super();
		Codigo = codigo;
		NombreCompleto = nombreCompleto;
		NombreCorto = nombreCorto;
		Abreviatura = abreviatura;
		Ruc = ruc;;
	}
	public Cliente(String codigo, String nombreCompleto, String nombreCorto, String abreviatura) {
		super();
		Codigo = codigo;
		NombreCompleto = nombreCompleto;
		NombreCorto = nombreCorto;
		Abreviatura = abreviatura;
	}
	public Cliente(String codigo, String nombreCompleto, String nombreCorto) {
		super();
		Codigo = codigo;
		NombreCompleto = nombreCompleto;
		NombreCorto = nombreCorto;
	}
	public Cliente(String codigo, String nombreCompleto) {
		super();
		Codigo = codigo;
		NombreCompleto = nombreCompleto;
	}
	public Cliente(String codigo) {
		super();
		Codigo = codigo;
	}
	public Cliente() {
		super();
	}

	@Override
	public String toString() {
		return "Cliente [Codigo=" + Codigo + ", NombreCompleto=" + NombreCompleto + ", NombreCorto=" + NombreCorto
				+ ", Abreviatura=" + Abreviatura + ", Ruc=" + Ruc + ", Estado=" + Estado + ", GrupoFacturacion="
				+ GrupoFacturacion + ", InactivoDesde=" + InactivoDesde + ", CodigoSAP=" + CodigoSAP + "]";
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombreCompleto() {
		return NombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		NombreCompleto = nombreCompleto;
	}

	public String getNombreCorto() {
		return NombreCorto;
	}

	public void setNombreCorto(String nombreCorto) {
		NombreCorto = nombreCorto;
	}

	public String getAbreviatura() {
		return Abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		Abreviatura = abreviatura;
	}

	public String getRuc() {
		return Ruc;
	}

	public void setRuc(String ruc) {
		Ruc = ruc;
	}

	public char getEstado() {
		return Estado;
	}

	public void setEstado(char estado) {
		Estado = estado;
	}

	public String getGrupoFacturacion() {
		return GrupoFacturacion;
	}

	public void setGrupoFacturacion(String grupoFacturacion) {
		GrupoFacturacion = grupoFacturacion;
	}

	public Date getInactivoDesde() {
		return InactivoDesde;
	}

	public void setInactivoDesde(Date inactivoDesde) {
		InactivoDesde = inactivoDesde;
	}

	public String getCodigoSAP() {
		return CodigoSAP;
	}

	public void setCodigoSAP(String codigoSAP) {
		CodigoSAP = codigoSAP;
	}
	
}
