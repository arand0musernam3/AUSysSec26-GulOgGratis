package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11913b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractSet f11914c;

    public /* synthetic */ u(AbstractSet abstractSet, int i11) {
        this.f11912a = i11;
        this.f11914c = abstractSet;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11912a) {
            case 0:
                int i11 = this.f11913b;
                v vVar = (v) this.f11914c;
                if (i11 < vVar.c() - vVar.b()) {
                }
                break;
            default:
                if (this.f11913b < ((oh) ((androidx.datastore.preferences.protobuf.f1) this.f11914c).f2963b).f11736e) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11912a) {
            case 0:
                int i11 = this.f11913b;
                v vVar = (v) this.f11914c;
                if (i11 >= vVar.c() - vVar.b()) {
                    m0.i1.c();
                    return null;
                }
                w wVar = vVar.f11949b;
                Object obj = wVar.f11974a[vVar.b() + i11];
                this.f11913b = i11 + 1;
                return obj;
            default:
                int i12 = this.f11913b;
                this.f11913b = i12 + 1;
                oh ohVar = (oh) ((androidx.datastore.preferences.protobuf.f1) this.f11914c).f2963b;
                return ohVar.d(ohVar.f11735d[i12] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11912a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
