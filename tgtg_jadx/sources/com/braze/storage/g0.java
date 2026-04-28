package com.braze.storage;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataStoreProvider f10568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(DataStoreProvider dataStoreProvider, x70.c cVar) {
        super(2, cVar);
        this.f10568b = dataStoreProvider;
    }

    public static final String a() {
        return "Reading all data from DataStore.";
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new g0(this.f10568b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g0(this.f10568b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10567a;
        try {
            if (i11 == 0) {
                ba0.g.M(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.f(26), 12, (Object) null);
                y80.i data = this.f10568b.getDataStore().getData();
                this.f10567a = 1;
                obj = y80.r.q(data, this);
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
            return ((h8.g) obj).a();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.f(27), 8, (Object) null);
            this.f10568b.publishException("Failed to read all data from DataStore", e5);
            kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
            o0Var.getClass();
            return o0Var;
        }
    }

    public static final String a(String str) {
        return str;
    }
}
