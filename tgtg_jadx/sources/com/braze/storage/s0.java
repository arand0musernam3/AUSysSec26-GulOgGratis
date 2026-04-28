package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends DataStoreProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.c0.c(g8.k.a(getContext(), "persistent.com.braze.storage.delayed_initialization_cache", kotlin.collections.y.W(new String[]{DataStoreKey.DELAYED_INIT_ENABLED.getKey(), DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG.getKey(), DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG.getKey()}))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.delayed_initialization";
    }
}
