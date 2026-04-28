package z1;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a4 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u70.f f46401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function0 f46402k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f46403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b4 f46404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f46405o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(b4 b4Var, z70.c cVar) {
        super(cVar);
        this.f46404n = b4Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f46403m = obj;
        this.f46405o |= Integer.MIN_VALUE;
        return this.f46404n.a(null, null, this);
    }
}
