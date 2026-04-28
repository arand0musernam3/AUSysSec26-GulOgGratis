package fn;

import kotlin.Unit;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f17833b;

    public /* synthetic */ l(t tVar, int i11) {
        this.f17832a = i11;
        this.f17833b = tVar;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        switch (this.f17832a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    vg.e eVar = vg.e.NEW_LOCATION_PICKER;
                    t tVar = this.f17833b;
                    tVar.f17861u = eVar;
                    tVar.f17860t = true;
                    tVar.f17862v.a("android.permission.ACCESS_FINE_LOCATION", null);
                    a2 a2Var = tVar.t().f46137j;
                    Boolean bool = Boolean.FALSE;
                    a2Var.getClass();
                    a2Var.k(null, bool);
                }
                break;
            default:
                vg.e eVar2 = (vg.e) obj;
                if (eVar2 == vg.e.MAP_CLICK) {
                    t tVar2 = this.f17833b;
                    tVar2.f17861u = eVar2;
                    tVar2.f17860t = true;
                    tVar2.f17862v.a("android.permission.ACCESS_FINE_LOCATION", null);
                }
                break;
        }
        return Unit.f26487a;
    }
}
