/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.seed.core.spi.configuration;

/**
 * Noop configuration converter that return the same value as provided.
 *
 * @author adrien.lauer@mpsa.com
 */
public class ConfigurationIdentityConverter implements ConfigurationConverter<String> {
    @Override
    public String convert(String value) {
        return value;
    }
}
