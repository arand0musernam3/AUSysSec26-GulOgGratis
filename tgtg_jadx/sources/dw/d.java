package dw;

import com.braze.Constants;
import com.braze.requests.e;
import com.braze.requests.m;
import com.braze.storage.BannersDataStoreProvider$Companion;
import com.braze.storage.ContentCardsDataStoreProvider$Companion;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.FeatureFlagsDataStoreProvider$Companion;
import com.braze.storage.SessionStorageDataStoreProvider$Companion;
import com.braze.storage.TriggerDataStoreProvider$Companion;
import com.braze.storage.a0;
import com.braze.storage.b2;
import com.braze.storage.c1;
import com.braze.storage.f0;
import com.braze.storage.i3;
import g9.v;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15186b;

    public /* synthetic */ d(String str, int i11) {
        this.f15185a = i11;
        this.f15186b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15185a) {
            case 0:
                return com.braze.models.outgoing.event.a.f(this.f15186b);
            case 1:
                return com.braze.models.outgoing.event.a.h(this.f15186b);
            case 2:
                return com.braze.models.outgoing.event.a.l(this.f15186b);
            case 3:
                return com.braze.models.outgoing.event.a.j(this.f15186b);
            case 4:
                return com.braze.models.outgoing.event.a.b(this.f15186b);
            case 5:
                return com.braze.requests.b.a(this.f15186b);
            case 6:
                return e.a(this.f15186b);
            case 7:
                return m.b(this.f15186b);
            case 8:
                return new v(this.f15186b, null, null);
            case 9:
                return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$3$lambda$1(this.f15186b);
            case 10:
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$3$lambda$1(this.f15186b);
            case 11:
                return DataStoreProvider.writeData$lambda$0(this.f15186b);
            case 12:
                return DataStoreProvider.readData$lambda$1(this.f15186b);
            case 13:
                return DataStoreProvider.createOrGetDataStore$lambda$10$lambda$9$lambda$8(this.f15186b);
            case 14:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$2$lambda$1(this.f15186b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$6$lambda$5(this.f15186b);
            case 16:
                return SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$2$lambda$1(this.f15186b);
            case 17:
                return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$11$lambda$10(this.f15186b);
            case 18:
                return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$4$lambda$2(this.f15186b);
            case 19:
                return a0.a(this.f15186b);
            case 20:
                return b2.f(this.f15186b);
            case 21:
                return b2.d(this.f15186b);
            case 22:
                return b2.e(this.f15186b);
            case 23:
                return b2.a(this.f15186b);
            case 24:
                return b2.b(this.f15186b);
            case 25:
                return b2.c(this.f15186b);
            case 26:
                return c1.a(this.f15186b);
            case 27:
                return c1.b(this.f15186b);
            case 28:
                return f0.a(this.f15186b);
            default:
                return i3.a(this.f15186b, Constants.BRAZE_SDK_VERSION);
        }
    }
}
