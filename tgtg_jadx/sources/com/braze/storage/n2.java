package com.braze.storage;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n2 extends AdaptedFunctionReference implements i80.n {
    public n2(PushDeliveryDataStoreProvider$Companion pushDeliveryDataStoreProvider$Companion) {
        super(3, pushDeliveryDataStoreProvider$Companion, PushDeliveryDataStoreProvider$Companion.class, "migratePushDeliveryEventsToJson", "migratePushDeliveryEventsToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((PushDeliveryDataStoreProvider$Companion) this.receiver).migratePushDeliveryEventsToJson((f8.d) obj, (h8.g) obj2);
    }
}
