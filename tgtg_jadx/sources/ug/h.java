package ug;

import android.content.Context;
import android.location.Location;
import com.app.tgtg.model.remote.item.LatLngInfo;
import om.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tg.i f41137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ st.a f41138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f41139d;

    public h(tg.i iVar, rt.d dVar, Context context) {
        this.f41137b = iVar;
        this.f41138c = dVar;
        this.f41139d = context;
    }

    @Override // om.n
    public final void a() {
        sm.b bVar = sm.b.DEFAULT;
        tg.i iVar = this.f41137b;
        iVar.g(bVar);
        st.a aVar = this.f41138c;
        rt.d dVar = (rt.d) aVar;
        Location locationG = dVar.g();
        LatLngInfo latLngInfo = new LatLngInfo(locationG.getLatitude(), locationG.getLongitude());
        vg.f fVar = ((vg.a) iVar.f40168g.getValue()).f42317a;
        vg.f fVar2 = vg.f.SELECT_AREA_SEARCH_BOX;
        if (fVar != fVar2) {
            fVar2 = vg.f.CHOSEN_LOCATION;
        }
        iVar.j(fVar2, latLngInfo);
        iVar.f40167f.d(Float.valueOf(dVar.j()), "zoom_level");
        c.j(this.f41139d, aVar, latLngInfo, iVar);
    }
}
