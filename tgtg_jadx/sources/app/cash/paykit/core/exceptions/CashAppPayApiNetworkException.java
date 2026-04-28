package app.cash.paykit.core.exceptions;

import bc.a;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/paykit/core/exceptions/CashAppPayApiNetworkException;", "Lapp/cash/paykit/core/exceptions/CashAppPayNetworkException;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CashAppPayApiNetworkException extends CashAppPayNetworkException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayApiNetworkException(String str, String str2, String str3, String str4) {
        super(a.API);
        str.getClass();
        str2.getClass();
        this.f4584a = str;
        this.f4585b = str2;
        this.f4586c = str3;
        this.f4587d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppPayApiNetworkException)) {
            return false;
        }
        CashAppPayApiNetworkException cashAppPayApiNetworkException = (CashAppPayApiNetworkException) obj;
        return Intrinsics.areEqual(this.f4584a, cashAppPayApiNetworkException.f4584a) && Intrinsics.areEqual(this.f4585b, cashAppPayApiNetworkException.f4585b) && Intrinsics.areEqual(this.f4586c, cashAppPayApiNetworkException.f4586c) && Intrinsics.areEqual(this.f4587d, cashAppPayApiNetworkException.f4587d);
    }

    public final int hashCode() {
        int iB = l1.b(this.f4584a.hashCode() * 31, 31, this.f4585b);
        String str = this.f4586c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4587d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return f.o(f.t("CashAppPayApiNetworkException(category=", this.f4584a, ", code=", this.f4585b, ", detail="), this.f4586c, ", field_value=", this.f4587d, ")");
    }
}
