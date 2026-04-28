package com.braze.storage;

import android.content.Context;
import com.adyen.checkout.components.core.Address;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f10592a;

    public j(Context context, String str, String str2) {
        context.getClass();
        this.f10592a = new o1(context, str, str2);
    }

    public static final String c(com.braze.models.k kVar) {
        return e0.f.k("Adding event to storage with uid ", ((com.braze.models.outgoing.event.b) kVar).e());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(Set set) {
        Map linkedHashMap;
        Map map;
        m90.f0 f0VarJ;
        String strC;
        set.getClass();
        o1 o1Var = this.f10592a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = o1Var.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (StringsKt.H(str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else if (Intrinsics.areEqual(StringsKt.e0(str).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else {
                        try {
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) h.f10570a, 6, (Object) null);
                                map = kotlin.collections.o0.f26530a;
                                map.getClass();
                            }
                            Object objB = n90.c.f30748d.b(f0VarJ, str);
                            objB.getClass();
                            map = (Map) objB;
                        } catch (Exception e5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                            map = kotlin.collections.o0.f26530a;
                            map.getClass();
                        }
                    }
                    linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new l0(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        Map map2 = linkedHashMap;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String strE = ((com.braze.models.outgoing.event.b) ((com.braze.models.k) it.next())).e();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.m(strE, 0), 7, (Object) null);
            map2.remove(strE);
        }
        o1 o1Var2 = this.f10592a;
        DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey2), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                m90.r1 r1Var7 = m90.r1.f29848a;
                strC = bVar.c(new m90.f0(r1Var7, r1Var7, 1), map2);
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = (!(map2 instanceof Map) && (map2 instanceof List)) ? "[]" : "{}";
            }
            o1Var2.writeData(dataStoreKey2, strC);
        } catch (Exception e13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new r0(dataStoreKey2), 8, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0396 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0376  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection b() {
        /*
            Method dump skipped, instruction units count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.storage.j.b():java.util.Collection");
    }

    public static final String a(String str, String str2) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Could not create BrazeEvent from [serialized event string=", str, ", unique identifier=", str2, "] ... Deleting!");
    }

    public final void a(com.braze.models.k kVar) {
        Map linkedHashMap;
        Map map;
        m90.f0 f0VarJ;
        String strC;
        kVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.n(kVar, 0), 7, (Object) null);
        o1 o1Var = this.f10592a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = o1Var.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (StringsKt.H(str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else if (Intrinsics.areEqual(StringsKt.e0(str).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else {
                        try {
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
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
                                BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) f.f10556a, 6, (Object) null);
                                map = kotlin.collections.o0.f26530a;
                                map.getClass();
                            }
                            Object objB = n90.c.f30748d.b(f0VarJ, str);
                            objB.getClass();
                            map = (Map) objB;
                        } catch (Exception e5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                            map = kotlin.collections.o0.f26530a;
                            map.getClass();
                        }
                    }
                    linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new l0(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        com.braze.models.outgoing.event.b bVar = (com.braze.models.outgoing.event.b) kVar;
        linkedHashMap.put(bVar.e(), bVar.a());
        o1 o1Var2 = this.f10592a;
        DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey2), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar2 = n90.c.f30748d;
                bVar2.getClass();
                m90.r1 r1Var7 = m90.r1.f29848a;
                strC = bVar2.c(new m90.f0(r1Var7, r1Var7, 1), linkedHashMap);
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = "{}";
            }
            o1Var2.writeData(dataStoreKey2, strC);
        } catch (Exception e13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new r0(dataStoreKey2), 8, (Object) null);
        }
    }

    public static final String a() {
        return "Storage provider is closed. Not getting all events.";
    }

    public static final String a(String str) {
        return e0.f.k("Deleting event from storage with uid ", str);
    }

    public static final String b(com.braze.models.k kVar) {
        return "Storage provider is closed. Not adding event: " + kVar;
    }

    public static final String b(Set set) {
        return "Storage provider is closed. Not deleting events: " + set;
    }
}
