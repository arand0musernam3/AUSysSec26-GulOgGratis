package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a2 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FeatureFlagsDataStoreProvider$Companion f10526d = new FeatureFlagsDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f10529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.f10527a = str;
        this.f10528b = str2;
        this.f10529c = u70.l.b(new lw.b(6, context, this));
    }

    public static final String a(Context context, a2 a2Var) {
        return StringUtils.getCacheFileSuffix(context, a2Var.f10527a, a2Var.f10528b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        f8.b bVarA = g8.k.a(getContext(), e0.f.k("com.braze.managers.featureflags.eligibility", (String) this.f10529c.getValue()), kotlin.collections.g1.b(DataStoreKey.LAST_REFRESH_IN_SECONDS.getKey()));
        Context context = getContext();
        String strK = e0.f.k("com.braze.managers.featureflags.storage", (String) this.f10529c.getValue());
        FeatureFlagsDataStoreProvider$Companion featureFlagsDataStoreProvider$Companion = f10526d;
        return createOrGetDataStore(kotlin.collections.d0.h(bVarA, new f8.b(context, strK, (aa.l0) null, new y1(featureFlagsDataStoreProvider$Companion), 12), new f8.b(getContext(), e0.f.k("com.braze.managers.featureflags.impressions", (String) this.f10529c.getValue()), (aa.l0) null, new z1(featureFlagsDataStoreProvider$Companion), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.featureflags.", (String) this.f10529c.getValue());
    }
}
