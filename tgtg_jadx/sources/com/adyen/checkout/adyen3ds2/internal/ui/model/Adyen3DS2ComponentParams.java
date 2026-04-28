package com.adyen.checkout.adyen3ds2.internal.ui.model;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.internal.ui.model.AnalyticsParams;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParams;
import com.adyen.checkout.components.core.internal.ui.model.ComponentParams;
import com.adyen.checkout.core.Environment;
import com.adyen.threeds2.customization.UiCustomization;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010&\u001a\u00020\u0003HÂ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003J=\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0001J\u0013\u0010+\u001a\u00020\u001d2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u001dX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00061"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/ui/model/Adyen3DS2ComponentParams;", "Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;", "commonComponentParams", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;", "uiCustomization", "Lcom/adyen/threeds2/customization/UiCustomization;", "threeDSRequestorAppURL", "", "deviceParameterBlockList", "", "(Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;Lcom/adyen/threeds2/customization/UiCustomization;Ljava/lang/String;Ljava/util/Set;)V", "amount", "Lcom/adyen/checkout/components/core/Amount;", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "analyticsParams", "Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "getAnalyticsParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "clientKey", "getClientKey", "()Ljava/lang/String;", "getDeviceParameterBlockList", "()Ljava/util/Set;", "environment", "Lcom/adyen/checkout/core/Environment;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "isCreatedByDropIn", "", "()Z", "shopperLocale", "Ljava/util/Locale;", "getShopperLocale", "()Ljava/util/Locale;", "getThreeDSRequestorAppURL", "getUiCustomization", "()Lcom/adyen/threeds2/customization/UiCustomization;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Adyen3DS2ComponentParams implements ComponentParams {

    @NotNull
    private final CommonComponentParams commonComponentParams;

    @Nullable
    private final Set<String> deviceParameterBlockList;

    @Nullable
    private final String threeDSRequestorAppURL;

    @Nullable
    private final UiCustomization uiCustomization;

    public Adyen3DS2ComponentParams(@NotNull CommonComponentParams commonComponentParams, @Nullable UiCustomization uiCustomization, @Nullable String str, @Nullable Set<String> set) {
        commonComponentParams.getClass();
        this.commonComponentParams = commonComponentParams;
        this.uiCustomization = uiCustomization;
        this.threeDSRequestorAppURL = str;
        this.deviceParameterBlockList = set;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final CommonComponentParams getCommonComponentParams() {
        return this.commonComponentParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Adyen3DS2ComponentParams copy$default(Adyen3DS2ComponentParams adyen3DS2ComponentParams, CommonComponentParams commonComponentParams, UiCustomization uiCustomization, String str, Set set, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonComponentParams = adyen3DS2ComponentParams.commonComponentParams;
        }
        if ((i11 & 2) != 0) {
            uiCustomization = adyen3DS2ComponentParams.uiCustomization;
        }
        if ((i11 & 4) != 0) {
            str = adyen3DS2ComponentParams.threeDSRequestorAppURL;
        }
        if ((i11 & 8) != 0) {
            set = adyen3DS2ComponentParams.deviceParameterBlockList;
        }
        return adyen3DS2ComponentParams.copy(commonComponentParams, uiCustomization, str, set);
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UiCustomization getUiCustomization() {
        return this.uiCustomization;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getThreeDSRequestorAppURL() {
        return this.threeDSRequestorAppURL;
    }

    @Nullable
    public final Set<String> component4() {
        return this.deviceParameterBlockList;
    }

    @NotNull
    public final Adyen3DS2ComponentParams copy(@NotNull CommonComponentParams commonComponentParams, @Nullable UiCustomization uiCustomization, @Nullable String threeDSRequestorAppURL, @Nullable Set<String> deviceParameterBlockList) {
        commonComponentParams.getClass();
        return new Adyen3DS2ComponentParams(commonComponentParams, uiCustomization, threeDSRequestorAppURL, deviceParameterBlockList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Adyen3DS2ComponentParams)) {
            return false;
        }
        Adyen3DS2ComponentParams adyen3DS2ComponentParams = (Adyen3DS2ComponentParams) other;
        return Intrinsics.areEqual(this.commonComponentParams, adyen3DS2ComponentParams.commonComponentParams) && Intrinsics.areEqual(this.uiCustomization, adyen3DS2ComponentParams.uiCustomization) && Intrinsics.areEqual(this.threeDSRequestorAppURL, adyen3DS2ComponentParams.threeDSRequestorAppURL) && Intrinsics.areEqual(this.deviceParameterBlockList, adyen3DS2ComponentParams.deviceParameterBlockList);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @Nullable
    public Amount getAmount() {
        return this.commonComponentParams.getAmount();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public AnalyticsParams getAnalyticsParams() {
        return this.commonComponentParams.getAnalyticsParams();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public String getClientKey() {
        return this.commonComponentParams.getClientKey();
    }

    @Nullable
    public final Set<String> getDeviceParameterBlockList() {
        return this.deviceParameterBlockList;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public Environment getEnvironment() {
        return this.commonComponentParams.getEnvironment();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public Locale getShopperLocale() {
        return this.commonComponentParams.getShopperLocale();
    }

    @Nullable
    public final String getThreeDSRequestorAppURL() {
        return this.threeDSRequestorAppURL;
    }

    @Nullable
    public final UiCustomization getUiCustomization() {
        return this.uiCustomization;
    }

    public int hashCode() {
        int iHashCode = this.commonComponentParams.hashCode() * 31;
        UiCustomization uiCustomization = this.uiCustomization;
        int iHashCode2 = (iHashCode + (uiCustomization == null ? 0 : uiCustomization.hashCode())) * 31;
        String str = this.threeDSRequestorAppURL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Set<String> set = this.deviceParameterBlockList;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    public boolean isCreatedByDropIn() {
        return this.commonComponentParams.isCreatedByDropIn();
    }

    @NotNull
    public String toString() {
        return "Adyen3DS2ComponentParams(commonComponentParams=" + this.commonComponentParams + ", uiCustomization=" + this.uiCustomization + ", threeDSRequestorAppURL=" + this.threeDSRequestorAppURL + ", deviceParameterBlockList=" + this.deviceParameterBlockList + ")";
    }
}
