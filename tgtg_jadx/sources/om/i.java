package om;

import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f32663b;

    public i(l lVar) {
        this.f32663b = lVar;
    }

    @Override // om.n
    public final void a() {
        l lVar = this.f32663b;
        lVar.C().D.i(Boolean.TRUE);
        lVar.D();
        if (lVar.A) {
            lVar.A = false;
            return;
        }
        if (lVar.C().B) {
            lVar.C().C = true;
        }
        lVar.P(sm.b.DEFAULT);
    }

    @Override // om.n
    public final void b() {
        l lVar = this.f32663b;
        if (lVar.C().e() != pm.j.HalfExpanded || lVar.A) {
            return;
        }
        pg.c cVar = lVar.B;
        cVar.getClass();
        ((MapBottomSheet) cVar.f34805f).getHideBottomSheet().invoke();
    }
}
