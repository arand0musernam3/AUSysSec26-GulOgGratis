package b5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface c0 extends l {
    default int maxIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        return mo58measure3p2s80s(new z4.y(uVar, uVar.getLayoutDirection()), new u1(tVar, w1.Max, x1.Height, 0), z5.b.b(i11, 0, 13)).getHeight();
    }

    default int maxIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        return mo58measure3p2s80s(new z4.y(uVar, uVar.getLayoutDirection()), new u1(tVar, w1.Max, x1.Width, 0), z5.b.b(0, i11, 7)).b();
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9);

    default int minIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        return mo58measure3p2s80s(new z4.y(uVar, uVar.getLayoutDirection()), new u1(tVar, w1.Min, x1.Height, 0), z5.b.b(i11, 0, 13)).getHeight();
    }

    default int minIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        return mo58measure3p2s80s(new z4.y(uVar, uVar.getLayoutDirection()), new u1(tVar, w1.Min, x1.Width, 0), z5.b.b(0, i11, 7)).b();
    }
}
