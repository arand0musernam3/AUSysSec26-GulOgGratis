package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e5 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11373b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f5 f11374c;

    public /* synthetic */ e5(f5 f5Var, int i11) {
        this.f11372a = i11;
        this.f11374c = f5Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11372a) {
            case 0:
                if (this.f11373b < this.f11374c.f11408a.length()) {
                }
                break;
            default:
                if (this.f11373b < this.f11374c.f11408a.length()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f11372a) {
            case 0:
                String str = this.f11374c.f11408a;
                int i11 = this.f11373b;
                if (i11 >= str.length()) {
                    m0.i1.c();
                } else {
                    this.f11373b = i11 + 1;
                }
                break;
            default:
                f5 f5Var = this.f11374c;
                String str2 = f5Var.f11408a;
                int i12 = this.f11373b;
                if (i12 >= str2.length()) {
                    m0.i1.c();
                } else {
                    this.f11373b = i12 + 1;
                }
                break;
        }
        return null;
    }
}
