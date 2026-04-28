package lw;

import com.braze.storage.PushDeliveryDataStoreProvider$Companion;
import com.braze.storage.PushMaxDataStoreProvider$Companion;
import com.braze.storage.SdkMetadataDataStoreProvider$Companion;
import com.braze.storage.ServerConfigDataStoreProvider$Companion;
import com.braze.storage.SessionStorageDataStoreProvider$Companion;
import com.braze.storage.TriggerDataStoreProvider$Companion;
import com.braze.storage.b2;
import com.braze.storage.c1;
import com.braze.storage.g0;
import com.braze.storage.h2;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28310a;

    public /* synthetic */ f(int i11) {
        this.f28310a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28310a) {
            case 0:
                return PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$5();
            case 1:
                return PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$0();
            case 2:
                return PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$6();
            case 3:
                return SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$0();
            case 4:
                return SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$1();
            case 5:
                return SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$5();
            case 6:
                return ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$0();
            case 7:
                return ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$2();
            case 8:
                return ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$3();
            case 9:
                return ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$1();
            case 10:
                return SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$0();
            case 11:
                return SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$5();
            case 12:
                return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$8();
            case 13:
                return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$7();
            case 14:
                return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$9();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$13$lambda$12();
            case 16:
                return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$14();
            case 17:
                return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$0();
            case 18:
                return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$1();
            case 19:
                return com.braze.storage.b.b();
            case 20:
                return b2.a();
            case 21:
                return b2.b();
            case 22:
                return b2.c();
            case 23:
                return c1.b();
            case 24:
                return c1.c();
            case 25:
                return c1.a();
            case 26:
                return g0.a();
            case 27:
                return g0.a("Failed to read all data from DataStore");
            case 28:
                return h2.a();
            default:
                return h2.b();
        }
    }
}
