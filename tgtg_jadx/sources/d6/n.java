package d6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import m2.c2;
import m2.g2;
import z4.m1;
import z4.t0;
import z4.u0;
import z4.v0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14512c;

    public /* synthetic */ n(int i11, Object obj, Object obj2) {
        this.f14510a = i11;
        this.f14511b = obj;
        this.f14512c = obj2;
    }

    @Override // z4.u0
    public final v0 c(w0 w0Var, List list, long j9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List list2;
        Pair pair;
        switch (this.f14510a) {
            case 0:
                ((g0) this.f14511b).setParentLayoutDirection((z5.m) this.f14512c);
                return w0.f(w0Var, 0, 0, d.f14442d);
            default:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj = list.get(i11);
                    if (!(((t0) obj).G() instanceof g2)) {
                        arrayList3.add(obj);
                    }
                }
                List list3 = (List) ((Function0) this.f14512c).invoke();
                if (list3 != null) {
                    ArrayList arrayList4 = new ArrayList(list3.size());
                    int size2 = list3.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        h4.c cVar = (h4.c) list3.get(i12);
                        if (cVar != null) {
                            float f11 = cVar.f21381b;
                            float f12 = cVar.f21380a;
                            t0 t0Var = (t0) arrayList3.get(i12);
                            int iFloor = (int) Math.floor(cVar.f21382c - f12);
                            float f13 = cVar.f21383d - f11;
                            arrayList2 = arrayList3;
                            list2 = list3;
                            m1 m1VarD = t0Var.D(z5.b.b(iFloor, (int) Math.floor(f13), 5));
                            int iRound = Math.round(f12);
                            pair = new Pair(m1VarD, new z5.j((((long) Math.round(f11)) & 4294967295L) | (((long) iRound) << 32)));
                        } else {
                            arrayList2 = arrayList3;
                            list2 = list3;
                            pair = null;
                        }
                        if (pair != null) {
                            arrayList4.add(pair);
                        }
                        i12++;
                        arrayList3 = arrayList2;
                        list3 = list2;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList5 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    Object obj2 = list.get(i13);
                    if (((t0) obj2).G() instanceof g2) {
                        arrayList5.add(obj2);
                    }
                }
                return w0.f(w0Var, z5.a.i(j9), z5.a.h(j9), new c2(2, arrayList, m2.g0.q(arrayList5, (Function0) this.f14511b)));
        }
    }
}
