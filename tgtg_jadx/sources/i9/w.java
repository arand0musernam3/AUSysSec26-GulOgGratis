package i9;

import g9.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.c3;
import q1.m0;
import t1.q1;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q1 f23576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f0 f23577k;
    public final /* synthetic */ g9.l l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m0 f23578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c3 f23579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f23580o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(q1 q1Var, f0 f0Var, g9.l lVar, m0 m0Var, c3 c3Var, i iVar, x70.c cVar) {
        super(2, cVar);
        this.f23576j = q1Var;
        this.f23577k = f0Var;
        this.l = lVar;
        this.f23578m = m0Var;
        this.f23579n = c3Var;
        this.f23580o = iVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new w(this.f23576j, this.f23577k, this.l, this.f23578m, this.f23579n, this.f23580o, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            ba0.g.M(r15)
            t1.q1 r15 = r14.f23576j
            h2.s0 r0 = r15.f39537a
            java.lang.Object r0 = r0.j()
            m3.k1 r15 = r15.f39540d
            java.lang.Object r1 = r15.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto Laa
            g9.f0 r0 = r14.f23577k
            l9.f r0 = r0.f20186b
            g9.l r0 = r0.h()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r15.getValue()
            g9.l r1 = r14.l
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto Laa
        L2f:
            m3.c3 r0 = r14.f23579n
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L3b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            g9.l r1 = (g9.l) r1
            i9.i r2 = r14.f23580o
            g9.o r2 = r2.b()
            r2.c(r1)
            goto L3b
        L51:
            q1.m0 r0 = r14.f23578m
            long[] r1 = r0.f35857a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto Laa
            r3 = 0
            r4 = r3
        L5c:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto La5
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L76:
            if (r9 >= r7) goto La3
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L9f
            int r10 = r4 << 3
            int r10 = r10 + r9
            java.lang.Object[] r11 = r0.f35858b
            r11 = r11[r10]
            float[] r12 = r0.f35859c
            r12 = r12[r10]
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r15.getValue()
            g9.l r12 = (g9.l) r12
            java.lang.String r12 = r12.f20167f
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r12)
            if (r11 != 0) goto L9f
            r0.e(r10)
        L9f:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L76
        La3:
            if (r7 != r8) goto Laa
        La5:
            if (r4 == r2) goto Laa
            int r4 = r4 + 1
            goto L5c
        Laa:
            kotlin.Unit r15 = kotlin.Unit.f26487a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
