package s0;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface y {
    k2 b();

    x c();

    default void d(v0.i iVar) {
        int i11;
        ArrayList arrayList = iVar.f41611a;
        x xVarC = c();
        if (xVarC == x.UNKNOWN) {
            return;
        }
        int i12 = v0.f.f41603a[xVarC.ordinal()];
        if (i12 == 1) {
            i11 = 0;
        } else if (i12 == 2) {
            i11 = 32;
        } else {
            if (i12 != 3) {
                wd.a.I("ExifData", "Unknown flash state: " + xVarC);
                return;
            }
            i11 = 1;
        }
        if ((i11 & 1) == 1) {
            iVar.c("LightSource", String.valueOf(4), arrayList);
        }
        iVar.c("Flash", String.valueOf(i11), arrayList);
    }

    w f();

    long getTimestamp();

    s h();

    default CaptureResult i() {
        return null;
    }

    u l();
}
