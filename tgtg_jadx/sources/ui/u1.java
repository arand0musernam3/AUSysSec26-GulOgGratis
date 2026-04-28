package ui;

import com.app.tgtg.model.remote.payment.PaymentMethods;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class u1 extends o2 {

    @NotNull
    public static final t1 Companion = new t1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentMethods f41281b;

    public /* synthetic */ u1(int i11, PaymentMethods paymentMethods) {
        if (1 == (i11 & 1)) {
            this.f41281b = paymentMethods;
        } else {
            m90.c1.j(i11, 1, s1.f41274a.getDescriptor());
            throw null;
        }
    }

    public u1(PaymentMethods paymentMethods) {
        paymentMethods.getClass();
        this.f41281b = paymentMethods;
    }
}
