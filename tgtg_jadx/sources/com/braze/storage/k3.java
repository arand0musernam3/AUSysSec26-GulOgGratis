package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k3 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SessionStorageDataStoreProvider$Companion f10607d = new SessionStorageDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f10610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.f10608a = str;
        this.f10609b = str2;
        this.f10610c = u70.l.b(new lw.b(11, context, this));
    }

    public static final String a(Context context, k3 k3Var) {
        return StringUtils.getCacheFileSuffix(context, k3Var.f10608a, k3Var.f10609b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.d0.h(g8.k.a(getContext(), e0.f.k("com.appboy.storage.session_storage", (String) this.f10610c.getValue()), kotlin.collections.g1.b(DataStoreKey.CURRENT_OPEN_SESSION_ID.getKey())), new f8.b(getContext(), e0.f.k("com.appboy.storage.session_storage", (String) this.f10610c.getValue()), (aa.l0) null, new j3(f10607d), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.session_storage", (String) this.f10610c.getValue());
    }
}
