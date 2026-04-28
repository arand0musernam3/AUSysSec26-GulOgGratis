package com.braze.storage;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u1 extends AdaptedFunctionReference implements i80.n {
    public u1(EventDuplicationValidatorDataStoreProvider$Companion eventDuplicationValidatorDataStoreProvider$Companion) {
        super(3, eventDuplicationValidatorDataStoreProvider$Companion, EventDuplicationValidatorDataStoreProvider$Companion.class, "migrateEventDuplicationMap", "migrateEventDuplicationMap(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((EventDuplicationValidatorDataStoreProvider$Companion) this.receiver).migrateEventDuplicationMap((f8.d) obj, (h8.g) obj2);
    }
}
