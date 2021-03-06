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
 * General exception type utilized by {@link IssueTracker}.
 * 
 * @author Tobias Sarnowski
 */
public abstract class IssueTrackerException extends Exception {

    private static final long serialVersionUID = -6433587005570197243L;

    protected IssueTrackerException() {
        
    }

    protected IssueTrackerException(String message) {
        super(message);
    }

    protected IssueTrackerException(String message, Throwable cause) {
        super(message, cause);
    }

    protected IssueTrackerException(Throwable cause) {
        super(cause);
    }

}
