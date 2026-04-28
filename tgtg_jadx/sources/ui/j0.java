package ui;

import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.core.Environment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class j0 extends o2 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u70.j[] f41223d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentMethod f41224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Environment f41225c;

    static {
        u70.m mVar = u70.m.PUBLICATION;
        f41223d = new u70.j[]{u70.l.a(mVar, new o(8)), u70.l.a(mVar, new o(9))};
    }

    public /* synthetic */ j0(int i11, PaymentMethod paymentMethod, Environment environment) {
        if (3 != (i11 & 3)) {
            m90.c1.j(i11, 3, h0.f41208a.getDescriptor());
            throw null;
        }
        this.f41224b = paymentMethod;
        this.f41225c = environment;
    }

    public j0(PaymentMethod paymentMethod, Environment environment) {
        paymentMethod.getClass();
        environment.getClass();
        this.f41224b = paymentMethod;
        this.f41225c = environment;
    }
}
