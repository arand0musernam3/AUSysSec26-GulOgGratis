package ui;

import com.app.tgtg.model.remote.payment.PaymentMethods;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class x extends o2 {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentMethods f41293b;

    public /* synthetic */ x(int i11, PaymentMethods paymentMethods) {
        if (1 == (i11 & 1)) {
            this.f41293b = paymentMethods;
        } else {
            m90.c1.j(i11, 1, v.f41284a.getDescriptor());
            throw null;
        }
    }

    public x(PaymentMethods paymentMethods) {
        paymentMethods.getClass();
        this.f41293b = paymentMethods;
    }
}
