package com.adyen.checkout.action.core.internal.ui;

import android.app.Application;
import androidx.lifecycle.c1;
import com.adyen.checkout.adyen3ds2.internal.provider.Adyen3DS2ComponentProvider;
import com.adyen.checkout.await.internal.provider.AwaitComponentProvider;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.action.AwaitAction;
import com.adyen.checkout.components.core.action.BaseThreeds2Action;
import com.adyen.checkout.components.core.action.QrCodeAction;
import com.adyen.checkout.components.core.action.RedirectAction;
import com.adyen.checkout.components.core.action.SdkAction;
import com.adyen.checkout.components.core.action.VoucherAction;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.provider.ActionComponentProvider;
import com.adyen.checkout.components.core.internal.ui.ActionDelegate;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.internal.util.LocaleProvider;
import com.adyen.checkout.qrcode.internal.provider.QRCodeComponentProvider;
import com.adyen.checkout.redirect.internal.provider.RedirectComponentProvider;
import com.adyen.checkout.twint.action.internal.provider.TwintActionComponentProvider;
import com.adyen.checkout.voucher.internal.provider.VoucherComponentProvider;
import com.adyen.checkout.wechatpay.internal.provider.WeChatPayActionComponentProvider;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/adyen/checkout/action/core/internal/ui/ActionDelegateProvider;", "", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "Lcom/adyen/checkout/components/core/internal/provider/ActionComponentProvider;", "getSdkActionComponentProvider", "(Lcom/adyen/checkout/components/core/action/Action;)Lcom/adyen/checkout/components/core/internal/provider/ActionComponentProvider;", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "checkoutConfiguration", "Landroidx/lifecycle/c1;", "savedStateHandle", "Landroid/app/Application;", "application", "Lcom/adyen/checkout/components/core/internal/ui/ActionDelegate;", "getDelegate", "(Lcom/adyen/checkout/components/core/action/Action;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroidx/lifecycle/c1;Landroid/app/Application;)Lcom/adyen/checkout/components/core/internal/ui/ActionDelegate;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ActionDelegateProvider {

    @Nullable
    private final AnalyticsManager analyticsManager;

    @Nullable
    private final DropInOverrideParams dropInOverrideParams;

    @NotNull
    private final LocaleProvider localeProvider;

    public ActionDelegateProvider(@Nullable AnalyticsManager analyticsManager, @Nullable DropInOverrideParams dropInOverrideParams, @NotNull LocaleProvider localeProvider) {
        localeProvider.getClass();
        this.analyticsManager = analyticsManager;
        this.dropInOverrideParams = dropInOverrideParams;
        this.localeProvider = localeProvider;
    }

    private final ActionComponentProvider<?, ?, ?> getSdkActionComponentProvider(Action action) {
        String paymentMethodType = action.getPaymentMethodType();
        if (Intrinsics.areEqual(paymentMethodType, PaymentMethodTypes.TWINT)) {
            return new TwintActionComponentProvider<>(this.analyticsManager, this.dropInOverrideParams, this.localeProvider);
        }
        if (Intrinsics.areEqual(paymentMethodType, PaymentMethodTypes.WECHAT_PAY_SDK)) {
            return new WeChatPayActionComponentProvider<>(this.analyticsManager, this.dropInOverrideParams, this.localeProvider);
        }
        throw new CheckoutException(s.k("Can't find delegate for action: ", action.getType(), " and type: ", action.getPaymentMethodType()), null, 2, null);
    }

    @NotNull
    public final ActionDelegate getDelegate(@NotNull Action action, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull c1 savedStateHandle, @NotNull Application application) {
        ActionComponentProvider<?, ?, ?> sdkActionComponentProvider;
        action.getClass();
        checkoutConfiguration.getClass();
        savedStateHandle.getClass();
        application.getClass();
        if (action instanceof AwaitAction) {
            sdkActionComponentProvider = new AwaitComponentProvider(this.analyticsManager, this.dropInOverrideParams, this.localeProvider);
        } else if (action instanceof QrCodeAction) {
            sdkActionComponentProvider = new QRCodeComponentProvider(this.analyticsManager, this.dropInOverrideParams, this.localeProvider);
        } else if (action instanceof RedirectAction) {
            sdkActionComponentProvider = new RedirectComponentProvider(this.analyticsManager, this.dropInOverrideParams, this.localeProvider);
        } else if (action instanceof BaseThreeds2Action) {
            sdkActionComponentProvider = new Adyen3DS2ComponentProvider(this.analyticsManager, this.dropInOverrideParams, this.localeProvider);
        } else if (action instanceof VoucherAction) {
            sdkActionComponentProvider = new VoucherComponentProvider(this.analyticsManager, this.dropInOverrideParams, this.localeProvider);
        } else {
            if (!(action instanceof SdkAction)) {
                throw new CheckoutException(f.k("Can't find delegate for action: ", action.getType()), null, 2, null);
            }
            sdkActionComponentProvider = getSdkActionComponentProvider(action);
        }
        return sdkActionComponentProvider.getDelegate(checkoutConfiguration, savedStateHandle, application);
    }

    public /* synthetic */ ActionDelegateProvider(AnalyticsManager analyticsManager, DropInOverrideParams dropInOverrideParams, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(analyticsManager, dropInOverrideParams, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }
}
