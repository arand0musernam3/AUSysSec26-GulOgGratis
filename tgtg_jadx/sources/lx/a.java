package lx;

import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f28337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Currency f28338c;

    public a(String str, double d3, Currency currency) {
        str.getClass();
        currency.getClass();
        this.f28336a = str;
        this.f28337b = d3;
        this.f28338c = currency;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f28336a, aVar.f28336a) && Double.compare(this.f28337b, aVar.f28337b) == 0 && Intrinsics.areEqual(this.f28338c, aVar.f28338c);
    }

    public final int hashCode() {
        return this.f28338c.hashCode() + j4.s.b(this.f28337b, this.f28336a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "InAppPurchase(eventName=" + this.f28336a + ", amount=" + this.f28337b + ", currency=" + this.f28338c + ')';
    }
}
