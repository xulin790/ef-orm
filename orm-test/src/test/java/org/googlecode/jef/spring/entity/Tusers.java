package org.googlecode.jef.spring.entity;

import javax.persistence.Table;
import jef.database.DataObject;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Entity;
import jef.codegen.support.NotModified;
/**
 * This class was generated by JEF according to the table in database.
 * You need to modify the type of primary key field, to the strategy your own.
 */
@NotModified
@Entity
@Table(name="tusers")
public class Tusers extends DataObject{


	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Id
	@Column(name="id",precision=10,columnDefinition="NUMBER",nullable=false)
	private int id;

	@Column(name="name",columnDefinition="Varchar",length=50,nullable=false)
	private String name;

	public void setId(int obj){
		this.id = obj;
	}

	public int getId(){
		return id;
	}

	public void setName(String obj){
		this.name = obj;
	}

	public String getName(){
		return name;
	}

	public Tusers(){
	}

	public Tusers(int id){
		this.id = id;
	}


public enum Field implements jef.database.Field{id,name}
}