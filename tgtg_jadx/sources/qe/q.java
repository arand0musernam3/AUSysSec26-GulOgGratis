package qe;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f37002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f37003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37004c;

    public q(PointF pointF, boolean z11, List list) {
        this.f37003b = pointF;
        this.f37004c = z11;
        this.f37002a = new ArrayList(list);
    }

    public final void a(float f11, float f12) {
        if (this.f37003b == null) {
            this.f37003b = new PointF();
        }
        this.f37003b.set(f11, f12);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.f37002a.size());
        sb2.append("closed=");
        return r8.k.q(sb2, this.f37004c, '}');
    }

    public q() {
        this.f37002a = new ArrayList();
    }
}
