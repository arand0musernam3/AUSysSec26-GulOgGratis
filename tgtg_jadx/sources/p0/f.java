package p0;

import df.g;
import s0.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends n0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u0.b f34104c = u0.b.OFF;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0.b f34105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f34106b;

    public f(u0.b bVar) {
        bVar.getClass();
        this.f34105a = bVar;
        this.f34106b = b.VIDEO_STABILIZATION;
    }

    @Override // n0.b
    public final b a() {
        return this.f34106b;
    }

    @Override // n0.b
    public final boolean b(g gVar, g0 g0Var) {
        int i11 = e.$EnumSwitchMapping$0[this.f34105a.ordinal()];
        if (i11 == 1) {
            return g0Var.c();
        }
        if (i11 == 2) {
            return g0Var.z();
        }
        if (i11 == 3 || i11 == 4) {
            return true;
        }
        e40.a.f();
        return false;
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.f34105a.name() + ')';
    }
}
