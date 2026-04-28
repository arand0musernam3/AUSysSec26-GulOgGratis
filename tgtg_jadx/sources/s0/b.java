package s0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f38281c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38279a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f38280b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f38282d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38283e = false;

    public b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            arrayList.add(w0.e.n(str, null, null));
        }
        this.f38281c = arrayList;
    }

    public final void a(List list, Throwable th2) {
        boolean z11;
        List listUnmodifiableList;
        Throwable th3;
        synchronized (this.f38279a) {
            try {
                if (th2 != null) {
                    z11 = this.f38282d == null || !this.f38281c.isEmpty();
                    this.f38282d = th2;
                    this.f38281c = Collections.EMPTY_LIST;
                } else {
                    list.getClass();
                    boolean z12 = (this.f38282d == null && this.f38281c.equals(list)) ? false : true;
                    this.f38282d = null;
                    this.f38281c = list;
                    z11 = z12;
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f38281c);
                th3 = this.f38282d;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z11) {
            StringBuilder sb2 = new StringBuilder("Data changed. Notifying ");
            sb2.append(this.f38280b.size());
            sb2.append(" observers. Error: ");
            sb2.append(th3 != null);
            Log.d("CameraPresenceSrc", sb2.toString());
            for (a aVar : this.f38280b) {
                aVar.f38276a.execute(new a40.q(th3, aVar, listUnmodifiableList, 28));
            }
        }
    }
}
