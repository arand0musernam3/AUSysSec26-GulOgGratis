package a4;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f680a;

    public a(List list) {
        this.f680a = list;
    }

    public final boolean a() {
        List list = this.f680a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((d) list.get(i11)).getClass();
        }
        return false;
    }
}
