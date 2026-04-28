package k00;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25675d;

    public p(q qVar) {
        this.f25675d = qVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f25675d.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // k00.h
    public final b0 e() {
        return j().listIterator(0);
    }

    @Override // k00.n, java.util.Collection, java.util.Set
    public final int hashCode() {
        return a.b(this.f25675d.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return j().listIterator(0);
    }

    @Override // k00.n
    public final l l() {
        return new o(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25675d.f25680d.size();
    }
}
