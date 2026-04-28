package androidx.constraintlayout.core.parser;

import com.adyen.checkout.components.core.PaymentMethodTypes;
import j6.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2259b;

    public CLParsingException(String str, c cVar) {
        super(str);
        this.f2258a = str;
        if (cVar != null) {
            this.f2259b = cVar.i();
        } else {
            this.f2259b = PaymentMethodTypes.UNKNOWN;
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CLParsingException (");
        sb2.append(hashCode());
        sb2.append(") : ");
        sb2.append(this.f2258a + " (" + this.f2259b + " at line 0)");
        return sb2.toString();
    }
}
