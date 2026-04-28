package d2;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements z.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13821b;

    public k0(s0.r1 r1Var) {
        boolean z11;
        r1Var.getClass();
        Iterator it = r1Var.c(CaptureIntentPreviewQuirk.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            } else if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                z11 = true;
                break;
            }
        }
        this.f13820a = z11;
        this.f13821b = r1Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @Override // z.j
    public Map b(e0.m1 m1Var) {
        if (m1Var != null && m1Var.f15368a == 3 && this.f13820a) {
            return kotlin.collections.w0.b(new Pair(CaptureRequest.CONTROL_CAPTURE_INTENT, 1));
        }
        if (m1Var != null && m1Var.f15368a == 4 && this.f13821b) {
            return kotlin.collections.w0.b(new Pair(CaptureRequest.CONTROL_CAPTURE_INTENT, 2));
        }
        kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
        o0Var.getClass();
        return o0Var;
    }

    public k0(boolean z11, boolean z12) {
        this.f13820a = z11;
        this.f13821b = z12;
    }
}
