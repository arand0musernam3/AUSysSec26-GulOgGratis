package h0;

import androidx.lifecycle.n1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f20975k;
    public final /* synthetic */ n1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20976m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n1 n1Var, z70.c cVar) {
        super(cVar);
        this.l = n1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f20975k = obj;
        this.f20976m |= Integer.MIN_VALUE;
        return n1.d(this.l, this);
    }
}
