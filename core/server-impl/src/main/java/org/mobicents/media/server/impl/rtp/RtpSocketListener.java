/*
 * JBoss, Home of Professional Open Source
 * Copyright XXXX, Red Hat Middleware LLC, and individual contributors as indicated
 * by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a full listing
 * of individual contributors.
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU General Public License, v. 2.0.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License,
 * v. 2.0 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
package org.mobicents.media.server.impl.rtp;

import java.io.Serializable;

import org.mobicents.media.server.spi.rtp.RtpSocket;

/**
 * Receive events related to RtpSocketAdaptor.
 *
 * @author amit bhayani
 * @author Oleg Kulikov
 */
public interface RtpSocketListener extends Serializable {
    
    /**
     * This method is call when some exceptions detected.
     *
     * @param e the exception detected by RtpSocketAdaptor.
     */
    public void error(Exception e);
    
    public void rtcpReceiverTimeout(RtpSocket rtpSocket);
    public void rtcpSenderTimeout(RtpSocket rtpSocket);
}