package w4;

import android.view.MotionEvent;
import com.app.tgtg.model.local.AppConstants;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f43174a = new a(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f43175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final StackTraceElement[] f43177d;

    static {
        new a(1007);
        f43175b = new a(1008);
        f43176c = new a(AppConstants.RESULT_CODE_AUTO_REFUND);
        f43177d = new StackTraceElement[0];
    }

    public static final boolean a(v vVar) {
        return (vVar.b() || vVar.f43185h || !vVar.f43181d) ? false : true;
    }

    public static final boolean b(v vVar) {
        return !vVar.f43185h && vVar.f43181d;
    }

    public static final boolean c(v vVar) {
        return (vVar.b() || !vVar.f43185h || vVar.f43181d) ? false : true;
    }

    public static final boolean d(v vVar) {
        return vVar.f43185h && !vVar.f43181d;
    }

    public static final boolean e(long j9, long j11) {
        return j9 == j11;
    }

    public static final boolean f(v vVar, long j9, long j11) {
        int i11 = vVar.f43186i == 1 ? 1 : 0;
        long j12 = vVar.f43180c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        float f11 = i11;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32)) * f11;
        float f12 = ((int) (j9 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f11;
        return (fIntBitsToFloat > f12) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j9 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static b4.t g(b4.t tVar, a aVar) {
        return tVar.then(new p(aVar));
    }

    public static final long h(v vVar, boolean z11) {
        long jE = h4.b.e(vVar.f43180c, vVar.f43184g);
        if (z11 || !vVar.b()) {
            return jE;
        }
        return 0L;
    }

    public static final void i(n nVar, long j9, Function1 function1, boolean z11) {
        MotionEvent motionEventA = nVar.a();
        if (motionEventA == null) {
            i4.a.f("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventA.getAction();
        if (z11) {
            motionEventA.setAction(3);
        }
        int i11 = (int) (j9 >> 32);
        int i12 = (int) (j9 & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i11), -Float.intBitsToFloat(i12));
        function1.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12));
        motionEventA.setAction(action);
    }

    public static String j(long j9) {
        return "PointerId(value=" + j9 + ')';
    }
}
