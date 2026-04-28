package com.braze.storage;

import android.content.Context;
import com.adyen.checkout.components.core.Address;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
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
public final class m2 extends DataStoreProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h2 f10628b = new h2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e90.a f10629a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(Context context) {
        super(context);
        context.getClass();
        this.f10629a = e90.d.a();
    }

    public final int a(String str) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        m90.f0 f0VarJ;
        str.getClass();
        DataStoreKey dataStoreKey = DataStoreKey.PERMISSION_REQUEST_COUNTS;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = readData(dataStoreKey, "");
                data.getClass();
                String str2 = (String) data;
                if (StringsKt.H(str2)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str2)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else if (Intrinsics.areEqual(StringsKt.e0(str2).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else {
                        try {
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Integer.class);
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
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) j2.f10602a, 6, (Object) null);
                                        map = kotlin.collections.o0.f26530a;
                                        map.getClass();
                                    } catch (Exception e5) {
                                        e = e5;
                                        exc = e;
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                                        map = kotlin.collections.o0.f26530a;
                                        map.getClass();
                                    }
                                }
                                Object objB = n90.c.f30748d.b(f0VarJ, str2);
                                objB.getClass();
                                map = (Map) objB;
                            } catch (Exception e11) {
                                exc = e11;
                                dataStoreUtils = dataStoreUtils2;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
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
        Integer num = (Integer) linkedHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.c0.c(new f8.b(getContext(), "com.braze.support.permission_util.requested_perms", (aa.l0) null, new i2(), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.permission";
    }
}
