package l8;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f27484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f27485b;

    public t(int i11) {
        this.f27484a = new SparseArray(i11);
    }

    public final void a(w wVar, int i11, int i12) {
        int iA = wVar.a(i11);
        SparseArray sparseArray = this.f27484a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(iA);
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(wVar.a(i11), tVar);
        }
        if (i12 > i11) {
            tVar.a(wVar, i11 + 1, i12);
        } else {
            tVar.f27485b = wVar;
        }
    }
}
