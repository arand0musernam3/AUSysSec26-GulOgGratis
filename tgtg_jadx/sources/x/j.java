package x;

import android.util.Size;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends t10.c {
    public static boolean v() {
        return y.c.a().b(PixelJpegRSupportedQuirk.class) != null;
    }

    @Override // t10.c
    public final Size[] j(int i11) {
        if (i11 == 4101 && v()) {
            return null;
        }
        return super.j(i11);
    }

    @Override // t10.c
    public final Integer[] k() {
        Integer[] numArrK = super.k();
        if (!v()) {
            return numArrK;
        }
        if (numArrK == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : numArrK) {
            if (num.intValue() != 4101) {
                arrayList.add(num);
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[0]);
    }

    @Override // t10.c
    public final long l(int i11, Size size) {
        size.getClass();
        if (i11 == 4101 && v()) {
            return 0L;
        }
        return super.l(i11, size);
    }

    @Override // t10.c
    public final Size[] n(int i11) {
        if (i11 == 4101 && v()) {
            return null;
        }
        return super.n(i11);
    }
}
