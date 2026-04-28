package com.braze.storage;

import com.braze.support.BrazeLogger;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataStoreProvider f10683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f10684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f10685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(DataStoreProvider dataStoreProvider, Map map, Set set, x70.c cVar) {
        super(2, cVar);
        this.f10683b = dataStoreProvider;
        this.f10684c = map;
        this.f10685d = set;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new s(this.f10683b, this.f10684c, this.f10685d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10682a;
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
            d8.f dataStore = this.f10683b.getDataStore();
            r rVar = new r(this.f10685d, this.f10684c, null);
            this.f10682a = 1;
            Object objR = xz.b.r(dataStore, rVar, this);
            return objR == aVar ? aVar : objR;
        } catch (Exception e5) {
            String str = "Failed to perform batch update with updates:" + this.f10684c + " and removals:" + this.f10685d;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.m(str, 16), 8, (Object) null);
            this.f10683b.publishException(str, e5);
            return Unit.f26487a;
        }
    }

    public static final String a(String str) {
        return str;
    }
}
