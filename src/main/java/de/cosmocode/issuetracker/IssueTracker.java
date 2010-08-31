/**
 * Copyright 2010 CosmoCode GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.cosmocode.issuetracker;

import com.google.common.base.Predicate;

import java.util.List;

/**
 * Describes a generic issue tracker like JIRA,
 * ActiveCollab, BugZilla, ... or self made issue
 * tracking.
 *
 * @author Tobias Sarnowski
 */
public interface IssueTracker {

    /**
     * Creates a new issue.
     *
     * @param title the issue's title
     * @param description the issue's description
     * @return the created issue
     */
    Issue createIssue(String title, String description);

    /**
     * Creates a new issue. The action will be aborted if the
     * precondition fails on one of the issue tracker's list.
     *
     * @param title the issue's title
     * @param description the issue's description
     * @param duplicationCheck checks, if the issue is a duplicate of another
     * @return the created issue
     * @throws DuplicateIssueException if the duplicationCheck prevents creation
     */
    Issue createIssue(String title, String description, Predicate<Issue> duplicationCheck)
            throws DuplicateIssueException;

    /**
     * Lists all issues. Depends on the implementation, which
     * issues will be returned.
     *
     * @return a list of issues
     */
    List<Issue> listIssues();

    /**
     * Updates an issue in the tracker. The issue to update
     * is identified by the
     * {@link de.cosmocode.issuetracker.Issue#getId()}.
     *
     * @param issue the source issue for the update
     */
    void updateIssue(Issue issue);

}
