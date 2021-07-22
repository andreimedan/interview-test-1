package eu.cec.digit.comref.interview.persistent.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WATCH")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Watch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 349533338490577533L;

	@Id
	@Column(name = "NAME", length = 51)
	private String name;

	@Column(name = "value")
	private Integer value;

	@Column(name = "sold")
	private Integer sold;

	@Column(name = "available")
	private Boolean available;
}
