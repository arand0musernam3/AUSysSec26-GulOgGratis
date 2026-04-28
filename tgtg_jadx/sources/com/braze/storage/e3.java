package com.braze.storage;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e3 extends AdaptedFunctionReference implements i80.n {
    public e3(SdkMetadataDataStoreProvider$Companion sdkMetadataDataStoreProvider$Companion) {
        super(3, sdkMetadataDataStoreProvider$Companion, SdkMetadataDataStoreProvider$Companion.class, "migrateMetadataToJson", "migrateMetadataToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((SdkMetadataDataStoreProvider$Companion) this.receiver).migrateMetadataToJson((f8.d) obj, (h8.g) obj2);
    }
}
