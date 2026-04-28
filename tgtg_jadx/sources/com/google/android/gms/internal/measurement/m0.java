package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f11621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f11622b;

    public m0(n1 n1Var, Iterator it, Iterator it2) {
        this.f11621a = it;
        this.f11622b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11621a.hasNext()) {
            return true;
        }
        return this.f11622b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f11621a;
        if (it.hasNext()) {
            return new f5(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f11622b;
        if (it2.hasNext()) {
            return new f5((String) it2.next());
        }
        m0.i1.c();
        return null;
    }
}
