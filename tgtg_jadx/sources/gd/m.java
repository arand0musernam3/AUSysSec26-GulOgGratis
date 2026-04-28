package gd;

import java.util.ArrayList;
import kotlin.Unit;
import z4.g0;
import z4.m1;
import z4.t0;
import z4.v0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements ud.i, g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f20395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f20396b;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, v80.l] */
    @Override // ud.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(x70.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof gd.l
            if (r0 == 0) goto L13
            r0 = r8
            gd.l r0 = (gd.l) r0
            int r1 = r0.f20394m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20394m = r1
            goto L1a
        L13:
            gd.l r0 = new gd.l
            z70.c r8 = (z70.c) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.f20393k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f20394m
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.Ref$ObjectRef r0 = r0.f20392j
            ba0.g.M(r8)     // Catch: java.lang.Throwable -> L2b
            goto L63
        L2b:
            r8 = move-exception
            goto L73
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L34:
            ba0.g.M(r8)
            long r4 = r7.f20395a
            boolean r8 = z5.a.l(r4)
            if (r8 == 0) goto L7f
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            r0.f20392j = r8     // Catch: java.lang.Throwable -> L6f
            r0.f20394m = r3     // Catch: java.lang.Throwable -> L6f
            v80.l r2 = new v80.l     // Catch: java.lang.Throwable -> L6f
            x70.c r0 = y70.f.b(r0)     // Catch: java.lang.Throwable -> L6f
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L6f
            r2.t()     // Catch: java.lang.Throwable -> L6f
            r8.element = r2     // Catch: java.lang.Throwable -> L6f
            java.util.ArrayList r0 = r7.f20396b     // Catch: java.lang.Throwable -> L6f
            r0.add(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r2.s()     // Catch: java.lang.Throwable -> L6f
            if (r0 != r1) goto L62
            return r1
        L62:
            r0 = r8
        L63:
            java.util.ArrayList r8 = r7.f20396b
            T r0 = r0.element
            java.util.Collection r8 = kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(r8)
            r8.remove(r0)
            goto L7f
        L6f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L73:
            java.util.ArrayList r1 = r7.f20396b
            T r0 = r0.element
            java.util.Collection r1 = kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(r1)
            r1.remove(r0)
            throw r8
        L7f:
            long r0 = r7.f20395a
            ud.h r8 = new ud.h
            int r2 = z5.a.i(r0)
            ud.b r3 = ud.b.f41056a
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r4) goto L97
            dx.f.a(r2)
            ud.a r5 = new ud.a
            r5.<init>(r2)
            goto L98
        L97:
            r5 = r3
        L98:
            int r0 = z5.a.h(r0)
            if (r0 == r4) goto La6
            dx.f.a(r0)
            ud.a r3 = new ud.a
            r3.<init>(r0)
        La6:
            r8.<init>(r5, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.m.a(x70.c):java.lang.Object");
    }

    public final void c(long j9) {
        this.f20395a = j9;
        if (z5.a.l(j9)) {
            return;
        }
        ArrayList<x70.c> arrayList = this.f20396b;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f20396b = new ArrayList();
        for (x70.c cVar : arrayList) {
            u70.o oVar = u70.q.f40850b;
            cVar.resumeWith(Unit.f26487a);
        }
    }

    @Override // z4.g0
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final v0 mo964measure3p2s80s(w0 w0Var, t0 t0Var, long j9) {
        c(j9);
        m1 m1VarD = t0Var.D(j9);
        return w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new d2.k(m1VarD, 8));
    }
}
