package info.joshuastech.chrm.rest.offer;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Offer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OFFER_SEQ")
    @SequenceGenerator(sequenceName = "offer_s", allocationSize = 1, name = "OFFER_SEQ")
	private Long id;
	private String name;
	private String code;
	private Date startDate;
	private Date endDate;
	
	public Offer() {
	}
	
	public Offer(String name, String code, Date startDate, Date endDate) {
		super();
		this.name = name;
		this.code = code;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
