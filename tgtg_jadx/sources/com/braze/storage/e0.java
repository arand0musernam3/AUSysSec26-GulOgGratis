package com.braze.storage;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements y80.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y80.i f10552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h8.e f10553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10554c;

    public e0(y80.i iVar, h8.e eVar, Object obj) {
        this.f10552a = iVar;
        this.f10553b = eVar;
        this.f10554c = obj;
    }

    @Override // y80.i
    public final Object collect(y80.j jVar, x70.c cVar) {
        Object objCollect = this.f10552a.collect(new d0(jVar, this.f10553b, this.f10554c), cVar);
        return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
    }
}
