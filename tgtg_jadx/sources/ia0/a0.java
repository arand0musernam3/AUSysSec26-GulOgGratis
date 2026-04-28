package ia0;

import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f23602b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f23603a;

    static {
        String str = File.separator;
        str.getClass();
        f23602b = str;
    }

    public a0(j jVar) {
        jVar.getClass();
        this.f23603a = jVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = ja0.c.a(this);
        j jVar = this.f23603a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < jVar.e() && jVar.j(iA) == 92) {
            iA++;
        }
        int iE = jVar.e();
        int i11 = iA;
        while (iA < iE) {
            if (jVar.j(iA) == 47 || jVar.j(iA) == 92) {
                arrayList.add(jVar.p(i11, iA));
                i11 = iA + 1;
            }
            iA++;
        }
        if (i11 < jVar.e()) {
            arrayList.add(jVar.p(i11, jVar.e()));
        }
        return arrayList;
    }

    public final String c() {
        j jVar = ja0.c.f24795a;
        j jVarQ = this.f23603a;
        int iL = j.l(jVarQ, jVar);
        if (iL == -1) {
            iL = j.l(jVarQ, ja0.c.f24796b);
        }
        if (iL != -1) {
            jVarQ = j.q(jVarQ, iL + 1, 0, 2);
        } else if (g() != null && jVarQ.e() == 2) {
            jVarQ = j.f23646d;
        }
        return jVarQ.s();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a0 a0Var = (a0) obj;
        a0Var.getClass();
        return this.f23603a.compareTo(a0Var.f23603a);
    }

    public final a0 d() {
        j jVar = ja0.c.f24798d;
        j jVar2 = this.f23603a;
        if (Intrinsics.areEqual(jVar2, jVar)) {
            return null;
        }
        j jVar3 = ja0.c.f24795a;
        if (Intrinsics.areEqual(jVar2, jVar3)) {
            return null;
        }
        j jVar4 = ja0.c.f24796b;
        if (Intrinsics.areEqual(jVar2, jVar4)) {
            return null;
        }
        j jVar5 = ja0.c.f24799e;
        jVar2.getClass();
        jVar5.getClass();
        int iE = jVar2.e();
        byte[] bArr = jVar5.f23647a;
        if (jVar2.m(iE - bArr.length, jVar5, bArr.length) && (jVar2.e() == 2 || jVar2.m(jVar2.e() - 3, jVar3, 1) || jVar2.m(jVar2.e() - 3, jVar4, 1))) {
            return null;
        }
        int iL = j.l(jVar2, jVar3);
        if (iL == -1) {
            iL = j.l(jVar2, jVar4);
        }
        if (iL == 2 && g() != null) {
            if (jVar2.e() == 3) {
                return null;
            }
            return new a0(j.q(jVar2, 0, 3, 1));
        }
        if (iL == 1) {
            jVar4.getClass();
            if (jVar2.m(0, jVar4, jVar4.e())) {
                return null;
            }
        }
        if (iL != -1 || g() == null) {
            return iL == -1 ? new a0(jVar) : iL == 0 ? new a0(j.q(jVar2, 0, 1, 1)) : new a0(j.q(jVar2, 0, iL, 1));
        }
        if (jVar2.e() == 2) {
            return null;
        }
        return new a0(j.q(jVar2, 0, 2, 1));
    }

    public final a0 e(a0 a0Var) {
        a0Var.getClass();
        j jVar = a0Var.f23603a;
        int iA = ja0.c.a(this);
        j jVar2 = this.f23603a;
        a0 a0Var2 = iA == -1 ? null : new a0(jVar2.p(0, iA));
        int iA2 = ja0.c.a(a0Var);
        if (!Intrinsics.areEqual(a0Var2, iA2 != -1 ? new a0(jVar.p(0, iA2)) : null)) {
            i4.a.g("Paths of different roots cannot be relative to each other: ", this, " and ", a0Var);
            return null;
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = a0Var.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i11 = 0;
        while (i11 < iMin && Intrinsics.areEqual(arrayListA.get(i11), arrayListA2.get(i11))) {
            i11++;
        }
        if (i11 == iMin && jVar2.e() == jVar.e()) {
            return n20.f.s(".");
        }
        if (arrayListA2.subList(i11, arrayListA2.size()).indexOf(ja0.c.f24799e) != -1) {
            i4.a.g("Impossible relative path to resolve: ", this, " and ", a0Var);
            return null;
        }
        if (Intrinsics.areEqual(jVar, ja0.c.f24798d)) {
            return this;
        }
        g gVar = new g();
        j jVarC = ja0.c.c(a0Var);
        if (jVarC == null && (jVarC = ja0.c.c(this)) == null) {
            jVarC = ja0.c.f(f23602b);
        }
        int size = arrayListA2.size();
        for (int i12 = i11; i12 < size; i12++) {
            gVar.y0(ja0.c.f24799e);
            gVar.y0(jVarC);
        }
        int size2 = arrayListA.size();
        while (i11 < size2) {
            gVar.y0((j) arrayListA.get(i11));
            gVar.y0(jVarC);
            i11++;
        }
        return ja0.c.d(gVar, false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a0) && Intrinsics.areEqual(((a0) obj).f23603a, this.f23603a);
    }

    public final a0 f(String str) {
        str.getClass();
        g gVar = new g();
        gVar.F0(str);
        return ja0.c.b(this, ja0.c.d(gVar, false), false);
    }

    public final Character g() {
        j jVar = ja0.c.f24795a;
        j jVar2 = this.f23603a;
        if (j.h(jVar2, jVar) != -1 || jVar2.e() < 2 || jVar2.j(1) != 58) {
            return null;
        }
        char cJ = (char) jVar2.j(0);
        if (('a' > cJ || cJ >= '{') && ('A' > cJ || cJ >= '[')) {
            return null;
        }
        return Character.valueOf(cJ);
    }

    public final int hashCode() {
        return this.f23603a.hashCode();
    }

    public final File toFile() {
        return new File(this.f23603a.s());
    }

    public final String toString() {
        return this.f23603a.s();
    }
}
