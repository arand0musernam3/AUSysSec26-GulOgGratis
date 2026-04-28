package h7;

import android.graphics.Rect;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends e2 {
    public f2(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat, windowInsets);
    }

    @Override // h7.y1, h7.g2
    public List<Rect> f(int i11) {
        return this.f21636c.getBoundingRects(j2.a(i11));
    }

    @Override // h7.y1, h7.g2
    public List<Rect> g(int i11) {
        return this.f21636c.getBoundingRectsIgnoringVisibility(j2.a(i11));
    }

    public f2(WindowInsetsCompat windowInsetsCompat, f2 f2Var) {
        super(windowInsetsCompat, f2Var);
    }

    @Override // h7.y1, h7.g2
    public void q() {
    }
}
