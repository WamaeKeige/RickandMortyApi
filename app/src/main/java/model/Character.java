package model;

import com.google.gson.annotations.SerializedName;

public class Character {
    @SerializedName("id")
    private int id;
    @SerializedName("image")
    private String image_path;
    @SerializedName("name")
    private String name;
    @SerializedName("status")
    private String status;
    @SerializedName("gender")
    private String gender;
    @SerializedName("species")
    private String species;

    public Character(int id, String name, String image_path, String gender, String status, String species ){
        this.id = id;
        this.name = name;
        this.image_path = image_path;
        this.gender = gender;
        this.status = status;
        this.species = species;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
