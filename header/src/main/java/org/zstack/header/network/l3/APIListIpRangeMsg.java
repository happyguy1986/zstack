package org.zstack.header.network.l3;

import org.zstack.header.message.APIListMessage;

import java.util.List;

public class APIListIpRangeMsg extends APIListMessage {
    public APIListIpRangeMsg() {
    }
    
    public APIListIpRangeMsg(List<String> uuids) {
        super(uuids);
    }
}
