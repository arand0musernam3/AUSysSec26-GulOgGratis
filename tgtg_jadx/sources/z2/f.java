package z2;

import b5.h1;
import c5.o2;
import i4.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m5.u0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz2/f;", "Lb5/h1;", "Lz2/g;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m5.h f46841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f46842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q5.h f46843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f46844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f46845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f46846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f46847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f46848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f46849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Function1 f46850k;
    public final i l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y f46851m;

    public f(m5.h hVar, u0 u0Var, q5.h hVar2, Function1 function1, int i11, boolean z11, int i12, int i13, List list, Function1 function12, i iVar, y yVar) {
        this.f46841b = hVar;
        this.f46842c = u0Var;
        this.f46843d = hVar2;
        this.f46844e = function1;
        this.f46845f = i11;
        this.f46846g = z11;
        this.f46847h = i12;
        this.f46848i = i13;
        this.f46849j = list;
        this.f46850k = function12;
        this.l = iVar;
        this.f46851m = yVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new g(this.f46841b, this.f46842c, this.f46843d, this.f46844e, this.f46845f, this.f46846g, this.f46847h, this.f46848i, this.f46849j, this.f46850k, this.l, this.f46851m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f46851m, fVar.f46851m) && Intrinsics.areEqual(this.f46841b, fVar.f46841b) && Intrinsics.areEqual(this.f46842c, fVar.f46842c) && Intrinsics.areEqual(this.f46849j, fVar.f46849j) && Intrinsics.areEqual(this.f46843d, fVar.f46843d) && Intrinsics.areEqual((Object) null, (Object) null) && this.f46844e == fVar.f46844e && this.f46845f == fVar.f46845f && this.f46846g == fVar.f46846g && this.f46847h == fVar.f46847h && this.f46848i == fVar.f46848i && this.f46850k == fVar.f46850k && Intrinsics.areEqual(this.l, fVar.l);
    }

    public final int hashCode() {
        int iHashCode = (this.f46843d.hashCode() + l1.c(this.f46841b.hashCode() * 31, 31, this.f46842c)) * 31;
        Function1 function1 = this.f46844e;
        int iE = (((r8.k.e(r8.k.b(this.f46845f, (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.f46846g) + this.f46847h) * 31) + this.f46848i) * 31;
        List list = this.f46849j;
        int iHashCode2 = (iE + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.f46850k;
        int iHashCode3 = (iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 31;
        i iVar = this.l;
        int iHashCode4 = (iHashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 961;
        y yVar = this.f46851m;
        return iHashCode4 + (yVar != null ? yVar.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // b5.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(b4.s r12) {
        /*
            r11 = this;
            z2.g r12 = (z2.g) r12
            z2.p r0 = r12.f46853r
            i4.y r1 = r0.f46901z
            i4.y r2 = r11.f46851m
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
            r0.f46901z = r2
            m5.u0 r4 = r11.f46842c
            if (r1 == 0) goto L26
            m5.u0 r1 = r0.f46891p
            if (r4 == r1) goto L21
            m5.l0 r2 = r4.f29655a
            m5.l0 r1 = r1.f29655a
            boolean r1 = r2.b(r1)
            if (r1 == 0) goto L26
            goto L24
        L21:
            r4.getClass()
        L24:
            r1 = 0
            goto L27
        L26:
            r1 = 1
        L27:
            m5.h r2 = r11.f46841b
            boolean r2 = r0.Q0(r2)
            z2.p r3 = r12.f46853r
            java.util.List r5 = r11.f46849j
            int r6 = r11.f46848i
            int r7 = r11.f46847h
            boolean r8 = r11.f46846g
            q5.h r9 = r11.f46843d
            int r10 = r11.f46845f
            boolean r3 = r3.P0(r4, r5, r6, r7, r8, r9, r10)
            r4 = 0
            kotlin.jvm.functions.Function1 r5 = r11.f46844e
            kotlin.jvm.functions.Function1 r6 = r11.f46850k
            z2.i r7 = r11.l
            boolean r4 = r0.O0(r5, r6, r7, r4)
            r0.L0(r1, r2, r3, r4)
            r12.f46852q = r7
            b5.m0 r12 = b5.m.g(r12)
            r12.F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.f.update(b4.s):void");
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
    }
}
