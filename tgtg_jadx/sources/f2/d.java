package f2;

import t1.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface d {
    static b4.t a(d dVar, b1 b1Var, b1 b1Var2, int i11) {
        if ((i11 & 1) != 0) {
            b1Var = t1.c.j(0.0f, 400.0f, null, 5);
        }
        if ((i11 & 2) != 0) {
            long j9 = 1;
            b1Var2 = t1.c.j(0.0f, 400.0f, new z5.j((j9 & 4294967295L) | (j9 << 32)), 1);
        }
        b1 b1VarJ = t1.c.j(0.0f, 400.0f, null, 5);
        ((e) dVar).getClass();
        return new h2.l(b1Var, b1Var2, b1VarJ);
    }

    static b4.t b(d dVar, b4.t tVar) {
        return tVar.then(new f0(((e) dVar).f17112a));
    }
}
