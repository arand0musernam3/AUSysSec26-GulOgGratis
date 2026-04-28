package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class n0 extends o0 {
    public final r.f l = new r.f();

    @Override // androidx.lifecycle.k0
    public void g() {
        Iterator it = this.l.iterator();
        while (true) {
            r.b bVar = (r.b) it;
            if (!bVar.hasNext()) {
                return;
            }
            m0 m0Var = (m0) ((Map.Entry) bVar.next()).getValue();
            m0Var.f3491a.f(m0Var);
        }
    }

    @Override // androidx.lifecycle.k0
    public void h() {
        Iterator it = this.l.iterator();
        while (true) {
            r.b bVar = (r.b) it;
            if (!bVar.hasNext()) {
                return;
            }
            m0 m0Var = (m0) ((Map.Entry) bVar.next()).getValue();
            m0Var.f3491a.j(m0Var);
        }
    }
}
