package de.cosmocode.issuetracker;

/**
 * @author Tobias Sarnowski
 */
public interface IssueTracker {

    Issue createIssue(String title, String description);

}
