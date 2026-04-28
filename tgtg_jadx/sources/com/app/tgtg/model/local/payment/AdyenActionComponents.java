package com.app.tgtg.model.local.payment;

import androidx.fragment.app.o0;
import com.adyen.checkout.adyen3ds2.Adyen3DS2Component;
import com.adyen.checkout.adyen3ds2.Adyen3DS2Configuration;
import com.adyen.checkout.await.AwaitComponent;
import com.adyen.checkout.await.AwaitConfiguration;
import com.adyen.checkout.components.core.ActionComponentCallback;
import com.adyen.checkout.components.core.internal.provider.ActionComponentProvider;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.qrcode.QRCodeComponent;
import com.adyen.checkout.qrcode.QRCodeConfiguration;
import com.adyen.checkout.redirect.RedirectComponent;
import com.adyen.checkout.redirect.RedirectConfiguration;
import com.app.tgtg.model.local.AppConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/app/tgtg/model/local/payment/AdyenActionComponents;", "", "Landroidx/fragment/app/o0;", "fragmentActivity", "<init>", "(Landroidx/fragment/app/o0;)V", "Lcom/adyen/checkout/components/core/ActionComponentCallback;", "callback", "Lcom/adyen/checkout/core/Environment;", "adyenEnvironment", "Lcom/adyen/checkout/redirect/RedirectComponent;", "getRedirectComponent", "(Lcom/adyen/checkout/components/core/ActionComponentCallback;Lcom/adyen/checkout/core/Environment;)Lcom/adyen/checkout/redirect/RedirectComponent;", "Lcom/adyen/checkout/adyen3ds2/Adyen3DS2Component;", "getThreeDSecureComponent", "(Lcom/adyen/checkout/components/core/ActionComponentCallback;Lcom/adyen/checkout/core/Environment;)Lcom/adyen/checkout/adyen3ds2/Adyen3DS2Component;", "Lcom/adyen/checkout/qrcode/QRCodeComponent;", "getQrComponent", "(Lcom/adyen/checkout/components/core/ActionComponentCallback;Lcom/adyen/checkout/core/Environment;)Lcom/adyen/checkout/qrcode/QRCodeComponent;", "Lcom/adyen/checkout/await/AwaitComponent;", "getAwaitComponent", "(Lcom/adyen/checkout/components/core/ActionComponentCallback;Lcom/adyen/checkout/core/Environment;)Lcom/adyen/checkout/await/AwaitComponent;", "Landroidx/fragment/app/o0;", "", "redirectComponentCache", "Ljava/util/Map;", "threeDSComponentCache", "qrComponentCache", "awaitComponentCache", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAdyenActionComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdyenActionComponents.kt\ncom/app/tgtg/model/local/payment/AdyenActionComponents\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,92:1\n410#2,7:93\n410#2,7:100\n410#2,7:107\n410#2,7:114\n*S KotlinDebug\n*F\n+ 1 AdyenActionComponents.kt\ncom/app/tgtg/model/local/payment/AdyenActionComponents\n*L\n27#1:93,7\n44#1:100,7\n61#1:107,7\n77#1:114,7\n*E\n"})
public final class AdyenActionComponents {
    public static final int $stable = 8;

    @NotNull
    private final Map<Environment, AwaitComponent> awaitComponentCache;

    @NotNull
    private final o0 fragmentActivity;

    @NotNull
    private final Map<Environment, QRCodeComponent> qrComponentCache;

    @NotNull
    private final Map<Environment, RedirectComponent> redirectComponentCache;

    @NotNull
    private final Map<Environment, Adyen3DS2Component> threeDSComponentCache;

    public AdyenActionComponents(@NotNull o0 o0Var) {
        o0Var.getClass();
        this.fragmentActivity = o0Var;
        this.redirectComponentCache = new LinkedHashMap();
        this.threeDSComponentCache = new LinkedHashMap();
        this.qrComponentCache = new LinkedHashMap();
        this.awaitComponentCache = new LinkedHashMap();
    }

    @NotNull
    public final AwaitComponent getAwaitComponent(@NotNull ActionComponentCallback callback, @NotNull Environment adyenEnvironment) {
        callback.getClass();
        adyenEnvironment.getClass();
        Map<Environment, AwaitComponent> map = this.awaitComponentCache;
        AwaitComponent awaitComponent = map.get(adyenEnvironment);
        if (awaitComponent == null) {
            awaitComponent = (AwaitComponent) ActionComponentProvider.DefaultImpls.get$default(AwaitComponent.PROVIDER, this.fragmentActivity, new AwaitConfiguration.Builder(adyenEnvironment, AppConstants.INSTANCE.getAdyenClientKey()).build(), callback, (String) null, 8, (Object) null);
            map.put(adyenEnvironment, awaitComponent);
        }
        return awaitComponent;
    }

    @NotNull
    public final QRCodeComponent getQrComponent(@NotNull ActionComponentCallback callback, @NotNull Environment adyenEnvironment) {
        callback.getClass();
        adyenEnvironment.getClass();
        Map<Environment, QRCodeComponent> map = this.qrComponentCache;
        QRCodeComponent qRCodeComponent = map.get(adyenEnvironment);
        if (qRCodeComponent == null) {
            qRCodeComponent = (QRCodeComponent) ActionComponentProvider.DefaultImpls.get$default(QRCodeComponent.PROVIDER, this.fragmentActivity, new QRCodeConfiguration.Builder(adyenEnvironment, AppConstants.INSTANCE.getAdyenClientKey()).build(), callback, (String) null, 8, (Object) null);
            map.put(adyenEnvironment, qRCodeComponent);
        }
        return qRCodeComponent;
    }

    @NotNull
    public final RedirectComponent getRedirectComponent(@NotNull ActionComponentCallback callback, @NotNull Environment adyenEnvironment) {
        callback.getClass();
        adyenEnvironment.getClass();
        Map<Environment, RedirectComponent> map = this.redirectComponentCache;
        RedirectComponent redirectComponent = map.get(adyenEnvironment);
        if (redirectComponent == null) {
            redirectComponent = (RedirectComponent) ActionComponentProvider.DefaultImpls.get$default(RedirectComponent.PROVIDER, this.fragmentActivity, new RedirectConfiguration.Builder(adyenEnvironment, AppConstants.INSTANCE.getAdyenClientKey()).build(), callback, (String) null, 8, (Object) null);
            map.put(adyenEnvironment, redirectComponent);
        }
        return redirectComponent;
    }

    @NotNull
    public final Adyen3DS2Component getThreeDSecureComponent(@NotNull ActionComponentCallback callback, @NotNull Environment adyenEnvironment) {
        callback.getClass();
        adyenEnvironment.getClass();
        Map<Environment, Adyen3DS2Component> map = this.threeDSComponentCache;
        Adyen3DS2Component adyen3DS2Component = map.get(adyenEnvironment);
        if (adyen3DS2Component == null) {
            adyen3DS2Component = (Adyen3DS2Component) ActionComponentProvider.DefaultImpls.get$default(Adyen3DS2Component.PROVIDER, this.fragmentActivity, new Adyen3DS2Configuration.Builder(adyenEnvironment, AppConstants.INSTANCE.getAdyenClientKey()).setThreeDSRequestorAppURL(AppConstants.ADYEN3DS2_APP_URL).build(), callback, (String) null, 8, (Object) null);
            map.put(adyenEnvironment, adyen3DS2Component);
        }
        return adyen3DS2Component;
    }
}
