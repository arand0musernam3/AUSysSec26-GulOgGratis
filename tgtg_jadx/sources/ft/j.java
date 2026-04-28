package ft;

import a3.b2;
import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import androidx.core.util.Consumer;
import b0.v;
import com.app.tgtg.model.remote.mapService.GeoLocation;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import mv.r0;
import qz.t;
import qz.u;
import v80.c1;
import v80.f0;
import v80.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static j f17932h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kt.h f17934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t5.a f17935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public st.b f17936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public dn.k f17937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GeoLocation f17938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17939g;

    public j(Context context, kt.h hVar) {
        hVar.getClass();
        this.f17933a = context;
        this.f17934b = hVar;
        this.f17935c = new t5.a(context);
        this.f17936d = new st.b(0.0d, 0.0d);
        this.f17938f = new GeoLocation(0.0d, 0.0d);
        f17932h = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ft.j r6, z70.c r7) throws qg.b {
        /*
            boolean r0 = r7 instanceof ft.i
            if (r0 == 0) goto L13
            r0 = r7
            ft.i r0 = (ft.i) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ft.i r0 = new ft.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f17930j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L28
            ba0.g.M(r7)     // Catch: java.lang.Throwable -> L5f
            goto L41
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2f:
            ba0.g.M(r7)
            boolean r7 = r6.b()
            if (r7 == 0) goto L6a
            r0.l = r4     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r7 = r6.f(r3, r0)     // Catch: java.lang.Throwable -> L5f
            if (r7 != r1) goto L41
            return r1
        L41:
            st.b r7 = (st.b) r7     // Catch: java.lang.Throwable -> L5f
            r6.d(r7)
            com.app.tgtg.model.remote.item.LatLngInfo r6 = new com.app.tgtg.model.remote.item.LatLngInfo
            double r0 = r7.f39278a
            double r4 = r7.f39279b
            r6.<init>(r0, r4)
            boolean r7 = r6.isValid()
            if (r7 == 0) goto L59
            ft.c.k0(r6)
            return r6
        L59:
            qg.b r6 = new qg.b
            r6.<init>(r3)
            throw r6
        L5f:
            qg.b r7 = new qg.b
            boolean r6 = r6.b()
            r6 = r6 ^ r4
            r7.<init>(r6)
            throw r7
        L6a:
            qg.b r7 = new qg.b
            boolean r6 = r6.b()
            r6 = r6 ^ r4
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.j.a(ft.j, z70.c):java.lang.Object");
    }

    public final boolean b() {
        return h() && i();
    }

    public final void c(Activity activity) {
        activity.getClass();
        this.f17935c.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(t5.a.t());
        int i11 = LocationServices.f12120a;
        m00.a aVar = new m00.a(activity, activity, m00.a.f28650b, com.google.android.gms.common.api.d.S, com.google.android.gms.common.api.k.f11084c, 1);
        s00.b bVar = new s00.b(arrayList, false, false);
        t tVarBuilder = u.builder();
        tVarBuilder.f37388a = new se.d(bVar, 29);
        tVarBuilder.f37391d = 2426;
        Task taskDoRead = aVar.doRead(tVarBuilder.a());
        taskDoRead.getClass();
        taskDoRead.d(activity, new mp.a(activity, 14));
    }

    public final void d(st.b bVar) {
        bVar.getClass();
        if (this.f17938f.isSamePlace(bVar) && !r0.v(this.f17939g)) {
            c.l0(this.f17939g);
            return;
        }
        f0.B(c1.f42075a, null, null, new al.n(bVar, this, (x70.c) null, 14), 3);
    }

    public final void e(boolean z11, Consumer consumer) {
        if (b()) {
            c90.f fVar = p0.f42144a;
            f0.B(f0.b(c90.e.f7834b), null, null, new v(this, z11, consumer, (x70.c) null, 3), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r10, z70.c r11) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.j.f(boolean, z70.c):java.lang.Object");
    }

    public final Object g(z70.c cVar) {
        return f0.K(p0.f42144a, new b2(this, null, 21), cVar);
    }

    public final boolean h() {
        Context context = this.f17933a;
        return (androidx.core.app.e.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) || (androidx.core.app.e.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0);
    }

    public final boolean i() {
        Object systemService = this.f17933a.getSystemService("location");
        systemService.getClass();
        LocationManager locationManager = (LocationManager) systemService;
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }
}
