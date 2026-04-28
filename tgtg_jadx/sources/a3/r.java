package a3;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1.s f536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0 f541f;

    public r(q1.i0 i0Var, List list, int i11, int i12, boolean z11, i0 i0Var2) {
        this.f536a = i0Var;
        this.f537b = list;
        this.f538c = i11;
        this.f539d = i12;
        this.f540e = z11;
        this.f541f = i0Var2;
        if (list.size() > 1) {
            return;
        }
        c2.a.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    public static void m(q1.k0 k0Var, i0 i0Var, f0 f0Var, int i11, int i12) {
        i0 i0Var2;
        if (i0Var.f387c) {
            i0Var2 = new i0(f0Var.a(i12), f0Var.a(i11), i12 > i11);
        } else {
            i0Var2 = new i0(f0Var.a(i11), f0Var.a(i12), i11 > i12);
        }
        if (i11 > i12) {
            c2.a.c("minOffset should be less than or equal to maxOffset: " + i0Var2);
        }
        long j9 = f0Var.f337a;
        int iD = k0Var.d(j9);
        Object[] objArr = k0Var.f35836c;
        Object obj = objArr[iD];
        k0Var.f35835b[iD] = j9;
        objArr[iD] = i0Var2;
    }

    @Override // a3.n1
    public final boolean a() {
        return this.f540e;
    }

    @Override // a3.n1
    public final f0 b() {
        return this.f540e ? k() : f();
    }

    @Override // a3.n1
    public final i0 c() {
        return this.f541f;
    }

    @Override // a3.n1
    public final f0 d() {
        return g() == k.CROSSED ? f() : k();
    }

    @Override // a3.n1
    public final int e() {
        return this.f539d;
    }

    @Override // a3.n1
    public final f0 f() {
        return (f0) this.f537b.get(o(this.f539d, false));
    }

    @Override // a3.n1
    public final k g() {
        int i11 = this.f538c;
        int i12 = this.f539d;
        if (i11 < i12) {
            return k.NOT_CROSSED;
        }
        if (i11 > i12) {
            return k.CROSSED;
        }
        return ((f0) this.f537b.get(i11 / 2)).b();
    }

    @Override // a3.n1
    public final int getSize() {
        return this.f537b.size();
    }

    @Override // a3.n1
    public final q1.k0 h(i0 i0Var) {
        h0 h0Var = i0Var.f385a;
        boolean z11 = i0Var.f387c;
        long j9 = h0Var.f368c;
        int i11 = h0Var.f367b;
        h0 h0Var2 = i0Var.f386b;
        long j11 = h0Var2.f368c;
        int i12 = h0Var2.f367b;
        if (j9 != j11) {
            q1.k0 k0Var = q1.w.f35850a;
            q1.k0 k0Var2 = new q1.k0();
            m(k0Var2, i0Var, d(), (z11 ? h0Var2 : h0Var).f367b, d().f342f.f29617a.f29603a.f29538b.length());
            j(new p(this, k0Var2, i0Var));
            if (!z11) {
                h0Var = h0Var2;
            }
            m(k0Var2, i0Var, g() == k.CROSSED ? k() : f(), 0, h0Var.f367b);
            return k0Var2;
        }
        if ((!z11 || i11 < i12) && (z11 || i11 > i12)) {
            c2.a.c("unexpectedly miss-crossed selection: " + i0Var);
        }
        long j12 = h0Var.f368c;
        q1.k0 k0Var3 = q1.w.f35850a;
        q1.k0 k0Var4 = new q1.k0();
        k0Var4.h(j12, i0Var);
        return k0Var4;
    }

    @Override // a3.n1
    public final boolean i(n1 n1Var) {
        if (this.f541f != null && n1Var != null && (n1Var instanceof r)) {
            r rVar = (r) n1Var;
            List list = rVar.f537b;
            if (this.f540e == rVar.f540e && this.f538c == rVar.f538c && this.f539d == rVar.f539d) {
                List list2 = this.f537b;
                if (list2.size() == list.size()) {
                    int size = list2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        f0 f0Var = (f0) list2.get(i11);
                        f0 f0Var2 = (f0) list.get(i11);
                        if (f0Var.f337a != f0Var2.f337a || f0Var.f339c != f0Var2.f339c || f0Var.f340d != f0Var2.f340d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // a3.n1
    public final void j(Function1 function1) {
        int iN = n(d().f337a);
        int iN2 = n((g() == k.CROSSED ? k() : f()).f337a);
        int i11 = iN + 1;
        if (i11 >= iN2) {
            return;
        }
        while (i11 < iN2) {
            function1.invoke(this.f537b.get(i11));
            i11++;
        }
    }

    @Override // a3.n1
    public final f0 k() {
        return (f0) this.f537b.get(o(this.f538c, true));
    }

    @Override // a3.n1
    public final int l() {
        return this.f538c;
    }

    public final int n(long j9) {
        try {
            return this.f536a.b(j9);
        } catch (NoSuchElementException e5) {
            wy.o.k(e0.f.i(j9, "Invalid selectableId: "), e5);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o(int r5, boolean r6) {
        /*
            r4 = this;
            a3.k r0 = r4.g()
            int[] r1 = a3.q.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L17
            if (r0 == r1) goto L20
            r3 = 3
            if (r0 != r3) goto L1b
            if (r6 != 0) goto L19
        L17:
            r6 = r2
            goto L20
        L19:
            r6 = 0
            goto L20
        L1b:
            e40.a.f()
            r5 = 0
            return r5
        L20:
            r6 = r6 ^ r2
            int r5 = r5 - r6
            int r5 = r5 / r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.r.o(int, boolean):int");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb2.append(this.f540e);
        sb2.append(", startPosition=");
        boolean z11 = true;
        float f11 = 2;
        sb2.append((this.f538c + 1) / f11);
        sb2.append(", endPosition=");
        sb2.append((this.f539d + 1) / f11);
        sb2.append(", crossed=");
        sb2.append(g());
        sb2.append(", infos=");
        StringBuilder sb3 = new StringBuilder("[\n\t");
        List list = this.f537b;
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            f0 f0Var = (f0) list.get(i11);
            if (z11) {
                z11 = false;
            } else {
                sb3.append(",\n\t");
            }
            StringBuilder sb4 = new StringBuilder();
            i11++;
            sb4.append(i11);
            sb4.append(" -> ");
            sb4.append(f0Var);
            sb3.append(sb4.toString());
        }
        sb3.append("\n]");
        sb2.append(sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
