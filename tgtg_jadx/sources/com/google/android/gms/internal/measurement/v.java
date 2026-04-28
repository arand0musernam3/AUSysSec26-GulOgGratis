package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f11949b;

    public v(w wVar, int i11) {
        this.f11949b = wVar;
        this.f11948a = i11;
    }

    public final int b() {
        int i11 = this.f11948a;
        if (i11 == -1) {
            return 0;
        }
        return this.f11949b.f11975b[i11];
    }

    public final int c() {
        return this.f11949b.f11975b[this.f11948a + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f11949b.f11974a, b(), c(), obj, this.f11948a == -1 ? w.f11973f : y.f12046b) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new u(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return c() - b();
    }
}
