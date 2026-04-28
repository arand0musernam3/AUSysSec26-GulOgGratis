package ui;

import com.adyen.checkout.components.core.action.AwaitAction;
import com.adyen.checkout.core.Environment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class n extends o2 {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u70.j[] f41250d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AwaitAction f41251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Environment f41252c;

    static {
        u70.m mVar = u70.m.PUBLICATION;
        f41250d = new u70.j[]{u70.l.a(mVar, new tr.e(28)), u70.l.a(mVar, new tr.e(29))};
    }

    public /* synthetic */ n(int i11, AwaitAction awaitAction, Environment environment) {
        if (3 != (i11 & 3)) {
            m90.c1.j(i11, 3, l.f41233a.getDescriptor());
            throw null;
        }
        this.f41251b = awaitAction;
        this.f41252c = environment;
    }

    public n(AwaitAction awaitAction, Environment environment) {
        awaitAction.getClass();
        environment.getClass();
        this.f41251b = awaitAction;
        this.f41252c = environment;
    }
}
