package com.adyen.checkout.components.core.internal.ui.model;

import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.internal.ButtonConfiguration;
import com.adyen.checkout.components.core.internal.Configuration;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J4\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/ButtonComponentParamsMapper;", "", "commonComponentParamsMapper", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParamsMapper;", "(Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParamsMapper;)V", "mapToParams", "Lcom/adyen/checkout/components/core/internal/ui/model/ButtonComponentParams;", "checkoutConfiguration", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "deviceLocale", "Ljava/util/Locale;", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "componentSessionParams", "Lcom/adyen/checkout/components/core/internal/ui/model/SessionParams;", "componentConfiguration", "Lcom/adyen/checkout/components/core/internal/Configuration;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ButtonComponentParamsMapper {

    @NotNull
    private final CommonComponentParamsMapper commonComponentParamsMapper;

    public ButtonComponentParamsMapper(@NotNull CommonComponentParamsMapper commonComponentParamsMapper) {
        commonComponentParamsMapper.getClass();
        this.commonComponentParamsMapper = commonComponentParamsMapper;
    }

    @NotNull
    public final ButtonComponentParams mapToParams(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Locale deviceLocale, @Nullable DropInOverrideParams dropInOverrideParams, @Nullable SessionParams componentSessionParams, @Nullable Configuration componentConfiguration) {
        boolean zBooleanValue;
        checkoutConfiguration.getClass();
        deviceLocale.getClass();
        CommonComponentParams commonComponentParams = this.commonComponentParamsMapper.mapToParams(checkoutConfiguration, deviceLocale, dropInOverrideParams, componentSessionParams).getCommonComponentParams();
        if (dropInOverrideParams != null) {
            zBooleanValue = dropInOverrideParams.isSubmitButtonVisible();
        } else {
            ButtonConfiguration buttonConfiguration = componentConfiguration instanceof ButtonConfiguration ? (ButtonConfiguration) componentConfiguration : null;
            Boolean boolIsSubmitButtonVisible = buttonConfiguration != null ? buttonConfiguration.isSubmitButtonVisible() : null;
            if (boolIsSubmitButtonVisible != null) {
                zBooleanValue = boolIsSubmitButtonVisible.booleanValue();
            } else {
                Boolean isSubmitButtonVisible = checkoutConfiguration.getIsSubmitButtonVisible();
                zBooleanValue = isSubmitButtonVisible != null ? isSubmitButtonVisible.booleanValue() : true;
            }
        }
        return new ButtonComponentParams(commonComponentParams, zBooleanValue);
    }
}
