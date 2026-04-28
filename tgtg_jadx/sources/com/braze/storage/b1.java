package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends DataStoreProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f10539c;

    static {
        new DustDataStoreProvider$Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.f10537a = str;
        this.f10538b = str2;
        this.f10539c = u70.l.b(new lw.b(8, context, this));
    }

    public static final String a(Context context, b1 b1Var) {
        return StringUtils.getCacheFileSuffix(context, b1Var.f10537a, b1Var.f10538b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.c0.c(g8.k.a(getContext(), e0.f.k("com.braze.managers.dust.metadata", (String) this.f10539c.getValue()), kotlin.collections.g1.b(DataStoreKey.MITE_KEY.getKey()))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.dust", (String) this.f10539c.getValue());
    }
}
