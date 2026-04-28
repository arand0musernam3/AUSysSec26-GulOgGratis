package s0;

import android.util.Range;
import android.util.Size;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface o2 extends y0.i, c1 {
    public static final g J0 = new g("camerax.core.useCase.defaultSessionConfig", z1.class, null);
    public static final g K0 = new g("camerax.core.useCase.defaultCaptureConfig", r0.class, null);
    public static final g L0 = new g("camerax.core.useCase.sessionConfigUnpacker", w.s.class, null);
    public static final g M0 = new g("camerax.core.useCase.captureConfigUnpacker", w.r.class, null);
    public static final g N0;
    public static final g O0;
    public static final g P0;
    public static final g Q0;
    public static final g R0;
    public static final g S0;
    public static final g T0;
    public static final g U0;
    public static final g V0;
    public static final g W0;
    public static final g X0;
    public static final g Y0;
    public static final g Z0;

    static {
        Class cls = Integer.TYPE;
        N0 = new g("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        O0 = new g("camerax.core.useCase.sessionType", cls, null);
        P0 = new g("camerax.core.useCase.targetFrameRate", Range.class, null);
        Q0 = new g("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        R0 = new g("camerax.core.useCase.resolutionToMaxFrameRate", Map.class, null);
        Class cls2 = Boolean.TYPE;
        S0 = new g("camerax.core.useCase.zslDisabled", cls2, null);
        T0 = new g("camerax.core.useCase.highResolutionDisabled", cls2, null);
        U0 = new g("camerax.core.useCase.captureType", q2.class, null);
        V0 = new g("camerax.core.useCase.previewStabilizationMode", cls, null);
        W0 = new g("camerax.core.useCase.videoStabilizationMode", cls, null);
        X0 = new g("camerax.core.useCase.isVideoQualitySelectorDefault", Boolean.class, null);
        Y0 = new g("camerax.core.useCase.takePictureManagerProvider", m2.class, null);
        Z0 = new g("camerax.core.useCase.streamUseCase", c2.class, null);
    }

    default c2 m() {
        c2 c2Var = (c2) i(Z0, c2.DEFAULT);
        Objects.requireNonNull(c2Var);
        return c2Var;
    }

    default q2 n() {
        return (q2) d(U0);
    }

    default int o() {
        return ((Integer) i(W0, 0)).intValue();
    }

    default int q(Size size) {
        Map map = (Map) i(R0, null);
        if (map == null || !map.containsKey(size)) {
            return Integer.MAX_VALUE;
        }
        Integer num = (Integer) map.get(size);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    default int t() {
        return ((Integer) i(V0, 0)).intValue();
    }
}
