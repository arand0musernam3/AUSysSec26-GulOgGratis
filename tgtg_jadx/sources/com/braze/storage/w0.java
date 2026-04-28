package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f10727d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f10730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Context context, String str, String str2) {
        super(context);
        context.getClass();
        this.f10728a = str;
        this.f10729b = str2;
        this.f10730c = u70.l.b(new jt.g(this, 26));
    }

    public static final String a(w0 w0Var) {
        return StringUtils.getCacheFileSuffix(w0Var.getContext(), w0Var.f10728a, w0Var.f10729b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.d0.h(g8.k.a(getContext(), e0.f.k("com.appboy.storage.device_cache.v3", (String) this.f10730c.getValue()), kotlin.collections.g1.b(DataStoreKey.CACHED_DEVICE.getKey())), g8.k.a(getContext(), e0.f.k("com.braze.storage.device_cache.metadata", (String) this.f10730c.getValue()), kotlin.collections.y.W(new String[]{DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT.getKey(), DataStoreKey.DEVICE_CACHE_LAST_OS_VERSION.getKey()}))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.device_cache", (String) this.f10730c.getValue());
    }
}
