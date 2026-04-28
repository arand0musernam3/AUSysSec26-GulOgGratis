package zp;

import a3.w1;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f48021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f48022k;
    public final /* synthetic */ w1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w1 w1Var, x70.c cVar) {
        super(cVar);
        this.l = w1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f48021j = obj;
        this.f48022k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
