package g9;

import com.braze.h2;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f20222b = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f20223a = new LinkedHashMap();

    public final void a(t0 t0Var) {
        t0Var.getClass();
        String strT = zz.f.t(t0Var.getClass());
        if (strT.length() <= 0) {
            i4.a.f("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.f20223a;
        t0 t0Var2 = (t0) linkedHashMap.get(strT);
        if (Intrinsics.areEqual(t0Var2, t0Var)) {
            return;
        }
        if (t0Var2 != null && t0Var2.f20219b) {
            e40.a.i("Navigator ", t0Var, " is replacing an already attached ", t0Var2);
        } else if (t0Var.f20219b) {
            qc.y.j("Navigator ", t0Var, " is already attached to another NavController");
        }
    }

    public final t0 b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            i4.a.f("navigator name cannot be an empty string");
            return null;
        }
        t0 t0Var = (t0) this.f20223a.get(str);
        if (t0Var != null) {
            return t0Var;
        }
        h2.b(w.a0.p("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
