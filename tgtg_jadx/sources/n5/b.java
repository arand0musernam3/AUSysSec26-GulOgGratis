package n5;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i11, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z11, TextUtils.TruncateAt truncateAt, int i12) {
        return new BoringLayout(charSequence, textPaint, i11, alignment, 1.0f, 0.0f, metrics, z11, truncateAt, i12, true);
    }
}
