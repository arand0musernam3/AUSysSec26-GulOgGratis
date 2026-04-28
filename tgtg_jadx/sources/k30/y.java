package k30;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f25929c;

    public y(z zVar) {
        this.f25929c = zVar;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        z zVar = this.f25929c;
        na0.a.Z(i11, zVar.f25932f);
        Object[] objArr = zVar.f25931e;
        int i12 = i11 * 2;
        Object obj = objArr[i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i12 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // k30.b
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25929c.f25932f;
    }

    @Override // k30.h, k30.b
    public Object writeReplace() {
        return super.writeReplace();
    }
}
