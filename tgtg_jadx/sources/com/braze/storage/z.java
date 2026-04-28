package com.braze.storage;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements y80.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y80.i f10744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h8.e f10745b;

    public z(y80.i iVar, h8.e eVar) {
        this.f10744a = iVar;
        this.f10745b = eVar;
    }

    @Override // y80.i
    public final Object collect(y80.j jVar, x70.c cVar) {
        Object objCollect = this.f10744a.collect(new y(jVar, this.f10745b), cVar);
        return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
    }
}
