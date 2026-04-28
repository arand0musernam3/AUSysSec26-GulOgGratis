package c0;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SizeF;
import e0.s;
import e0.v;
import f0.t0;
import java.util.ArrayList;
import java.util.Iterator;
import v0.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0.b f6801a;

    public e(j0.b bVar) {
        this.f6801a = bVar;
    }

    public static int a(float f11, float f12) {
        pd.g.i("Focal length should be positive.", f11 > 0.0f);
        pd.g.i("Sensor length should be positive.", f12 > 0.0f);
        int degrees = (int) Math.toDegrees(Math.atan(f12 / (2 * f11)) * ((double) 2));
        pd.g.k(degrees, 0, 360, "The provided focal length and sensor length result in an invalid view angle degrees.");
        return degrees;
    }

    public static float c(v vVar) {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS;
        key.getClass();
        Object objC = ((t0) vVar).c(key);
        pd.g.m(objC, "The focal lengths can not be empty.");
        float[] fArr = (float[]) objC;
        pd.g.n("The focal lengths can not be empty.", !(fArr.length == 0));
        return fArr[0];
    }

    public static float d(v vVar) {
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE;
        key.getClass();
        t0 t0Var = (t0) vVar;
        Object objC = t0Var.c(key);
        pd.g.m(objC, "The sensor size can't be null.");
        SizeF sizeF = (SizeF) objC;
        CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key2.getClass();
        Object objC2 = t0Var.c(key2);
        pd.g.m(objC2, "The sensor orientation can't be null.");
        CameraCharacteristics.Key key3 = CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE;
        key3.getClass();
        Object objC3 = t0Var.c(key3);
        pd.g.m(objC3, "The active array size can't be null.");
        Size size = (Size) objC3;
        CameraCharacteristics.Key key4 = CameraCharacteristics.SENSOR_ORIENTATION;
        key4.getClass();
        Object objC4 = t0Var.c(key4);
        pd.g.m(objC4, "The pixel array size can't be null.");
        int iIntValue = ((Number) objC4).intValue();
        Size sizeG = o.g((Rect) objC2);
        if (o.d(iIntValue)) {
            SizeF sizeF2 = new SizeF(sizeF.getHeight(), sizeF.getWidth());
            Size size2 = new Size(sizeG.getHeight(), sizeG.getWidth());
            size = new Size(size.getHeight(), size.getWidth());
            sizeG = size2;
            sizeF = sizeF2;
        }
        return (sizeF.getWidth() * sizeG.getWidth()) / size.getWidth();
    }

    public final int b(v vVar) {
        j0.b bVar = this.f6801a;
        try {
            ArrayList arrayListA = j0.b.a(bVar);
            pd.g.m(arrayListA, "Failed to get available camera IDs");
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                String str = ((s) it.next()).f15403a;
                v vVarB = j0.b.b(bVar, str);
                s.b(str);
                CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                key.getClass();
                Object objC = ((t0) vVarB).c(key);
                pd.g.m(objC, "Failed to get CameraCharacteristics.LENS_FACING for " + ((Object) s.b(str)));
                int iIntValue = ((Number) objC).intValue();
                t0 t0Var = (t0) vVar;
                Object objC2 = t0Var.c(key);
                pd.g.m(objC2, "Failed to get the required LENS_FACING for " + ((Object) s.b(t0Var.f16904a)));
                if (iIntValue == ((Number) objC2).intValue()) {
                    return a(c(vVarB), d(vVarB));
                }
            }
            throw new IllegalStateException("Could not find the default camera for " + ((Object) s.b(((t0) vVar).f16904a)));
        } catch (Exception e5) {
            wy.o.k("Failed to get a valid view angle", e5);
            return 0;
        }
    }
}
