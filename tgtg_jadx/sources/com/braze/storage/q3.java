package com.braze.storage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q3 extends DataStoreProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10667a;

    static {
        new TriggerAssetDataStoreProvider$Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.f10667a = str;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.c0.c(g8.k.a(getContext(), e0.f.k("com.appboy.storage.triggers.local_assets.", this.f10667a), g8.k.f20094a)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.triggers.assets.", this.f10667a);
    }
}
