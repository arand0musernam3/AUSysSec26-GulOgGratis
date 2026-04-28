package com.braze.storage;

import android.content.Context;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v1 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EventDuplicationValidatorDataStoreProvider$Companion f10714d = new EventDuplicationValidatorDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f10717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.f10715a = str;
        this.f10716b = str2;
        this.f10717c = u70.l.b(new lw.b(19, context, this));
    }

    public static final String a(Context context, v1 v1Var) {
        return StringUtils.getCacheFileSuffix(context, v1Var.f10715a, v1Var.f10716b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.c0.c(new f8.b(getContext(), e0.f.k("com.appboy.storage.event_data_validator", (String) this.f10717c.getValue()), (aa.l0) null, new u1(f10714d), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.storage.event_data_validator", (String) this.f10717c.getValue());
    }
}
