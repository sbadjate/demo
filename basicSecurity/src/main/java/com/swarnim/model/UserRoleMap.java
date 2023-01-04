//package com.swarnim.model;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import org.hibernate.annotations.ManyToAny;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table(name = "user_role_map")
//@Data
//@NoArgsConstructor
//public class UserRoleMap {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	private Long id;
//	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "role_id", referencedColumnName = "role_id")
//	private Role role;
//	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
//	@JsonBackReference
//	private User user;
//}
