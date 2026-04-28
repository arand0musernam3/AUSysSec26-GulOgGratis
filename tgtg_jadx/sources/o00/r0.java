package o00;

import android.os.Build;
import com.google.android.gms.internal.measurement.cg;
import dalvik.system.VMStack;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends q0 {
    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            cg.class.getName().equals(a());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
    }

    public static String a() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
