package artmanager.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Recommendation")
public class Recommendation implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String code;
	@Column
	private String description;
	@Column
	private String normative;
	@Column
	private String observation;
	@Column
	private String coderesolution;
	@Column
	private String resolution;
	@Column
	private String date;
	@Column
	private String filetype;
	@Column
	private Long establishmentid;
	@Column
	private String dateadded;
	@Column
	private String modifieddate;
	//agregado test
	@Column
	private Long visitid;
	
	
	
	public Recommendation(){}
	
	public Recommendation(artmanager.dto.Recommendation recommendation){
		this.setId(recommendation.getId());
		this.setCode(recommendation.getCode());
		this.setDescription(recommendation.getDescription());
		this.setNormative(recommendation.getNormative());
		this.setObservation(recommendation.getObservation());
		this.setCoderesolution(recommendation.getCoderesolution());
		this.setResolution(recommendation.getResolution());
		this.setDate(recommendation.getDate());
		this.setFiletype(recommendation.getFiletype());
		this.setEstablishmentid(recommendation.getEstablishmentid());
		this.setDateadded(recommendation.getDateadded());
		this.setModifieddate(recommendation.getModifieddate());
		
		this.setVisitid(recommendation.getVisitid());
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNormative() {
		return normative;
	}
	public void setNormative(String normative) {
		this.normative = normative;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getCoderesolution() {
		return coderesolution;
	}

	public void setCoderesolution(String coderesolution) {
		this.coderesolution = coderesolution;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public Long getEstablishmentid() {
		return establishmentid;
	}

	public void setEstablishmentid(Long establishmentid) {
		this.establishmentid = establishmentid;
	}

	public String getDateadded() {
		return dateadded;
	}

	public void setDateadded(String dateadded) {
		this.dateadded = dateadded;
	}

	public String getModifieddate() {
		return modifieddate;
	}

	public void setModifieddate(String modifieddate) {
		this.modifieddate = modifieddate;
	}

	public Long getVisitid() {
		return visitid;
	}

	public void setVisitid(Long visitid) {
		this.visitid = visitid;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	
}
