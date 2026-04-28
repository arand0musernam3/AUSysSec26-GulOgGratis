package com.app.tgtg.model.remote.payment;

import com.adyen.checkout.core.Environment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mv.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"getAdyenEnvironment", "Lcom/adyen/checkout/core/Environment;", "Lcom/app/tgtg/model/remote/payment/PaymentMethods;", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class PaymentMethodsKt {
    @NotNull
    public static final Environment getAdyenEnvironment(@Nullable PaymentMethods paymentMethods) {
        if (paymentMethods == null) {
            return Environment.EUROPE;
        }
        b bVar = b.f30149d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            bVar = null;
        }
        return bVar.f30152c.getProduction() ? paymentMethods.getAdyenEnvironment() : Environment.TEST;
    }
}
