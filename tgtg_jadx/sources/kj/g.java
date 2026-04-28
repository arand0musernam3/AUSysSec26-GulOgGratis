package kj;

import al.z;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f26453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26454k;
    public final /* synthetic */ z l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(z zVar, x70.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f26453j = obj;
        this.f26454k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
