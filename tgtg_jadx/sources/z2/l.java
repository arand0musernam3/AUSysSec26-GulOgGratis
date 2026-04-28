package z2;

import m5.q0;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f46870c = new l(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f46871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f46872b;

    public l(q0 q0Var, z zVar) {
        this.f46871a = zVar;
        this.f46872b = q0Var;
    }

    public static l a(l lVar, z zVar, q0 q0Var, int i11) {
        if ((i11 & 1) != 0) {
            zVar = lVar.f46871a;
        }
        if ((i11 & 2) != 0) {
            q0Var = lVar.f46872b;
        }
        return new l(q0Var, zVar);
    }
}
