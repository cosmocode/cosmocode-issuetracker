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
 * An {@link IssueTrackerException} which indicates an error during issue creation.
 * 
 * @author Tobias Sarnowski
 */
public final class StoringIssueFailed extends IssueTrackerException {

    private static final long serialVersionUID = 5482526212846219181L;

    public StoringIssueFailed() {
        
    }

    public StoringIssueFailed(String message) {
        super(message);
    }

    public StoringIssueFailed(String message, Throwable cause) {
        super(message, cause);
    }

    public StoringIssueFailed(Throwable cause) {
        super(cause);
    }
    
}
