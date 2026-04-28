package ui;

import com.adyen.checkout.components.core.StoredPaymentMethod;
import com.adyen.checkout.core.Environment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class i1 extends o2 {

    @NotNull
    public static final h1 Companion = new h1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u70.j[] f41215e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoredPaymentMethod f41216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f41217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Environment f41218d;

    static {
        u70.m mVar = u70.m.PUBLICATION;
        f41215e = new u70.j[]{u70.l.a(mVar, new o(17)), null, u70.l.a(mVar, new o(18))};
    }

    public /* synthetic */ i1(int i11, StoredPaymentMethod storedPaymentMethod, boolean z11, Environment environment) {
        if (7 != (i11 & 7)) {
            m90.c1.j(i11, 7, g1.f41202a.getDescriptor());
            throw null;
        }
        this.f41216b = storedPaymentMethod;
        this.f41217c = z11;
        this.f41218d = environment;
    }

    public i1(StoredPaymentMethod storedPaymentMethod, boolean z11, Environment environment) {
        storedPaymentMethod.getClass();
        environment.getClass();
        this.f41216b = storedPaymentMethod;
        this.f41217c = z11;
        this.f41218d = environment;
    }
}
