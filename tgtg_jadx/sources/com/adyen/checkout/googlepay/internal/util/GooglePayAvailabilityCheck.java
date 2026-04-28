package com.adyen.checkout.googlepay.internal.util;

import android.app.Application;
import com.adyen.checkout.components.core.ComponentAvailableCallback;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.googlepay.internal.ui.model.GooglePayComponentParams;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.k;
import com.google.android.gms.tasks.Task;
import e10.f;
import e10.p;
import e10.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import qz.t;
import qz.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/util/GooglePayAvailabilityCheck;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "isAvailable", "", "paymentMethod", "Lcom/adyen/checkout/components/core/PaymentMethod;", "componentParams", "Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;", "callback", "Lcom/adyen/checkout/components/core/ComponentAvailableCallback;", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayAvailabilityCheck.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayAvailabilityCheck.kt\ncom/adyen/checkout/googlepay/internal/util/GooglePayAvailabilityCheck\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,53:1\n16#2,17:54\n21#2,12:71\n*S KotlinDebug\n*F\n+ 1 GooglePayAvailabilityCheck.kt\ncom/adyen/checkout/googlepay/internal/util/GooglePayAvailabilityCheck\n*L\n44#1:54,17\n48#1:71,12\n*E\n"})
public final class GooglePayAvailabilityCheck {

    @NotNull
    private final Application application;

    public GooglePayAvailabilityCheck(@NotNull Application application) {
        application.getClass();
        this.application = application;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isAvailable$lambda$0(Function1 function1, Object obj) {
        function1.getClass();
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isAvailable$lambda$2(GooglePayAvailabilityCheck googlePayAvailabilityCheck, ComponentAvailableCallback componentAvailableCallback, PaymentMethod paymentMethod) {
        googlePayAvailabilityCheck.getClass();
        componentAvailableCallback.getClass();
        paymentMethod.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = GooglePayAvailabilityCheck.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "GooglePay readyToPay task is cancelled.", null);
        }
        componentAvailableCallback.onAvailabilityResult(false, paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isAvailable$lambda$4(GooglePayAvailabilityCheck googlePayAvailabilityCheck, ComponentAvailableCallback componentAvailableCallback, PaymentMethod paymentMethod, Exception exc) {
        googlePayAvailabilityCheck.getClass();
        componentAvailableCallback.getClass();
        paymentMethod.getClass();
        exc.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = GooglePayAvailabilityCheck.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "GooglePay readyToPay task is failed.", exc);
        }
        componentAvailableCallback.onAvailabilityResult(false, paymentMethod);
    }

    public final void isAvailable(@NotNull final PaymentMethod paymentMethod, @NotNull GooglePayComponentParams componentParams, @NotNull final ComponentAvailableCallback callback) {
        paymentMethod.getClass();
        componentParams.getClass();
        callback.getClass();
        if (GoogleApiAvailability.f11044d.b(this.application, com.google.android.gms.common.a.f11047a) != 0) {
            callback.onAvailabilityResult(false, paymentMethod);
            return;
        }
        Application application = this.application;
        GooglePayUtils googlePayUtils = GooglePayUtils.INSTANCE;
        p pVar = new p(application, null, v.f15550a, googlePayUtils.createWalletOptions(componentParams), k.f11084c);
        f fVarCreateIsReadyToPayRequest = googlePayUtils.createIsReadyToPayRequest(componentParams);
        t tVarBuilder = u.builder();
        tVarBuilder.f37391d = 23705;
        tVarBuilder.f37388a = new se.b(fVarCreateIsReadyToPayRequest, 15);
        Task taskDoRead = pVar.doRead(tVarBuilder.a());
        taskDoRead.getClass();
        taskDoRead.g(new a(new Function1<Boolean, Unit>() { // from class: com.adyen.checkout.googlepay.internal.util.GooglePayAvailabilityCheck.isAvailable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(Boolean bool) {
                callback.onAvailabilityResult(Intrinsics.areEqual(bool, Boolean.TRUE), paymentMethod);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return Unit.f26487a;
            }
        }, 0));
        taskDoRead.a(new b(this, callback, paymentMethod));
        taskDoRead.e(new b(this, callback, paymentMethod));
    }
}
