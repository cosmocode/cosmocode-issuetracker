package de.cosmocode.issuetracker;

/**
 * @author Tobias Sarnowski
 */
public interface Issue {

    String getId();

    String getTitle();

    void setTitle(String title);

    String getDescription();

    void setDescription(String description);

}
