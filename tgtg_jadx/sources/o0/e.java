package o0;

import m0.j0;
import m0.m1;
import m0.s0;
import v0.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static g a(m1 m1Var) {
        m1Var.getClass();
        return m1Var instanceof s0 ? g.PREVIEW : m1Var instanceof j0 ? g.IMAGE_CAPTURE : p.c(m1Var) ? g.VIDEO_CAPTURE : m1Var instanceof g1.d ? g.STREAM_SHARING : g.UNDEFINED;
    }
}
