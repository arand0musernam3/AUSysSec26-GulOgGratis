package com.braze.requests.util;

import android.content.Context;
import com.braze.storage.DataStoreProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends DataStoreProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10483a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.f10483a = str;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return DataStoreProvider.createOrGetDataStore$default(this, null, 1, null);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return this.f10483a;
    }
}
