package ao;

import android.content.Context;
import com.app.tgtg.model.remote.item.LatLngInfo;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt.c f4508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ft.j f4509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w1 f4512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LatLngInfo f4513f;

    public z1(kt.c cVar, ft.j jVar, Context context) {
        cVar.getClass();
        jVar.getClass();
        this.f4508a = cVar;
        this.f4509b = jVar;
        this.f4510c = context;
        this.f4512e = w1.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.app.tgtg.model.remote.mapService.request.MapClustersRequest r6, boolean r7, z70.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ao.x1
            if (r0 == 0) goto L13
            r0 = r8
            ao.x1 r0 = (ao.x1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.x1 r0 = new ao.x1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f4490j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r6 = r8.f40851a
            return r6
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L35:
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r6 = r8.f40851a
            return r6
        L3d:
            ba0.g.M(r8)
            android.content.Context r8 = r5.f4510c
            kt.c r2 = r5.f4508a
            if (r7 == 0) goto L67
            java.time.ZonedDateTime r7 = java.time.ZonedDateTime.now()
            java.time.ZoneOffset r7 = r7.getOffset()
            java.lang.String r7 = r7.toString()
            r7.getClass()
            boolean r8 = android.text.format.DateFormat.is24HourFormat(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r0.l = r4
            java.lang.Object r6 = r2.b(r6, r7, r8, r0)
            if (r6 != r1) goto L66
            goto L86
        L66:
            return r6
        L67:
            java.time.ZonedDateTime r7 = java.time.ZonedDateTime.now()
            java.time.ZoneOffset r7 = r7.getOffset()
            java.lang.String r7 = r7.toString()
            r7.getClass()
            boolean r8 = android.text.format.DateFormat.is24HourFormat(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r0.l = r3
            java.lang.Object r6 = r2.a(r6, r7, r8, r0)
            if (r6 != r1) goto L87
        L86:
            return r1
        L87:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.z1.a(com.app.tgtg.model.remote.mapService.request.MapClustersRequest, boolean, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:12:0x0026, B:27:0x004e, B:28:0x0056, B:31:0x0066, B:19:0x0036, B:21:0x003a, B:23:0x0040), top: B:35:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(z70.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ao.y1
            if (r0 == 0) goto L13
            r0 = r6
            ao.y1 r0 = (ao.y1) r0
            int r1 = r0.f4501m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4501m = r1
            goto L18
        L13:
            ao.y1 r0 = new ao.y1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f4500k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f4501m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2c
            ao.z1 r0 = r0.f4499j
            ba0.g.M(r6)     // Catch: java.lang.Throwable -> L2a
            goto L4e
        L2a:
            r6 = move-exception
            goto L69
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L33:
            ba0.g.M(r6)
            com.app.tgtg.model.remote.item.LatLngInfo r6 = r5.f4513f     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L40
            ao.w1 r6 = r5.f4512e     // Catch: java.lang.Throwable -> L2a
            ao.w1 r2 = ao.w1.BROWSE     // Catch: java.lang.Throwable -> L2a
            if (r6 != r2) goto L56
        L40:
            ft.j r6 = r5.f4509b     // Catch: java.lang.Throwable -> L2a
            r0.f4499j = r5     // Catch: java.lang.Throwable -> L2a
            r0.f4501m = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = r6.g(r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r5
        L4e:
            com.app.tgtg.model.remote.item.LatLngInfo r6 = (com.app.tgtg.model.remote.item.LatLngInfo) r6     // Catch: java.lang.Throwable -> L2a
            r0.f4513f = r6     // Catch: java.lang.Throwable -> L2a
            ao.w1 r6 = ao.w1.NONE     // Catch: java.lang.Throwable -> L2a
            r5.f4512e = r6     // Catch: java.lang.Throwable -> L2a
        L56:
            com.app.tgtg.model.remote.item.LatLngInfo r6 = r5.f4513f     // Catch: java.lang.Throwable -> L2a
            com.app.tgtg.model.remote.item.LatLngInfo r0 = new com.app.tgtg.model.remote.item.LatLngInfo     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            r0.<init>(r1, r1)     // Catch: java.lang.Throwable -> L2a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L66
            return r3
        L66:
            com.app.tgtg.model.remote.item.LatLngInfo r6 = r5.f4513f     // Catch: java.lang.Throwable -> L2a
            return r6
        L69:
            mv.m0 r0 = sa0.a.f38953a
            java.lang.String r6 = r6.getMessage()
            java.lang.String r1 = "getOfficialLocation error "
            java.lang.String r6 = e0.f.k(r1, r6)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.c(r6, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.z1.b(z70.c):java.lang.Object");
    }
}
