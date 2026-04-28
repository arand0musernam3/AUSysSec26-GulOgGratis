package ta;

import android.view.View;
import java.util.Comparator;
import ta.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        e.a aVar = (e.a) ((View) obj).getLayoutParams();
        e.a aVar2 = (e.a) ((View) obj2).getLayoutParams();
        boolean z11 = aVar.f39915a;
        if (z11 != aVar2.f39915a) {
            return z11 ? 1 : -1;
        }
        return 0;
    }
}
