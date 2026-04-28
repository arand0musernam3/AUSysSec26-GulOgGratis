package qb;

import java.util.Iterator;
import java.util.Set;
import m2.c2;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9.v f36875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gt.a f36876b = new gt.a(10);

    public y(y9.v vVar) {
        this.f36875a = vVar;
    }

    public final void a(String str, Set set) {
        str.getClass();
        set.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            x0.A(this.f36875a, false, true, new c2(23, this, new x((String) it.next(), str)));
        }
    }
}
