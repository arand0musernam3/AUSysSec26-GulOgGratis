package tp;

import i80.o;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f40405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f40406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ op.c f40407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f40408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f40409e;

    public g(List list, List list2, op.c cVar, boolean z11, Function1 function1) {
        this.f40405a = list;
        this.f40406b = list2;
        this.f40407c = cVar;
        this.f40408d = z11;
        this.f40409e = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    @Override // i80.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            f2.d r1 = (f2.d) r1
            r2 = r19
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r20
            m3.n r3 = (m3.n) r3
            r4 = r21
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = r4 & 6
            if (r5 != 0) goto L2c
            r5 = r3
            m3.s r5 = (m3.s) r5
            boolean r1 = r5.f(r1)
            if (r1 == 0) goto L29
            r1 = 4
            goto L2a
        L29:
            r1 = 2
        L2a:
            r1 = r1 | r4
            goto L2d
        L2c:
            r1 = r4
        L2d:
            r4 = r4 & 48
            if (r4 != 0) goto L40
            r4 = r3
            m3.s r4 = (m3.s) r4
            boolean r4 = r4.d(r2)
            if (r4 == 0) goto L3d
            r4 = 32
            goto L3f
        L3d:
            r4 = 16
        L3f:
            r1 = r1 | r4
        L40:
            r4 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L4a
            r4 = r6
            goto L4b
        L4a:
            r4 = r7
        L4b:
            r1 = r1 & r6
            r14 = r3
            m3.s r14 = (m3.s) r14
            boolean r1 = r14.R(r1, r4)
            if (r1 == 0) goto Lc1
            java.util.List r1 = r0.f40405a
            java.lang.Object r1 = r1.get(r2)
            r8 = r1
            op.l r8 = (op.l) r8
            r1 = -1552435893(0xffffffffa377b54b, float:-1.3428287E-17)
            r14.a0(r1)
            java.util.List r1 = r0.f40406b
            if (r1 == 0) goto L70
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L70
        L6e:
            r10 = r7
            goto L89
        L70:
            java.util.Iterator r1 = r1.iterator()
        L74:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r1.next()
            op.l r2 = (op.l) r2
            long r2 = r2.f32909b
            long r4 = r8.f32909b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L74
            r10 = r6
        L89:
            op.c r1 = r0.f40407c
            if (r1 == 0) goto L91
            java.lang.String r1 = r1.f32900e
        L8f:
            r9 = r1
            goto L93
        L91:
            r1 = 0
            goto L8f
        L93:
            kotlin.jvm.functions.Function1 r1 = r0.f40409e
            boolean r2 = r14.f(r1)
            boolean r3 = r14.f(r8)
            r2 = r2 | r3
            java.lang.Object r3 = r14.M()
            if (r2 != 0) goto La8
            m3.f r2 = m3.m.f29332a
            if (r3 != r2) goto Lb1
        La8:
            tp.d r3 = new tp.d
            r2 = 1
            r3.<init>(r1, r8, r2)
            r14.k0(r3)
        Lb1:
            r13 = r3
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            r15 = 0
            r16 = 8
            r11 = 0
            boolean r12 = r0.f40408d
            tp.b.b(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r14.q(r7)
            goto Lc4
        Lc1:
            r14.U()
        Lc4:
            kotlin.Unit r1 = kotlin.Unit.f26487a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tp.g.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
