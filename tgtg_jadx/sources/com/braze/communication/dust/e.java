package com.braze.communication.dust;

import com.braze.h2;
import java.io.BufferedReader;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.f0;
import v80.p0;
import x80.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BufferedReader f9614c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BufferedReader bufferedReader, x70.c cVar) {
        super(2, cVar);
        this.f9614c = bufferedReader;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        e eVar = new e(this.f9614c, cVar);
        eVar.f9613b = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        e eVar = new e(this.f9614c, (x70.c) obj2);
        eVar.f9613b = (u) obj;
        return eVar.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        u uVar;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f9612a;
        if (i11 == 0) {
            ba0.g.M(obj);
            uVar = (u) this.f9613b;
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uVar = (u) this.f9613b;
            ba0.g.M(obj);
        }
        while (f0.y(uVar)) {
            c90.f fVar = p0.f42144a;
            c90.e eVar = c90.e.f7834b;
            d dVar = new d(this.f9614c, uVar, null);
            this.f9613b = uVar;
            this.f9612a = 1;
            if (f0.K(eVar, dVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f26487a;
    }
}
