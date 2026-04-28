package h7;

import a3.a3;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f21566a;

    public j(DisplayCutout displayCutout) {
        this.f21566a = displayCutout;
    }

    public List<Rect> a() {
        return Build.VERSION.SDK_INT >= 28 ? a3.i(this.f21566a) : Collections.EMPTY_LIST;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a3.o(this.f21566a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a3.p(this.f21566a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a3.q(this.f21566a);
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a3.r(this.f21566a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return this.f21566a.equals(((j) obj).f21566a);
    }

    public x6.d f() {
        return Build.VERSION.SDK_INT >= 30 ? x6.d.c(f5.b.h(this.f21566a)) : x6.d.f43872e;
    }

    public int hashCode() {
        return this.f21566a.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f21566a + "}";
    }
}
