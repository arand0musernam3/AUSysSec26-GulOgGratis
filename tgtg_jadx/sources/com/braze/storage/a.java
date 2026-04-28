package com.braze.storage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e90.e f10518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f10520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, x70.c cVar) {
        super(2, cVar);
        this.f10520c = bVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new a(this.f10520c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.f10520c, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10519b;
        if (i11 == 0) {
            ba0.g.M(obj);
            e90.e eVar = this.f10520c.f10533a;
            this.f10518a = eVar;
            this.f10519b = 1;
            if (((e90.h) eVar).b(this) == aVar) {
                return aVar;
            }
            obj2 = eVar;
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj3 = this.f10518a;
            ba0.g.M(obj);
            obj2 = obj3;
        }
        try {
            return Unit.f26487a;
        } finally {
            ((e90.h) obj2).d();
        }
    }
}
