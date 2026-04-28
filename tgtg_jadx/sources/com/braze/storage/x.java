package com.braze.storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends z70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f10737c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, x70.c cVar) {
        super(cVar);
        this.f10737c = yVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f10735a = obj;
        this.f10736b |= Integer.MIN_VALUE;
        return this.f10737c.emit(null, this);
    }
}
