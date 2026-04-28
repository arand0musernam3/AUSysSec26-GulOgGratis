package qc;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f36931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.BooleanRef f36932k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f36933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36934n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a0 a0Var, z70.c cVar) {
        super(cVar);
        this.f36933m = a0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f36934n |= Integer.MIN_VALUE;
        return this.f36933m.a(this);
    }
}
