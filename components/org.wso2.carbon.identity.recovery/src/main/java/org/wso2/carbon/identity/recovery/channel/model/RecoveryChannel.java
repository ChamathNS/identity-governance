/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.recovery.channel.model;

import org.wso2.carbon.identity.recovery.channel.dao.RecoveryChannelDAO;
import org.wso2.carbon.identity.recovery.channel.dao.RecoveryChannelDAOImpl;

public class RecoveryChannel {

    private String channelId;
    private String channelType;
    private boolean isChannelLocked;
    private int channelUnlockTime;
    private String[] channelLockReasonCode;
    private String[] channelLockReason;

    public RecoveryChannel(String channelId, String channelType, boolean isChannelLocked, int channelUnlockTime,
                           String[] channelLockReasonCode, String[] channelLockReason) {

        this.channelId = channelId;
        this.channelType = channelType;
        this.isChannelLocked = isChannelLocked;
        this.channelUnlockTime = channelUnlockTime;
        this.channelLockReasonCode = channelLockReasonCode;
        this.channelLockReason = channelLockReason;
    }

    public String getChannelType() {

        return channelType;
    }

    public boolean isChannelLocked() {

        return isChannelLocked;
    }

    public int getChannelUnlockTime() {

        return channelUnlockTime;
    }

    public String[] getChannelLockReasonCode() {

        return channelLockReasonCode;
    }

    public String[] getChannelLockReason() {

        return channelLockReason;
    }

    public void setChannelType(String channelType) {

        this.channelType = channelType;
    }

    public void setChannelLocked(boolean channelLocked) {

        isChannelLocked = channelLocked;
    }

    public void setChannelUnlockTime(int channelUnlockTime) {

        this.channelUnlockTime = channelUnlockTime;
    }

    public void setChannelLockReasonCode(String[] channelLockReasonCode) {

        this.channelLockReasonCode = channelLockReasonCode;
    }

    public void setChannelLockReason(String[] channelLockReason) {

        this.channelLockReason = channelLockReason;
    }
}
