package s0;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f38455a = Collections.unmodifiableSet(EnumSet.of(u.PASSIVE_FOCUSED, u.PASSIVE_NOT_FOCUSED, u.LOCKED_FOCUSED, u.LOCKED_NOT_FOCUSED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f38456b = Collections.unmodifiableSet(EnumSet.of(w.CONVERGED, w.UNKNOWN));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f38457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f38458d;

    static {
        s sVar = s.CONVERGED;
        s sVar2 = s.FLASH_REQUIRED;
        s sVar3 = s.UNKNOWN;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(sVar, sVar2, sVar3));
        f38457c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(sVar2);
        enumSetCopyOf.remove(sVar3);
        f38458d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    public static boolean a(w.y yVar, boolean z11) {
        t tVar;
        r rVar;
        v vVar;
        f0.o metadata = yVar.f42797b.getMetadata();
        CaptureResult.Key key = CaptureResult.CONTROL_AF_MODE;
        key.getClass();
        Integer num = (Integer) metadata.c(key);
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 5)) {
            tVar = t.OFF;
        } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            tVar = t.ON_MANUAL_AUTO;
        } else if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 3)) {
            tVar = t.ON_CONTINUOUS_AUTO;
        } else {
            if (num != null && wd.a.B(3, "CXCP")) {
                Log.d("CXCP", "Unknown AF mode (" + num.intValue() + ") for " + ((Object) e0.l0.a(metadata.f16792a.getFrameNumber())) + '!');
            }
            tVar = t.UNKNOWN;
        }
        boolean z12 = tVar == t.OFF || f38455a.contains(yVar.l());
        f0.o metadata2 = yVar.f42797b.getMetadata();
        CaptureResult.Key key2 = CaptureResult.CONTROL_AE_MODE;
        key2.getClass();
        Integer num2 = (Integer) metadata2.c(key2);
        if (num2 != null && num2.intValue() == 0) {
            rVar = r.OFF;
        } else if (num2 != null && num2.intValue() == 1) {
            rVar = r.ON;
        } else if (num2 != null && num2.intValue() == 2) {
            rVar = r.ON_AUTO_FLASH;
        } else if (num2 != null && num2.intValue() == 3) {
            rVar = r.ON_ALWAYS_FLASH;
        } else if (num2 != null && num2.intValue() == 4) {
            rVar = r.ON_AUTO_FLASH_REDEYE;
        } else {
            if (num2 != null && wd.a.B(3, "CXCP")) {
                Log.d("CXCP", "Unknown AE mode (" + num2.intValue() + ") for " + ((Object) e0.l0.a(metadata2.f16792a.getFrameNumber())) + '!');
            }
            rVar = r.UNKNOWN;
        }
        boolean z13 = rVar == r.OFF;
        boolean z14 = !z11 ? !(z13 || f38457c.contains(yVar.h())) : !(z13 || f38458d.contains(yVar.h()));
        f0.o metadata3 = yVar.f42797b.getMetadata();
        CaptureResult.Key key3 = CaptureResult.CONTROL_AWB_MODE;
        key3.getClass();
        Integer num3 = (Integer) metadata3.c(key3);
        if (num3 != null && num3.intValue() == 0) {
            vVar = v.OFF;
        } else if (num3 != null && num3.intValue() == 1) {
            vVar = v.AUTO;
        } else if (num3 != null && num3.intValue() == 2) {
            vVar = v.INCANDESCENT;
        } else if (num3 != null && num3.intValue() == 3) {
            vVar = v.FLUORESCENT;
        } else if (num3 != null && num3.intValue() == 4) {
            vVar = v.WARM_FLUORESCENT;
        } else if (num3 != null && num3.intValue() == 5) {
            vVar = v.DAYLIGHT;
        } else if (num3 != null && num3.intValue() == 6) {
            vVar = v.CLOUDY_DAYLIGHT;
        } else if (num3 != null && num3.intValue() == 7) {
            vVar = v.TWILIGHT;
        } else if (num3 != null && num3.intValue() == 8) {
            vVar = v.SHADE;
        } else {
            if (num3 != null && wd.a.B(3, "CXCP")) {
                Log.d("CXCP", "Unknown AWB mode (" + num3.intValue() + ") for " + ((Object) e0.l0.a(metadata3.f16792a.getFrameNumber())) + '!');
            }
            vVar = v.UNKNOWN;
        }
        boolean z15 = vVar == v.OFF || f38456b.contains(yVar.f());
        wd.a.p("ConvergenceUtils", "checkCaptureResult, AE=" + yVar.h() + " AF =" + yVar.l() + " AWB=" + yVar.f());
        return z12 && z14 && z15;
    }
}
