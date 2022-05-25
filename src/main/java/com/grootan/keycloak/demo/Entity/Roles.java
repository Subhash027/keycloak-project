package com.grootan.keycloak.demo.Entity;


import lombok.*;

import javax.persistence.*;

@Table(name="roles")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Roles {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "role")
	private String role;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

}
