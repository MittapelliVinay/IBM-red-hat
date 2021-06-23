package org.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "instructor_detail")
public class InstructorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "youtube_channel")
	private String youtubeChannel;
	@Column(name = "hobby")
	private String hobby;
	@OneToOne(mappedBy = "instructorDetails",cascade = CascadeType.ALL)
	private Instructor instructor;
	public void setHobby(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setYoutubeChannel(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setInstructor(Instructor instructor2) {
		// TODO Auto-generated method stub
		
	}
	

}