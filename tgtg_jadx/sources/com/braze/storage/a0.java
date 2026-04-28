package com.braze.storage;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataStoreProvider f10522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h8.e f10523c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(DataStoreProvider dataStoreProvider, h8.e eVar, x70.c cVar) {
        super(2, cVar);
        this.f10522b = dataStoreProvider;
        this.f10523c = eVar;
    }

    public static final String a(h8.e eVar) {
        return w.a0.p("Checking if data store contains data for key: ", eVar.f21665a, ".");
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new a0(this.f10522b, this.f10523c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a0(this.f10522b, this.f10523c, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10521a;
        boolean z11 = false;
        try {
            if (i11 == 0) {
                ba0.g.M(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.i(this.f10523c, 0), 12, (Object) null);
                z zVar = new z(this.f10522b.getDataStore().getData(), this.f10523c);
                this.f10521a = 1;
                obj = y80.r.r(zVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
            }
            if (obj != null) {
                z11 = true;
            }
        } catch (Exception e5) {
            String strP = w.a0.p("Failed to check if data store contains key: ", this.f10523c.f21665a, ". Using default value: false.");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new dw.d(strP, 19), 8, (Object) null);
            this.f10522b.publishException(strP, e5);
        }
        return Boolean.valueOf(z11);
    }

    public static final String a(String str) {
        return str;
    }
}
