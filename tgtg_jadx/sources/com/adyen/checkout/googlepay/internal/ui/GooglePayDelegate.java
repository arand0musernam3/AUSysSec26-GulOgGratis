package com.adyen.checkout.googlepay.internal.ui;

import android.app.Activity;
import android.content.Intent;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate;
import com.adyen.checkout.googlepay.GooglePayButtonParameters;
import com.adyen.checkout.googlepay.GooglePayComponentState;
import com.adyen.checkout.googlepay.internal.ui.model.GooglePayComponentParams;
import com.adyen.checkout.ui.core.internal.ui.ButtonDelegate;
import com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate;
import g10.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;
import y80.i;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010 R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150'0\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010 ¨\u0006*"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/ui/GooglePayDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/PaymentComponentDelegate;", "Lcom/adyen/checkout/googlepay/GooglePayComponentState;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvidingDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/ButtonDelegate;", "Landroid/app/Activity;", "activity", "", "requestCode", "", "startGooglePayScreen", "(Landroid/app/Activity;I)V", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", Bayeux.KEY_DATA, "handleActivityResult", "(ILandroid/content/Intent;)V", "Lcom/adyen/checkout/googlepay/GooglePayButtonParameters;", "getGooglePayButtonParameters", "()Lcom/adyen/checkout/googlepay/GooglePayButtonParameters;", "Lg10/a;", "Le10/l;", "paymentDataTaskResult", "handlePaymentResult", "(Lg10/a;)V", "Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;", "componentParams", "Ly80/i;", "Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayOutputData;", "getOutputDataFlow", "()Ly80/i;", "outputDataFlow", "getComponentStateFlow", "componentStateFlow", "Lcom/adyen/checkout/core/exception/CheckoutException;", "getExceptionFlow", "exceptionFlow", "Lcom/google/android/gms/tasks/Task;", "getPayEventFlow", "payEventFlow", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface GooglePayDelegate extends PaymentComponentDelegate<GooglePayComponentState>, ViewProvidingDelegate, ButtonDelegate {
    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    GooglePayComponentParams getComponentParams();

    @NotNull
    i getComponentStateFlow();

    @NotNull
    i getExceptionFlow();

    @NotNull
    GooglePayButtonParameters getGooglePayButtonParameters();

    @NotNull
    i getOutputDataFlow();

    @NotNull
    i getPayEventFlow();

    void handleActivityResult(int resultCode, @Nullable Intent data);

    void handlePaymentResult(@NotNull a paymentDataTaskResult);

    @d
    void startGooglePayScreen(@NotNull Activity activity, int requestCode);
}
