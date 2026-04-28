package jt;

import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.CateringItem;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.item.response.Item;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import com.app.tgtg.model.remote.item.response.TableReservationItem;
import com.google.firebase.messaging.a0;
import i2.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import m0.i1;
import o30.e0;
import p80.m;
import q90.y;
import q90.z;
import u70.l;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mv.b f25407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f25408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oa0.b f25409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f25410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f25411e;

    public h(mv.b bVar, a aVar) {
        Object next;
        KClass kClass;
        bVar.getClass();
        aVar.getClass();
        this.f25407a = bVar;
        this.f25408b = aVar;
        this.f25409c = new oa0.b(2);
        this.f25410d = l.b(new g(this, 0));
        x xVar = new x();
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BasicItem.class);
        j30.g gVar = new j30.g(orCreateKotlinClass);
        KClass kClass2 = (KClass) gVar.f24502b;
        gVar.F(Reflection.getOrCreateKotlinClass(Item.class), Item.INSTANCE.serializer());
        gVar.F(Reflection.getOrCreateKotlinClass(FlashSalesItem.class), FlashSalesItem.INSTANCE.serializer());
        gVar.F(Reflection.getOrCreateKotlinClass(ManufacturerItem.class), ManufacturerItem.INSTANCE.serializer());
        gVar.F(Reflection.getOrCreateKotlinClass(CateringItem.class), CateringItem.INSTANCE.serializer());
        gVar.F(Reflection.getOrCreateKotlinClass(TableReservationItem.class), TableReservationItem.INSTANCE.serializer());
        im.a aVar2 = new im.a(21);
        if (((im.a) gVar.f24504d) != null) {
            StringBuilder sb2 = new StringBuilder("Default deserializer provider is already registered for class ");
            sb2.append(orCreateKotlinClass);
            e40.a.m(sb2, ": ", (im.a) gVar.f24504d);
            throw null;
        }
        gVar.f24504d = aVar2;
        for (Pair pair : (ArrayList) gVar.f24503c) {
            KClass kClass3 = (KClass) pair.f26485a;
            KSerializer kSerializer = (KSerializer) pair.f26486b;
            kClass3.getClass();
            kSerializer.getClass();
            kClass2.getClass();
            kClass3.getClass();
            kSerializer.getClass();
            String strA = kSerializer.getDescriptor().a();
            HashMap map = (HashMap) xVar.f22929c;
            Object map2 = map.get(kClass2);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(kClass2, map2);
            }
            Map map3 = (Map) map2;
            HashMap map4 = (HashMap) xVar.f22931e;
            Object map5 = map4.get(kClass2);
            if (map5 == null) {
                map5 = new HashMap();
                map4.put(kClass2, map5);
            }
            Map map6 = (Map) map5;
            KSerializer kSerializer2 = (KSerializer) map3.get(kClass3);
            if (kSerializer2 != null && !Intrinsics.areEqual(kSerializer2, kSerializer)) {
                throw new m("Serializer for " + kClass3 + " already registered in the scope of " + kClass2);
            }
            KSerializer kSerializer3 = (KSerializer) map6.get(strA);
            if (kSerializer3 == null || Intrinsics.areEqual(kSerializer3, kSerializer)) {
                map3.put(kClass3, kSerializer);
                map6.put(strA, kSerializer);
            } else {
                Iterator it = ((Iterable) CollectionsKt.F(map3.entrySet()).f7286b).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((Map.Entry) next).getValue() == kSerializer3) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null && (kClass = (KClass) entry.getKey()) != null) {
                    throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + kClass2 + "' have the same serial name '" + strA + "': " + kSerializer + " for '" + kClass3 + "' and " + kSerializer3 + " for '" + kClass + '\'');
                }
                j4.d.h("Name ", strA, " is registered in the module but no Kotlin class is associated with it.");
            }
        }
        im.a aVar3 = (im.a) gVar.f24504d;
        if (aVar3 != null) {
            kClass2.getClass();
            aVar3.getClass();
            HashMap map7 = (HashMap) xVar.f22932f;
            Function1 function1 = (Function1) map7.get(kClass2);
            if (function1 == null || Intrinsics.areEqual(function1, aVar3)) {
                map7.put(kClass2, aVar3);
            } else {
                i1.k("Default deserializers provider for ", kClass2, " is already registered: ", function1);
            }
        }
        this.f25411e = xVar.a();
    }

    public final Object b(Class cls, c cVar) {
        cVar.getClass();
        a0 a0Var = new a0(18);
        a0Var.w(this.f25407a.f30152c.getUrl());
        a0Var.B(((f) this.f25408b).b(cVar));
        a0Var.u(mt.a.f30134a);
        a0Var.u(this.f25409c);
        n90.c cVar2 = (n90.c) this.f25410d.getValue();
        Regex regex = z.f36633e;
        a0Var.u(e0.q(cVar2, y.a("application/json")));
        ((ArrayList) a0Var.f12782e).add(new oa0.i(1));
        return a0Var.y().b(cls);
    }
}
