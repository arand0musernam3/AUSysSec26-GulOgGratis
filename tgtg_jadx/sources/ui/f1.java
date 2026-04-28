package ui;

import com.app.tgtg.model.remote.payment.PaymentMethods;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class f1 extends o2 {

    @NotNull
    public static final e1 Companion = new e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentMethods f41195b;

    public /* synthetic */ f1(int i11, PaymentMethods paymentMethods) {
        if (1 == (i11 & 1)) {
            this.f41195b = paymentMethods;
        } else {
            m90.c1.j(i11, 1, d1.f41185a.getDescriptor());
            throw null;
        }
    }

    public f1(PaymentMethods paymentMethods) {
        paymentMethods.getClass();
        this.f41195b = paymentMethods;
    }
}
