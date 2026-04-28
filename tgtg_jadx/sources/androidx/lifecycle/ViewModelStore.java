package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "<init>", "()V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ViewModelStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3412a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f3412a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((l1) it.next()).clear$lifecycle_viewmodel();
        }
        linkedHashMap.clear();
    }
}
