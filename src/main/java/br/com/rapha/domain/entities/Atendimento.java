package br.com.rapha.domain.entities;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "tbl_atendimento")
@Data
public class Atendimento {
	
	@Id
	@Column(name = "id")
	private UUID id;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "data_atendimento", nullable = false)
	private Date dataAtendimento;
	
	@Column(name = "local", length = 200, nullable = false)
	private String local;
	
	@ManyToOne
	@JoinColumn(name = "paciente_id", nullable = false)
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "medico_id", nullable = false)
	private Medico medico;
	
	@OneToMany(mappedBy = "atendimento")
	private List<Exame> exames;
	
}
