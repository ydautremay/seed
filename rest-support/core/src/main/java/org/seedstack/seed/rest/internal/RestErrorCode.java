/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.seed.rest.internal;

import org.seedstack.seed.core.api.ErrorCode;

/**
 * Enumerate all REST support errors.
 *
 * @author adrien.lauer@mpsa.com
 */
public enum RestErrorCode implements ErrorCode {
    MULTIPLE_PATH_FOR_THE_SAME_REL,
    UNSUPPORTED_CACHE_POLICY, CANNOT_MERGE_RESOURCE_WITH_DIFFERENT_REL, CANNOT_MERGE_RESOURCES_WITH_DIFFERENT_DOC,
}
