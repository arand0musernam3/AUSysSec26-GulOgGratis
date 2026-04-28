package com.braze.storage;

import android.content.Context;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t3 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TriggerDataStoreProvider$Companion f10697d = new TriggerDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f10700c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.f10698a = str;
        this.f10699b = str2;
        this.f10700c = u70.l.b(new lw.b(18, context, this));
    }

    public static final String a(Context context, t3 t3Var) {
        return StringUtils.getCacheFileSuffix(context, t3Var.f10698a, t3Var.f10699b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        Context context = getContext();
        String strK = e0.f.k("com.appboy.storage.triggers.actions", (String) this.f10700c.getValue());
        TriggerDataStoreProvider$Companion triggerDataStoreProvider$Companion = f10697d;
        return createOrGetDataStore(kotlin.collections.d0.h(new f8.b(context, strK, (aa.l0) null, new r3(triggerDataStoreProvider$Companion), 12), new f8.b(getContext(), e0.f.k("com.appboy.storage.triggers.re_eligibility", (String) this.f10700c.getValue()), (aa.l0) null, new s3(triggerDataStoreProvider$Companion), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.triggers.", (String) this.f10700c.getValue());
    }
}
