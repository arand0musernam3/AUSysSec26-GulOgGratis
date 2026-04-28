package d8;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f14625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f14626k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Ref.ObjectRef f14627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y f14628n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f14629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f14630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14631q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, z70.c cVar) {
        super(cVar);
        this.f14630p = jVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f14629o = obj;
        this.f14631q |= Integer.MIN_VALUE;
        return this.f14630p.a(null, this);
    }
}
