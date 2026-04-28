package te;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f40117a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a60.n f40118b = a60.n.b("c", "v", "i", "o");

    @Override // te.f0
    public final Object f(ue.d dVar, float f11) {
        if (dVar.H() == ue.c.BEGIN_ARRAY) {
            dVar.a();
        }
        dVar.e();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zU = false;
        while (dVar.t()) {
            int iJ = dVar.J(f40118b);
            if (iJ == 0) {
                zU = dVar.u();
            } else if (iJ == 1) {
                arrayListC = o.c(dVar, f11);
            } else if (iJ == 2) {
                arrayListC2 = o.c(dVar, f11);
            } else if (iJ != 3) {
                dVar.L();
                dVar.O();
            } else {
                arrayListC3 = o.c(dVar, f11);
            }
        }
        dVar.p();
        if (dVar.H() == ue.c.END_ARRAY) {
            dVar.g();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            i4.a.f("Shape data was missing information.");
            return null;
        }
        if (arrayListC.isEmpty()) {
            return new qe.q(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 1; i11 < size; i11++) {
            PointF pointF2 = (PointF) arrayListC.get(i11);
            int i12 = i11 - 1;
            arrayList.add(new oe.a(ve.g.a((PointF) arrayListC.get(i12), (PointF) arrayListC3.get(i12)), ve.g.a(pointF2, (PointF) arrayListC2.get(i11)), pointF2));
        }
        if (zU) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i13 = size - 1;
            arrayList.add(new oe.a(ve.g.a((PointF) arrayListC.get(i13), (PointF) arrayListC3.get(i13)), ve.g.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new qe.q(pointF, zU, arrayList);
    }
}
