package app.cash.paykit.core.exceptions;

import bc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/paykit/core/exceptions/CashAppPayConnectivityNetworkException;", "Lapp/cash/paykit/core/exceptions/CashAppPayNetworkException;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CashAppPayConnectivityNetworkException extends CashAppPayNetworkException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f4588a;

    public CashAppPayConnectivityNetworkException(Exception exc) {
        super(a.CONNECTIVITY);
        this.f4588a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashAppPayConnectivityNetworkException) && Intrinsics.areEqual(this.f4588a, ((CashAppPayConnectivityNetworkException) obj).f4588a);
    }

    public final int hashCode() {
        return this.f4588a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "CashAppPayConnectivityNetworkException(e=" + this.f4588a + ")";
    }
}
