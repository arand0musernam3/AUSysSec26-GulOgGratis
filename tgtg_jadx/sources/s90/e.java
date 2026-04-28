package s90;

import ia0.j0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f38928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f38929d;

    public e(g gVar, String str, long j9, ArrayList arrayList, long[] jArr) {
        str.getClass();
        jArr.getClass();
        this.f38929d = gVar;
        this.f38926a = str;
        this.f38927b = j9;
        this.f38928c = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f38928c.iterator();
        while (it.hasNext()) {
            r90.e.b((j0) it.next());
        }
    }
}
