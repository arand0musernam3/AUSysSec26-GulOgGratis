package ve;

import android.graphics.Path;
import android.graphics.PointF;
import j4.s;
import java.util.ArrayList;
import qe.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PointF f42266a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f11, float f12, float f13) {
        return Math.max(f12, Math.min(f13, f11));
    }

    public static int c(int i11) {
        return Math.max(0, Math.min(255, i11));
    }

    public static int d(float f11, float f12) {
        int i11 = (int) f11;
        int i12 = (int) f12;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (!((i11 ^ i12) >= 0) && i14 != 0) {
            i13--;
        }
        return i11 - (i12 * i13);
    }

    public static void e(q qVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = qVar.f37003b;
        ArrayList arrayList = qVar.f37002a;
        path.moveTo(pointF.x, pointF.y);
        float f11 = pointF.x;
        float f12 = pointF.y;
        PointF pointF2 = f42266a;
        pointF2.set(f11, f12);
        int i11 = 0;
        while (i11 < arrayList.size()) {
            oe.a aVar = (oe.a) arrayList.get(i11);
            PointF pointF3 = aVar.f32449a;
            PointF pointF4 = aVar.f32450b;
            PointF pointF5 = aVar.f32451c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i11++;
            path = path2;
        }
        Path path3 = path;
        if (qVar.f37004c) {
            path3.close();
        }
    }

    public static float f(float f11, float f12, float f13) {
        return s.a(f12, f11, f13, f11);
    }

    public static void g(oe.f fVar, int i11, ArrayList arrayList, oe.f fVar2, je.k kVar) {
        if (fVar.a(i11, kVar.getName())) {
            String name = kVar.getName();
            oe.f fVar3 = new oe.f(fVar2);
            fVar3.f32474a.add(name);
            oe.f fVar4 = new oe.f(fVar3);
            fVar4.f32475b = kVar;
            arrayList.add(fVar4);
        }
    }
}
