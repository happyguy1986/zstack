package org.zstack.header.vm;

import org.zstack.header.message.APIListMessage;

import java.util.List;

public class APIListVmInstanceMsg extends APIListMessage {
    public APIListVmInstanceMsg(List<String> uuids) {
        super(uuids);
    }
    
    public APIListVmInstanceMsg() {
        super(null);
    }
}
