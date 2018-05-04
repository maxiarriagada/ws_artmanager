package artmanager.dto;

public class Recommendation {
	
	private Long id;
	private String code;
	private String coderesolution;
	private String resolution;
	private String description;
	private String normative;
	private String observation;
	private String date;
	private String filetype;
	private String dateadded;
	private String modifieddate;
	
	private Long establishmentid;
	
	private Long visitid;
	
public Recommendation(){}
	
	public Recommendation(artmanager.entity.Recommendation recommendation){
		this.setId(recommendation.getId());
		this.setCode(recommendation.getCode());
		this.setDescription(recommendation.getDescription());
		this.setNormative(recommendation.getNormative());
		this.setObservation(recommendation.getObservation());
		this.setCoderesolution(recommendation.getCoderesolution());
		this.setDate(recommendation.getDate());
		this.setFiletype(recommendation.getFiletype());
		this.setEstablishmentid(recommendation.getEstablishmentid());
		this.setDateadded(recommendation.getDateadded());
		this.setModifieddate(recommendation.getModifieddate());
		this.setVisitid(recommendation.getVisitid());
		this.setResolution(recommendation.getResolution());
		
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
