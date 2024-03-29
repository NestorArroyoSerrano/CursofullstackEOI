package com.nestor.entidades;


import java.util.List;
import java.util.Objects;

public class Films {

	private String title;
	private Long episode_id;
	private String opening_crawl;
	private String director;
	private String producer;
	private String release_date;
	private List<String> characters;
	private List<String> planets;
	private List<String> starships;
	private List<String> vehicles;
	private List<String> species;
	
	
	public Films() {
		
	}


	public Films(String title, Long episode_id, String opening_crawl, String director, String producer,
			String release_date, List<String> characters, List<String> planets, List<String> starships,
			List<String> vehicles, List<String> species) {
		super();
		this.title = title;
		this.episode_id = episode_id;
		this.opening_crawl = opening_crawl;
		this.director = director;
		this.producer = producer;
		this.release_date = release_date;
		this.characters = characters;
		this.planets = planets;
		this.starships = starships;
		this.vehicles = vehicles;
		this.species = species;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Long getEpisode_id() {
		return episode_id;
	}


	public void setEpisode_id(Long episode_id) {
		this.episode_id = episode_id;
	}


	public String getOpening_crawl() {
		return opening_crawl;
	}


	public void setOpening_crawl(String opening_crawl) {
		this.opening_crawl = opening_crawl;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getProducer() {
		return producer;
	}


	public void setProducer(String producer) {
		this.producer = producer;
	}


	public String getRelease_date() {
		return release_date;
	}


	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}


	public List<String> getCharacters() {
		return characters;
	}


	public void setCharacters(List<String> characters) {
		this.characters = characters;
	}


	public List<String> getPlanets() {
		return planets;
	}


	public void setPlanets(List<String> planets) {
		this.planets = planets;
	}


	public List<String> getStarships() {
		return starships;
	}


	public void setStarships(List<String> starships) {
		this.starships = starships;
	}


	public List<String> getVehicles() {
		return vehicles;
	}


	public void setVehicles(List<String> vehicles) {
		this.vehicles = vehicles;
	}


	public List<String> getSpecies() {
		return species;
	}


	public void setSpecies(List<String> species) {
		this.species = species;
	}


	@Override
	public String toString() {
		return "Films [title=" + title + ", episode_id=" + episode_id + ", opening_crawl=" + opening_crawl
				+ ", director=" + director + ", producer=" + producer + ", release_date=" + release_date
				+ ", characters=" + characters + ", planets=" + planets + ", starships=" + starships + ", vehicles="
				+ vehicles + ", species=" + species + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(characters, director, episode_id, opening_crawl, planets, producer, release_date, species,
				starships, title, vehicles);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Films other = (Films) obj;
		return Objects.equals(characters, other.characters) && Objects.equals(director, other.director)
				&& Objects.equals(episode_id, other.episode_id) && Objects.equals(opening_crawl, other.opening_crawl)
				&& Objects.equals(planets, other.planets) && Objects.equals(producer, other.producer)
				&& Objects.equals(release_date, other.release_date) && Objects.equals(species, other.species)
				&& Objects.equals(starships, other.starships) && Objects.equals(title, other.title)
				&& Objects.equals(vehicles, other.vehicles);
	}
	
}
