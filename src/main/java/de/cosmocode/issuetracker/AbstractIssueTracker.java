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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility implementation which can be used for implementations
 *
 * @author Tobias Sarnowski
 */
public abstract class AbstractIssueTracker implements IssueTracker {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractIssueTracker.class);

    @Override
    public Issue createIssue(String title, String description, Predicate<? super Issue> duplicationCheck)
            throws IssueTrackerException {
        for (Issue issue: listIssues()) {
            if (duplicationCheck.apply(issue)) {
                throw new DuplicateIssueException(issue);
            }
        }
        return createIssue(title, description);
    }
}
