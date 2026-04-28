package com.braze.storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends z70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f10542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, x70.c cVar) {
        super(cVar);
        this.f10542c = d0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f10540a = obj;
        this.f10541b |= Integer.MIN_VALUE;
        return this.f10542c.emit(null, this);
    }
}
