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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz2/m;", "Lb5/h1;", "Lz2/p;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m5.h f46873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f46874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q5.h f46875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f46876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f46877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f46878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f46879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f46880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f46881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Function1 f46882k;
    public final y l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Function1 f46883m;

    public m(m5.h hVar, u0 u0Var, q5.h hVar2, Function1 function1, int i11, boolean z11, int i12, int i13, List list, Function1 function12, y yVar, Function1 function13) {
        this.f46873b = hVar;
        this.f46874c = u0Var;
        this.f46875d = hVar2;
        this.f46876e = function1;
        this.f46877f = i11;
        this.f46878g = z11;
        this.f46879h = i12;
        this.f46880i = i13;
        this.f46881j = list;
        this.f46882k = function12;
        this.l = yVar;
        this.f46883m = function13;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new p(this.f46873b, this.f46874c, this.f46875d, this.f46876e, this.f46877f, this.f46878g, this.f46879h, this.f46880i, this.f46881j, this.f46882k, null, this.l, this.f46883m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.l, mVar.l) && Intrinsics.areEqual(this.f46873b, mVar.f46873b) && Intrinsics.areEqual(this.f46874c, mVar.f46874c) && Intrinsics.areEqual(this.f46881j, mVar.f46881j) && Intrinsics.areEqual(this.f46875d, mVar.f46875d) && this.f46876e == mVar.f46876e && this.f46883m == mVar.f46883m && this.f46877f == mVar.f46877f && this.f46878g == mVar.f46878g && this.f46879h == mVar.f46879h && this.f46880i == mVar.f46880i && this.f46882k == mVar.f46882k && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        int iHashCode = (this.f46875d.hashCode() + l1.c(this.f46873b.hashCode() * 31, 31, this.f46874c)) * 31;
        Function1 function1 = this.f46876e;
        int iE = (((r8.k.e(r8.k.b(this.f46877f, (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.f46878g) + this.f46879h) * 31) + this.f46880i) * 31;
        List list = this.f46881j;
        int iHashCode2 = (iE + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.f46882k;
        int iHashCode3 = (iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 961;
        y yVar = this.l;
        int iHashCode4 = (iHashCode3 + (yVar != null ? yVar.hashCode() : 0)) * 31;
        Function1 function13 = this.f46883m;
        return iHashCode4 + (function13 != null ? function13.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // b5.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(b4.s r10) {
        /*
            r9 = this;
            r0 = r10
            z2.p r0 = (z2.p) r0
            i4.y r10 = r0.f46901z
            i4.y r1 = r9.l
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r10)
            r0.f46901z = r1
            if (r10 == 0) goto L25
            m5.u0 r10 = r0.f46891p
            m5.u0 r1 = r9.f46874c
            if (r1 == r10) goto L20
            m5.l0 r1 = r1.f29655a
            m5.l0 r10 = r10.f29655a
            boolean r10 = r1.b(r10)
            if (r10 == 0) goto L25
            goto L23
        L20:
            r1.getClass()
        L23:
            r10 = 0
            goto L26
        L25:
            r10 = 1
        L26:
            m5.h r1 = r9.f46873b
            boolean r8 = r0.Q0(r1)
            q5.h r6 = r9.f46875d
            int r7 = r9.f46877f
            m5.u0 r1 = r9.f46874c
            java.util.List r2 = r9.f46881j
            int r3 = r9.f46880i
            int r4 = r9.f46879h
            boolean r5 = r9.f46878g
            boolean r1 = r0.P0(r1, r2, r3, r4, r5, r6, r7)
            r2 = 0
            kotlin.jvm.functions.Function1 r3 = r9.f46883m
            kotlin.jvm.functions.Function1 r4 = r9.f46876e
            kotlin.jvm.functions.Function1 r5 = r9.f46882k
            boolean r2 = r0.O0(r4, r5, r2, r3)
            r0.L0(r10, r8, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.m.update(b4.s):void");
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
    }
}
