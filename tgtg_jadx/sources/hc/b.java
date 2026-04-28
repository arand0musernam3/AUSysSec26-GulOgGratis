package hc;

import app.cash.paykit.core.models.sdk.CashAppPayCurrency;
import kotlin.jvm.internal.Intrinsics;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashAppPayCurrency f21834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f21835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21836c;

    public b(CashAppPayCurrency cashAppPayCurrency, Integer num, String str) {
        this.f21834a = cashAppPayCurrency;
        this.f21835b = num;
        this.f21836c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21834a == bVar.f21834a && Intrinsics.areEqual(this.f21835b, bVar.f21835b) && Intrinsics.areEqual(this.f21836c, bVar.f21836c) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        CashAppPayCurrency cashAppPayCurrency = this.f21834a;
        int iHashCode = (this.f21835b.hashCode() + ((cashAppPayCurrency == null ? 0 : cashAppPayCurrency.hashCode()) * 31)) * 31;
        String str = this.f21836c;
        return (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OneTimeAction(currency=");
        sb2.append(this.f21834a);
        sb2.append(", amount=");
        sb2.append(this.f21835b);
        sb2.append(", scopeId=");
        return k.p(sb2, this.f21836c, ", referenceId=null)");
    }
}
