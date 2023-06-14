package com.nestor.xml.entidades;

import java.util.Objects;

public class NoticiaAs {

	private String title;
	private String description;
	private String creator;
	private String guid;
	private String pubDate;
	
	public NoticiaAs() {
		
		}

	public NoticiaAs(String title, String description, String creator, String guid, String pubDate) {
		super();
		this.title = title;
		this.description = description;
		this.creator = creator;
		this.guid = guid;
		this.pubDate = pubDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	@Override
	public String toString() {
		return "NoticiaAs [title=" + title + ", description=" + description + ", creator=" + creator + ", guid=" + guid
				+ ", pubDate=" + pubDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(creator, description, guid, pubDate, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoticiaAs other = (NoticiaAs) obj;
		return Objects.equals(creator, other.creator) && Objects.equals(description, other.description)
				&& Objects.equals(guid, other.guid) && Objects.equals(pubDate, other.pubDate)
				&& Objects.equals(title, other.title);
	}
	
}

	
	
	