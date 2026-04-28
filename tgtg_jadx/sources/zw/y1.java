package zw;

import android.graphics.Matrix;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y1 extends c2 implements i0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Matrix f48402r;

    @Override // zw.i0
    public final void j(Matrix matrix) {
        this.f48402r = matrix;
    }

    @Override // zw.p1
    public final String n() {
        return TextBundle.TEXT_ENTRY;
    }
}
