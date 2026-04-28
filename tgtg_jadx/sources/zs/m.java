package zs;

import a3.w1;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f48094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f48095k;
    public final /* synthetic */ w1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(w1 w1Var, x70.c cVar) {
        super(cVar);
        this.l = w1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f48094j = obj;
        this.f48095k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
