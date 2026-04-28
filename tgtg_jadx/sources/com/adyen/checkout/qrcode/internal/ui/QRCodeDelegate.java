package com.adyen.checkout.qrcode.internal.ui;

import android.content.Context;
import com.adyen.checkout.components.core.internal.ui.ActionDelegate;
import com.adyen.checkout.components.core.internal.ui.DetailsEmittingDelegate;
import com.adyen.checkout.components.core.internal.ui.IntentHandlingDelegate;
import com.adyen.checkout.components.core.internal.ui.PermissionRequestingDelegate;
import com.adyen.checkout.components.core.internal.ui.RedirectableDelegate;
import com.adyen.checkout.components.core.internal.ui.StatusPollingDelegate;
import com.adyen.checkout.components.core.internal.ui.ViewableDelegate;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.internal.ui.PermissionHandler;
import com.adyen.checkout.qrcode.internal.ui.model.QRCodeOutputData;
import com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/qrcode/internal/ui/QRCodeDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/ActionDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/DetailsEmittingDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/ViewableDelegate;", "Lcom/adyen/checkout/qrcode/internal/ui/model/QRCodeOutputData;", "Lcom/adyen/checkout/components/core/internal/ui/IntentHandlingDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/StatusPollingDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvidingDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/RedirectableDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/PermissionRequestingDelegate;", "Lcom/adyen/checkout/core/internal/ui/PermissionHandler;", "Landroid/content/Context;", "context", "", "downloadQRImage", "(Landroid/content/Context;)V", "Ly80/i;", "Lcom/adyen/checkout/qrcode/internal/ui/model/QrCodeUIEvent;", "getEventFlow", "()Ly80/i;", "eventFlow", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface QRCodeDelegate extends ActionDelegate, DetailsEmittingDelegate, ViewableDelegate<QRCodeOutputData>, IntentHandlingDelegate, StatusPollingDelegate, ViewProvidingDelegate, RedirectableDelegate, PermissionRequestingDelegate, PermissionHandler {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onError(@NotNull QRCodeDelegate qRCodeDelegate, @NotNull CheckoutException checkoutException) {
            checkoutException.getClass();
            ActionDelegate.DefaultImpls.onError(qRCodeDelegate, checkoutException);
        }
    }

    void downloadQRImage(@NotNull Context context);

    @NotNull
    i getEventFlow();
}
