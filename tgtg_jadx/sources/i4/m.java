package i4;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final void a(List list) {
        if (list.size() >= 2) {
            return;
        }
        a.f("colors must have length of at least 2 if colorStops is omitted.");
    }
}
