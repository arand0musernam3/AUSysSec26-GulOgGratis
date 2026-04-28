package aa;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f1088k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Ref.ObjectRef f1089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CoroutineContext f1090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Ref.ObjectRef f1091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r40.d f1092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f1094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1095s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, z70.c cVar) {
        super(cVar);
        this.f1094r = hVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f1093q = obj;
        this.f1095s |= Integer.MIN_VALUE;
        return this.f1094r.T(false, null, this);
    }
}
