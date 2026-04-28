package n7;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30682a;

    public s(List list) {
        list.getClass();
        this.f30682a = list;
        if (list.isEmpty()) {
            i4.a.f("credentialOptions should not be empty");
            throw null;
        }
        if (list.size() > 1) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                }
            }
            for (m mVar : this.f30682a) {
            }
        }
    }
}
