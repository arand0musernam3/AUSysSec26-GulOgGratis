package com.braze.storage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e90.a f10659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t1 f10660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t1 f10664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f10665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f10666h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(t1 t1Var, String str, long j9, x70.c cVar) {
        super(2, cVar);
        this.f10664f = t1Var;
        this.f10665g = str;
        this.f10666h = j9;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new q1(this.f10664f, this.f10665g, this.f10666h, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        t1 t1Var;
        e90.a aVar;
        String str;
        long j9;
        y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10663e;
        if (i11 == 0) {
            ba0.g.M(obj);
            t1Var = this.f10664f;
            aVar = t1Var.f10694b;
            String str2 = this.f10665g;
            long j11 = this.f10666h;
            this.f10659a = aVar;
            this.f10660b = t1Var;
            this.f10661c = str2;
            this.f10662d = j11;
            this.f10663e = 1;
            if (aVar.g(this) == aVar2) {
                return aVar2;
            }
            str = str2;
            j9 = j11;
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j9 = this.f10662d;
            str = this.f10661c;
            t1Var = this.f10660b;
            aVar = this.f10659a;
            ba0.g.M(obj);
        }
        try {
            Map mapA = t1Var.a();
            mapA.put(str, new Long(j9));
            t1.a(t1Var, mapA);
            return Unit.f26487a;
        } finally {
            aVar.e(null);
        }
    }
}
