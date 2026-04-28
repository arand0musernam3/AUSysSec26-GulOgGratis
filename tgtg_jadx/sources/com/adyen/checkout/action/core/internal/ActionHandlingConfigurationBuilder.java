package com.adyen.checkout.action.core.internal;

import com.adyen.checkout.adyen3ds2.Adyen3DS2Configuration;
import com.adyen.checkout.await.AwaitConfiguration;
import com.adyen.checkout.qrcode.QRCodeConfiguration;
import com.adyen.checkout.redirect.RedirectConfiguration;
import com.adyen.checkout.twint.action.TwintActionConfiguration;
import com.adyen.checkout.voucher.VoucherConfiguration;
import com.adyen.checkout.wechatpay.WeChatPayActionConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\bH&¢\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u000bH&¢\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u000eH&¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0011H&¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0014H&¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0017H&¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/action/core/internal/ActionHandlingConfigurationBuilder;", "BuilderT", "", "add3ds2ActionConfiguration", "configuration", "Lcom/adyen/checkout/adyen3ds2/Adyen3DS2Configuration;", "(Lcom/adyen/checkout/adyen3ds2/Adyen3DS2Configuration;)Ljava/lang/Object;", "addAwaitActionConfiguration", "Lcom/adyen/checkout/await/AwaitConfiguration;", "(Lcom/adyen/checkout/await/AwaitConfiguration;)Ljava/lang/Object;", "addQRCodeActionConfiguration", "Lcom/adyen/checkout/qrcode/QRCodeConfiguration;", "(Lcom/adyen/checkout/qrcode/QRCodeConfiguration;)Ljava/lang/Object;", "addRedirectActionConfiguration", "Lcom/adyen/checkout/redirect/RedirectConfiguration;", "(Lcom/adyen/checkout/redirect/RedirectConfiguration;)Ljava/lang/Object;", "addTwintActionConfiguration", "Lcom/adyen/checkout/twint/action/TwintActionConfiguration;", "(Lcom/adyen/checkout/twint/action/TwintActionConfiguration;)Ljava/lang/Object;", "addVoucherActionConfiguration", "Lcom/adyen/checkout/voucher/VoucherConfiguration;", "(Lcom/adyen/checkout/voucher/VoucherConfiguration;)Ljava/lang/Object;", "addWeChatPayActionConfiguration", "Lcom/adyen/checkout/wechatpay/WeChatPayActionConfiguration;", "(Lcom/adyen/checkout/wechatpay/WeChatPayActionConfiguration;)Ljava/lang/Object;", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ActionHandlingConfigurationBuilder<BuilderT> {
    BuilderT add3ds2ActionConfiguration(@NotNull Adyen3DS2Configuration configuration);

    BuilderT addAwaitActionConfiguration(@NotNull AwaitConfiguration configuration);

    BuilderT addQRCodeActionConfiguration(@NotNull QRCodeConfiguration configuration);

    BuilderT addRedirectActionConfiguration(@NotNull RedirectConfiguration configuration);

    BuilderT addTwintActionConfiguration(@NotNull TwintActionConfiguration configuration);

    BuilderT addVoucherActionConfiguration(@NotNull VoucherConfiguration configuration);

    BuilderT addWeChatPayActionConfiguration(@NotNull WeChatPayActionConfiguration configuration);
}
