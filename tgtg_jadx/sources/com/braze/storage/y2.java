package com.braze.storage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y2 extends DataStoreProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w2 f10743a = new w2();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.c0.c(new f8.b(getContext(), "com.appboy.override.configuration.cache", (aa.l0) null, new x2(), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return DataStoreProvider.RUNTIME_CONFIG_PREFIX;
    }
}
