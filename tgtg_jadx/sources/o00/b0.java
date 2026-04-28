package o00;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient e0 f31622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f31623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f31624e;

    public b0(e0 e0Var, Object[] objArr, int i11) {
        this.f31622c = e0Var;
        this.f31623d = objArr;
        this.f31624e = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f31622c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // o00.s
    public final int e(Object[] objArr) {
        return i().e(objArr);
    }

    @Override // o00.x
    public final j00.g g() {
        return i().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // o00.x
    public final v j() {
        return new a0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f31624e;
    }
}
