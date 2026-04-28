package com.braze.storage;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataStoreProvider f10633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h8.e f10635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(DataStoreProvider dataStoreProvider, Object obj, h8.e eVar, x70.c cVar) {
        super(2, cVar);
        this.f10633b = dataStoreProvider;
        this.f10634c = obj;
        this.f10635d = eVar;
    }

    public static final String a(Object obj, h8.e eVar) {
        return "Writing data:" + obj + " for key: " + eVar.f21665a + ".";
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new n0(this.f10633b, this.f10634c, this.f10635d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10632a;
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.b(13, this.f10634c, this.f10635d), 12, (Object) null);
            d8.f dataStore = this.f10633b.getDataStore();
            m0 m0Var = new m0(this.f10635d, this.f10634c, null);
            this.f10632a = 1;
            Object objR = xz.b.r(dataStore, m0Var, this);
            return objR == aVar ? aVar : objR;
        } catch (Exception e5) {
            String str = "Failed to write data:" + this.f10634c + " for key: " + this.f10635d.f21665a + ".";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.m(str, 2), 8, (Object) null);
            this.f10633b.publishException(str, e5);
            return Unit.f26487a;
        }
    }

    public static final String a(String str) {
        return str;
    }
}
