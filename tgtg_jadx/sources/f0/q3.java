package f0;

import android.util.Log;
import com.google.android.gms.internal.measurement.cg;
import g3.q9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3 f16856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f16857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f16858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v80.b0 f16859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zw.q2 f16860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f16861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f16862g;

    public q3(h0.h hVar, v3 v3Var, d1 d1Var, j1 j1Var, h0.n nVar) {
        hVar.getClass();
        v3Var.getClass();
        d1Var.getClass();
        j1Var.getClass();
        nVar.getClass();
        this.f16856a = v3Var;
        this.f16857b = d1Var;
        this.f16858c = j1Var;
        v80.b0 b0Var = nVar.f20981a;
        this.f16859d = b0Var;
        al.d dVar = new al.d(1, this, q3.class, "prune", "prune$camera_camera2_pipe(Ljava/util/List;)V", 0, 2);
        x70.c cVar = null;
        d8.c cVar2 = new d8.c(this, cVar, 18);
        g9.r0 r0Var = new g9.r0(22);
        zw.q2 q2Var = new zw.q2();
        q2Var.f48333a = dVar;
        q2Var.f48334b = r0Var;
        q2Var.f48335c = cVar2;
        q2Var.f48336d = w.b.p(false);
        q2Var.f48337e = cg.a(Integer.MAX_VALUE, null, new q9(q2Var, 9), 2);
        q2Var.f48338f = new kotlin.collections.t();
        b0Var.getClass();
        if (!((r80.a) q2Var.f48336d).a()) {
            com.braze.h2.b("PruningProcessingQueue cannot be re-started!");
            throw null;
        }
        if (v80.f0.B(b0Var, null, null, new a3.b2(q2Var, cVar, 27), 3).isCancelled()) {
            zw.q2.i(q2Var, null);
        }
        this.f16860e = q2Var;
        this.f16861f = new LinkedHashSet();
        this.f16862g = new ArrayList();
    }

    public final void a(String str) {
        str.getClass();
        t3 t3Var = new t3(str);
        if (((x80.i) this.f16860e.f48337e).h(t3Var) instanceof x80.o) {
            Log.e("CXCP", "Camera close by ID request failed for " + ((Object) e0.s.b(str)) + '!');
            t3Var.f16918b.R(Unit.f26487a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c7, code lost:
    
        com.braze.h2.b("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00dc -> B:44:0x00df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Set r10, z70.c r11) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.q3.b(java.util.Set, z70.c):java.lang.Object");
    }

    public final Unit c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f3 f3Var = (f3) it.next();
            f3Var.f16658c.b();
            this.f16862g.remove(f3Var);
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, java.util.List r6, f0.k0 r7, v80.b0 r8, z70.c r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof f0.k3
            if (r0 == 0) goto L13
            r0 = r9
            f0.k3 r0 = (f0.k3) r0
            int r1 = r0.f16751o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16751o = r1
            goto L18
        L13:
            f0.k3 r0 = new f0.k3
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f16749m
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16751o
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            v80.b0 r8 = r0.l
            java.util.List r6 = r0.f16748k
            java.lang.String r5 = r0.f16747j
            ba0.g.M(r9)
            goto L68
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L34:
            ba0.g.M(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "Opening "
            r9.<init>(r2)
            java.lang.String r2 = e0.s.b(r5)
            r9.append(r2)
            java.lang.String r2 = " with retries..."
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "CXCP"
            android.util.Log.d(r2, r9)
            r0.f16747j = r5
            r0.f16748k = r6
            r0.l = r8
            r0.f16751o = r3
            f0.v3 r9 = r4.f16856a
            f0.x3 r9 = (f0.x3) r9
            f0.d1 r2 = r4.f16857b
            java.lang.Object r9 = r9.b(r5, r2, r7, r0)
            if (r9 != r1) goto L68
            return r1
        L68:
            f0.a3 r9 = (f0.a3) r9
            f0.h r7 = r9.f16566a
            if (r7 != 0) goto L76
            f0.c3 r5 = new f0.c3
            e0.l r6 = r9.f16567b
            r5.<init>(r6)
            return r5
        L76:
            f0.d3 r9 = new f0.d3
            f0.a r0 = new f0.a
            e0.s r1 = new e0.s
            r1.<init>(r5)
            java.util.ArrayList r5 = kotlin.collections.CollectionsKt.e0(r6, r1)
            java.util.Set r5 = kotlin.collections.CollectionsKt.v0(r5)
            c50.p r6 = new c50.p
            r1 = 20
            r6.<init>(r4, r1)
            r0.<init>(r7, r5, r8, r6)
            r9.<init>(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.q3.d(java.lang.String, java.util.List, f0.k0, v80.b0, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (r9.b(r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(f0.r3 r9, z70.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f0.l3
            if (r0 == 0) goto L13
            r0 = r10
            f0.l3 r0 = (f0.l3) r0
            int r1 = r0.f16764m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16764m = r1
            goto L18
        L13:
            f0.l3 r0 = new f0.l3
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f16763k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16764m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r10)
            goto Laa
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L32:
            f0.r3 r9 = r0.f16762j
            ba0.g.M(r10)
            goto L97
        L38:
            ba0.g.M(r10)
            f0.a r10 = r9.f16872a
            f0.h r2 = r10.f16556a
            java.lang.String r2 = r2.f16686a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "PruningCamera2DeviceManager#processRequestClose("
            r5.<init>(r6)
            java.lang.String r2 = e0.s.b(r2)
            r5.append(r2)
            r2 = 41
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r5 = "CXCP"
            android.util.Log.i(r5, r2)
            java.util.LinkedHashSet r2 = r8.f16861f
            boolean r5 = r2.contains(r10)
            if (r5 == 0) goto L68
            r2.remove(r10)
        L68:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r5 = r8.f16862g
            java.util.Iterator r5 = r5.iterator()
        L73:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8c
            java.lang.Object r6 = r5.next()
            r7 = r6
            f0.f3 r7 = (f0.f3) r7
            f0.a r7 = r7.f16657b
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r10)
            if (r7 == 0) goto L73
            r2.add(r6)
            goto L73
        L8c:
            r0.f16762j = r9
            r0.f16764m = r4
            kotlin.Unit r10 = r8.c(r2)
            if (r10 != r1) goto L97
            goto La9
        L97:
            f0.a r10 = r9.f16872a
            r10.c()
            f0.a r9 = r9.f16872a
            r10 = 0
            r0.f16762j = r10
            r0.f16764m = r3
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r1) goto Laa
        La9:
            return r1
        Laa:
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.q3.e(f0.r3, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (c(r6.f16862g) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(f0.s3 r7, z70.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof f0.m3
            if (r0 == 0) goto L13
            r0 = r8
            f0.m3 r0 = (f0.m3) r0
            int r1 = r0.f16777n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16777n = r1
            goto L18
        L13:
            f0.m3 r0 = new f0.m3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16777n
            r3 = 2
            r4 = 1
            java.util.LinkedHashSet r5 = r6.f16861f
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            java.util.Iterator r7 = r0.f16775k
            f0.s3 r2 = r0.f16774j
            ba0.g.M(r8)
            goto L6e
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L37:
            f0.s3 r7 = r0.f16774j
            ba0.g.M(r8)
            goto L54
        L3d:
            ba0.g.M(r8)
            java.lang.String r8 = "CXCP"
            java.lang.String r2 = "PruningCamera2DeviceManager#processRequestCloseAll()"
            android.util.Log.i(r8, r2)
            r0.f16774j = r7
            r0.f16777n = r4
            java.util.ArrayList r8 = r6.f16862g
            kotlin.Unit r8 = r6.c(r8)
            if (r8 != r1) goto L54
            goto L86
        L54:
            java.util.Iterator r8 = r5.iterator()
        L58:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r8.next()
            f0.a r2 = (f0.a) r2
            r2.c()
            goto L58
        L68:
            java.util.Iterator r8 = r5.iterator()
            r2 = r7
            r7 = r8
        L6e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L87
            java.lang.Object r8 = r7.next()
            f0.a r8 = (f0.a) r8
            r0.f16774j = r2
            r0.f16775k = r7
            r0.f16777n = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L6e
        L86:
            return r1
        L87:
            r5.clear()
            v80.q r7 = r2.f16903a
            kotlin.Unit r8 = kotlin.Unit.f26487a
            r7.R(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.q3.f(f0.s3, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(f0.t3 r9, z70.c r10) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.q3.g(f0.t3, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0269, code lost:
    
        if (b(r10, r0) != r1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x027c, code lost:
    
        if (r11.d(r10, r0) == r1) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138 A[LOOP:3: B:46:0x0132->B:48:0x0138, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(f0.u3 r10, z70.c r11) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.q3.h(f0.u3, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        r11 = r10.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r11 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        r10.c();
        r2.f16841j = r1;
        r2.f16842k = r9;
        r2.l = r3;
        r2.f16843m = r10;
        r2.f16846p = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r10.b(r2) != r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        r12 = r9;
        r9 = r3;
        r3 = r10;
        r10 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0083 -> B:28:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r14, f0.u3 r15, z70.c r16) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.q3.i(java.lang.String, f0.u3, z70.c):java.lang.Object");
    }
}
