package i90;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.n0;
import kotlin.collections.w0;
import kotlin.collections.x0;
import kotlin.collections.y;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import m0.i1;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends m90.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass f23590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f23593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f23594e;

    public f(String str, KClass kClass, KClass[] kClassArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        kClass.getClass();
        this.f23590a = kClass;
        this.f23591b = n0.f26529a;
        this.f23592c = l.a(m.PUBLICATION, new i2.e(4, str, this));
        if (kClassArr.length != kSerializerArr.length) {
            i1.j("All subclasses of sealed class ", kClass.getSimpleName(), " should be marked @Serializable");
            throw null;
        }
        Map mapJ = x0.j(y.X(kClassArr, kSerializerArr));
        this.f23593d = mapJ;
        Set<Map.Entry> setEntrySet = mapJ.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strA = ((KSerializer) entry.getValue()).getDescriptor().a();
            Object obj = linkedHashMap.get(strA);
            if (obj == null) {
                linkedHashMap.containsKey(strA);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb2 = new StringBuilder("Multiple sealed subclasses of '");
                sb2.append(this.f23590a);
                sb2.append("' have the same serial name '");
                sb2.append(strA);
                sb2.append("': '");
                sb2.append(entry2.getKey());
                Object key = entry.getKey();
                sb2.append("', '");
                sb2.append(key);
                sb2.append('\'');
                throw new IllegalStateException(sb2.toString().toString());
            }
            linkedHashMap.put(strA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(w0.a(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f23594e = linkedHashMap2;
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.f23591b = listAsList;
    }

    @Override // m90.b
    public final b a(l90.a aVar, String str) {
        KSerializer kSerializer = (KSerializer) this.f23594e.get(str);
        return kSerializer != null ? kSerializer : super.a(aVar, str);
    }

    @Override // m90.b
    public final KSerializer b(Encoder encoder, Object obj) {
        encoder.getClass();
        obj.getClass();
        KSerializer kSerializer = (KSerializer) this.f23593d.get(Reflection.getOrCreateKotlinClass(obj.getClass()));
        KSerializer kSerializerB = kSerializer != null ? kSerializer : super.b(encoder, obj);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        return null;
    }

    @Override // m90.b
    public final KClass c() {
        return this.f23590a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f23592c.getValue();
    }
}
