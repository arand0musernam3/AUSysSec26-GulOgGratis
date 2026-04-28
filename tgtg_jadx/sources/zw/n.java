package zw;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48289b;

    public n(boolean z11, String str) {
        this.f48288a = z11;
        this.f48289b = str;
    }

    @Override // zw.h
    public final boolean a(n1 n1Var) {
        int i11;
        boolean z11 = this.f48288a;
        String strN = this.f48289b;
        if (z11 && strN == null) {
            strN = n1Var.n();
        }
        l1 l1Var = n1Var.f48324b;
        if (l1Var != null) {
            Iterator it = l1Var.getChildren().iterator();
            i11 = 0;
            while (it.hasNext()) {
                n1 n1Var2 = (n1) ((p1) it.next());
                if (strN == null || n1Var2.n().equals(strN)) {
                    i11++;
                }
            }
        } else {
            i11 = 1;
        }
        return i11 == 1;
    }

    public final String toString() {
        return this.f48288a ? w.a0.p("only-of-type <", this.f48289b, ">") : "only-child";
    }
}
