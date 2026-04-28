package ao;

import android.content.Context;
import android.text.format.DateFormat;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.CateringItem;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.item.response.HeroComponentResponse;
import com.app.tgtg.model.remote.item.response.Item;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import com.app.tgtg.model.remote.item.response.TableReservationItem;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kt.f f4418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kt.c f4419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kt.i f4420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kt.d f4421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g3 f4422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft.j f4423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wj.d f4424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final cv.b f4425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ft.b f4426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HeroComponentResponse f4427k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f4428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DiscoverBucket f4430o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f4431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f4432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e90.c f4433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f4434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4435t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public nq.c f4436u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public u70.q f4437v;

    public r1(Context context, kt.f fVar, kt.c cVar, kt.i iVar, kt.d dVar, g3 g3Var, ft.j jVar, wj.d dVar2, cv.b bVar, ft.b bVar2, qb.e eVar) {
        fVar.getClass();
        cVar.getClass();
        iVar.getClass();
        dVar.getClass();
        g3Var.getClass();
        jVar.getClass();
        dVar2.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.f4417a = context;
        this.f4418b = fVar;
        this.f4419c = cVar;
        this.f4420d = iVar;
        this.f4421e = dVar;
        this.f4422f = g3Var;
        this.f4423g = jVar;
        this.f4424h = dVar2;
        this.f4425i = bVar;
        this.f4426j = bVar2;
        this.f4433r = e90.d.a();
    }

    public static String l() {
        String string = ZonedDateTime.now().getOffset().toString();
        string.getClass();
        return string;
    }

    public static boolean m(DiscoverBucket discoverBucket) {
        ArrayList<BasicItem> items = discoverBucket.getItems();
        if (items == null || items.isEmpty()) {
            return false;
        }
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            if (((BasicItem) it.next()).getItemsAvailable() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.z0
            if (r0 == 0) goto L13
            r0 = r6
            ao.z0 r0 = (ao.z0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.z0 r0 = new ao.z0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4506j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            r0.l = r3
            kt.f r6 = r4.f4418b
            java.lang.Object r5 = r6.c(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.a(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.a1
            if (r0 == 0) goto L13
            r0 = r6
            ao.a1 r0 = (ao.a1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.a1 r0 = new ao.a1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4176j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            r0.l = r3
            kt.f r6 = r4.f4418b
            java.lang.Object r5 = r6.b(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.b(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(boolean r22, java.util.List r23, z70.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.c(boolean, java.util.List, z70.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.app.tgtg.model.remote.discover.request.DiscoverSingleBucketRequest r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.c1
            if (r0 == 0) goto L13
            r0 = r6
            ao.c1 r0 = (ao.c1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.c1 r0 = new ao.c1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4201j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            java.lang.String r6 = l()
            java.lang.String r2 = r4.f()
            r0.l = r3
            kt.c r3 = r4.f4419c
            java.lang.Object r5 = r3.e(r5, r6, r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.d(com.app.tgtg.model.remote.discover.request.DiscoverSingleBucketRequest, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(pt.b r11, z70.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ao.d1
            if (r0 == 0) goto L13
            r0 = r12
            ao.d1 r0 = (ao.d1) r0
            int r1 = r0.f4218n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4218n = r1
            goto L18
        L13:
            ao.d1 r0 = new ao.d1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f4218n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            com.app.tgtg.model.remote.discover.response.DiscoverSingleBucketResponse r11 = r0.f4216k
            ba0.g.M(r12)
            goto L7e
        L2c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L33:
            pt.b r11 = r0.f4215j
            ba0.g.M(r12)
            u70.q r12 = (u70.q) r12
            java.lang.Object r12 = r12.f40851a
        L3c:
            r5 = r11
            goto L5b
        L3e:
            ba0.g.M(r12)
            com.app.tgtg.model.remote.discover.request.BucketFillerType r12 = new com.app.tgtg.model.remote.discover.request.BucketFillerType
            java.lang.String r2 = "Favorites"
            r12.<init>(r2)
            com.app.tgtg.model.remote.discover.request.SingleBucketPaging r2 = new com.app.tgtg.model.remote.discover.request.SingleBucketPaging
            r5 = 100
            r6 = 0
            r2.<init>(r6, r5)
            r0.f4215j = r11
            r0.f4218n = r4
            java.lang.Object r12 = r10.p(r12, r2, r6, r0)
            if (r12 != r1) goto L3c
            goto L7c
        L5b:
            java.lang.Throwable r11 = u70.q.a(r12)
            r8 = 0
            if (r11 != 0) goto L83
            r7 = r12
            com.app.tgtg.model.remote.discover.response.DiscoverSingleBucketResponse r7 = (com.app.tgtg.model.remote.discover.response.DiscoverSingleBucketResponse) r7
            c90.f r11 = v80.p0.f42144a
            w80.c r11 = a90.p.f1044a
            ao.e1 r4 = new ao.e1
            r9 = 0
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f4215j = r8
            r0.f4216k = r7
            r0.f4218n = r3
            java.lang.Object r11 = v80.f0.K(r11, r4, r0)
            if (r11 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r11 = r7
        L7e:
            com.app.tgtg.model.remote.discover.response.DiscoverBucket r11 = r11.getBucket()
            return r11
        L83:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.e(pt.b, z70.c):java.lang.Object");
    }

    public final String f() {
        return String.valueOf(DateFormat.is24HourFormat(this.f4417a));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r7, z70.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ao.f1
            if (r0 == 0) goto L13
            r0 = r8
            ao.f1 r0 = (ao.f1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.f1 r0 = new ao.f1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f4243j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            ba0.g.M(r8)
            goto L44
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            return r3
        L2e:
            ba0.g.M(r8)
            c90.f r8 = v80.p0.f42144a
            c90.e r8 = c90.e.f7834b
            ao.g1 r2 = new ao.g1
            r5 = 0
            r2.<init>(r6, r7, r3, r5)
            r0.l = r4
            java.lang.Object r8 = v80.f0.K(r8, r2, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            u70.q r8 = (u70.q) r8
            java.lang.Object r7 = r8.f40851a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.g(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.app.tgtg.model.remote.item.requests.ListItemRequest r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.h1
            if (r0 == 0) goto L13
            r0 = r6
            ao.h1 r0 = (ao.h1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.h1 r0 = new ao.h1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4300j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            java.lang.String r6 = l()
            java.lang.String r2 = r4.f()
            r0.l = r3
            kt.f r3 = r4.f4418b
            java.lang.Object r5 = r3.f(r5, r6, r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.h(com.app.tgtg.model.remote.item.requests.ListItemRequest, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.app.tgtg.model.remote.manufacturer.request.BasketRequest r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.i1
            if (r0 == 0) goto L13
            r0 = r6
            ao.i1 r0 = (ao.i1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.i1 r0 = new ao.i1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4312j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            r0.l = r3
            kt.i r6 = r4.f4420d
            java.lang.Object r5 = r6.d(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.i(com.app.tgtg.model.remote.manufacturer.request.BasketRequest, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.app.tgtg.model.remote.manufacturer.request.MnuRecommendationsRequest r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.j1
            if (r0 == 0) goto L13
            r0 = r6
            ao.j1 r0 = (ao.j1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.j1 r0 = new ao.j1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4321j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            r0.l = r3
            kt.i r6 = r4.f4420d
            java.lang.Object r5 = r6.c(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.j(com.app.tgtg.model.remote.manufacturer.request.MnuRecommendationsRequest, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.app.tgtg.model.remote.item.requests.RecommendationsListRequest r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.k1
            if (r0 == 0) goto L13
            r0 = r6
            ao.k1 r0 = (ao.k1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.k1 r0 = new ao.k1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4332j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            java.lang.String r6 = l()
            java.lang.String r2 = r4.f()
            r0.l = r3
            kt.f r3 = r4.f4418b
            java.lang.Object r5 = r3.g(r5, r6, r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.k(com.app.tgtg.model.remote.item.requests.RecommendationsListRequest, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.util.ArrayList r6, java.util.List r7, z70.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ao.l1
            if (r0 == 0) goto L13
            r0 = r8
            ao.l1 r0 = (ao.l1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.l1 r0 = new ao.l1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f4341j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            ba0.g.M(r8)
            goto L43
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            return r3
        L2e:
            ba0.g.M(r8)
            c90.f r8 = v80.p0.f42144a
            c90.e r8 = c90.e.f7834b
            j r2 = new j
            r2.<init>(r5, r6, r7, r3)
            r0.l = r4
            java.lang.Object r8 = v80.f0.K(r8, r2, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            u70.q r8 = (u70.q) r8
            java.lang.Object r6 = r8.f40851a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.n(java.util.ArrayList, java.util.List, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(com.app.tgtg.model.remote.manufacturer.request.ManufacturerItemsV2Request r9, z70.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ao.m1
            if (r0 == 0) goto L13
            r0 = r10
            ao.m1 r0 = (ao.m1) r0
            int r1 = r0.f4362m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4362m = r1
            goto L18
        L13:
            ao.m1 r0 = new ao.m1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f4361k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f4362m
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            ao.r1 r9 = r0.f4360j
            ba0.g.M(r10)
            u70.q r10 = (u70.q) r10
            java.lang.Object r10 = r10.f40851a
            goto L6a
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L34:
            ba0.g.M(r10)
            java.lang.String r10 = r9.getSearchQuery()
            int r10 = r10.length()
            if (r10 <= 0) goto L4a
            long r4 = java.lang.System.currentTimeMillis()
            r8.f4432q = r4
            r10 = 0
            r8.f4437v = r10
        L4a:
            u70.q r10 = r8.f4437v
            if (r10 == 0) goto L5c
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r8.f4432q
            long r4 = r4 - r6
            r6 = 180000(0x2bf20, double:8.8932E-319)
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L7a
        L5c:
            r0.f4360j = r8
            r0.f4362m = r3
            kt.i r10 = r8.f4420d
            java.lang.Object r10 = r10.a(r9, r0)
            if (r10 != r1) goto L69
            return r1
        L69:
            r9 = r8
        L6a:
            u70.q r0 = new u70.q
            r0.<init>(r10)
            r9.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            r9.f4432q = r1
            r9.f4437v = r0
        L7a:
            u70.q r9 = r8.f4437v
            r9.getClass()
            java.lang.Object r9 = r9.f40851a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.o(com.app.tgtg.model.remote.manufacturer.request.ManufacturerItemsV2Request, z70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(com.app.tgtg.model.remote.discover.request.BucketFillerType r17, com.app.tgtg.model.remote.discover.request.SingleBucketPaging r18, boolean r19, z70.c r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            boolean r2 = r1 instanceof ao.n1
            if (r2 == 0) goto L17
            r2 = r1
            ao.n1 r2 = (ao.n1) r2
            int r3 = r2.f4374p
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f4374p = r3
            goto L1c
        L17:
            ao.n1 r2 = new ao.n1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f4372n
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.f4374p
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L47
            if (r4 == r6) goto L39
            if (r4 != r5) goto L32
            ba0.g.M(r1)
            u70.q r1 = (u70.q) r1
            java.lang.Object r1 = r1.f40851a
            return r1
        L32:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L39:
            boolean r4 = r2.f4371m
            ao.r1 r6 = r2.l
            com.app.tgtg.model.remote.discover.request.SingleBucketPaging r7 = r2.f4370k
            com.app.tgtg.model.remote.discover.request.BucketFillerType r8 = r2.f4369j
            ba0.g.M(r1)
            r10 = r7
            r11 = r8
            goto L68
        L47:
            ba0.g.M(r1)
            r1 = r17
            r2.f4369j = r1
            r4 = r18
            r2.f4370k = r4
            r2.l = r0
            r7 = r19
            r2.f4371m = r7
            r2.f4374p = r6
            ft.j r6 = r0.f4423g
            java.lang.Object r6 = r6.g(r2)
            if (r6 != r3) goto L63
            goto Lbb
        L63:
            r11 = r1
            r10 = r4
            r1 = r6
            r4 = r7
            r6 = r0
        L68:
            r8 = r1
            com.app.tgtg.model.remote.item.LatLngInfo r8 = (com.app.tgtg.model.remote.item.LatLngInfo) r8
            double r12 = mv.r0.k()
            if (r4 == 0) goto L98
            ft.b r1 = r0.f4426j
            java.util.LinkedHashSet r1 = r1.f17903c
            java.util.ArrayList r7 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.e0.o(r1, r9)
            r7.<init>(r9)
            java.util.Iterator r1 = r1.iterator()
        L84:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L9a
            java.lang.Object r9 = r1.next()
            com.app.tgtg.model.remote.item.QuickFilter r9 = (com.app.tgtg.model.remote.item.QuickFilter) r9
            java.lang.String r9 = r9.getId()
            r7.add(r9)
            goto L84
        L98:
            kotlin.collections.n0 r7 = kotlin.collections.n0.f26529a
        L9a:
            com.app.tgtg.model.remote.discover.request.DiscoverSingleBucketRequest r1 = new com.app.tgtg.model.remote.discover.request.DiscoverSingleBucketRequest
            java.lang.Double r9 = new java.lang.Double
            r9.<init>(r12)
            r14 = 16
            r15 = 0
            r12 = 0
            r13 = r7
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = 0
            r2.f4369j = r1
            r2.f4370k = r1
            r2.l = r1
            r2.f4371m = r4
            r2.f4374p = r5
            java.lang.Object r1 = r6.d(r7, r2)
            if (r1 != r3) goto Lbc
        Lbb:
            return r3
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.p(com.app.tgtg.model.remote.discover.request.BucketFillerType, com.app.tgtg.model.remote.discover.request.SingleBucketPaging, boolean, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.o1
            if (r0 == 0) goto L13
            r0 = r6
            ao.o1 r0 = (ao.o1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.o1 r0 = new ao.o1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4383j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            r0.l = r3
            kt.f r6 = r4.f4418b
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.q(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.String r6, boolean r7, java.lang.String r8, z70.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof ao.p1
            if (r0 == 0) goto L13
            r0 = r9
            ao.p1 r0 = (ao.p1) r0
            int r1 = r0.f4396n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4396n = r1
            goto L18
        L13:
            ao.p1 r0 = new ao.p1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f4396n
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L30
            boolean r7 = r0.f4394k
            java.lang.String r6 = r0.f4393j
            ba0.g.M(r9)
            u70.q r9 = (u70.q) r9
            java.lang.Object r8 = r9.f40851a
            goto L4d
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            return r3
        L36:
            ba0.g.M(r9)
            com.app.tgtg.model.remote.item.requests.SetFavoriteRequest r9 = new com.app.tgtg.model.remote.item.requests.SetFavoriteRequest
            r9.<init>(r7, r8, r3)
            r0.f4393j = r6
            r0.f4394k = r7
            r0.f4396n = r4
            kt.d r8 = r5.f4421e
            java.lang.Object r8 = r8.c(r6, r9, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            u70.o r9 = u70.q.f40850b
            boolean r9 = r8 instanceof u70.p
            if (r9 != 0) goto L5d
            r9 = r8
            q90.r0 r9 = (q90.r0) r9
            wj.d r9 = r5.f4424h
            r9.f(r6, r7)
            r5.f4429n = r4
        L5d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.r(java.lang.String, boolean, java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(com.app.tgtg.model.remote.item.response.BasicItem r8, z70.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ao.q1
            if (r0 == 0) goto L13
            r0 = r9
            ao.q1 r0 = (ao.q1) r0
            int r1 = r0.f4408m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4408m = r1
            goto L18
        L13:
            ao.q1 r0 = new ao.q1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f4407k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f4408m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            com.app.tgtg.model.remote.item.response.BasicItem r8 = r0.f4406j
            ba0.g.M(r9)
            u70.q r9 = (u70.q) r9
            java.lang.Object r9 = r9.f40851a
            goto L5e
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            return r3
        L34:
            ba0.g.M(r9)
            com.app.tgtg.model.remote.item.BasicItemInformation r9 = r8.getInformation()
            java.lang.String r9 = r9.mo340getItemIdFvU5WIY()
            com.app.tgtg.model.remote.item.requests.SetFavoriteRequest r2 = new com.app.tgtg.model.remote.item.requests.SetFavoriteRequest
            boolean r5 = r8.getFavorite()
            r5 = r5 ^ r4
            com.app.tgtg.model.remote.item.StoreInformation r6 = mv.d.m(r8)
            java.lang.String r6 = r6.m370getStoreId7QsYvu8()
            r2.<init>(r5, r6, r3)
            r0.f4406j = r8
            r0.f4408m = r4
            kt.d r3 = r7.f4421e
            java.lang.Object r9 = r3.c(r9, r2, r0)
            if (r9 != r1) goto L5e
            return r1
        L5e:
            u70.o r0 = u70.q.f40850b
            boolean r0 = r9 instanceof u70.p
            if (r0 != 0) goto L7b
            r0 = r9
            q90.r0 r0 = (q90.r0) r0
            com.app.tgtg.model.remote.item.BasicItemInformation r0 = r8.getInformation()
            java.lang.String r0 = r0.mo340getItemIdFvU5WIY()
            boolean r8 = r8.getFavorite()
            r8 = r8 ^ r4
            wj.d r1 = r7.f4424h
            r1.f(r0, r8)
            r7.f4429n = r4
        L7b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r1.s(com.app.tgtg.model.remote.item.response.BasicItem, z70.c):java.lang.Object");
    }

    public final boolean t() {
        nq.c cVar = this.f4436u;
        return cVar == null || cVar.f31351a.size() == 0 || this.f4431p == 0 || System.currentTimeMillis() - this.f4431p > 600000;
    }

    public final void u(BasicItem basicItem) {
        ArrayList<DiscoverBucket> arrayList;
        BasicItem basicItem2;
        int i11;
        BasicItem basicItemCopy$default;
        basicItem.getClass();
        nq.c cVar = this.f4436u;
        if (cVar != null) {
            ArrayList arrayList2 = cVar.f31351a;
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof DiscoverBucket) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            for (DiscoverBucket discoverBucket : arrayList) {
                ArrayList<BasicItem> items = discoverBucket.getItems();
                if (items != null) {
                    int i12 = 0;
                    basicItem2 = null;
                    i11 = -1;
                    for (Object obj2 : items) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            kotlin.collections.d0.n();
                            throw null;
                        }
                        BasicItem basicItem3 = (BasicItem) obj2;
                        if (ItemId.m201equalsimpl0(basicItem3.getInformation().mo340getItemIdFvU5WIY(), basicItem.getInformation().mo340getItemIdFvU5WIY())) {
                            i11 = i12;
                            basicItem2 = basicItem3;
                        }
                        i12 = i13;
                    }
                } else {
                    basicItem2 = null;
                    i11 = -1;
                }
                if (i11 != -1 && basicItem2 != null) {
                    if (basicItem instanceof Item) {
                        basicItemCopy$default = Item.copy$default((Item) basicItem, null, null, 0.0d, null, 0, false, null, null, null, null, null, false, false, null, 0, null, null, false, null, basicItem2.getItemTags(), null, null, null, null, 16252927, null);
                    } else if (basicItem instanceof FlashSalesItem) {
                        basicItemCopy$default = FlashSalesItem.copy$default((FlashSalesItem) basicItem, null, null, 0.0d, null, 0, false, null, null, null, null, null, false, false, null, 0, null, null, false, null, basicItem2.getItemTags(), null, null, null, 7864319, null);
                    } else if (basicItem instanceof CharityItem) {
                        basicItemCopy$default = CharityItem.copy$default((CharityItem) basicItem, null, null, 0.0d, null, 0, false, null, null, null, null, null, false, false, null, 0, null, null, false, null, basicItem2.getItemTags(), null, null, null, 7864319, null);
                    } else if (basicItem instanceof CateringItem) {
                        basicItemCopy$default = CateringItem.copy$default((CateringItem) basicItem, null, null, null, null, null, 0, 0.0d, false, false, null, null, null, null, 0, null, null, false, basicItem2.getItemTags(), null, null, null, 1966079, null);
                    } else if (basicItem instanceof ManufacturerItem) {
                        basicItemCopy$default = ManufacturerItem.copy$default((ManufacturerItem) basicItem, null, null, null, null, null, 0, 0.0d, false, false, null, null, null, null, 0, null, null, false, basicItem2.getItemTags(), null, null, null, 1966079, null);
                    } else {
                        if (!(basicItem instanceof TableReservationItem)) {
                            e40.a.f();
                            return;
                        }
                        basicItemCopy$default = TableReservationItem.copy$default((TableReservationItem) basicItem, null, null, 0.0d, null, 0, false, null, null, null, null, null, false, false, null, 0, null, null, false, null, basicItem2.getItemTags(), null, null, null, null, 16252927, null);
                    }
                    ArrayList<BasicItem> items2 = discoverBucket.getItems();
                    if (items2 != null) {
                        items2.remove(i11);
                    }
                    ArrayList<BasicItem> items3 = discoverBucket.getItems();
                    if (items3 != null) {
                        items3.add(i11, basicItemCopy$default);
                    }
                }
            }
        }
    }
}
