package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BannersDataStoreProvider$Companion f10548d = new BannersDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f10551c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.f10549a = str;
        this.f10550b = str2;
        this.f10551c = u70.l.b(new lw.b(9, context, this));
    }

    public static final String a(Context context, e eVar) {
        return StringUtils.getCacheFileSuffix(context, eVar.f10549a, eVar.f10550b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        f8.b bVarA = g8.k.a(getContext(), e0.f.k("com.braze.managers.banners.eligibility", (String) this.f10551c.getValue()), kotlin.collections.g1.b(DataStoreKey.LAST_REFRESH_IN_SECONDS.getKey()));
        Context context = getContext();
        String strK = e0.f.k("com.braze.managers.banners.storage", (String) this.f10551c.getValue());
        BannersDataStoreProvider$Companion bannersDataStoreProvider$Companion = f10548d;
        return createOrGetDataStore(kotlin.collections.d0.h(bVarA, new f8.b(context, strK, (aa.l0) null, new c(bannersDataStoreProvider$Companion), 12), new f8.b(getContext(), e0.f.k("com.braze.managers.banners.impressions", (String) this.f10551c.getValue()), (aa.l0) null, new d(bannersDataStoreProvider$Companion), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.banners", (String) this.f10551c.getValue());
    }
}
