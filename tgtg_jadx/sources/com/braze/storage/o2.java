package com.braze.storage;

import android.content.Context;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o2 extends DataStoreProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PushDeliveryDataStoreProvider$Companion f10641c = new PushDeliveryDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u70.j f10643b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.f10642a = str;
        this.f10643b = u70.l.b(new lw.b(14, context, this));
    }

    public static final String a(Context context, o2 o2Var) {
        return StringUtils.getCacheFileSuffix(context, null, o2Var.f10642a);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.c0.c(new f8.b(getContext(), e0.f.k("com.braze.storage.braze_push_delivery_storage", (String) this.f10643b.getValue()), (aa.l0) null, new n2(f10641c), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.push_delivery.", this.f10642a);
    }
}
