package com.braze.storage;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d extends AdaptedFunctionReference implements i80.n {
    public d(BannersDataStoreProvider$Companion bannersDataStoreProvider$Companion) {
        super(3, bannersDataStoreProvider$Companion, BannersDataStoreProvider$Companion.class, "migrateBannerImpressionMapToJson", "migrateBannerImpressionMapToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((BannersDataStoreProvider$Companion) this.receiver).migrateBannerImpressionMapToJson((f8.d) obj, (h8.g) obj2);
    }
}
