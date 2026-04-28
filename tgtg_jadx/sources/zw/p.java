package zw;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f48319a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48320b = 0;

    public final void a() {
        this.f48320b += 1000;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f48319a.iterator();
        while (it.hasNext()) {
            sb2.append((q) it.next());
            sb2.append(' ');
        }
        sb2.append('[');
        return r8.k.o(sb2, this.f48320b, ']');
    }
}
