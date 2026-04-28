package j7;

import android.hardware.camera2.CaptureRequest;
import android.text.StaticLayout;
import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    public static final void b(LinkedHashMap linkedHashMap, int i11) {
        linkedHashMap.put(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(i11));
    }

    public static void c(NestedScrollView nestedScrollView, float f11) {
        try {
            nestedScrollView.setFrameContentVelocity(f11);
        } catch (LinkageError unused) {
        }
    }

    public static void d(EditorInfo editorInfo, boolean z11) {
        editorInfo.setStylusHandwritingEnabled(z11);
    }
}
