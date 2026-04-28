package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b5 extends b4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b7 f11280e;

    public b5(String str, ArrayList arrayList, List list, b7 b7Var) {
        super(str);
        this.f11278c = new ArrayList();
        this.f11280e = b7Var;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f11278c.add(((c5) it.next()).e());
            }
        }
        this.f11279d = new ArrayList(list);
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final c5 a(b7 b7Var, List list) {
        g5 g5Var;
        b7 b7VarD = this.f11280e.d();
        i5 i5Var = (i5) b7VarD.f11283c;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f11278c;
            int size = arrayList.size();
            g5Var = c5.U;
            if (i11 >= size) {
                break;
            }
            if (i11 < list.size()) {
                b7VarD.g((String) arrayList.get(i11), ((i5) b7Var.f11283c).e(b7Var, (c5) list.get(i11)));
            } else {
                b7VarD.g((String) arrayList.get(i11), g5Var);
            }
            i11++;
        }
        for (c5 c5Var : this.f11279d) {
            c5 c5VarE = i5Var.e(b7VarD, c5Var);
            if (c5VarE instanceof d5) {
                c5VarE = i5Var.e(b7VarD, c5Var);
            }
            if (c5VarE instanceof q2) {
                return ((q2) c5VarE).f11777a;
            }
        }
        return g5Var;
    }

    @Override // com.google.android.gms.internal.measurement.b4, com.google.android.gms.internal.measurement.c5
    public final c5 m() {
        return new b5(this);
    }

    public b5(b5 b5Var) {
        super(b5Var.f11276a);
        ArrayList arrayList = new ArrayList(b5Var.f11278c.size());
        this.f11278c = arrayList;
        arrayList.addAll(b5Var.f11278c);
        ArrayList arrayList2 = new ArrayList(b5Var.f11279d.size());
        this.f11279d = arrayList2;
        arrayList2.addAll(b5Var.f11279d);
        this.f11280e = b5Var.f11280e;
    }
}
