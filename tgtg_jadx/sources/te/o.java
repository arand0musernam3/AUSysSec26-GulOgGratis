package te;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a60.n f40098a = a60.n.b("x", "y");

    public static int a(ue.d dVar) {
        dVar.a();
        int iA = (int) (dVar.A() * 255.0d);
        int iA2 = (int) (dVar.A() * 255.0d);
        int iA3 = (int) (dVar.A() * 255.0d);
        while (dVar.t()) {
            dVar.O();
        }
        dVar.g();
        return Color.argb(255, iA, iA2, iA3);
    }

    public static PointF b(ue.d dVar, float f11) {
        int i11 = n.f40097a[dVar.H().ordinal()];
        if (i11 == 1) {
            float fA = (float) dVar.A();
            float fA2 = (float) dVar.A();
            while (dVar.t()) {
                dVar.O();
            }
            return new PointF(fA * f11, fA2 * f11);
        }
        if (i11 == 2) {
            dVar.a();
            float fA3 = (float) dVar.A();
            float fA4 = (float) dVar.A();
            while (dVar.H() != ue.c.END_ARRAY) {
                dVar.O();
            }
            dVar.g();
            return new PointF(fA3 * f11, fA4 * f11);
        }
        if (i11 != 3) {
            j4.d.t(dVar.H(), "Unknown point starts with ");
            return null;
        }
        dVar.e();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (dVar.t()) {
            int iJ = dVar.J(f40098a);
            if (iJ == 0) {
                fD = d(dVar);
            } else if (iJ != 1) {
                dVar.L();
                dVar.O();
            } else {
                fD2 = d(dVar);
            }
        }
        dVar.p();
        return new PointF(fD * f11, fD2 * f11);
    }

    public static ArrayList c(ue.d dVar, float f11) {
        ArrayList arrayList = new ArrayList();
        dVar.a();
        while (dVar.H() == ue.c.BEGIN_ARRAY) {
            dVar.a();
            arrayList.add(b(dVar, f11));
            dVar.g();
        }
        dVar.g();
        return arrayList;
    }

    public static float d(ue.d dVar) {
        ue.c cVarH = dVar.H();
        int i11 = n.f40097a[cVarH.ordinal()];
        if (i11 == 1) {
            return (float) dVar.A();
        }
        if (i11 != 2) {
            j4.d.o(cVarH, "Unknown value for token of type ");
            return 0.0f;
        }
        dVar.a();
        float fA = (float) dVar.A();
        while (dVar.t()) {
            dVar.O();
        }
        dVar.g();
        return fA;
    }
}
