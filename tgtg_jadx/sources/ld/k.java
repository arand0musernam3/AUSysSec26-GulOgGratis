package ld;

import android.content.Context;
import android.view.Surface;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.collections.n0;
import ky.o;
import m0.b1;
import m0.l0;
import q90.v;
import qc.y;
import s0.e1;
import s0.f1;
import u90.n;
import zc.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f27647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f27648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f27649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f27650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f27651g;

    public k(q90.a aVar, o oVar, n nVar, boolean z11) {
        List listK;
        oVar.getClass();
        this.f27647c = aVar;
        this.f27648d = oVar;
        this.f27646b = z11;
        n0 n0Var = n0.f26529a;
        this.f27649e = n0Var;
        this.f27650f = n0Var;
        this.f27651g = new ArrayList();
        v vVar = aVar.f36408h;
        vVar.getClass();
        URI uriI = vVar.i();
        if (uriI.getHost() == null) {
            listK = r90.g.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = aVar.f36407g.select(uriI);
            listK = (listSelect == null || listSelect.isEmpty()) ? r90.g.k(new Proxy[]{Proxy.NO_PROXY}) : r90.g.j(listSelect);
        }
        this.f27649e = listK;
        this.f27645a = 0;
        listK.getClass();
    }

    @Override // s0.f1
    public m0.n0 a() {
        b1 b1Var;
        synchronized (this.f27647c) {
            m0.n0 n0VarA = ((f1) this.f27648d).a();
            if (n0VarA != null) {
                this.f27645a++;
                b1Var = new b1(n0VarA);
                b1Var.a((l0) this.f27651g);
            } else {
                b1Var = null;
            }
        }
        return b1Var;
    }

    @Override // s0.f1
    public int b() {
        int iB;
        synchronized (this.f27647c) {
            iB = ((f1) this.f27648d).b();
        }
        return iB;
    }

    @Override // s0.f1
    public int c() {
        int iC;
        synchronized (this.f27647c) {
            iC = ((f1) this.f27648d).c();
        }
        return iC;
    }

    @Override // s0.f1
    public void close() {
        synchronized (this.f27647c) {
            try {
                Surface surface = (Surface) this.f27649e;
                if (surface != null) {
                    surface.release();
                }
                ((f1) this.f27648d).close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(zc.k kVar, uc.i iVar) {
        Context context = kVar.f47464a;
        zc.k kVar2 = (zc.k) this.f27647c;
        if (context != kVar2.f47464a) {
            y.j("Interceptor '", iVar, "' cannot modify the request's context.");
            return;
        }
        if (kVar.f47465b == m.f47489a) {
            y.j("Interceptor '", iVar, "' cannot set the request's data to null.");
            return;
        }
        if (kVar.f47466c != kVar2.f47466c) {
            y.j("Interceptor '", iVar, "' cannot modify the request's target.");
        } else if (kVar.f47485w != kVar2.f47485w) {
            y.j("Interceptor '", iVar, "' cannot modify the request's lifecycle.");
        } else {
            if (kVar.f47486x == kVar2.f47486x) {
                return;
            }
            y.j("Interceptor '", iVar, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        }
    }

    @Override // s0.f1
    public void e() {
        synchronized (this.f27647c) {
            ((f1) this.f27648d).e();
        }
    }

    public boolean f() {
        return this.f27645a < ((List) this.f27649e).size() || !((ArrayList) this.f27651g).isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(z70.c r13) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f27647c
            r2 = r0
            td.i r2 = (td.i) r2
            int r0 = r12.f27645a
            boolean r1 = r13 instanceof ld.j
            if (r1 == 0) goto L1b
            r1 = r13
            ld.j r1 = (ld.j) r1
            int r3 = r1.f27644m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r1.f27644m = r3
        L19:
            r13 = r1
            goto L21
        L1b:
            ld.j r1 = new ld.j
            r1.<init>(r12, r13)
            goto L19
        L21:
            java.lang.Object r1 = r13.f27643k
            y70.a r9 = y70.a.COROUTINE_SUSPENDED
            int r3 = r13.f27644m
            r10 = 1
            if (r3 == 0) goto L39
            if (r3 != r10) goto L32
            ld.i r13 = r13.f27642j
            ba0.g.M(r1)
            goto L73
        L32:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r13)
        L37:
            r13 = 0
            return r13
        L39:
            ba0.g.M(r1)
            java.lang.Object r1 = r12.f27649e
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r0)
            r11 = r1
            ld.i r11 = (ld.i) r11
            int r4 = r0 + 1
            java.lang.Object r0 = r12.f27648d
            r5 = r0
            td.i r5 = (td.i) r5
            java.lang.Object r0 = r12.f27650f
            r6 = r0
            ud.h r6 = (ud.h) r6
            ld.k r1 = new ld.k
            java.lang.Object r0 = r12.f27649e
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r12.f27651g
            r7 = r0
            fd.g r7 = (fd.g) r7
            boolean r8 = r12.f27646b
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.f27642j = r11
            r13.f27644m = r10
            r0 = r11
            ld.g r0 = (ld.g) r0
            java.lang.Object r1 = r0.d(r1, r13)
            if (r1 != r9) goto L72
            return r9
        L72:
            r13 = r0
        L73:
            td.l r1 = (td.l) r1
            td.i r0 = r1.e()
            android.content.Context r3 = r0.f39996a
            android.content.Context r4 = r2.f39996a
            java.lang.String r5 = "Interceptor '"
            if (r3 != r4) goto La6
            java.lang.Object r3 = r0.f39997b
            td.n r4 = td.n.f40029a
            if (r3 == r4) goto La0
            xd.b r3 = r0.f39998c
            xd.b r4 = r2.f39998c
            if (r3 != r4) goto L9a
            ud.i r0 = r0.f40010p
            ud.i r2 = r2.f40010p
            if (r0 != r2) goto L94
            return r1
        L94:
            java.lang.String r0 = "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead."
            qc.y.j(r5, r13, r0)
            goto L37
        L9a:
            java.lang.String r0 = "' cannot modify the request's target."
            qc.y.j(r5, r13, r0)
            goto L37
        La0:
            java.lang.String r0 = "' cannot set the request's data to null."
            qc.y.j(r5, r13, r0)
            goto L37
        La6:
            java.lang.String r0 = "' cannot modify the request's context."
            qc.y.j(r5, r13, r0)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.k.g(z70.c):java.lang.Object");
    }

    @Override // s0.f1
    public int getHeight() {
        int height;
        synchronized (this.f27647c) {
            height = ((f1) this.f27648d).getHeight();
        }
        return height;
    }

    @Override // s0.f1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f27647c) {
            surface = ((f1) this.f27648d).getSurface();
        }
        return surface;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(zc.k r17, z70.c r18) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.Object r2 = r0.f27649e
            java.util.List r2 = (java.util.List) r2
            int r3 = r0.f27645a
            boolean r4 = r1 instanceof uc.j
            if (r4 == 0) goto L1d
            r4 = r1
            uc.j r4 = (uc.j) r4
            int r5 = r4.f41054n
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1d
            int r5 = r5 - r6
            r4.f41054n = r5
            goto L22
        L1d:
            uc.j r4 = new uc.j
            r4.<init>(r0, r1)
        L22:
            java.lang.Object r1 = r4.l
            y70.a r5 = y70.a.COROUTINE_SUSPENDED
            int r6 = r4.f41054n
            r7 = 1
            if (r6 == 0) goto L3c
            if (r6 != r7) goto L35
            uc.i r2 = r4.f41052k
            ld.k r3 = r4.f41051j
            ba0.g.M(r1)
            goto L85
        L35:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L3c:
            ba0.g.M(r1)
            if (r3 <= 0) goto L4f
            int r1 = r3 + (-1)
            java.lang.Object r1 = r2.get(r1)
            uc.i r1 = (uc.i) r1
            r12 = r17
            r0.d(r12, r1)
            goto L51
        L4f:
            r12 = r17
        L51:
            java.lang.Object r1 = r2.get(r3)
            uc.i r1 = (uc.i) r1
            int r11 = r3 + 1
            java.lang.Object r2 = r0.f27650f
            r13 = r2
            ad.h r13 = (ad.h) r13
            ld.k r8 = new ld.k
            java.lang.Object r2 = r0.f27647c
            r9 = r2
            zc.k r9 = (zc.k) r9
            java.lang.Object r2 = r0.f27649e
            r10 = r2
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r2 = r0.f27651g
            r14 = r2
            pc.b r14 = (pc.b) r14
            boolean r15 = r0.f27646b
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r4.f41051j = r0
            r4.f41052k = r1
            r4.f41054n = r7
            r2 = r1
            uc.h r2 = (uc.h) r2
            java.lang.Object r1 = r2.d(r8, r4)
            if (r1 != r5) goto L84
            return r5
        L84:
            r3 = r0
        L85:
            zc.l r1 = (zc.l) r1
            zc.k r4 = r1.b()
            r3.d(r4, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.k.h(zc.k, z70.c):java.lang.Object");
    }

    @Override // s0.f1
    public int i() {
        int i11;
        synchronized (this.f27647c) {
            i11 = ((f1) this.f27648d).i();
        }
        return i11;
    }

    @Override // s0.f1
    public m0.n0 j() {
        b1 b1Var;
        synchronized (this.f27647c) {
            m0.n0 n0VarJ = ((f1) this.f27648d).j();
            if (n0VarJ != null) {
                this.f27645a++;
                b1Var = new b1(n0VarJ);
                b1Var.a((l0) this.f27651g);
            } else {
                b1Var = null;
            }
        }
        return b1Var;
    }

    @Override // s0.f1
    public void k(e1 e1Var, Executor executor) {
        synchronized (this.f27647c) {
            ((f1) this.f27648d).k(new a50.d(21, this, e1Var), executor);
        }
    }

    public void l() {
        synchronized (this.f27647c) {
            try {
                this.f27646b = true;
                ((f1) this.f27648d).e();
                if (this.f27645a == 0) {
                    close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ k(Object obj, List list, int i11, Object obj2, Object obj3, Object obj4, boolean z11) {
        this.f27647c = obj;
        this.f27649e = list;
        this.f27645a = i11;
        this.f27648d = obj2;
        this.f27650f = obj3;
        this.f27651g = obj4;
        this.f27646b = z11;
    }

    public k(f1 f1Var) {
        this.f27647c = new Object();
        this.f27645a = 0;
        this.f27646b = false;
        this.f27651g = new l0(this);
        this.f27648d = f1Var;
        this.f27649e = f1Var.getSurface();
    }
}
