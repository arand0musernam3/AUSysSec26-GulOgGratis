package w;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import s0.c2;
import s0.d2;
import s0.e2;
import s0.g2;
import s0.i2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u70.t f42677a = u70.l.b(new vv.b(24));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u70.t f42678b = u70.l.b(new vv.b(25));

    public static ArrayList a(e2 e2Var, e2 e2Var2) {
        ArrayList arrayList = new ArrayList();
        d2 d2Var = new d2();
        c2 c2Var = i2.f38344e;
        g2 g2Var = g2.PRIV;
        c2 c2Var2 = i2.f38344e;
        d2Var.a(l50.a.n(g2Var, e2Var, c2Var2));
        d2Var.a(l50.a.n(g2.JPEG, e2Var2, c2Var2));
        arrayList.add(d2Var);
        d2 d2Var2 = new d2();
        d2Var2.a(l50.a.n(g2Var, e2Var, c2Var2));
        d2Var2.a(l50.a.n(g2.JPEG_R, e2Var2, c2Var2));
        arrayList.add(d2Var2);
        return arrayList;
    }

    public static ArrayList b(e0.v vVar, u0.b bVar) {
        vVar.getClass();
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 35) {
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION;
            key.getClass();
            Object objC = ((f0.t0) vVar).c(key);
            if (objC == null) {
                i4.a.f("Required value was null.");
                return null;
            }
            int iIntValue = ((Number) objC).intValue();
            if (iIntValue >= 35 && bVar != u0.b.ON) {
                arrayList.addAll((List) f42677a.getValue());
            }
            if (iIntValue >= 36 && bVar != u0.b.PREVIEW) {
                arrayList.addAll((List) f42678b.getValue());
                return arrayList;
            }
        }
        return arrayList;
    }
}
