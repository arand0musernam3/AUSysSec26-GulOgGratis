package zi;

import com.app.tgtg.model.remote.payment.PaymentMethods;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethods f47926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47927b;

    public a(int i11, PaymentMethods paymentMethods) {
        this.f47926a = paymentMethods;
        this.f47927b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f47926a, aVar.f47926a) && this.f47927b == aVar.f47927b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47927b) + (this.f47926a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentMethodChangedDueToInsufficientFunds(previousPaymentMethod=" + this.f47926a + ", previousQuantity=" + this.f47927b + ")";
    }
}
