/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.seed.jms.fixtures;

import org.seedstack.seed.core.api.Logging;
import org.seedstack.seed.it.api.ITBind;
import org.seedstack.seed.jms.JmsBaseIT;
import org.seedstack.seed.jms.api.DestinationType;
import org.seedstack.seed.jms.api.JmsMessageListener;
import org.seedstack.seed.transaction.api.Transactional;
import org.slf4j.Logger;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;


@JmsMessageListener(connection = "connection1", destinationType = DestinationType.QUEUE, destinationName = "queue1")
public class TestMessageListener1 implements javax.jms.MessageListener {

    @Logging
    public Logger logger;

    @Override
    @Transactional
    public void onMessage(Message message) {
        try {
            JmsBaseIT.textManaged = ((TextMessage) message).getText();
        } catch (JMSException e) {
            throw new RuntimeException(e);
        } finally {
            JmsBaseIT.managed.countDown();
        }
    }
}