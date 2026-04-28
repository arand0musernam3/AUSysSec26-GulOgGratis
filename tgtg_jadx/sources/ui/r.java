package ui;

import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.core.Environment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class r extends o2 {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u70.j[] f41266d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentMethod f41267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Environment f41268c;

    static {
        u70.m mVar = u70.m.PUBLICATION;
        f41266d = new u70.j[]{u70.l.a(mVar, new o(0)), u70.l.a(mVar, new o(1))};
    }

    public /* synthetic */ r(int i11, PaymentMethod paymentMethod, Environment environment) {
        if (3 != (i11 & 3)) {
            m90.c1.j(i11, 3, p.f41258a.getDescriptor());
            throw null;
        }
        this.f41267b = paymentMethod;
        this.f41268c = environment;
    }

    public r(PaymentMethod paymentMethod, Environment environment) {
        paymentMethod.getClass();
        environment.getClass();
        this.f41267b = paymentMethod;
        this.f41268c = environment;
    }
}
