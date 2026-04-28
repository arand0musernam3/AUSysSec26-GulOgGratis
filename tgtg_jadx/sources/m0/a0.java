package m0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f28461a;

    public a0(List list) {
        if (list == null || list.isEmpty()) {
            i4.a.f("Cannot set an empty CaptureStage list.");
            throw null;
        }
        this.f28461a = Collections.unmodifiableList(new ArrayList(list));
    }
}
