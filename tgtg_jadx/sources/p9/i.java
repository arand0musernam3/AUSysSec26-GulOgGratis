package p9;

import oq.k;

/* JADX INFO: loaded from: classes.dex */
public final class i extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f34618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34619k;
    public final /* synthetic */ k l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, x70.c cVar) {
        super(cVar);
        this.l = kVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f34618j = obj;
        this.f34619k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
