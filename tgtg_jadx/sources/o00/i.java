package o00;

import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f31677e;

    static {
        i iVar = new i(null, new q1.k1(0));
        if (iVar.f31684c) {
            h2.b("Already frozen");
            return;
        }
        iVar.f31684c = true;
        f31677e = iVar;
        q1.k1 k1Var = new q1.k1(0);
        i iVar2 = new i(iVar, k1Var);
        boolean z11 = iVar2.f31684c;
        Boolean bool = Boolean.TRUE;
        if (z11) {
            h2.b("Can't mutate after handing to trace");
            return;
        }
        if (iVar2.a()) {
            h2.b("Key already present");
            return;
        }
        k1Var.put(j.f31681d, bool);
        if (iVar2.f31684c) {
            h2.b("Already frozen");
        } else {
            iVar2.f31684c = true;
        }
    }
}
