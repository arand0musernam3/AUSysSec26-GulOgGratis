package com.google.android.gms.internal.measurement;

import java.util.AbstractList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q1 extends AbstractList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f11775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f11776b;

    public q1(o1 o1Var, p1 p1Var) {
        this.f11775a = o1Var;
        this.f11776b = p1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        int iD = ((l1) this.f11775a).d(i11);
        ((h1) this.f11776b).getClass();
        l0 l0VarC = l0.c(iD);
        return l0VarC == null ? l0.UNKNOWN : l0VarC;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((l1) this.f11775a).f11583c;
    }
}
