package b0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f5251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f5252k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l1 f5253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5254n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, z70.c cVar) {
        super(cVar);
        this.f5253m = l1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f5254n |= Integer.MIN_VALUE;
        return this.f5253m.e(this);
    }
}
