package lu;

import com.app.tgtg.model.remote.payment.PriceSpecification;
import com.app.tgtg.model.remote.payment.PriceSpecifications;
import com.app.tgtg.model.remote.payment.SavedPaymentMethodsResponse;
import com.app.tgtg.model.remote.payment.SupportedPayments;
import com.app.tgtg.model.remote.payment.UnknownSavedPaymentMethod;
import com.braze.storage.BannersDataStoreProvider$Companion;
import com.braze.storage.ContentCardsDataStoreProvider$Companion;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.EventDuplicationValidatorDataStoreProvider$Companion;
import com.braze.storage.FeatureFlagsDataStoreProvider$Companion;
import com.braze.storage.PushDeliveryDataStoreProvider$Companion;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lv.q0;
import lv.x0;
import mv.b;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28171a;

    public /* synthetic */ a(int i11) {
        this.f28171a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28171a) {
            case 0:
                return PriceSpecification._childSerializers$_anonymous_();
            case 1:
                return PriceSpecification._childSerializers$_anonymous_$0();
            case 2:
                return PriceSpecification._childSerializers$_anonymous_$1();
            case 3:
                return PriceSpecifications._childSerializers$_anonymous_();
            case 4:
                return SavedPaymentMethodsResponse._childSerializers$_anonymous_();
            case 5:
                return SupportedPayments._childSerializers$_anonymous_();
            case 6:
                return SupportedPayments._childSerializers$_anonymous_$0();
            case 7:
                return UnknownSavedPaymentMethod._init_$_anonymous_();
            case 8:
                q0 q0Var = x0.f28292b;
                try {
                    b bVar = b.f30149d;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("instance");
                        bVar = null;
                    }
                    return Intrinsics.areEqual(bVar.a(), "ja-JP") ? x0.f28291a : q0Var;
                } catch (UninitializedPropertyAccessException unused) {
                    return q0Var;
                }
            case 9:
                return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$0();
            case 10:
                return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$6();
            case 11:
                return BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$7();
            case 12:
                return BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$11$lambda$10();
            case 13:
                return BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$12();
            case 14:
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$0();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$6();
            case 16:
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$7();
            case 17:
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$8();
            case 18:
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$9();
            case 19:
                return DataStoreProvider.publishException$lambda$11();
            case 20:
                return DataStoreProvider.Companion.deleteDataStoreFiles$lambda$8();
            case 21:
                return EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$0();
            case 22:
                return EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$4();
            case 23:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$0();
            case 24:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$8$lambda$7();
            case 25:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$9();
            case 26:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$10();
            case 27:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$14$lambda$13();
            case 28:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$15();
            default:
                return PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$0();
        }
    }
}
