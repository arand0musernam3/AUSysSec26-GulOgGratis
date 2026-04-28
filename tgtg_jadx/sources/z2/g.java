package z2;

import a3.s0;
import a3.s2;
import b5.c0;
import b5.o0;
import i4.y;
import java.util.List;
import kotlin.jvm.functions.Function1;
import m5.u0;
import z4.t0;
import z4.u;
import z4.v0;
import z4.w0;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b5.n implements c0, b5.r, b5.s {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f46852q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f46853r;

    public g(m5.h hVar, u0 u0Var, q5.h hVar2, Function1 function1, int i11, boolean z11, int i12, int i13, List list, Function1 function12, i iVar, y yVar) {
        this.f46852q = iVar;
        p pVar = new p(hVar, u0Var, hVar2, function1, i11, z11, i12, i13, list, function12, iVar, yVar, null);
        L0(pVar);
        this.f46853r = pVar;
        if (this.f46852q != null) {
            return;
        }
        c2.a.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        qc.y.m();
        throw null;
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.c0
    public final int maxIntrinsicHeight(u uVar, z4.t tVar, int i11) {
        return this.f46853r.maxIntrinsicHeight(uVar, tVar, i11);
    }

    @Override // b5.c0
    public final int maxIntrinsicWidth(u uVar, z4.t tVar, int i11) {
        return this.f46853r.maxIntrinsicWidth(uVar, tVar, i11);
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final v0 mo58measure3p2s80s(w0 w0Var, t0 t0Var, long j9) {
        return this.f46853r.mo58measure3p2s80s(w0Var, t0Var, j9);
    }

    @Override // b5.c0
    public final int minIntrinsicHeight(u uVar, z4.t tVar, int i11) {
        return this.f46853r.minIntrinsicHeight(uVar, tVar, i11);
    }

    @Override // b5.c0
    public final int minIntrinsicWidth(u uVar, z4.t tVar, int i11) {
        return this.f46853r.minIntrinsicWidth(uVar, tVar, i11);
    }

    @Override // b5.r
    public final void n(o0 o0Var) throws Throwable {
        this.f46853r.n(o0Var);
    }

    @Override // b5.s
    public final void v(z zVar) {
        i iVar = this.f46852q;
        if (iVar != null) {
            iVar.f46859d = l.a(iVar.f46859d, zVar, null, 2);
            s2 s2Var = iVar.f46857b;
            long j9 = iVar.f46856a;
            s2Var.f557a = false;
            s0 s0Var = s2Var.f561e;
            if (s0Var != null) {
                s0Var.invoke(Long.valueOf(j9));
            }
        }
    }
}
