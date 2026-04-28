package uf;

import androidx.constraintlayout.widget.z;
import q1.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z f41109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h1 f41110k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f41111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41112n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z zVar, z70.c cVar) {
        super(cVar);
        this.f41111m = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f41112n |= Integer.MIN_VALUE;
        return this.f41111m.b(null, this);
    }
}
