package eu;

import androidx.lifecycle.o0;
import com.app.tgtg.model.remote.manufacturer.request.ManufacturerItemsV2Request;
import com.app.tgtg.model.remote.manufacturer.request.MnuRecommendationsRequest;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.app.tgtg.model.remote.manufacturer.response.BasketPriceSpecification;
import com.app.tgtg.model.remote.manufacturer.response.BasketPriceSpecificationsResponse;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.app.tgtg.model.remote.manufacturer.response.CateringItemProperties;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOption;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsResponse;
import com.app.tgtg.model.remote.manufacturer.response.FindAddressMatchResponse;
import com.app.tgtg.model.remote.manufacturer.response.GetRecommendedManufacturerItemsResponse;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerInformation;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemsV2Response;
import com.app.tgtg.model.remote.manufacturer.response.MnuRecommendationsResponse;
import com.app.tgtg.model.remote.manufacturer.response.OpeningHourPeriod;
import com.braze.models.push.BrazeNotificationPayload;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16477a;

    public /* synthetic */ a(int i11) {
        this.f16477a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16477a) {
            case 0:
                return ManufacturerItemsV2Request._childSerializers$_anonymous_();
            case 1:
                return ManufacturerItemsV2Request._childSerializers$_anonymous_$0();
            case 2:
                return ManufacturerItemsV2Request._childSerializers$_anonymous_$1();
            case 3:
                return MnuRecommendationsRequest._childSerializers$_anonymous_();
            case 4:
                return MnuRecommendationsRequest._childSerializers$_anonymous_$0();
            case 5:
                return MnuRecommendationsRequest._childSerializers$_anonymous_$1();
            case 6:
                return BrazeNotificationPayload.Companion.getTemplateFieldAtIndex$lambda$1();
            case 7:
                return BrazeNotificationPayload.Companion.getTemplateFieldAtIndex$lambda$0();
            case 8:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 9:
                return Unit.f26487a;
            case 10:
                return new o0();
            case 11:
                return new o0();
            case 12:
                return new o0();
            case 13:
                return new o0();
            case 14:
                return BasketItem._childSerializers$_anonymous_();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BasketPriceSpecification._childSerializers$_anonymous_();
            case 16:
                return BasketPriceSpecification._childSerializers$_anonymous_$0();
            case 17:
                return BasketPriceSpecificationsResponse._childSerializers$_anonymous_();
            case 18:
                return BasketResponse._childSerializers$_anonymous_();
            case 19:
                return CateringItemProperties._childSerializers$_anonymous_();
            case 20:
                return DeliveryOption._childSerializers$_anonymous_();
            case 21:
                return DeliveryOptionsResponse._childSerializers$_anonymous_();
            case 22:
                return FindAddressMatchResponse._childSerializers$_anonymous_();
            case 23:
                return GetRecommendedManufacturerItemsResponse._childSerializers$_anonymous_();
            case 24:
                return ManufacturerInformation._childSerializers$_anonymous_();
            case 25:
                return ManufacturerItemsV2Response._childSerializers$_anonymous_();
            case 26:
                return ManufacturerItemsV2Response._childSerializers$_anonymous_$0();
            case 27:
                return ManufacturerItemsV2Response._childSerializers$_anonymous_$1();
            case 28:
                return MnuRecommendationsResponse._childSerializers$_anonymous_();
            default:
                return OpeningHourPeriod._childSerializers$_anonymous_();
        }
    }
}
