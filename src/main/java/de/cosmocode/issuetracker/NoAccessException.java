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
 * An {@link IssueTrackerException} which indicates a failed authentication/authorization.
 * 
 * @author Tobias Sarnowski
 */
final class NoAccessException extends IssueTrackerException {

    private static final long serialVersionUID = -1144086220650975461L;

    NoAccessException() {
        
    }

    NoAccessException(String message) {
        super(message);
    }

    NoAccessException(Throwable cause) {
        super(cause);
    }

    NoAccessException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
