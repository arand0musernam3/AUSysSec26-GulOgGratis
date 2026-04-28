package z2;

import b5.h1;
import c5.o2;
import i4.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m5.u0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz2/q;", "Lb5/h1;", "Lz2/t;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f46903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q5.h f46904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f46907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f46908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y f46909i;

    public q(String str, u0 u0Var, q5.h hVar, int i11, boolean z11, int i12, int i13, y yVar) {
        this.f46902b = str;
        this.f46903c = u0Var;
        this.f46904d = hVar;
        this.f46905e = i11;
        this.f46906f = z11;
        this.f46907g = i12;
        this.f46908h = i13;
        this.f46909i = yVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        t tVar = new t();
        tVar.f46916o = this.f46902b;
        tVar.f46917p = this.f46903c;
        tVar.f46918q = this.f46904d;
        tVar.f46919r = this.f46905e;
        tVar.f46920s = this.f46906f;
        tVar.f46921t = this.f46907g;
        tVar.f46922u = this.f46908h;
        tVar.f46923v = this.f46909i;
        return tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f46909i, qVar.f46909i) && Intrinsics.areEqual(this.f46902b, qVar.f46902b) && Intrinsics.areEqual(this.f46903c, qVar.f46903c) && Intrinsics.areEqual(this.f46904d, qVar.f46904d) && this.f46905e == qVar.f46905e && this.f46906f == qVar.f46906f && this.f46907g == qVar.f46907g && this.f46908h == qVar.f46908h;
    }

    public final int hashCode() {
        int iE = (((r8.k.e(r8.k.b(this.f46905e, (this.f46904d.hashCode() + l1.c(this.f46902b.hashCode() * 31, 31, this.f46903c)) * 31, 31), 31, this.f46906f) + this.f46907g) * 31) + this.f46908h) * 31;
        y yVar = this.f46909i;
        return iE + (yVar != null ? yVar.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // b5.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(b4.s r12) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.q.update(b4.s):void");
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
    }
}
