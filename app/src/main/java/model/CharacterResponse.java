package model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CharacterResponse {
    @SerializedName("pages")
    private int pages;
    @SerializedName("results")
    private List<Character> results;
    @SerializedName("count")
    private int totalResults;
    @SerializedName("next")
    private String next;

    public int getPage() {
        return pages;
    }

    public void setPage(int pages) {
        this.pages = pages;
    }

    public List<Character> getResults() {
        return results;
    }

    public List<Character> getCharacters() {
        return results;
    }

    public void setResults(List<Character> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }



}
