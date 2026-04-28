package aa;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f1175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function0 f1176k;
    public Ref.ObjectRef l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0 f1178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1179o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, z70.c cVar) {
        super(cVar);
        this.f1178n = a0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f1177m = obj;
        this.f1179o |= Integer.MIN_VALUE;
        return this.f1178n.b(0L, null, this);
    }
}
