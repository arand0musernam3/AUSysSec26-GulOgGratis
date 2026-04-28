package f0;

import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface q1 extends e0.r1, AutoCloseable {
    boolean K();

    r1 P();

    Integer S(ArrayList arrayList, w0 w0Var);

    Integer V(CaptureRequest captureRequest, w0 w0Var);

    boolean c0(List list);

    boolean d0();

    Surface getInputSurface();

    Integer k0(CaptureRequest captureRequest, w0 w0Var);

    Integer w(ArrayList arrayList, w0 w0Var);
}
