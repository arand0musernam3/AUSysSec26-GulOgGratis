package nh;

import android.content.Context;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import ft.j;
import lh.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mh.a f30852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f30853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f30854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DiscoverBucket f30855e;

    public b(Context context, mh.a aVar, j jVar, e0 e0Var) {
        this.f30851a = context;
        this.f30852b = aVar;
        this.f30853c = jVar;
        this.f30854d = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(nh.b r11, com.app.tgtg.model.remote.discover.request.BucketFillerType r12, java.util.ArrayList r13, z70.c r14) {
        /*
            r11.getClass()
            boolean r0 = r14 instanceof nh.a
            if (r0 == 0) goto L16
            r0 = r14
            nh.a r0 = (nh.a) r0
            int r1 = r0.f30850n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f30850n = r1
            goto L1b
        L16:
            nh.a r0 = new nh.a
            r0.<init>(r11, r14)
        L1b:
            java.lang.Object r14 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f30850n
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            java.util.ArrayList r13 = r0.f30848k
            com.app.tgtg.model.remote.discover.request.BucketFillerType r12 = r0.f30847j
            ba0.g.M(r14)
        L2d:
            r6 = r12
            r8 = r13
            goto L49
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L37:
            ba0.g.M(r14)
            ft.j r11 = r11.f30853c
            r0.f30847j = r12
            r0.f30848k = r13
            r0.f30850n = r3
            java.lang.Object r14 = r11.g(r0)
            if (r14 != r1) goto L2d
            return r1
        L49:
            r3 = r14
            com.app.tgtg.model.remote.item.LatLngInfo r3 = (com.app.tgtg.model.remote.item.LatLngInfo) r3
            double r11 = mv.r0.k()
            java.lang.Double r4 = new java.lang.Double
            r4.<init>(r11)
            com.app.tgtg.model.remote.discover.request.DiscoverSingleBucketRequest r2 = new com.app.tgtg.model.remote.discover.request.DiscoverSingleBucketRequest
            r5 = 0
            r7 = 0
            r9 = 20
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.b.a(nh.b, com.app.tgtg.model.remote.discover.request.BucketFillerType, java.util.ArrayList, z70.c):java.lang.Object");
    }
}
