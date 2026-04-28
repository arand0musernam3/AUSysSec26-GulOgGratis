package com.braze.storage;

import android.content.Context;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends DataStoreProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y0 f10524b = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10525a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.f10525a = str;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.d0.h(g8.k.a(getContext(), e0.f.k("com.braze.device_id", StringUtils.getCacheFileSuffix(getContext(), null, this.f10525a)), g8.k.f20094a), new f8.b(getContext(), "com.appboy.device", (aa.l0) null, new z0(), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.device_id", StringUtils.getCacheFileSuffix(getContext(), null, this.f10525a));
    }
}
