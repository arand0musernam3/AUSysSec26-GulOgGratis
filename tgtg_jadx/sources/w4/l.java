package w4;

import a3.i3;
import b5.i2;
import b5.s1;
import java.util.List;
import q1.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b4.s f43145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.constraintlayout.widget.z f43146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1.z f43147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1 f43148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f43149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f43150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f43152j;

    public l(b4.s sVar) {
        this.f43145c = sVar;
        androidx.constraintlayout.widget.z zVar = new androidx.constraintlayout.widget.z(13, (byte) 0);
        zVar.f2543c = new long[2];
        this.f43146d = zVar;
        this.f43147e = new q1.z(2);
        this.f43151i = true;
        this.f43152j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ef  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r5v1, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    @Override // w4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(q1.z r53, z4.z r54, a3.i3 r55, boolean r56) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.l.a(q1.z, z4.z, a3.i3, boolean):boolean");
    }

    @Override // w4.m
    public final void b(i3 i3Var) {
        super.b(i3Var);
        n nVar = this.f43149g;
        if (nVar == null) {
            return;
        }
        this.f43150h = this.f43151i;
        List list = nVar.f43165a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            v vVar = (v) list.get(i11);
            boolean z11 = vVar.f43181d;
            long j9 = vVar.f43178a;
            boolean zM = i3Var.m(j9);
            boolean z12 = this.f43151i;
            if ((!z11 && !zM) || (!z11 && !z12)) {
                this.f43146d.n(j9);
            }
        }
        this.f43151i = false;
        this.f43152j = nVar.f43170f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        o3.e eVar = this.f43153a;
        Object[] objArr = eVar.f31830a;
        int i11 = eVar.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            ((l) objArr[i12]).c();
        }
        ?? B = this.f43145c;
        ?? eVar2 = 0;
        while (B != 0) {
            if (B instanceof i2) {
                ((i2) B).F();
            } else if ((B.getKindSet$ui() & 16) != 0 && (B instanceof b5.n)) {
                b4.s child$ui = ((b5.n) B).f5892p;
                int i13 = 0;
                B = B;
                eVar2 = eVar2;
                while (child$ui != null) {
                    if ((child$ui.getKindSet$ui() & 16) != 0) {
                        i13++;
                        eVar2 = eVar2;
                        if (i13 == 1) {
                            B = child$ui;
                        } else {
                            if (eVar2 == 0) {
                                eVar2 = new o3.e(new b4.s[16], 0);
                            }
                            if (B != 0) {
                                eVar2.b(B);
                                B = 0;
                            }
                            eVar2.b(child$ui);
                        }
                    }
                    child$ui = child$ui.getChild$ui();
                    B = B;
                    eVar2 = eVar2;
                }
                if (i13 == 1) {
                }
            }
            B = b5.m.b(eVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(i3 i3Var) {
        q1.z zVar = this.f43147e;
        boolean z11 = false;
        z11 = false;
        if (!zVar.d()) {
            b4.s sVar = this.f43145c;
            if (sVar.isAttached()) {
                n nVar = this.f43149g;
                nVar.getClass();
                s1 s1Var = this.f43148f;
                s1Var.getClass();
                long j9 = s1Var.f47185c;
                ?? B = sVar;
                ?? eVar = 0;
                while (B != 0) {
                    if (B instanceof i2) {
                        ((i2) B).p0(nVar, o.Final, j9);
                    } else if ((B.getKindSet$ui() & 16) != 0 && (B instanceof b5.n)) {
                        b4.s child$ui = ((b5.n) B).f5892p;
                        int i11 = 0;
                        B = B;
                        eVar = eVar;
                        while (child$ui != null) {
                            if ((child$ui.getKindSet$ui() & 16) != 0) {
                                i11++;
                                eVar = eVar;
                                if (i11 == 1) {
                                    B = child$ui;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new o3.e(new b4.s[16], 0);
                                    }
                                    if (B != 0) {
                                        eVar.b(B);
                                        B = 0;
                                    }
                                    eVar.b(child$ui);
                                }
                            }
                            child$ui = child$ui.getChild$ui();
                            B = B;
                            eVar = eVar;
                        }
                        if (i11 == 1) {
                        }
                    }
                    B = b5.m.b(eVar);
                }
                if (sVar.isAttached()) {
                    o3.e eVar2 = this.f43153a;
                    Object[] objArr = eVar2.f31830a;
                    int i12 = eVar2.f31832c;
                    for (int i13 = 0; i13 < i12; i13++) {
                        ((l) objArr[i13]).d(i3Var);
                    }
                }
                z11 = true;
            }
        }
        b(i3Var);
        zVar.a();
        this.f43148f = null;
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r0v3, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(i3 i3Var, boolean z11) {
        if (!this.f43147e.d()) {
            ?? B = this.f43145c;
            if (B.isAttached()) {
                n nVar = this.f43149g;
                nVar.getClass();
                s1 s1Var = this.f43148f;
                s1Var.getClass();
                long j9 = s1Var.f47185c;
                ?? B2 = B;
                ?? eVar = 0;
                while (B2 != 0) {
                    if (B2 instanceof i2) {
                        ((i2) B2).p0(nVar, o.Initial, j9);
                    } else if ((B2.getKindSet$ui() & 16) != 0 && (B2 instanceof b5.n)) {
                        b4.s child$ui = ((b5.n) B2).f5892p;
                        int i11 = 0;
                        B2 = B2;
                        eVar = eVar;
                        while (child$ui != null) {
                            if ((child$ui.getKindSet$ui() & 16) != 0) {
                                i11++;
                                eVar = eVar;
                                if (i11 == 1) {
                                    B2 = child$ui;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new o3.e(new b4.s[16], 0);
                                    }
                                    if (B2 != 0) {
                                        eVar.b(B2);
                                        B2 = 0;
                                    }
                                    eVar.b(child$ui);
                                }
                            }
                            child$ui = child$ui.getChild$ui();
                            B2 = B2;
                            eVar = eVar;
                        }
                        if (i11 == 1) {
                        }
                    }
                    B2 = b5.m.b(eVar);
                }
                if (B.isAttached()) {
                    o3.e eVar2 = this.f43153a;
                    Object[] objArr = eVar2.f31830a;
                    int i12 = eVar2.f31832c;
                    for (int i13 = 0; i13 < i12; i13++) {
                        l lVar = (l) objArr[i13];
                        this.f43148f.getClass();
                        lVar.e(i3Var, z11);
                    }
                }
                if (B.isAttached()) {
                    ?? eVar3 = 0;
                    while (B != 0) {
                        if (B instanceof i2) {
                            ((i2) B).p0(nVar, o.Main, j9);
                        } else if ((B.getKindSet$ui() & 16) != 0 && (B instanceof b5.n)) {
                            b4.s child$ui2 = ((b5.n) B).f5892p;
                            int i14 = 0;
                            B = B;
                            eVar3 = eVar3;
                            while (child$ui2 != null) {
                                if ((child$ui2.getKindSet$ui() & 16) != 0) {
                                    i14++;
                                    eVar3 = eVar3;
                                    if (i14 == 1) {
                                        B = child$ui2;
                                    } else {
                                        if (eVar3 == 0) {
                                            eVar3 = new o3.e(new b4.s[16], 0);
                                        }
                                        if (B != 0) {
                                            eVar3.b(B);
                                            B = 0;
                                        }
                                        eVar3.b(child$ui2);
                                    }
                                }
                                child$ui2 = child$ui2.getChild$ui();
                                B = B;
                                eVar3 = eVar3;
                            }
                            if (i14 == 1) {
                            }
                        }
                        B = b5.m.b(eVar3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j9, o0 o0Var) {
        androidx.constraintlayout.widget.z zVar = this.f43146d;
        if (zVar.f(j9) && o0Var.c(this) < 0) {
            zVar.n(j9);
            this.f43147e.i(j9);
        }
        o3.e eVar = this.f43153a;
        Object[] objArr = eVar.f31830a;
        int i11 = eVar.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            ((l) objArr[i12]).f(j9, o0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f43145c + ", children=" + this.f43153a + ", pointerIds=" + this.f43146d + ')';
    }
}
