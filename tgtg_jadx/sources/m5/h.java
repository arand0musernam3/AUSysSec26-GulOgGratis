package m5;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f29539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f29540d;

    static {
        ub.a aVar = i0.f29542a;
    }

    public h(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f29537a = list;
        this.f29538b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = (f) list.get(i11);
                Object obj = fVar.f29529a;
                if (obj instanceof l0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(fVar);
                } else if (obj instanceof w) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(fVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f29539c = arrayList;
        this.f29540d = arrayList2;
        List listL0 = arrayList2 != null ? CollectionsKt.l0(arrayList2, new g(0)) : null;
        if (listL0 == null || listL0.isEmpty()) {
            return;
        }
        int i12 = ((f) CollectionsKt.O(listL0)).f29531c;
        q1.f0 f0Var = q1.n.f35794a;
        q1.f0 f0Var2 = new q1.f0(1);
        f0Var2.c(i12);
        int size2 = listL0.size();
        for (int i13 = 1; i13 < size2; i13++) {
            f fVar2 = (f) listL0.get(i13);
            while (true) {
                if (f0Var2.f35790b != 0) {
                    int iB = f0Var2.b();
                    int i14 = fVar2.f29530b;
                    int i15 = fVar2.f29531c;
                    if (i14 >= iB) {
                        f0Var2.e(f0Var2.f35790b - 1);
                    } else if (i15 > iB) {
                        s5.a.a("Paragraph overlap not allowed, end " + i15 + " should be less than or equal to " + iB);
                    }
                }
            }
            f0Var2.c(fVar2.f29531c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public final List a(int i11) {
        ?? arrayList;
        List list = this.f29537a;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                f fVar = (f) obj;
                if ((fVar.f29529a instanceof o) && i.b(0, i11, fVar.f29530b, fVar.f29531c)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = kotlin.collections.n0.f26529a;
        }
        arrayList.getClass();
        return arrayList;
    }

    public final List b(int i11, int i12, String str) {
        List list = this.f29537a;
        if (list == null) {
            return kotlin.collections.n0.f26529a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            f fVar = (f) list.get(i13);
            Object obj = fVar.f29529a;
            int i14 = fVar.f29531c;
            int i15 = fVar.f29530b;
            String str2 = fVar.f29532d;
            if ((obj instanceof n0) && Intrinsics.areEqual(str, str2) && i.b(i11, i12, i15, i14)) {
                Object obj2 = fVar.f29529a;
                obj2.getClass();
                arrayList.add(new f(((n0) obj2).f29600a, i15, i14, str2));
            }
        }
        return arrayList;
    }

    public final h c(Function1 function1) {
        e eVar = new e(this);
        ArrayList arrayList = eVar.f29527c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = (f) function1.invoke(((d) arrayList.get(i11)).a(Integer.MIN_VALUE));
            arrayList.set(i11, new d(fVar.f29529a, fVar.f29530b, fVar.f29531c, fVar.f29532d));
        }
        return eVar.j();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i11) {
        return this.f29538b.charAt(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m5.h subSequence(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 > r12) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            s5.a.a(r1)
        L26:
            java.lang.String r1 = r10.f29538b
            if (r11 != 0) goto L31
            int r4 = r1.length()
            if (r12 != r4) goto L31
            return r10
        L31:
            java.lang.String r1 = r1.substring(r11, r12)
            m5.h r4 = m5.i.f29541a
            if (r11 > r12) goto L3a
            goto L54
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r11)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            s5.a.a(r2)
        L54:
            java.util.List r2 = r10.f29537a
            if (r2 != 0) goto L59
            goto L99
        L59:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            int r4 = r2.size()
        L66:
            if (r0 >= r4) goto L93
            java.lang.Object r5 = r2.get(r0)
            m5.f r5 = (m5.f) r5
            int r6 = r5.f29530b
            int r7 = r5.f29531c
            boolean r6 = m5.i.b(r11, r12, r6, r7)
            if (r6 == 0) goto L90
            m5.f r6 = new m5.f
            java.lang.Object r8 = r5.f29529a
            int r9 = r5.f29530b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.f29532d
            r6.<init>(r8, r9, r7, r5)
            r3.add(r6)
        L90:
            int r0 = r0 + 1
            goto L66
        L93:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L9a
        L99:
            r3 = 0
        L9a:
            m5.h r11 = new m5.h
            r11.<init>(r3, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.h.subSequence(int, int):m5.h");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f29538b, hVar.f29538b) && Intrinsics.areEqual(this.f29537a, hVar.f29537a);
    }

    public final int hashCode() {
        int iHashCode = this.f29538b.hashCode() * 31;
        List list = this.f29537a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f29538b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f29538b;
    }

    public h(String str) {
        this(str, kotlin.collections.n0.f26529a);
    }

    public h(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
