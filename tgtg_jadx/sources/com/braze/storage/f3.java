package com.braze.storage;

import android.content.Context;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f3 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SdkMetadataDataStoreProvider$Companion f10562d = new SdkMetadataDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f10565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.f10563a = str;
        this.f10564b = str2;
        this.f10565c = u70.l.b(new lw.b(10, context, this));
    }

    public static final String a(Context context, f3 f3Var) {
        return StringUtils.getCacheFileSuffix(context, f3Var.f10563a, f3Var.f10564b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.c0.c(new f8.b(getContext(), e0.f.k("com.braze.storage.sdk_metadata_cache", (String) this.f10565c.getValue()), (aa.l0) null, new e3(f10562d), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.sdk_metadata", (String) this.f10565c.getValue());
    }
}
