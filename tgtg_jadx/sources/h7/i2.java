package h7;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i2 {
    public static int a(int i11) {
        int iStatusBars;
        int i12 = 0;
        for (int i13 = 1; i13 <= 512; i13 <<= 1) {
            if ((i11 & i13) != 0) {
                if (i13 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i13 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i13 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i13 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i13 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i13 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i13 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i13 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                }
                i12 |= iStatusBars;
            }
        }
        return i12;
    }
}
