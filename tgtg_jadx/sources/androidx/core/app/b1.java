package androidx.core.app;

import android.app.PictureInPictureUiState;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {
    public static r40.d a(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            return new r40.d();
        }
        if (i11 < 31) {
            return new r40.d();
        }
        pictureInPictureUiState.isStashed();
        return new r40.d();
    }
}
