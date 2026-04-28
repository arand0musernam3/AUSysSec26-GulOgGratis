package com.app.tgtg.model.remote.payment;

import i90.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import n90.k;
import n90.n;
import n90.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/app/tgtg/model/remote/payment/BasicSavedPaymentMethodSerializer;", "Ln90/k;", "Lcom/app/tgtg/model/remote/payment/BasicSavedPaymentMethod;", "<init>", "()V", "Ln90/n;", "element", "Li90/b;", "selectDeserializer", "(Ln90/n;)Li90/b;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BasicSavedPaymentMethodSerializer extends k {

    @NotNull
    public static final BasicSavedPaymentMethodSerializer INSTANCE = new BasicSavedPaymentMethodSerializer();
    public static final int $stable = 8;

    private BasicSavedPaymentMethodSerializer() {
        super(Reflection.getOrCreateKotlinClass(BasicSavedPaymentMethod.class));
    }

    @Override // n90.k
    @NotNull
    public b selectDeserializer(@NotNull n element) {
        element.getClass();
        n nVar = (n) o.g(element).get("payment_type");
        String strB = nVar != null ? o.h(nVar).b() : null;
        if (strB != null) {
            int iHashCode = strB.hashCode();
            if (iHashCode != -1173845527) {
                if (iHashCode != -78778999) {
                    if (iHashCode == 662951207 && strB.equals("BCMCCARD")) {
                        return SavedBancontactCard.INSTANCE.serializer();
                    }
                } else if (strB.equals("CREDITCARD")) {
                    return SavedCreditCard.INSTANCE.serializer();
                }
            } else if (strB.equals("EDENRED")) {
                return SavedEdenred.INSTANCE.serializer();
            }
        }
        return UnknownSavedPaymentMethod.INSTANCE.serializer();
    }
}
