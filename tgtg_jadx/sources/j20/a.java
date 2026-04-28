package j20;

import android.graphics.Typeface;
import jb.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Typeface f24447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final se.b f24448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24449g;

    public a(se.b bVar, Typeface typeface) {
        this.f24447e = typeface;
        this.f24448f = bVar;
    }

    @Override // jb.u
    public final void J(int i11) {
        if (this.f24449g) {
            return;
        }
        e20.c cVar = (e20.c) this.f24448f.f39010b;
        if (cVar.l(this.f24447e)) {
            cVar.j(false);
        }
    }

    @Override // jb.u
    public final void K(Typeface typeface, boolean z11) {
        if (this.f24449g) {
            return;
        }
        e20.c cVar = (e20.c) this.f24448f.f39010b;
        if (cVar.l(typeface)) {
            cVar.j(false);
        }
    }
}
