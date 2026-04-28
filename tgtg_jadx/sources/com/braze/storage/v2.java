package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v2 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PushMaxDataStoreProvider$Companion f10718d = new PushMaxDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f10721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.f10719a = str;
        this.f10720b = str2;
        this.f10721c = u70.l.b(new lw.b(20, context, this));
    }

    public static final String a(Context context, v2 v2Var) {
        return StringUtils.getCacheFileSuffix(context, v2Var.f10719a, v2Var.f10720b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.d0.h(g8.k.a(getContext(), e0.f.k("com.braze.storage.braze_push_max_metadata", (String) this.f10721c.getValue()), kotlin.collections.g1.b(DataStoreKey.PUSH_MAX_LAST_UPDATE.getKey())), new f8.b(getContext(), e0.f.k("com.braze.storage.braze_push_max_storage", (String) this.f10721c.getValue()), (aa.l0) null, new u2(f10718d), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.pushmax", (String) this.f10721c.getValue());
    }
}
