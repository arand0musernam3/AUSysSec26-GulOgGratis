package om;

import android.location.Location;
import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mv.r0;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f32664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f32665k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f32666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f32667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f32668o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, boolean z11, x70.c cVar) {
        super(2, cVar);
        this.f32667n = lVar;
        this.f32668o = z11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        j jVar = new j(this.f32667n, this.f32668o, cVar);
        jVar.f32666m = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        l lVar2;
        b0 b0Var = (b0) this.f32666m;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.l;
        try {
        } catch (Throwable th2) {
            sa0.a.f38953a.i(e0.f.k("Exception Ignored: ", th2.getMessage()), new Object[0]);
        }
        if (i11 == 0) {
            ba0.g.M(obj);
            l lVar3 = this.f32667n;
            lVar3.K();
            boolean z11 = this.f32668o;
            if (!z11) {
                pg.c cVar = lVar3.B;
                cVar.getClass();
                ((MapBottomSheet) cVar.f34805f).setSheetData(null);
            }
            lVar3.B();
            if (z11) {
                lVar3.f32686w = true;
                lVar3.D();
                return Unit.f26487a;
            }
            lVar3.f32680q = new Double(r0.k());
            this.f32666m = b0Var;
            this.f32664j = lVar3;
            this.f32665k = lVar3;
            this.l = 1;
            Object objS = l.s(lVar3, this);
            if (objS == aVar) {
                return aVar;
            }
            lVar = lVar3;
            obj = objS;
            lVar2 = lVar;
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar = this.f32665k;
            lVar2 = this.f32664j;
            ba0.g.M(obj);
        }
        st.b bVar = (st.b) obj;
        if (bVar == null) {
            f0.j(b0Var, null);
            return Unit.f26487a;
        }
        lVar.f32681r = bVar;
        Location locationT = l.t(lVar2);
        st.b bVar2 = lVar2.f32681r;
        locationT.setLatitude(bVar2 != null ? bVar2.f39278a : 0.0d);
        Location locationT2 = l.t(lVar2);
        st.b bVar3 = lVar2.f32681r;
        locationT2.setLongitude(bVar3 != null ? bVar3.f39279b : 0.0d);
        tm.e eVarC = lVar2.C();
        eVarC.getClass();
        eVarC.B = Intrinsics.areEqual(ft.c.r(), AppConstants.LOCATION_PICKER_YOUR_LOCATION);
        lVar2.P((!lVar2.C().B || lVar2.C().C) ? sm.b.DEFAULT : sm.b.CLICKED);
        if (lVar2.f32677n != null) {
            lVar2.z();
        }
        return Unit.f26487a;
    }
}
