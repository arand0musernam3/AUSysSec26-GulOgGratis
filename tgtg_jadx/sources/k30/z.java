package k30;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient k f25930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f25931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f25932f;

    public z(k kVar, Object[] objArr, int i11) {
        this.f25930d = kVar;
        this.f25931e = objArr;
        this.f25932f = i11;
    }

    @Override // k30.b
    public final int c(Object[] objArr) {
        return b().c(objArr);
    }

    @Override // k30.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f25930d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // k30.b
    public final boolean h() {
        return true;
    }

    @Override // k30.b
    /* JADX INFO: renamed from: i */
    public final j00.g iterator() {
        return b().listIterator(0);
    }

    @Override // k30.m
    public final h m() {
        return new y(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25932f;
    }

    @Override // k30.m, k30.b
    public Object writeReplace() {
        return super.writeReplace();
    }
}
