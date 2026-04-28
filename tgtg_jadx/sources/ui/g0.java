package ui;

import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.core.Environment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class g0 extends o2 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u70.j[] f41198e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentMethod f41199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f41200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Environment f41201d;

    static {
        u70.m mVar = u70.m.PUBLICATION;
        f41198e = new u70.j[]{u70.l.a(mVar, new o(6)), null, u70.l.a(mVar, new o(7))};
    }

    public /* synthetic */ g0(int i11, PaymentMethod paymentMethod, boolean z11, Environment environment) {
        if (7 != (i11 & 7)) {
            m90.c1.j(i11, 7, e0.f41190a.getDescriptor());
            throw null;
        }
        this.f41199b = paymentMethod;
        this.f41200c = z11;
        this.f41201d = environment;
    }

    public g0(PaymentMethod paymentMethod, boolean z11, Environment environment) {
        paymentMethod.getClass();
        environment.getClass();
        this.f41199b = paymentMethod;
        this.f41200c = z11;
        this.f41201d = environment;
    }
}
