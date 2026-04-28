package s0;

import android.util.Size;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface d1 extends s1 {
    public static final g A0;
    public static final g B0;
    public static final g C0;
    public static final g D0;
    public static final g E0;
    public static final g F0;
    public static final g G0;
    public static final g H0;
    public static final g I0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final g f38313z0 = new g("camerax.core.imageOutput.targetAspectRatio", m0.c.class, null);

    static {
        Class cls = Integer.TYPE;
        A0 = new g("camerax.core.imageOutput.targetRotation", cls, null);
        B0 = new g("camerax.core.imageOutput.appTargetRotation", cls, null);
        C0 = new g("camerax.core.imageOutput.mirrorMode", cls, null);
        D0 = new g("camerax.core.imageOutput.targetResolution", Size.class, null);
        E0 = new g("camerax.core.imageOutput.defaultResolution", Size.class, null);
        F0 = new g("camerax.core.imageOutput.maxResolution", Size.class, null);
        G0 = new g("camerax.core.imageOutput.supportedResolutions", List.class, null);
        H0 = new g("camerax.core.imageOutput.resolutionSelector", f1.b.class, null);
        I0 = new g("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void l(d1 d1Var) {
        boolean zG = d1Var.g(f38313z0);
        boolean z11 = ((Size) d1Var.i(D0, null)) != null;
        if (zG && z11) {
            i4.a.f("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((f1.b) d1Var.i(H0, null)) != null) {
            if (zG || z11) {
                i4.a.f("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int w(int i11) {
        return ((Integer) i(A0, Integer.valueOf(i11))).intValue();
    }
}
