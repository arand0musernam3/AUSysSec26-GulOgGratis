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
public final class l2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e90.a f10614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m2 f10615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m2 f10618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f10619f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, String str, x70.c cVar) {
        super(2, cVar);
        this.f10618e = m2Var;
        this.f10619f = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new l2(this.f10618e, this.f10619f, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new l2(this.f10618e, this.f10619f, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        e90.a aVar;
        m2 m2Var;
        String str;
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        KClass orCreateKotlinClass;
        m90.f0 f0VarJ;
        String strC;
        y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10617d;
        if (i11 == 0) {
            ba0.g.M(obj);
            aVar = this.f10618e.f10629a;
            m2Var = this.f10618e;
            str = this.f10619f;
            this.f10614a = aVar;
            this.f10615b = m2Var;
            this.f10616c = str;
            this.f10617d = 1;
            if (aVar.g(this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str2 = this.f10616c;
            m2Var = this.f10615b;
            aVar = this.f10614a;
            ba0.g.M(obj);
            str = str2;
        }
        try {
            DataStoreKey dataStoreKey = DataStoreKey.PERMISSION_REQUEST_COUNTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object data = m2Var.readData(dataStoreKey, "");
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
                                orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Integer.class);
                            } catch (Exception e5) {
                                e = e5;
                                dataStoreUtils = dataStoreUtils2;
                            }
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
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) k2.f10606a, 6, (Object) null);
                                        map = kotlin.collections.o0.f26530a;
                                        map.getClass();
                                    } catch (Exception e11) {
                                        e = e11;
                                        exc = e;
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str3), 4, (Object) null);
                                        map = kotlin.collections.o0.f26530a;
                                        map.getClass();
                                    }
                                }
                                Object objB = n90.c.f30748d.b(f0VarJ, str3);
                                objB.getClass();
                                map = (Map) objB;
                            } catch (Exception e12) {
                                exc = e12;
                                dataStoreUtils = dataStoreUtils2;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str3), 4, (Object) null);
                                map = kotlin.collections.o0.f26530a;
                                map.getClass();
                            }
                        }
                        linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                    }
                } catch (Exception e13) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new l0(dataStoreKey), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            Integer num = (Integer) linkedHashMap.get(str);
            linkedHashMap.put(str, new Integer((num != null ? num.intValue() : 0) + 1));
            DataStoreKey dataStoreKey2 = DataStoreKey.PERMISSION_REQUEST_COUNTS;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey2), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    try {
                        n90.b bVar = n90.c.f30748d;
                        bVar.getClass();
                        strC = bVar.c(new m90.f0(m90.r1.f29848a, m90.l0.f29821a, 1), linkedHashMap);
                    } catch (Exception e14) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e14, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                        strC = "{}";
                    }
                    m2Var.writeData(dataStoreKey2, strC);
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
