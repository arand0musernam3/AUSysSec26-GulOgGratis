package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b3 extends DataStoreProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        Context applicationContext = getContext().getApplicationContext();
        applicationContext.getClass();
        return createOrGetDataStore(kotlin.collections.c0.c(g8.k.a(applicationContext, "persistent.com.appboy.storage.sdk_enabled_cache", kotlin.collections.g1.b(DataStoreKey.SDK_ENABLEMENT.getKey()))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.sdk_enablement";
    }
}
