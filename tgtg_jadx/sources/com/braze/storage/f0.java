package com.braze.storage;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataStoreProvider f10558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h8.e f10559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(DataStoreProvider dataStoreProvider, h8.e eVar, Object obj, x70.c cVar) {
        super(2, cVar);
        this.f10558b = dataStoreProvider;
        this.f10559c = eVar;
        this.f10560d = obj;
    }

    public static final String a(h8.e eVar) {
        return w.a0.p("Reading data for key: ", eVar.f21665a, ".");
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new f0(this.f10558b, this.f10559c, this.f10560d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10557a;
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.i(this.f10559c, 1), 12, (Object) null);
            e0 e0Var = new e0(this.f10558b.getDataStore().getData(), this.f10559c, this.f10560d);
            this.f10557a = 1;
            Object objQ = y80.r.q(e0Var, this);
            return objQ == aVar ? aVar : objQ;
        } catch (Exception e5) {
            String str = "Failed to read data for key: " + this.f10559c.f21665a + ". Using default value: " + this.f10560d + ".";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new dw.d(str, 28), 8, (Object) null);
            this.f10558b.publishException(str, e5);
            return this.f10560d;
        }
    }

    public static final String a(String str) {
        return str;
    }
}
