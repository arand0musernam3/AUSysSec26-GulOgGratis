package o00;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends cl.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f31763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v0 f31764c;

    static {
        Set<k0> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(j0.f31685a, m0.f31709b, n0.f31716a)));
        f31763b = setUnmodifiableSet;
        o0 o0Var = new o0();
        for (k0 k0Var : setUnmodifiableSet) {
            if (k0Var == null) {
                c50.w.l("key".concat(" must not be null"));
                return;
            }
            boolean z11 = k0Var.f31699c;
            HashMap map = o0Var.f31724b;
            HashMap map2 = o0Var.f31723a;
            if (!z11) {
                map.remove(k0Var);
                map2.put(k0Var, o0.f31721c);
            } else if (!z11) {
                i4.a.f("key must be repeating");
                return;
            } else {
                map2.remove(k0Var);
                map.put(k0Var, o0.f31722d);
            }
        }
        h hVar = new h();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        map3.putAll(o0Var.f31723a);
        map4.putAll(o0Var.f31724b);
        f31764c = new v0(Level.ALL, f31763b, hVar);
    }
}
