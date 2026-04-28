package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class nh implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg f11675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oh f11678d;

    public /* synthetic */ nh(oh ohVar, tg tgVar, int i11) {
        this.f11678d = ohVar;
        this.f11675a = tgVar;
        int i12 = i11 & 31;
        this.f11676b = i12;
        this.f11677c = i11 >>> (i12 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11676b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i11 = this.f11676b;
        oh ohVar = this.f11678d;
        la laVar = ohVar.f11733b;
        int iA = laVar.a();
        Object objCast = this.f11675a.f11908b.cast(i11 >= iA ? ohVar.f11734c.j(i11 - iA) : laVar.j(i11));
        int i12 = this.f11677c;
        if (i12 == 0) {
            this.f11676b = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i12) + 1;
        this.f11677c >>>= iNumberOfTrailingZeros;
        this.f11676b += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
