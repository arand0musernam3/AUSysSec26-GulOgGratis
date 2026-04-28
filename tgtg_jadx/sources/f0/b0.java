package f0;

import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.util.Size;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b0 {
    public static /* synthetic */ OutputConfiguration a(int i11, Size size) {
        return new OutputConfiguration(i11, size);
    }

    public static /* synthetic */ SessionConfiguration b(int i11, List list) {
        return new SessionConfiguration(i11, list);
    }
}
