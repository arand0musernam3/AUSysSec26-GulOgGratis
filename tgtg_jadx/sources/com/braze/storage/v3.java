package com.braze.storage;

import android.content.Context;
import com.braze.support.StringUtils;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v3 extends DataStoreProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f10724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(Context context, String str, String str2) {
        super(context);
        context.getClass();
        this.f10722a = str;
        this.f10723b = str2;
        this.f10724c = u70.l.b(new lw.b(21, context, this));
    }

    public static final String a(Context context, v3 v3Var) {
        return StringUtils.getCacheFileSuffix(context, v3Var.f10722a, v3Var.f10723b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        Context context = getContext();
        String strK = e0.f.k("com.appboy.storage.user_cache.v3", (String) this.f10724c.getValue());
        LinkedHashSet linkedHashSet = g8.k.f20094a;
        return createOrGetDataStore(kotlin.collections.d0.h(g8.k.a(context, strK, linkedHashSet), g8.k.a(getContext(), "com.braze.storage.user_cache.push_token_store" + ((String) this.f10724c.getValue()), linkedHashSet)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.user_cache", (String) this.f10724c.getValue());
    }
}
