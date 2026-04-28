package pk;

import oq.k;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f35449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35450k;
    public final /* synthetic */ k l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, x70.c cVar) {
        super(cVar);
        this.l = kVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f35449j = obj;
        this.f35450k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
