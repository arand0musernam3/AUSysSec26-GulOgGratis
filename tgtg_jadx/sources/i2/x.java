package i2;

import h2.t0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import m3.g1;
import m3.h1;
import o30.m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements com.google.android.gms.common.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f22930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f22931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f22932f;

    public x() {
        this.f22928b = new HashMap();
        this.f22929c = new HashMap();
        this.f22930d = new HashMap();
        this.f22931e = new HashMap();
        this.f22932f = new HashMap();
    }

    public x a() {
        return new x((HashMap) this.f22928b, (HashMap) this.f22929c, (HashMap) this.f22930d, (HashMap) this.f22931e, (HashMap) this.f22932f, this.f22927a);
    }

    public void b(KClass kClass, KSerializer kSerializer) {
        kClass.getClass();
        kSerializer.getClass();
        p90.a aVar = new p90.a(kSerializer);
        HashMap map = (HashMap) this.f22928b;
        kClass.getClass();
        p90.c cVar = (p90.c) map.get(kClass);
        if (cVar != null && !Intrinsics.areEqual(cVar, aVar)) {
            throw new p80.m("Contextual serializer or serializer provider for " + kClass + " already registered in this module");
        }
        map.put(kClass, aVar);
        if (y9.w.v(kClass).isInterface()) {
            this.f22927a = true;
        }
    }

    @Override // com.google.android.gms.common.internal.d
    public void c(pz.b bVar) {
        ((qz.g) this.f22932f).f37348n.post(new m0(this, bVar, false, 13));
    }

    public KSerializer d(KClass kClass, List list) {
        kClass.getClass();
        list.getClass();
        p90.c cVar = (p90.c) ((Map) this.f22928b).get(kClass);
        KSerializer kSerializerA = cVar != null ? cVar.a(list) : null;
        if (kSerializerA instanceof KSerializer) {
            return kSerializerA;
        }
        return null;
    }

    public KSerializer e(KClass kClass, Object obj) {
        kClass.getClass();
        obj.getClass();
        if (!kClass.isInstance(obj)) {
            return null;
        }
        Map map = (Map) ((Map) this.f22929c).get(kClass);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(Reflection.getOrCreateKotlinClass(obj.getClass())) : null;
        KSerializer kSerializer2 = kSerializer instanceof KSerializer ? kSerializer : null;
        if (kSerializer2 != null) {
            return kSerializer2;
        }
        Object obj2 = ((Map) this.f22930d).get(kClass);
        Function1 function1 = TypeIntrinsics.isFunctionOfArity(obj2, 1) ? (Function1) obj2 : null;
        if (function1 != null) {
            return (KSerializer) function1.invoke(obj);
        }
        return null;
    }

    public void f(pz.b bVar) {
        qz.z zVar = (qz.z) ((qz.g) this.f22932f).f37345j.get((qz.a) this.f22929c);
        if (zVar != null) {
            zVar.n(bVar);
        }
    }

    public x(Map map, Map map2, Map map3, Map map4, Map map5, boolean z11) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.f22928b = map;
        this.f22929c = map2;
        this.f22930d = map3;
        this.f22931e = map4;
        this.f22932f = map5;
        this.f22927a = z11;
    }

    public x(int i11, float f11, e0 e0Var) {
        this.f22928b = e0Var;
        this.f22929c = new h1(i11);
        this.f22930d = new g1(f11);
        this.f22932f = new t0(i11, 30, 100);
    }

    public x(qz.g gVar, com.google.android.gms.common.api.f fVar, qz.a aVar) {
        Objects.requireNonNull(gVar);
        this.f22932f = gVar;
        this.f22930d = null;
        this.f22931e = null;
        this.f22927a = false;
        this.f22928b = fVar;
        this.f22929c = aVar;
    }
}
