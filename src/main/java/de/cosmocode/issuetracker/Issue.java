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

/**
 * Describes a single issue of an issue tracker.
 *
 * @author Tobias Sarnowski
 */
public interface Issue {

    /**
     * Returns a unique ID, which will be used to identify
     * the issue in the source issue tracker.
     *
     * @return a unique ID
     */
    String getId();

    /**
     * The source issue tracker where the issue comes from.
     *
     * @return source issue tracker
     */
    IssueTracker getIssueTracker();

    /**
     * Returns the issue's title.
     *
     * @return issue's title
     */
    String getTitle();

    /**
     * Sets the issue's title
     *
     * @param title issue's title
     */
    void setTitle(String title);

    /**
     * Returns the issue's description
     *
     * @return issue's description
     */
    String getDescription();

    /**
     * Sets the issue's description
     *
     * @param description issue's description
     */
    void setDescription(String description);

    /**
     * Triggers an update of the ticket
     *
     * @throws IssueTrackerException if something goes wrong
     */
    void update() throws IssueTrackerException;

}
