package p6;

import android.view.View;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f34501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.constraintlayout.widget.b f34502h;

    @Override // p6.g
    public final void c(androidx.constraintlayout.widget.b bVar) {
        this.f34502h = bVar;
    }

    @Override // p6.g
    public final void d(View view, float f11) {
        float[] fArr = this.f34501g;
        fArr[0] = a(f11);
        u.O(this.f34502h, view, fArr);
    }
}
