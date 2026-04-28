package com.app.tgtg.model.remote.item.response;

import com.braze.models.Banner;
import com.braze.models.FeatureFlag;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.InAppMessageControl;
import com.braze.models.inappmessage.InAppMessageHtmlBase;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9481a;

    public /* synthetic */ a(int i11) {
        this.f9481a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9481a) {
            case 0:
                return ItemDiscountResponse._childSerializers$_anonymous_();
            case 1:
                return ItemDiscountResponse._childSerializers$_anonymous_$0();
            case 2:
                return ListItemResponse._childSerializers$_anonymous_();
            case 3:
                return ListItemResponse._childSerializers$_anonymous_$0();
            case 4:
                return ManufacturerItem._childSerializers$_anonymous_();
            case 5:
                return ManufacturerItem._childSerializers$_anonymous_$0();
            case 6:
                return SameTimeCloseByResponse._childSerializers$_anonymous_();
            case 7:
                return SameTimeCloseByResponse._childSerializers$_anonymous_$0();
            case 8:
                return TableReservationItem._childSerializers$_anonymous_();
            case 9:
                return TableReservationItem._childSerializers$_anonymous_$0();
            case 10:
                return TypedItemCardsCarouselMnu._childSerializers$_anonymous_();
            case 11:
                return Banner.forJsonPut$lambda$0();
            case 12:
                return FeatureFlag.forJsonPut$lambda$2();
            case 13:
                return com.braze.models.a.a();
            case 14:
                return com.braze.models.a.b();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return InAppMessageBase.forJsonPut$lambda$9();
            case 16:
                return InAppMessageBase.setClickBehavior$lambda$2();
            case 17:
                return InAppMessageBase.logImpression$lambda$4();
            case 18:
                return InAppMessageBase.logImpression$lambda$5();
            case 19:
                return InAppMessageBase.logImpression$lambda$3();
            case 20:
                return InAppMessageBase.enableDarkTheme$lambda$6();
            case 21:
                return InAppMessageBase.handleLogClick$lambda$11();
            case 22:
                return InAppMessageBase.handleLogClick$lambda$12();
            case 23:
                return InAppMessageBase.handleLogClick$lambda$10();
            case 24:
                return InAppMessageControl.logImpression$lambda$0();
            case 25:
                return InAppMessageControl.logImpression$lambda$2();
            case 26:
                return InAppMessageControl.logImpression$lambda$3();
            case 27:
                return InAppMessageControl.logImpression$lambda$1();
            case 28:
                return InAppMessageHtmlBase.logButtonClick$lambda$1();
            default:
                return InAppMessageHtmlBase.logButtonClick$lambda$2();
        }
    }
}
