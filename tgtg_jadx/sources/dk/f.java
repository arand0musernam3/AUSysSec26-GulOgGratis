package dk;

import androidx.lifecycle.l1;
import androidx.lifecycle.o0;
import ao.m0;
import ao.r1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldk/f;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f14956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f14957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cv.b f14958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rg.d f14959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ck.a f14960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f14961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0 f14962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o0 f14963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o0 f14964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o0 f14965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o0 f14966k;
    public final o0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f14967m;

    public f(r1 r1Var, m0 m0Var, cv.b bVar, rg.d dVar, ck.a aVar) {
        r1Var.getClass();
        m0Var.getClass();
        bVar.getClass();
        dVar.getClass();
        aVar.getClass();
        this.f14956a = r1Var;
        this.f14957b = m0Var;
        this.f14958c = bVar;
        this.f14959d = dVar;
        this.f14960e = aVar;
        o0 o0Var = new o0();
        this.f14961f = o0Var;
        this.f14962g = o0Var;
        o0 o0Var2 = new o0();
        this.f14963h = o0Var2;
        this.f14964i = o0Var2;
        o0 o0Var3 = new o0();
        this.f14965j = o0Var3;
        this.f14966k = o0Var3;
        this.l = new o0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(dk.f r5, java.lang.String r6, z70.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof dk.e
            if (r0 == 0) goto L13
            r0 = r7
            dk.e r0 = (dk.e) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            dk.e r0 = new dk.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f14954j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ba0.g.M(r7)
            u70.q r7 = (u70.q) r7
            java.lang.Object r6 = r7.f40851a
            goto L45
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            return r3
        L32:
            ba0.g.M(r7)
            ao.r1 r7 = r5.f14956a
            com.app.tgtg.model.remote.discover.request.BucketFillerType r2 = new com.app.tgtg.model.remote.discover.request.BucketFillerType
            r2.<init>(r6)
            r0.l = r4
            java.lang.Object r6 = r7.p(r2, r3, r4, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            u70.o r7 = u70.q.f40850b
            boolean r7 = r6 instanceof u70.p
            if (r7 != 0) goto L80
            r7 = r6
            com.app.tgtg.model.remote.discover.response.DiscoverSingleBucketResponse r7 = (com.app.tgtg.model.remote.discover.response.DiscoverSingleBucketResponse) r7
            com.app.tgtg.model.remote.discover.response.DiscoverBucket r7 = r7.getBucket()
            if (r7 == 0) goto L58
            java.util.ArrayList r3 = r7.getItems()
        L58:
            if (r3 == 0) goto L7d
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L61
            goto L7d
        L61:
            if (r7 == 0) goto L68
            androidx.lifecycle.o0 r0 = r5.f14961f
            r0.k(r7)
        L68:
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r7.<init>(r0)
            d1.e r0 = new d1.e
            r1 = 2
            r0.<init>(r5, r1)
            r1 = 500(0x1f4, double:2.47E-321)
            r7.postDelayed(r0, r1)
            goto L80
        L7d:
            r5.b()
        L80:
            java.lang.Throwable r6 = u70.q.a(r6)
            if (r6 == 0) goto L96
            androidx.lifecycle.o0 r7 = r5.f14963h
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.k(r0)
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L95
            r5.b()
            goto L96
        L95:
            throw r6
        L96:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dk.f.a(dk.f, java.lang.String, z70.c):java.lang.Object");
    }

    public final void b() {
        this.f14963h.k(Boolean.FALSE);
        this.f14965j.k(Boolean.TRUE);
    }
}
