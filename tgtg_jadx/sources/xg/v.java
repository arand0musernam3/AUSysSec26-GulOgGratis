package xg;

import ss.o0;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f44297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f44298k;
    public final /* synthetic */ o0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(o0 o0Var, x70.c cVar) {
        super(cVar);
        this.l = o0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f44297j = obj;
        this.f44298k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
