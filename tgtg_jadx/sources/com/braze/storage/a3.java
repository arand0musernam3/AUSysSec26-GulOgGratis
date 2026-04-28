package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a3 extends DataStoreProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f10532c;

    static {
        new SdkAuthenticationDataStoreProvider$Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.f10530a = str;
        this.f10531b = str2;
        this.f10532c = u70.l.b(new lw.b(7, context, this));
    }

    public static final String a(Context context, a3 a3Var) {
        return StringUtils.getCacheFileSuffix(context, a3Var.f10530a, a3Var.f10531b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.c0.c(g8.k.a(getContext(), e0.f.k("com.braze.storage.sdk_auth_cache", (String) this.f10532c.getValue()), kotlin.collections.g1.b(DataStoreKey.SDK_AUTH.getKey()))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.sdk_auth", (String) this.f10532c.getValue());
    }
}
