package ui;

import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.core.Environment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class a0 extends o2 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u70.j[] f41165d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentMethod f41166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Environment f41167c;

    static {
        u70.m mVar = u70.m.PUBLICATION;
        f41165d = new u70.j[]{u70.l.a(mVar, new o(2)), u70.l.a(mVar, new o(3))};
    }

    public /* synthetic */ a0(int i11, PaymentMethod paymentMethod, Environment environment) {
        if (3 != (i11 & 3)) {
            m90.c1.j(i11, 3, y.f41297a.getDescriptor());
            throw null;
        }
        this.f41166b = paymentMethod;
        this.f41167c = environment;
    }

    public a0(PaymentMethod paymentMethod, Environment environment) {
        paymentMethod.getClass();
        environment.getClass();
        this.f41166b = paymentMethod;
        this.f41167c = environment;
    }
}
