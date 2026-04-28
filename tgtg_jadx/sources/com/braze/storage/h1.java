package com.braze.storage;

import com.adyen.checkout.components.core.Address;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e90.a f10572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k1 f10573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k1 f10577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f10578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f10579h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(k1 k1Var, String str, long j9, x70.c cVar) {
        super(2, cVar);
        this.f10577f = k1Var;
        this.f10578g = str;
        this.f10579h = j9;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new h1(this.f10577f, this.f10578g, this.f10579h, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        e90.a aVar;
        k1 k1Var;
        String str;
        long j9;
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        m90.f0 f0VarJ;
        String strC;
        y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10576e;
        if (i11 == 0) {
            ba0.g.M(obj);
            aVar = this.f10577f.f10605a;
            k1Var = this.f10577f;
            str = this.f10578g;
            j9 = this.f10579h;
            this.f10572a = aVar;
            this.f10573b = k1Var;
            this.f10574c = str;
            this.f10575d = j9;
            this.f10576e = 1;
            if (aVar.g(this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j11 = this.f10575d;
            String str2 = this.f10574c;
            k1Var = this.f10573b;
            aVar = this.f10572a;
            ba0.g.M(obj);
            j9 = j11;
            str = str2;
        }
        try {
            DataStoreKey dataStoreKey = DataStoreKey.ENDPOINT_ATTEMPT_COUNT_MAP;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object data = k1Var.readData(dataStoreKey, "");
                    data.getClass();
                    String str3 = (String) data;
                    if (StringsKt.H(str3)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                        if (StringsKt.H(str3)) {
                            map = kotlin.collections.o0.f26530a;
                            map.getClass();
                        } else if (Intrinsics.areEqual(StringsKt.e0(str3).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                            map = kotlin.collections.o0.f26530a;
                            map.getClass();
                        } else {
                            try {
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
                                try {
                                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                        o30.f0.R(StringCompanionObject.INSTANCE);
                                        m90.r1 r1Var = m90.r1.f29848a;
                                        f0VarJ = o30.f0.j(r1Var, r1Var);
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                        o30.f0.R(StringCompanionObject.INSTANCE);
                                        m90.r1 r1Var2 = m90.r1.f29848a;
                                        o30.f0.Q(LongCompanionObject.INSTANCE);
                                        f0VarJ = o30.f0.j(r1Var2, m90.q0.f29842a);
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                        o30.f0.R(StringCompanionObject.INSTANCE);
                                        m90.r1 r1Var3 = m90.r1.f29848a;
                                        o30.f0.M(BooleanCompanionObject.INSTANCE);
                                        f0VarJ = o30.f0.j(r1Var3, m90.g.f29797a);
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                        o30.f0.R(StringCompanionObject.INSTANCE);
                                        m90.r1 r1Var4 = m90.r1.f29848a;
                                        o30.f0.P(IntCompanionObject.INSTANCE);
                                        f0VarJ = o30.f0.j(r1Var4, m90.l0.f29821a);
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                        o30.f0.R(StringCompanionObject.INSTANCE);
                                        m90.r1 r1Var5 = m90.r1.f29848a;
                                        o30.f0.N(DoubleCompanionObject.INSTANCE);
                                        f0VarJ = o30.f0.j(r1Var5, m90.v.f29868a);
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                        o30.f0.R(StringCompanionObject.INSTANCE);
                                        m90.r1 r1Var6 = m90.r1.f29848a;
                                        o30.f0.O(FloatCompanionObject.INSTANCE);
                                        f0VarJ = o30.f0.j(r1Var6, m90.c0.f29762a);
                                    } else {
                                        dataStoreUtils = dataStoreUtils2;
                                        try {
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) g1.f10569a, 6, (Object) null);
                                            map = kotlin.collections.o0.f26530a;
                                            map.getClass();
                                        } catch (Exception e5) {
                                            e = e5;
                                            exc = e;
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str3), 4, (Object) null);
                                            map = kotlin.collections.o0.f26530a;
                                            map.getClass();
                                        }
                                    }
                                    Object objB = n90.c.f30748d.b(f0VarJ, str3);
                                    objB.getClass();
                                    map = (Map) objB;
                                } catch (Exception e11) {
                                    exc = e11;
                                    dataStoreUtils = dataStoreUtils2;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str3), 4, (Object) null);
                                    map = kotlin.collections.o0.f26530a;
                                    map.getClass();
                                }
                            } catch (Exception e12) {
                                e = e12;
                                dataStoreUtils = dataStoreUtils2;
                            }
                        }
                        linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                    }
                } catch (Exception e13) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new l0(dataStoreKey), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            linkedHashMap.put(str, new Long(j9));
            DataStoreKey dataStoreKey2 = DataStoreKey.ENDPOINT_ATTEMPT_COUNT_MAP;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey2), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    try {
                        n90.b bVar = n90.c.f30748d;
                        bVar.getClass();
                        strC = bVar.c(new m90.f0(m90.r1.f29848a, m90.q0.f29842a, 1), linkedHashMap);
                    } catch (Exception e14) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e14, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                        strC = "{}";
                    }
                    k1Var.writeData(dataStoreKey2, strC);
                } catch (Exception e15) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e15, false, (Function0) new r0(dataStoreKey2), 8, (Object) null);
                }
            }
            return Unit.f26487a;
        } finally {
            aVar.e(null);
        }
    }
}
