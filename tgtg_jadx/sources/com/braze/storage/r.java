package com.braze.storage;

import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f10669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f10670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Set set, Map map, x70.c cVar) {
        super(2, cVar);
        this.f10669b = set;
        this.f10670c = map;
    }

    public static final String a(String str, Object obj) {
        return "Adding/updating key: " + str + " with value: " + obj + " in DataStore.";
    }

    public static final String b(String str, Object obj) {
        return j4.s.k("Unsupported value type for key '", str, "': ", Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName());
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        r rVar = new r(this.f10669b, this.f10670c, cVar);
        rVar.f10668a = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((h8.a) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        h8.a aVar2 = (h8.a) this.f10668a;
        for (String str : this.f10669b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.m(str, 15), 12, (Object) null);
            aVar2.e(wd.a.G(str));
            aVar2.e(new h8.e(str));
            aVar2.e(new h8.e(str));
            aVar2.e(new h8.e(str));
            aVar2.e(new h8.e(str));
            aVar2.e(new h8.e(str));
        }
        for (Map.Entry entry : this.f10670c.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            DataStoreProvider.Companion companion = DataStoreProvider.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, companion.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new com.braze.z1(value, 5, str2), 12, (Object) null);
            if (value instanceof String) {
                h8.e eVarG = wd.a.G(str2);
                aVar2.getClass();
                aVar2.g(eVarG, value);
            } else if (value instanceof Integer) {
                h8.e eVarZ = wd.a.z(str2);
                aVar2.getClass();
                aVar2.g(eVarZ, value);
            } else if (value instanceof Long) {
                h8.e eVarC = wd.a.C(str2);
                aVar2.getClass();
                aVar2.g(eVarC, value);
            } else if (value instanceof Float) {
                h8.e eVarT = wd.a.t(str2);
                aVar2.getClass();
                aVar2.g(eVarT, value);
            } else if (value instanceof Double) {
                h8.e eVarQ = wd.a.q(str2);
                aVar2.getClass();
                aVar2.g(eVarQ, value);
            } else if (value instanceof Boolean) {
                h8.e eVarK = wd.a.k(str2);
                aVar2.getClass();
                aVar2.g(eVarK, value);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.z1(value, 6, str2), 12, (Object) null);
            }
        }
        return Unit.f26487a;
    }

    public static final String a(String str) {
        return w.a0.p("Removing key: ", str, " from DataStore.");
    }
}
