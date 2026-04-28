package h7;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class a2 extends z1 {
    public a2(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat, windowInsets);
    }

    @Override // h7.g2
    public WindowInsetsCompat a() {
        return WindowInsetsCompat.v(this.f21636c.consumeDisplayCutout());
    }

    @Override // h7.y1, h7.g2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return Objects.equals(this.f21636c, a2Var.f21636c) && Objects.equals(this.f21640g, a2Var.f21640g) && y1.M(this.f21641h, a2Var.f21641h);
    }

    @Override // h7.g2
    public j h() {
        DisplayCutout displayCutout = this.f21636c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new j(displayCutout);
    }

    @Override // h7.g2
    public int hashCode() {
        return this.f21636c.hashCode();
    }

    public a2(WindowInsetsCompat windowInsetsCompat, a2 a2Var) {
        super(windowInsetsCompat, a2Var);
    }
}
