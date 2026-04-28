package com.braze.storage;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataStoreProvider f10702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h8.e f10703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(DataStoreProvider dataStoreProvider, h8.e eVar, x70.c cVar) {
        super(2, cVar);
        this.f10702b = dataStoreProvider;
        this.f10703c = eVar;
    }

    public static final String a(h8.e eVar) {
        return "Clearing all data for key: " + eVar + ".";
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new u(this.f10702b, this.f10703c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u(this.f10702b, this.f10703c, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10701a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ba0.g.M(obj);
                    return obj;
                }
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.i(this.f10703c, 2), 12, (Object) null);
            d8.f dataStore = this.f10702b.getDataStore();
            t tVar = new t(this.f10703c, null);
            this.f10701a = 1;
            Object objR = xz.b.r(dataStore, tVar, this);
            return objR == aVar ? aVar : objR;
        } catch (Exception e5) {
            String str = "Failed to clear data for key: " + this.f10703c + ".";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.m(str, 18), 8, (Object) null);
            this.f10702b.publishException(str, e5);
            return Unit.f26487a;
        }
    }

    public static final String a(String str) {
        return str;
    }
}
