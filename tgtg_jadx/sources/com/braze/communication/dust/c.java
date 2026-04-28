package com.braze.communication.dust;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends z70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f9604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f9606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, z70.c cVar) {
        super(cVar);
        this.f9606c = iVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f9605b = obj;
        this.f9607d |= Integer.MIN_VALUE;
        return this.f9606c.a(this);
    }
}
