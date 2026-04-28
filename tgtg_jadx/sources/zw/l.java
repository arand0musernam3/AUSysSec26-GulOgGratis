package zw;

import a3.i3;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f48270a;

    @Override // zw.h
    public final boolean a(n1 n1Var) {
        Iterator it = this.f48270a.iterator();
        while (it.hasNext()) {
            if (i3.v((p) it.next(), n1Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return e0.f.p(new StringBuilder("not("), this.f48270a, ")");
    }
}
