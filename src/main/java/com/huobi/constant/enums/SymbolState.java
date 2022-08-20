package com.huobi.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SymbolState {
    UNKNOWN("unknown"),
    NOT_ONLINE("not-online"),
    PRE_ONLINE("pre-online"),
    ONLINE("online"),
    SUSPEND("suspend"),
    OFFLINE("offline"),
    TRANSFER_BOARD("transfer-board"),
    FUSE("fuse");

    private final String status;
}
