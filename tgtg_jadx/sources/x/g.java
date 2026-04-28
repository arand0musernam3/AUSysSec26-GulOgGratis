package x;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
import b0.k3;
import b0.n;
import b0.x0;
import e0.v;
import f0.t0;
import v80.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3 f43605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f43606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Range f43607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rational f43609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f43610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f43611g;

    public g(n nVar, k3 k3Var, x0 x0Var) {
        Integer num;
        Rational rational;
        nVar.getClass();
        k3Var.getClass();
        x0Var.getClass();
        this.f43605a = k3Var;
        this.f43606b = x0Var;
        v vVar = nVar.f5321b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        key.getClass();
        Object obj = e.f43603a;
        t0 t0Var = (t0) vVar;
        t0Var.getClass();
        Object objC = t0Var.c(key);
        obj = objC != null ? objC : obj;
        obj.getClass();
        Range range = (Range) obj;
        this.f43607c = range;
        Integer num2 = (Integer) range.getUpper();
        boolean z11 = (num2 == null || num2.intValue() != 0) && ((num = (Integer) range.getLower()) == null || num.intValue() != 0);
        this.f43608d = z11;
        if (z11) {
            CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
            key2.getClass();
            Object objC2 = ((t0) vVar).c(key2);
            objC2.getClass();
            rational = (Rational) objC2;
        } else {
            rational = Rational.ZERO;
            rational.getClass();
        }
        this.f43609e = rational;
    }
}
