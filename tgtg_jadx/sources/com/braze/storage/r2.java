package com.braze.storage;

import android.content.Context;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r2 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p2 f10678d = new p2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f10681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(Context context, String str, String str2) {
        super(context);
        context.getClass();
        this.f10679a = str;
        this.f10680b = str2;
        this.f10681c = u70.l.b(new lw.b(17, context, this));
    }

    public static final String a(Context context, r2 r2Var) {
        return StringUtils.getCacheFileSuffix(context, r2Var.f10679a, r2Var.f10680b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.c0.c(new f8.b(getContext(), e0.f.k("com.braze.storage.push_identifier_storage", (String) this.f10681c.getValue()), (aa.l0) null, new q2(), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.push_identifier", (String) this.f10681c.getValue());
    }
}
