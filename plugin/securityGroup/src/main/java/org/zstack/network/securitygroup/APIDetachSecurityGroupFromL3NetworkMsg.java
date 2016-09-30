package org.zstack.network.securitygroup;

import org.zstack.header.identity.Action;
import org.zstack.header.message.APIMessage;
import org.zstack.header.message.APIParam;
import org.zstack.header.network.l3.L3NetworkVO;


/**
 * @api
 * detach security group from a l3Network
 *
 * @category security group
 *
 * @since 0.1.0
 *
 * @cli
 *
 * @httpMsg
 *
 * @msg
 * {
"org.zstack.network.securitygroup.APIDetachSecurityGroupFromL3NetworkMsg": {
"securityGroupUuid": "3d9d1a6a472440a4b53d2389c111336c",
"l3NetworkUuid": "2a4b46c9ce154d759dc0e933c4f84ae6",
"session": {
"uuid": "2a4038cebb1a411fb2f549e5119996b8"
},
"timeout": 1800000,
"id": "6fd757b4b4964a4ebc4d636dda67c8cc",
"serviceId": "api.portal"
}
}
 *
 * @result
 * see :ref:`APIDetachSecurityGroupFromL3NetworkEvent`
 */

@Action(category = SecurityGroupConstant.ACTION_CATEGORY)
public class APIDetachSecurityGroupFromL3NetworkMsg extends APIMessage {
    /**
     * @desc security group uuid
     */
    @APIParam(resourceType = SecurityGroupVO.class, checkAccount = true, operationTarget = true)
    private String securityGroupUuid;
    /**
     * @desc l3Network uuid
     */
    @APIParam(resourceType = L3NetworkVO.class, checkAccount = true)
    private String l3NetworkUuid;

    public String getSecurityGroupUuid() {
        return securityGroupUuid;
    }

    public void setSecurityGroupUuid(String securityGroupUuid) {
        this.securityGroupUuid = securityGroupUuid;
    }

    public String getL3NetworkUuid() {
        return l3NetworkUuid;
    }

    public void setL3NetworkUuid(String l3NetworkUuid) {
        this.l3NetworkUuid = l3NetworkUuid;
    }
}
