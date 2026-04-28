package f0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d1 f16962k;
    public Function1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Ref.IntRef f16963m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AutoCloseable f16964n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j0 f16965o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f16966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f16967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x3 f16968r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16969s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(x3 x3Var, z70.c cVar) {
        super(cVar);
        this.f16968r = x3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16967q = obj;
        this.f16969s |= Integer.MIN_VALUE;
        return this.f16968r.b(null, null, null, this);
    }
}
