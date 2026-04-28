package n20;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f30411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f30412d;

    public r(ArrayList arrayList, Matrix matrix) {
        this.f30411c = arrayList;
        this.f30412d = matrix;
    }

    @Override // n20.x
    public final void a(Matrix matrix, m20.a aVar, int i11, Canvas canvas) {
        Iterator it = this.f30411c.iterator();
        while (it.hasNext()) {
            ((x) it.next()).a(this.f30412d, aVar, i11, canvas);
        }
    }
}
