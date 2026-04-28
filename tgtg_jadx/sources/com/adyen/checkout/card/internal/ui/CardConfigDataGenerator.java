package com.adyen.checkout.card.internal.ui;

import com.adyen.checkout.card.KCPAuthVisibility;
import com.adyen.checkout.card.SocialSecurityNumberVisibility;
import com.adyen.checkout.card.internal.ui.model.CVCVisibility;
import com.adyen.checkout.card.internal.ui.model.CardComponentParams;
import com.adyen.checkout.card.internal.ui.model.StoredCVCVisibility;
import com.adyen.checkout.core.CardBrand;
import com.adyen.checkout.ui.core.internal.ui.model.AddressParams;
import e40.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v70.i;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/CardConfigDataGenerator;", "", "()V", "generate", "", "", "configuration", "Lcom/adyen/checkout/card/internal/ui/model/CardComponentParams;", "isStored", "", "generateDualBrandConfigData", "brandOptions", "", "getBillingAddressMode", "addressParams", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams;", "getHideCVC", "getShowKCPType", "kcpAuthVisibility", "Lcom/adyen/checkout/card/KCPAuthVisibility;", "getSocialSecurityNumberMode", "socialSecurityNumberVisibility", "Lcom/adyen/checkout/card/SocialSecurityNumberVisibility;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardConfigDataGenerator {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[StoredCVCVisibility.values().length];
            try {
                iArr[StoredCVCVisibility.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoredCVCVisibility.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CVCVisibility.values().length];
            try {
                iArr2[CVCVisibility.ALWAYS_SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CVCVisibility.ALWAYS_HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CVCVisibility.HIDE_FIRST.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[KCPAuthVisibility.values().length];
            try {
                iArr3[KCPAuthVisibility.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[KCPAuthVisibility.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[SocialSecurityNumberVisibility.values().length];
            try {
                iArr4[SocialSecurityNumberVisibility.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[SocialSecurityNumberVisibility.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private final String getBillingAddressMode(AddressParams addressParams) {
        if (addressParams instanceof AddressParams.FullAddress) {
            return "full";
        }
        if (addressParams instanceof AddressParams.Lookup) {
            return "lookup";
        }
        if (Intrinsics.areEqual(addressParams, AddressParams.None.INSTANCE)) {
            return "none";
        }
        if (addressParams instanceof AddressParams.PostalCode) {
            return "partial";
        }
        a.f();
        return null;
    }

    private final String getHideCVC(CardComponentParams configuration, boolean isStored) {
        if (isStored) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[configuration.getStoredCVCVisibility().ordinal()];
            if (i11 == 1) {
                return "show";
            }
            if (i11 == 2) {
                return "hide";
            }
            a.f();
            return null;
        }
        int i12 = WhenMappings.$EnumSwitchMapping$1[configuration.getCvcVisibility().ordinal()];
        if (i12 == 1) {
            return "show";
        }
        if (i12 == 2) {
            return "hide";
        }
        if (i12 == 3) {
            return "auto";
        }
        a.f();
        return null;
    }

    private final String getShowKCPType(KCPAuthVisibility kcpAuthVisibility) {
        int i11 = WhenMappings.$EnumSwitchMapping$2[kcpAuthVisibility.ordinal()];
        if (i11 == 1) {
            return "show";
        }
        if (i11 == 2) {
            return "hide";
        }
        a.f();
        return null;
    }

    private final String getSocialSecurityNumberMode(SocialSecurityNumberVisibility socialSecurityNumberVisibility) {
        int i11 = WhenMappings.$EnumSwitchMapping$3[socialSecurityNumberVisibility.ordinal()];
        if (i11 == 1) {
            return "show";
        }
        if (i11 == 2) {
            return "hide";
        }
        a.f();
        return null;
    }

    @NotNull
    public final Map<String, String> generate(@NotNull CardComponentParams configuration, boolean isStored) {
        configuration.getClass();
        i iVar = new i();
        if (configuration.getAddressParams() instanceof AddressParams.FullAddress) {
            iVar.put("billingAddressAllowedCountries", CollectionsKt.U(((AddressParams.FullAddress) configuration.getAddressParams()).getSupportedCountryCodes(), MessageLogView.COMMA_SEPARATOR, null, null, null, 62));
        }
        iVar.put("billingAddressMode", getBillingAddressMode(configuration.getAddressParams()));
        iVar.put("billingAddressRequired", String.valueOf(!(configuration.getAddressParams() instanceof AddressParams.None)));
        iVar.put("brands", CollectionsKt.U(configuration.getSupportedCardBrands(), MessageLogView.COMMA_SEPARATOR, null, null, new Function1<CardBrand, CharSequence>() { // from class: com.adyen.checkout.card.internal.ui.CardConfigDataGenerator$generate$1$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull CardBrand cardBrand) {
                cardBrand.getClass();
                return cardBrand.getTxVariant();
            }
        }, 30));
        iVar.put("enableStoreDetails", String.valueOf(configuration.isStorePaymentFieldVisible()));
        iVar.put("hasHolderName", String.valueOf(configuration.isHolderNameRequired()));
        iVar.put("hasInstallmentOptions", String.valueOf(configuration.getInstallmentParams() != null));
        iVar.put("hideCVC", getHideCVC(configuration, isStored));
        iVar.put("holderNameRequired", String.valueOf(configuration.isHolderNameRequired()));
        if (configuration.getInstallmentParams() != null) {
            iVar.put("showInstallmentAmounts", String.valueOf(configuration.getInstallmentParams().getShowInstallmentAmount()));
        }
        iVar.put("showKCPType", getShowKCPType(configuration.getKcpAuthVisibility()));
        iVar.put("showPayButton", String.valueOf(configuration.isSubmitButtonVisible()));
        iVar.put("socialSecurityNumberMode", getSocialSecurityNumberMode(configuration.getSocialSecurityNumberVisibility()));
        return iVar.b();
    }

    @NotNull
    public final Map<String, String> generateDualBrandConfigData(@NotNull List<String> brandOptions) {
        brandOptions.getClass();
        return w0.b(new Pair("dualBrands", CollectionsKt.U(brandOptions, MessageLogView.COMMA_SEPARATOR, null, null, null, 62)));
    }
}
