package com.movies.data;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.movies.model.Actor;
import com.movies.util.Retorno;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ActorRetorno extends Retorno {
	
	@XmlElementWrapper(name="tipos")
	@XmlElement(name="tipo")
	private List<Actor> data;
	public ActorRetorno() {
		data = new ArrayList<Actor>();		
	}
	public List<Actor> getData() {
		return data;
	}
	public void setData(List<Actor> data) {
		this.data = data;
	}
}
