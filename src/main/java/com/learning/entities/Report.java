package com.learning.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reports")
@Getter
@Setter
@NoArgsConstructor
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy = "report" ,
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	private List<Tag> tags = new ArrayList<>();
	
	public void addTag(Tag tag) {
		tags.add(tag);
		tag.setReport(this);
	}
	
	public void removeTag(Tag tag) {
		tags.remove(tag);
		tag.setReport(null);
	}
	
	
}
