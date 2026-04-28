package bs;

import a3.w1;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6694k;
    public final /* synthetic */ w1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w1 w1Var, x70.c cVar) {
        super(cVar);
        this.l = w1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f6693j = obj;
        this.f6694k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
