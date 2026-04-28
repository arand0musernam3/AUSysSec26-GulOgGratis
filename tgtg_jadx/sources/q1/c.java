package q1;

import com.braze.h2;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35724b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f35726d;

    public c(e eVar) {
        this.f35726d = eVar;
        this.f35723a = eVar.f35782c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f35725c) {
            h2.b("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i11 = this.f35724b;
        e eVar = this.f35726d;
        return Intrinsics.areEqual(key, eVar.g(i11)) && Intrinsics.areEqual(entry.getValue(), eVar.j(this.f35724b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f35725c) {
            return this.f35726d.g(this.f35724b);
        }
        h2.b("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f35725c) {
            return this.f35726d.j(this.f35724b);
        }
        h2.b("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35724b < this.f35723a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f35725c) {
            h2.b("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i11 = this.f35724b;
        e eVar = this.f35726d;
        Object objG = eVar.g(i11);
        Object objJ = eVar.j(this.f35724b);
        return (objG == null ? 0 : objG.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            m0.i1.c();
            return null;
        }
        this.f35724b++;
        this.f35725c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f35725c) {
            qc.y.e();
            return;
        }
        this.f35726d.h(this.f35724b);
        this.f35724b--;
        this.f35723a--;
        this.f35725c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f35725c) {
            return this.f35726d.i(this.f35724b, obj);
        }
        h2.b("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
