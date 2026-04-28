package com.braze.managers;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends DataStoreProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.c0.c(g8.k.a(getContext(), "com.braze.push_registration", kotlin.collections.y.W(new String[]{DataStoreKey.PUSH_REGISTRATION_VERSION_CODE.getKey(), DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID.getKey(), DataStoreKey.PUSH_REGISTRATION_ID_KEY.getKey()}))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.push_storage";
    }
}
