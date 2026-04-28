package com.adyen.checkout.action.core.internal;

import android.content.Context;
import com.adyen.checkout.action.core.GenericActionConfiguration;
import com.adyen.checkout.adyen3ds2.Adyen3DS2Configuration;
import com.adyen.checkout.await.AwaitConfiguration;
import com.adyen.checkout.components.core.internal.BaseConfigurationBuilder;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.qrcode.QRCodeConfiguration;
import com.adyen.checkout.redirect.RedirectConfiguration;
import com.adyen.checkout.twint.action.TwintActionConfiguration;
import com.adyen.checkout.voucher.VoucherConfiguration;
import com.adyen.checkout.wechatpay.WeChatPayActionConfiguration;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u001f\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rB\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010\u001eJ\u0015\u0010\u001f\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020 H\u0007¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020#H\u0007¢\u0006\u0002\u0010$J\u0015\u0010%\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020&H\u0007¢\u0006\u0002\u0010'J\u0015\u0010(\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020)H\u0007¢\u0006\u0002\u0010*R\u0014\u0010\u0011\u001a\u00020\u0012X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006+"}, d2 = {"Lcom/adyen/checkout/action/core/internal/ActionHandlingPaymentMethodConfigurationBuilder;", "ConfigurationT", "Lcom/adyen/checkout/components/core/internal/Configuration;", "BuilderT", "Lcom/adyen/checkout/components/core/internal/BaseConfigurationBuilder;", "Lcom/adyen/checkout/action/core/internal/ActionHandlingConfigurationBuilder;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "(Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "shopperLocale", "Ljava/util/Locale;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "genericActionConfigurationBuilder", "Lcom/adyen/checkout/action/core/GenericActionConfiguration$Builder;", "getGenericActionConfigurationBuilder", "()Lcom/adyen/checkout/action/core/GenericActionConfiguration$Builder;", "add3ds2ActionConfiguration", "configuration", "Lcom/adyen/checkout/adyen3ds2/Adyen3DS2Configuration;", "(Lcom/adyen/checkout/adyen3ds2/Adyen3DS2Configuration;)Lcom/adyen/checkout/components/core/internal/BaseConfigurationBuilder;", "addAwaitActionConfiguration", "Lcom/adyen/checkout/await/AwaitConfiguration;", "(Lcom/adyen/checkout/await/AwaitConfiguration;)Lcom/adyen/checkout/components/core/internal/BaseConfigurationBuilder;", "addQRCodeActionConfiguration", "Lcom/adyen/checkout/qrcode/QRCodeConfiguration;", "(Lcom/adyen/checkout/qrcode/QRCodeConfiguration;)Lcom/adyen/checkout/components/core/internal/BaseConfigurationBuilder;", "addRedirectActionConfiguration", "Lcom/adyen/checkout/redirect/RedirectConfiguration;", "(Lcom/adyen/checkout/redirect/RedirectConfiguration;)Lcom/adyen/checkout/components/core/internal/BaseConfigurationBuilder;", "addTwintActionConfiguration", "Lcom/adyen/checkout/twint/action/TwintActionConfiguration;", "(Lcom/adyen/checkout/twint/action/TwintActionConfiguration;)Lcom/adyen/checkout/components/core/internal/BaseConfigurationBuilder;", "addVoucherActionConfiguration", "Lcom/adyen/checkout/voucher/VoucherConfiguration;", "(Lcom/adyen/checkout/voucher/VoucherConfiguration;)Lcom/adyen/checkout/components/core/internal/BaseConfigurationBuilder;", "addWeChatPayActionConfiguration", "Lcom/adyen/checkout/wechatpay/WeChatPayActionConfiguration;", "(Lcom/adyen/checkout/wechatpay/WeChatPayActionConfiguration;)Lcom/adyen/checkout/components/core/internal/BaseConfigurationBuilder;", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ActionHandlingPaymentMethodConfigurationBuilder<ConfigurationT extends Configuration, BuilderT extends BaseConfigurationBuilder<ConfigurationT, BuilderT>> extends BaseConfigurationBuilder<ConfigurationT, BuilderT> implements ActionHandlingConfigurationBuilder<BuilderT> {

    @NotNull
    private final GenericActionConfiguration.Builder genericActionConfigurationBuilder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionHandlingPaymentMethodConfigurationBuilder(@Nullable Locale locale, @NotNull Environment environment, @NotNull String str) {
        super(locale, environment, str);
        environment.getClass();
        str.getClass();
        GenericActionConfiguration.Builder builder = new GenericActionConfiguration.Builder(environment, str);
        if (locale != null) {
            builder.setShopperLocale(locale);
        }
        this.genericActionConfigurationBuilder = builder;
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder
    @d
    @NotNull
    public final BuilderT add3ds2ActionConfiguration(@NotNull Adyen3DS2Configuration configuration) {
        configuration.getClass();
        this.genericActionConfigurationBuilder.add3ds2ActionConfiguration(configuration);
        return this;
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder
    @d
    @NotNull
    public final BuilderT addAwaitActionConfiguration(@NotNull AwaitConfiguration configuration) {
        configuration.getClass();
        this.genericActionConfigurationBuilder.addAwaitActionConfiguration(configuration);
        return this;
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder
    @d
    @NotNull
    public final BuilderT addQRCodeActionConfiguration(@NotNull QRCodeConfiguration configuration) {
        configuration.getClass();
        this.genericActionConfigurationBuilder.addQRCodeActionConfiguration(configuration);
        return this;
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder
    @d
    @NotNull
    public final BuilderT addRedirectActionConfiguration(@NotNull RedirectConfiguration configuration) {
        configuration.getClass();
        this.genericActionConfigurationBuilder.addRedirectActionConfiguration(configuration);
        return this;
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder
    @d
    @NotNull
    public final BuilderT addTwintActionConfiguration(@NotNull TwintActionConfiguration configuration) {
        configuration.getClass();
        this.genericActionConfigurationBuilder.addTwintActionConfiguration(configuration);
        return this;
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder
    @d
    @NotNull
    public final BuilderT addVoucherActionConfiguration(@NotNull VoucherConfiguration configuration) {
        configuration.getClass();
        this.genericActionConfigurationBuilder.addVoucherActionConfiguration(configuration);
        return this;
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder
    @d
    @NotNull
    public final BuilderT addWeChatPayActionConfiguration(@NotNull WeChatPayActionConfiguration configuration) {
        configuration.getClass();
        this.genericActionConfigurationBuilder.addWeChatPayActionConfiguration(configuration);
        return this;
    }

    @NotNull
    public final GenericActionConfiguration.Builder getGenericActionConfigurationBuilder() {
        return this.genericActionConfigurationBuilder;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionHandlingPaymentMethodConfigurationBuilder(@NotNull Environment environment, @NotNull String str) {
        this((Locale) null, environment, str);
        environment.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @d
    public ActionHandlingPaymentMethodConfigurationBuilder(@NotNull Context context, @NotNull Environment environment, @NotNull String str) {
        this((Locale) null, environment, str);
        context.getClass();
        environment.getClass();
        str.getClass();
    }
}
