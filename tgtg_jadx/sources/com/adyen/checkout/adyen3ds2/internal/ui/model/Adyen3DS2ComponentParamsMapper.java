package com.adyen.checkout.adyen3ds2.internal.ui.model;

import com.adyen.checkout.adyen3ds2.Adyen3DS2Configuration;
import com.adyen.checkout.adyen3ds2.Adyen3DS2ConfigurationKt;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapper;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapperData;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.components.core.internal.ui.model.SessionParams;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.g1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/ui/model/Adyen3DS2ComponentParamsMapper;", "", "commonComponentParamsMapper", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParamsMapper;", "(Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParamsMapper;)V", "mapToParams", "Lcom/adyen/checkout/adyen3ds2/internal/ui/model/Adyen3DS2ComponentParams;", "checkoutConfiguration", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "deviceLocale", "Ljava/util/Locale;", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "componentSessionParams", "Lcom/adyen/checkout/components/core/internal/ui/model/SessionParams;", "Companion", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Adyen3DS2ComponentParamsMapper {

    @NotNull
    private final CommonComponentParamsMapper commonComponentParamsMapper;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String PHONE_NUMBER_PARAMETER = "A005";

    @NotNull
    private static final Set<String> DEVICE_PARAMETER_BLOCK_LIST = g1.b(PHONE_NUMBER_PARAMETER);

    public Adyen3DS2ComponentParamsMapper(@NotNull CommonComponentParamsMapper commonComponentParamsMapper) {
        commonComponentParamsMapper.getClass();
        this.commonComponentParamsMapper = commonComponentParamsMapper;
    }

    @NotNull
    public final Adyen3DS2ComponentParams mapToParams(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Locale deviceLocale, @Nullable DropInOverrideParams dropInOverrideParams, @Nullable SessionParams componentSessionParams) {
        checkoutConfiguration.getClass();
        deviceLocale.getClass();
        CommonComponentParamsMapperData commonComponentParamsMapperDataMapToParams = this.commonComponentParamsMapper.mapToParams(checkoutConfiguration, deviceLocale, dropInOverrideParams, componentSessionParams);
        Adyen3DS2Configuration adyen3DS2Configuration = Adyen3DS2ConfigurationKt.getAdyen3DS2Configuration(checkoutConfiguration);
        return new Adyen3DS2ComponentParams(commonComponentParamsMapperDataMapToParams.getCommonComponentParams(), adyen3DS2Configuration != null ? adyen3DS2Configuration.getUiCustomization() : null, adyen3DS2Configuration != null ? adyen3DS2Configuration.getThreeDSRequestorAppURL() : null, DEVICE_PARAMETER_BLOCK_LIST);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/ui/model/Adyen3DS2ComponentParamsMapper$Companion;", "", "()V", "DEVICE_PARAMETER_BLOCK_LIST", "", "", "getDEVICE_PARAMETER_BLOCK_LIST$3ds2_release$annotations", "getDEVICE_PARAMETER_BLOCK_LIST$3ds2_release", "()Ljava/util/Set;", "PHONE_NUMBER_PARAMETER", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> getDEVICE_PARAMETER_BLOCK_LIST$3ds2_release() {
            return Adyen3DS2ComponentParamsMapper.DEVICE_PARAMETER_BLOCK_LIST;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDEVICE_PARAMETER_BLOCK_LIST$3ds2_release$annotations() {
        }
    }
}
