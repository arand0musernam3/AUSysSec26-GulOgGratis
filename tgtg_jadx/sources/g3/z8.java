package g3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z8 implements z4.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a9 f19905a;

    public z8(a9 a9Var) {
        this.f19905a = a9Var;
    }

    @Override // z4.a1
    public final z4.v0 c(z4.w0 w0Var, List list, long j9) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        int i11 = z5.a.i(j9);
        int size = list2.size();
        Ref.IntRef intRef = new Ref.IntRef();
        if (size > 0) {
            intRef.element = i11 / size;
        }
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            numValueOf = Integer.valueOf(Math.max(((z4.t0) list2.get(i12)).b(intRef.element), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            arrayList2.add(new l8(w0Var.O(intRef.element) * i13, w0Var.O(intRef.element), ((z5.f) w70.b.c(new z5.f(w0Var.O(Math.min(((z4.t0) list2.get(i13)).y(iIntValue), intRef.element)) - (k8.f18978b * 2)), new z5.f(24))).f47277a));
        }
        this.f19905a.f18338a.setValue(arrayList2);
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i14 = 0; i14 < size3; i14++) {
            z4.t0 t0Var = (z4.t0) list2.get(i14);
            int i15 = intRef.element;
            arrayList3.add(t0Var.D(z5.a.a(i15, i15, iIntValue, iIntValue)));
        }
        ArrayList arrayList4 = new ArrayList(list3.size());
        int i16 = 0;
        for (int size4 = list3.size(); i16 < size4; size4 = size4) {
            arrayList4.add(((z4.t0) list3.get(i16)).D(z5.a.b(j9, 0, 0, 0, 0, 11)));
            i16++;
        }
        ArrayList arrayList5 = new ArrayList(list4.size());
        int i17 = 0;
        for (int size5 = list4.size(); i17 < size5; size5 = size5) {
            z4.t0 t0Var2 = (z4.t0) list4.get(i17);
            int i18 = intRef.element;
            arrayList5.add(t0Var2.D(z5.a.a(i18, i18, 0, iIntValue)));
            i17++;
            list4 = list4;
        }
        return z4.w0.f(w0Var, i11, iIntValue, new d2.x(arrayList3, arrayList4, arrayList5, intRef, iIntValue));
    }
}
