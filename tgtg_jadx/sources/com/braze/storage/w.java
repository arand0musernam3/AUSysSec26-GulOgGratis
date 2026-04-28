package com.braze.storage;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataStoreProvider f10726b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(DataStoreProvider dataStoreProvider, x70.c cVar) {
        super(2, cVar);
        this.f10726b = dataStoreProvider;
    }

    public static final String a() {
        return "Clearing all data in file.";
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new w(this.f10726b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w(this.f10726b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10725a;
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.p(13), 12, (Object) null);
            d8.f dataStore = this.f10726b.getDataStore();
            v vVar = new v(null);
            this.f10725a = 1;
            Object objR = xz.b.r(dataStore, vVar, this);
            return objR == aVar ? aVar : objR;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.p(14), 8, (Object) null);
            this.f10726b.publishException("Failed to clear all data in file.", e5);
            return Unit.f26487a;
        }
    }

    public static final String a(String str) {
        return str;
    }
}
