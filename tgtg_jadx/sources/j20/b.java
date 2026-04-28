package j20;

import android.graphics.Typeface;
import jb.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends w6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u f24450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f24451i;

    public b(d dVar, u uVar) {
        this.f24451i = dVar;
        this.f24450h = uVar;
    }

    @Override // w6.a
    public final void i(int i11) {
        this.f24451i.f24468n = true;
        this.f24450h.J(i11);
    }

    @Override // w6.a
    public final void j(Typeface typeface) {
        d dVar = this.f24451i;
        Typeface typefaceCreate = Typeface.create(typeface, dVar.f24459d);
        dVar.f24470p = typefaceCreate;
        dVar.f24468n = true;
        this.f24450h.K(typefaceCreate, false);
    }
}
