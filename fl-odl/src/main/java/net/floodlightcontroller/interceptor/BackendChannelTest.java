/**
 * Copyright (c) 2014, NetIDE Consortium (Create-Net (CN), Telefonica Investigacion Y Desarrollo SA (TID), Fujitsu 
 * Technology Solutions GmbH (FTS), Thales Communications & Security SAS (THALES), Fundacion Imdea Networks (IMDEA),
 * Universitaet Paderborn (UPB), Intel Research & Innovation Ireland Ltd (IRIIL) )
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Authors:
 *     ...
 */
package net.floodlightcontroller.interceptor;

import java.io.IOException;

/**
 * Describe your class here...
 *
 * @author aleckey
 *
 */
public class BackendChannelTest {
	public static void main(String[] args) {
		try {
			MessageWorker worker = new MessageWorker();
			new Thread(worker).start();
			new Thread(new NioServer(null, 41414, worker)).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
