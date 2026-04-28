package y80;

import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45623k;
    public final /* synthetic */ a1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a1 f45624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f45625n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Ref.ObjectRef f45626o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, x70.c cVar) {
        super(cVar);
        this.l = a1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45622j = obj;
        this.f45623k |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
