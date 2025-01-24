package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

	@EmbeddedId
	private BelongingPK Id = new BelongingPK();
	
	private Integer Position;
	
	public Belonging() {
	}

	public Belonging(Game geme,GameList list, Integer position) {
		
		Id.setGame(geme);
		Id.setList(list);
		this.Position = position;
	}

	public BelongingPK getId() {
		return Id;
	}

	public void setId(BelongingPK id) {
		Id = id;
	}

	public Integer getPosition() {
		return Position;
	}

	public void setPosition(Integer position) {
		Position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(Id, other.Id);
	}
	
}
