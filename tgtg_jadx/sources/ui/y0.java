package ui;

import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.core.Environment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class y0 extends o2 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u70.j[] f41298d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Action f41299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Environment f41300c;

    static {
        u70.m mVar = u70.m.PUBLICATION;
        f41298d = new u70.j[]{u70.l.a(mVar, new o(14)), u70.l.a(mVar, new o(15))};
    }

    public /* synthetic */ y0(int i11, Action action, Environment environment) {
        if (3 != (i11 & 3)) {
            m90.c1.j(i11, 3, w0.f41290a.getDescriptor());
            throw null;
        }
        this.f41299b = action;
        this.f41300c = environment;
    }

    public y0(Action action, Environment environment) {
        action.getClass();
        environment.getClass();
        this.f41299b = action;
        this.f41300c = environment;
    }
}
