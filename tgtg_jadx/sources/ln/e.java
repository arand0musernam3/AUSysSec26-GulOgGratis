package ln;

import lh.q;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f27943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27944k;
    public final /* synthetic */ q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, x70.c cVar) {
        super(cVar);
        this.l = qVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f27943j = obj;
        this.f27944k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
