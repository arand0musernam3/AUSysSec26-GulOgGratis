package mn;

import lh.q;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f30013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30014k;
    public final /* synthetic */ q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, x70.c cVar) {
        super(cVar);
        this.l = qVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f30013j = obj;
        this.f30014k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
