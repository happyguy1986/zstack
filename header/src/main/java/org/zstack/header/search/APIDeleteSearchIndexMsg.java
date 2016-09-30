package org.zstack.header.search;

import org.zstack.header.message.APIMessage;

public class APIDeleteSearchIndexMsg extends APIMessage {
    private String indexName;

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
}
