package k00;

import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f25673c;

    public o(p pVar) {
        this.f25673c = pVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        q qVar = this.f25673c.f25675d;
        return new AbstractMap.SimpleImmutableEntry(qVar.f25679c.f25712f.get(i11), qVar.f25680d.get(i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25673c.f25675d.f25680d.size();
    }
}
