package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n1 implements Iterable, c5, y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap f11650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap f11651b;

    public n1(List list) {
        this();
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                r(i11, (c5) list.get(i11));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.y4
    public final c5 b(String str) {
        c5 c5Var;
        return "length".equals(str) ? new i3(Double.valueOf(p())) : (!i(str) || (c5Var = (c5) this.f11651b.get(str)) == null) ? c5.U : c5Var;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Iterator c() {
        return new m0(this, this.f11650a.keySet().iterator(), this.f11651b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Boolean d() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final String e() {
        return u(MessageLogView.COMMA_SEPARATOR);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        if (p() != n1Var.p()) {
            return false;
        }
        TreeMap treeMap = this.f11650a;
        if (treeMap.isEmpty()) {
            return n1Var.f11650a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!q(iIntValue).equals(n1Var.q(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.y4
    public final void g(String str, c5 c5Var) {
        TreeMap treeMap = this.f11651b;
        if (c5Var == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, c5Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Double h() {
        TreeMap treeMap = this.f11650a;
        return treeMap.size() == 1 ? q(0).h() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.f11650a.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.y4
    public final boolean i(String str) {
        return "length".equals(str) || this.f11651b.containsKey(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a1(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02dc, code lost:
    
        if (com.google.android.gms.internal.measurement.h.f(r7, r2, (com.google.android.gms.internal.measurement.b5) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).p() == r7.p()) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe  */
    @Override // com.google.android.gms.internal.measurement.c5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.c5 j(java.lang.String r37, com.google.android.gms.internal.measurement.b7 r38, java.util.ArrayList r39) {
        /*
            Method dump skipped, instruction units count: 2168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n1.j(java.lang.String, com.google.android.gms.internal.measurement.b7, java.util.ArrayList):com.google.android.gms.internal.measurement.c5");
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final c5 m() {
        n1 n1Var = new n1();
        for (Map.Entry entry : this.f11650a.entrySet()) {
            boolean z11 = entry.getValue() instanceof y4;
            TreeMap treeMap = n1Var.f11650a;
            if (z11) {
                treeMap.put((Integer) entry.getKey(), (c5) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((c5) entry.getValue()).m());
            }
        }
        return n1Var;
    }

    public final List n() {
        ArrayList arrayList = new ArrayList(p());
        for (int i11 = 0; i11 < p(); i11++) {
            arrayList.add(q(i11));
        }
        return arrayList;
    }

    public final Iterator o() {
        return this.f11650a.keySet().iterator();
    }

    public final int p() {
        TreeMap treeMap = this.f11650a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final c5 q(int i11) {
        c5 c5Var;
        if (i11 < p()) {
            return (!s(i11) || (c5Var = (c5) this.f11650a.get(Integer.valueOf(i11))) == null) ? c5.U : c5Var;
        }
        org.bouncycastle.jce.provider.a.v("Attempting to get element outside of current array");
        return null;
    }

    public final void r(int i11, c5 c5Var) {
        if (i11 > 32468) {
            com.braze.h2.b("Array too large");
            return;
        }
        if (i11 < 0) {
            org.bouncycastle.jce.provider.a.v(e0.f.h(i11, "Out of bounds index: ", new StringBuilder(String.valueOf(i11).length() + 21)));
            return;
        }
        TreeMap treeMap = this.f11650a;
        if (c5Var == null) {
            treeMap.remove(Integer.valueOf(i11));
        } else {
            treeMap.put(Integer.valueOf(i11), c5Var);
        }
    }

    public final boolean s(int i11) {
        if (i11 >= 0) {
            TreeMap treeMap = this.f11650a;
            if (i11 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i11));
            }
        }
        org.bouncycastle.jce.provider.a.v(e0.f.h(i11, "Out of bounds index: ", new StringBuilder(String.valueOf(i11).length() + 21)));
        return false;
    }

    public final void t(int i11) {
        TreeMap treeMap = this.f11650a;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i11 > iIntValue || i11 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i11));
        if (i11 == iIntValue) {
            int i12 = i11 - 1;
            Integer numValueOf = Integer.valueOf(i12);
            if (treeMap.containsKey(numValueOf) || i12 < 0) {
                return;
            }
            treeMap.put(numValueOf, c5.U);
            return;
        }
        while (true) {
            i11++;
            if (i11 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i11);
            c5 c5Var = (c5) treeMap.get(numValueOf2);
            if (c5Var != null) {
                treeMap.put(Integer.valueOf(i11 - 1), c5Var);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final String toString() {
        return u(MessageLogView.COMMA_SEPARATOR);
    }

    public final String u(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f11650a.isEmpty()) {
            int i11 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i11 >= p()) {
                    break;
                }
                c5 c5VarQ = q(i11);
                sb2.append(str2);
                if (!(c5VarQ instanceof g5) && !(c5VarQ instanceof a5)) {
                    sb2.append(c5VarQ.e());
                }
                i11++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    public n1() {
        this.f11650a = new TreeMap();
        this.f11651b = new TreeMap();
    }
}
