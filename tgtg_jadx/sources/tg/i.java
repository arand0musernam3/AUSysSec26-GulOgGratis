package tg;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import ao.g3;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.user.response.Address;
import ft.j;
import gl.o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import v80.f0;
import y80.a2;
import y80.h1;
import y80.m1;
import y80.p1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltg/i;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddressPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressPickerViewModel.kt\ncom/app/tgtg/feature/addressPicker/AddressPickerViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,524:1\n49#2:525\n51#2:529\n46#3:526\n51#3:528\n105#4:527\n1#5:530\n1807#6,3:531\n1807#6,3:534\n1807#6,3:537\n1807#6,3:540\n*S KotlinDebug\n*F\n+ 1 AddressPickerViewModel.kt\ncom/app/tgtg/feature/addressPicker/AddressPickerViewModel\n*L\n105#1:525\n105#1:529\n105#1:526\n105#1:528\n105#1:527\n418#1:531,3\n421#1:534,3\n424#1:537,3\n427#1:540,3\n*E\n"})
public final class i extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f40162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yk.f f40163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f40164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g3 f40165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cv.b f40166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c1 f40167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f40168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f40169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h1 f40170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m1 f40171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m1 f40172k;
    public final a2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h1 f40173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a2 f40174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a2 f40175o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a2 f40176p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a2 f40177q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h1 f40178r;

    public i(c cVar, o oVar, yk.f fVar, j jVar, g3 g3Var, cv.b bVar, c1 c1Var) {
        cVar.getClass();
        oVar.getClass();
        fVar.getClass();
        jVar.getClass();
        g3Var.getClass();
        bVar.getClass();
        c1Var.getClass();
        this.f40162a = cVar;
        this.f40163b = fVar;
        this.f40164c = jVar;
        this.f40165d = g3Var;
        this.f40166e = bVar;
        this.f40167f = c1Var;
        this.f40168g = cVar.f40151f;
        Boolean bool = Boolean.FALSE;
        a2 a2VarC = r.c(bool);
        this.f40169h = a2VarC;
        this.f40170i = new h1(a2VarC);
        m1 m1VarB = r.b(0, 0, null, 7);
        this.f40171j = m1VarB;
        this.f40172k = m1VarB;
        a2 a2VarC2 = r.c(sm.b.DEFAULT);
        this.l = a2VarC2;
        this.f40173m = new h1(a2VarC2);
        a2 a2VarC3 = r.c(new vg.g(null, null, null, null, 15));
        this.f40174n = a2VarC3;
        this.f40175o = a2VarC3;
        a2 a2VarC4 = r.c(bool);
        this.f40176p = a2VarC4;
        this.f40177q = a2VarC4;
        this.f40178r = r.x(new at.o(a2VarC3, 4), androidx.lifecycle.m1.d(this), p1.f45551a, vg.c.MAP);
        f0.B(androidx.lifecycle.m1.d(this), null, null, new f(this, null, 0), 3);
    }

    public final void a(Address address) {
        vg.f fVar = ((vg.a) this.f40168g.getValue()).f42317a;
        vg.f fVar2 = vg.f.SELECT_AREA_SEARCH_BOX;
        if (fVar != fVar2) {
            fVar2 = vg.f.SEARCH_RESULT;
        }
        k(new vg.g(address.getDisplayName(), null, address, vg.d.SELECTED_ADDRESS));
        this.f40167f.d(Float.valueOf(15.0f), "zoom_level");
        j(fVar2, address.getCenter());
    }

    public final String b() {
        switch (d.$EnumSwitchMapping$2[this.f40162a.a().f25299a.ordinal()]) {
            case 1:
                return dv.d.HOME.a();
            case 2:
                return dv.d.WORK.a();
            case 3:
                return dv.d.OTHER.a();
            case 4:
                return dv.d.SELECTED.a();
            case 5:
                return dv.d.STATIONS.a();
            case 6:
            case 7:
                return "";
            default:
                e40.a.f();
                return null;
        }
    }

    public final String c() {
        String displayName;
        vg.g gVar = (vg.g) this.f40174n.getValue();
        vg.d dVar = gVar.f42322d;
        String str = gVar.f42319a;
        int i11 = dVar == null ? -1 : d.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i11 != -1 && i11 != 1) {
            if (i11 == 2) {
                Address address = this.f40162a.a().f25302d;
                displayName = address != null ? address.getDisplayName() : null;
                return displayName == null ? "" : displayName;
            }
            if (i11 == 3) {
                Address address2 = gVar.f42321c;
                displayName = address2 != null ? address2.getDisplayName() : null;
                return displayName == null ? "" : displayName;
            }
            if (i11 != 4) {
                e40.a.f();
                return null;
            }
        }
        return str;
    }

    public final float d() {
        Float f11 = (Float) this.f40167f.a("zoom_level");
        if (f11 != null) {
            return f11.floatValue();
        }
        return 4.0f;
    }

    public final void e(jl.c cVar, vg.a aVar) {
        Pair pair;
        cVar.getClass();
        aVar.getClass();
        Address address = cVar.f25302d;
        a2 a2Var = this.f40174n;
        if (address != null) {
            ((vg.g) a2Var.getValue()).f42322d = vg.d.PRE_FILLED_ADDRESS;
            pair = new Pair(vg.f.SAVED_ADDRESS, address.getCenter());
        } else {
            ((vg.g) a2Var.getValue()).f42322d = vg.d.NONE;
            pair = new Pair(vg.f.INITIAL_LOCATION, aVar.f42318b);
        }
        j((vg.f) pair.f26485a, (LatLngInfo) pair.f26486b);
    }

    public final void f(String str, LatLngInfo latLngInfo) {
        f0.B(androidx.lifecycle.m1.d(this), null, null, new nk.j(this, str, latLngInfo, null, 29), 3);
    }

    public final void g(sm.b bVar) {
        bVar.getClass();
        a2 a2Var = this.l;
        a2Var.getClass();
        a2Var.k(null, bVar);
    }

    public final void h() {
        Boolean bool = Boolean.TRUE;
        a2 a2Var = this.f40176p;
        a2Var.getClass();
        a2Var.k(null, bool);
    }

    public final void i(cv.i iVar, String str, String str2) {
        iVar.getClass();
        str.getClass();
        str2.getClass();
        this.f40166e.c(iVar, h0.g.E(new Pair(dv.a.SOURCE, new dv.c(str)), new Pair(dv.a.TYPE, new dv.c(str2))));
    }

    public final void j(vg.f fVar, LatLngInfo latLngInfo) {
        fVar.getClass();
        c cVar = this.f40162a;
        cVar.getClass();
        if (latLngInfo != null) {
            a2 a2Var = cVar.f40150e;
            vg.a aVar = new vg.a(fVar, latLngInfo);
            a2Var.getClass();
            a2Var.k(null, aVar);
        }
    }

    public final void k(vg.g gVar) {
        a2 a2Var = this.f40174n;
        a2Var.getClass();
        a2Var.k(null, gVar);
    }
}
