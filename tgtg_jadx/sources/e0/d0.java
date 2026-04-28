package e0;

import com.braze.h2;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15327a;

    public d0(List list) {
        list.getClass();
        this.f15327a = list;
        b1 b1Var = (b1) CollectionsKt.O(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((b1) it.next()).f15315b != b1Var.f15315b) {
                h2.b("All outputs must have the same format!");
                throw null;
            }
        }
    }

    public final String toString() {
        return f.p(new StringBuilder("CameraStream.Config(outputs="), this.f15327a, ", imageSourceConfig=null)");
    }
}
