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

import com.google.common.base.Preconditions;

/**
 * An {@link IssueTrackerException} which indicates a duplicate issue.
 * 
 * @author Tobias Sarnowski
 */
public final class DuplicateIssueException extends IssueTrackerException {
    
    private static final long serialVersionUID = -2237164096242397024L;
    
    private final Issue issue;

    public DuplicateIssueException(Issue issue) {
        this.issue = Preconditions.checkNotNull(issue, "issue");
    }

    public Issue getIssue() {
        return issue;
    }
    
}
