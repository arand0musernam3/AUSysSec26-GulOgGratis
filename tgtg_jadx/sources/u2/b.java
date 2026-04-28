package u2;

import b4.t;
import b5.q;
import kotlin.jvm.functions.Function0;
import w4.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f40636a;

    static {
        float f11 = 40;
        float f12 = 10;
        f40636a = new q(f12, f11, f12, f11);
    }

    public static final t a(t tVar, boolean z11, boolean z12, Function0 function0) {
        if (!z11 || !d.f40640a) {
            return tVar;
        }
        if (z12) {
            tVar = tVar.then(new e0(f40636a));
        }
        return tVar.then(new a(function0));
    }
}
