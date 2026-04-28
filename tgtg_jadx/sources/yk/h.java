package yk;

import androidx.lifecycle.l1;
import ao.g3;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.user.response.Address;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import op.l;
import y80.a2;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyk/h;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNewLocationPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewLocationPickerViewModel.kt\ncom/app/tgtg/feature/locationpicker/newlocationpicker/NewLocationPickerViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,470:1\n1#2:471\n1915#3,2:472\n1807#3,3:474\n1807#3,3:477\n1807#3,3:480\n1807#3,3:483\n*S KotlinDebug\n*F\n+ 1 NewLocationPickerViewModel.kt\ncom/app/tgtg/feature/locationpicker/newlocationpicker/NewLocationPickerViewModel\n*L\n88#1:472,2\n417#1:474,3\n422#1:477,3\n427#1:480,3\n432#1:483,3\n*E\n"})
public final class h extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg.c f46128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f46129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3 f46130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.j f46131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wk.a f46132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cv.b f46133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f46134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f46135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2 f46136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2 f46137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f46138k;

    public h(tg.c cVar, f fVar, g3 g3Var, ft.j jVar, wk.a aVar, cv.b bVar) {
        cVar.getClass();
        fVar.getClass();
        g3Var.getClass();
        jVar.getClass();
        aVar.getClass();
        bVar.getClass();
        this.f46128a = cVar;
        this.f46129b = fVar;
        this.f46130c = g3Var;
        this.f46131d = jVar;
        this.f46132e = aVar;
        this.f46133f = bVar;
        a2 a2VarC = r.c(vg.b.CLOSE);
        this.f46134g = a2VarC;
        this.f46135h = a2VarC;
        this.f46136i = cVar.f40149d;
        a2 a2VarC2 = r.c(Boolean.FALSE);
        this.f46137j = a2VarC2;
        this.f46138k = a2VarC2;
    }

    public final void a() {
        LatLngInfo latLngInfo;
        LatLngInfo latLngInfo2;
        jl.c cVarB = b();
        Address address = cVarB.f25302d;
        l lVar = cVarB.f25306h;
        jl.b bVar = cVarB.f25299a;
        ft.j jVar = this.f46131d;
        jVar.getClass();
        bVar.getClass();
        ft.c.i0(bVar);
        if (bVar == jl.b.STATIONS) {
            if (lVar == null || (latLngInfo2 = lVar.f32913f) == null) {
                latLngInfo2 = new LatLngInfo(0.0d, 0.0d, 3, (DefaultConstructorMarker) null);
            }
            jVar.getClass();
            ft.c.k0(latLngInfo2);
            ft.c.m0(lVar);
            ft.c.h0(null);
        } else {
            if (address == null || (latLngInfo = address.getCenter()) == null) {
                latLngInfo = new LatLngInfo(0.0d, 0.0d, 3, (DefaultConstructorMarker) null);
            }
            jVar.getClass();
            ft.c.k0(latLngInfo);
            ft.c.m0(null);
            if (bVar == jl.b.SELECTED) {
                ft.c.h0(address != null ? address.getDisplayName() : null);
            } else {
                ft.c.l0(address != null ? address.getDisplayName() : null);
                ft.c.h0(null);
            }
            latLngInfo2 = latLngInfo;
        }
        if (latLngInfo2.isValid()) {
            ft.c.X(new st.b(latLngInfo2.getLatitude(), latLngInfo2.getLongitude()));
        }
        int i11 = g.$EnumSwitchMapping$0[bVar.ordinal()];
        ft.c.g0(i11 != 1 ? i11 != 2 ? AppConstants.LOCATION_PICKER_SELECTED_LOCATION : AppConstants.LOCATION_PICKER_YOUR_LOCATION : AppConstants.LOCATION_PICKER_NO_SELECTED_LOCATION);
    }

    public final jl.c b() {
        Object next;
        Iterator it = ((Iterable) this.f46128a.f40148c.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((jl.c) next).f25304f) {
                break;
            }
        }
        jl.c cVar = (jl.c) next;
        if (cVar != null) {
            return cVar;
        }
        return new jl.c(null, 0, null, false, null, 511);
    }

    public final void c(jl.b bVar) {
        bVar.getClass();
        tg.c cVar = this.f46128a;
        cVar.getClass();
        a2 a2Var = cVar.f40148c;
        Iterable<jl.c> iterable = (Iterable) a2Var.getValue();
        ArrayList arrayList = new ArrayList(e0.o(iterable, 10));
        for (jl.c cVar2 : iterable) {
            arrayList.add(jl.c.a(cVar2, null, null, false, false, cVar2.f25299a == bVar, null, null, 447));
        }
        a2Var.k(null, arrayList);
    }

    public final void d(jl.b bVar, l lVar) {
        bVar.getClass();
        tg.c cVar = this.f46128a;
        cVar.getClass();
        a2 a2Var = cVar.f40148c;
        Iterable<jl.c> iterable = (Iterable) a2Var.getValue();
        ArrayList arrayList = new ArrayList(e0.o(iterable, 10));
        for (jl.c cVar2 : iterable) {
            jl.b bVar2 = cVar2.f25299a;
            arrayList.add(bVar2 == jl.b.STATIONS ? jl.c.a(cVar2, null, null, false, bVar2 == bVar && CollectionsKt.I(cVar2.f25307i, lVar), false, lVar, null, 351) : jl.c.a(cVar2, null, null, false, bVar2 == bVar && cVar2.f25303e, false, null, null, 479));
        }
        a2Var.k(null, arrayList);
    }

    public final void e(vg.b bVar) {
        bVar.getClass();
        a2 a2Var = this.f46134g;
        a2Var.getClass();
        a2Var.k(null, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(jl.c r5, jl.a r6, op.l r7) {
        /*
            r4 = this;
            r5.getClass()
            jl.b r0 = r5.f25299a
            r6.getClass()
            jl.a r1 = jl.a.SELECT
            if (r6 != r1) goto L24
            ft.j r6 = r4.f46131d
            r6.getClass()
            jl.b r6 = ft.c.t()
            if (r0 != r6) goto L21
            op.l r6 = ft.c.B()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r6)
            if (r6 != 0) goto L24
        L21:
            vg.b r5 = vg.b.APPLY
            goto L77
        L24:
            ao.g3 r6 = r4.f46130c
            com.app.tgtg.model.remote.UserData r6 = r6.m()
            java.util.List r6 = r6.getUserPointsOfInterests()
            r7 = 0
            if (r6 == 0) goto L55
            java.util.Iterator r6 = r6.iterator()
        L35:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r6.next()
            r2 = r1
            com.app.tgtg.model.remote.user.requests.OnboardingUserAddress r2 = (com.app.tgtg.model.remote.user.requests.OnboardingUserAddress) r2
            java.lang.String r2 = r2.getType()
            java.lang.String r3 = r0.name()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L35
            goto L52
        L51:
            r1 = r7
        L52:
            com.app.tgtg.model.remote.user.requests.OnboardingUserAddress r1 = (com.app.tgtg.model.remote.user.requests.OnboardingUserAddress) r1
            goto L56
        L55:
            r1 = r7
        L56:
            if (r1 == 0) goto L63
            com.app.tgtg.model.remote.user.response.Address r6 = r1.getAddress()
            if (r6 == 0) goto L63
            com.app.tgtg.model.remote.item.LatLngInfo r6 = r6.getCenter()
            goto L64
        L63:
            r6 = r7
        L64:
            com.app.tgtg.model.remote.user.response.Address r5 = r5.f25302d
            if (r5 == 0) goto L6c
            com.app.tgtg.model.remote.item.LatLngInfo r7 = r5.getCenter()
        L6c:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r5 != 0) goto L75
            vg.b r5 = vg.b.APPLY
            goto L77
        L75:
            vg.b r5 = vg.b.CLOSE
        L77:
            r4.e(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.h.f(jl.c, jl.a, op.l):void");
    }
}
