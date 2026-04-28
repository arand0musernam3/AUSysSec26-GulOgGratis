package s1;

import android.view.ViewConfiguration;
import c5.x1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f38640a = ViewConfiguration.getScrollFriction();

    public static final t1.s a(m3.n nVar) {
        m3.s sVar = (m3.s) nVar;
        z5.c cVar = (z5.c) sVar.j(x1.f7416h);
        boolean zC = sVar.c(cVar.a());
        Object objM = sVar.M();
        if (zC || objM == m3.m.f29332a) {
            objM = new t1.s(new jb.b(cVar));
            sVar.k0(objM);
        }
        return (t1.s) objM;
    }
}
