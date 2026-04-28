package com.braze.storage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e90.a f10672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t1 f10673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1 f10676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f10677f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(t1 t1Var, String str, x70.c cVar) {
        super(2, cVar);
        this.f10676e = t1Var;
        this.f10677f = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new r1(this.f10676e, this.f10677f, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new r1(this.f10676e, this.f10677f, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        t1 t1Var;
        e90.a aVar;
        String str;
        y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10675d;
        if (i11 == 0) {
            ba0.g.M(obj);
            t1Var = this.f10676e;
            e90.a aVar3 = t1Var.f10694b;
            String str2 = this.f10677f;
            this.f10672a = aVar3;
            this.f10673b = t1Var;
            this.f10674c = str2;
            this.f10675d = 1;
            if (aVar3.g(this) == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            str = str2;
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.f10674c;
            t1Var = this.f10673b;
            aVar = this.f10672a;
            ba0.g.M(obj);
        }
        try {
            Map mapA = t1Var.a();
            mapA.remove(str);
            t1.a(t1Var, mapA);
            return Unit.f26487a;
        } finally {
            aVar.e(null);
        }
    }
}
