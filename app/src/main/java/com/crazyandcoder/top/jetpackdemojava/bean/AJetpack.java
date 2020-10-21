package com.crazyandcoder.top.jetpackdemojava.bean;

import androidx.annotation.IntDef;

@IntDef({
        TJetpack.LIFECYCLE,
        TJetpack.APP_START_UP,
        TJetpack.DATA_STORE,
        TJetpack.VIEW_BINDING,
        TJetpack.DATA_BINDING,
        TJetpack.LIVE_DATA,
        TJetpack.ROOM,
        TJetpack.PAGING,
        TJetpack.VIEW_MODEL,
        TJetpack.WORK_MANAGER,
        TJetpack.SAVING_STATE
})
public @interface AJetpack {
}
