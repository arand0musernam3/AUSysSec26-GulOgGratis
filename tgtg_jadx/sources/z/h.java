package z;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import e0.i1;
import e0.m1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final boolean a(ArrayList arrayList) {
        if (((StillCaptureFlashStopRepeatingQuirk) y.c.a().b(StillCaptureFlashStopRepeatingQuirk.class)) != null) {
            Iterator it = arrayList.iterator();
            boolean z11 = false;
            boolean z12 = false;
            while (it.hasNext()) {
                i1 i1Var = (i1) it.next();
                m1 m1Var = i1Var.f15359e;
                if (m1Var != null && m1Var.f15368a == 2) {
                    z11 = true;
                }
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                key.getClass();
                Integer num = (Integer) i1Var.f15356b.get(key);
                if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
                    z12 = true;
                }
            }
            if (z11 && z12) {
                return true;
            }
        }
        return false;
    }
}
