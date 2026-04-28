package ui;

import com.adyen.checkout.components.core.action.QrCodeAction;
import com.adyen.checkout.core.Environment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class v0 extends o2 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u70.j[] f41285d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final QrCodeAction f41286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Environment f41287c;

    static {
        u70.m mVar = u70.m.PUBLICATION;
        f41285d = new u70.j[]{u70.l.a(mVar, new o(12)), u70.l.a(mVar, new o(13))};
    }

    public /* synthetic */ v0(int i11, QrCodeAction qrCodeAction, Environment environment) {
        if (3 != (i11 & 3)) {
            m90.c1.j(i11, 3, t0.f41277a.getDescriptor());
            throw null;
        }
        this.f41286b = qrCodeAction;
        this.f41287c = environment;
    }

    public v0(QrCodeAction qrCodeAction, Environment environment) {
        qrCodeAction.getClass();
        environment.getClass();
        this.f41286b = qrCodeAction;
        this.f41287c = environment;
    }
}
