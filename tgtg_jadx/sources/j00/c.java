package j00;

import bx.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient e f24352c;

    public c(e eVar) {
        this.f24352c = eVar;
    }

    @Override // j00.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f24352c.contains(obj);
    }

    @Override // j00.e
    public final e g() {
        return this.f24352c;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        e eVar = this.f24352c;
        o.T(i11, eVar.size());
        return eVar.get((eVar.size() - 1) - i11);
    }

    @Override // j00.e, java.util.List
    /* JADX INFO: renamed from: h */
    public final e subList(int i11, int i12) {
        e eVar = this.f24352c;
        o.U(i11, i12, eVar.size());
        return eVar.subList(eVar.size() - i12, eVar.size() - i11).g();
    }

    @Override // j00.e, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f24352c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // j00.e, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f24352c.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24352c.size();
    }
}
