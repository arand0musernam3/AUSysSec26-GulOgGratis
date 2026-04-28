package y80;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45499k;
    public final /* synthetic */ at.o l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f45500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Iterator f45501n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(at.o oVar, x70.c cVar) {
        super(cVar);
        this.l = oVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45498j = obj;
        this.f45499k |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
