package o90;

import com.braze.h2;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import m90.c1;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f32173a = new l();

    public static final JsonEncodingException a(Number number, String str) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) n(-1, str)));
    }

    public static final JsonEncodingException b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return new JsonEncodingException("Value of type '" + serialDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException c(int i11, String str) {
        if (i11 >= 0) {
            str = "Unexpected JSON token at offset " + i11 + ": " + str;
        }
        str.getClass();
        return new JsonDecodingException(str);
    }

    public static final JsonDecodingException d(int i11, String str, CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        return c(i11, str + "\nJSON input: " + ((Object) n(i11, charSequence)));
    }

    public static final void e(n90.c cVar, KSerializer kSerializer, KSerializer kSerializer2, String str) {
        SerialDescriptor descriptor = kSerializer2.getDescriptor();
        descriptor.getClass();
        cVar.getClass();
        o(descriptor, cVar);
        if (c1.b(descriptor).contains(str)) {
            String strA = kSerializer.getDescriptor().a();
            String strA2 = kSerializer2.getDescriptor().a();
            throw new JsonEncodingException(r8.k.p(e0.f.t("Class '", strA2, "' cannot be serialized ", (cVar.f30749a.f30778h == n90.a.ALL_JSON_OBJECTS && Intrinsics.areEqual(strA, strA2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : e0.f.g('\'', "as base class '", strA), " because it has property name that conflicts with JSON class discriminator '"), str, "'. You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation."));
        }
    }

    public static final SerialDescriptor f(SerialDescriptor serialDescriptor, i2.x xVar) {
        SerialDescriptor serialDescriptorF;
        KSerializer kSerializerD;
        serialDescriptor.getClass();
        xVar.getClass();
        if (!Intrinsics.areEqual(serialDescriptor.getKind(), k90.h.f26238j)) {
            return serialDescriptor.isInline() ? f(serialDescriptor.h(0), xVar) : serialDescriptor;
        }
        KClass kClassA = f0.A(serialDescriptor);
        SerialDescriptor descriptor = null;
        if (kClassA != null && (kSerializerD = xVar.d(kClassA, n0.f26529a)) != null) {
            descriptor = kSerializerD.getDescriptor();
        }
        return (descriptor == null || (serialDescriptorF = f(descriptor, xVar)) == null) ? serialDescriptor : serialDescriptorF;
    }

    public static final byte g(char c3) {
        if (c3 < '~') {
            return e.f32165b[c3];
        }
        return (byte) 0;
    }

    public static final void h(p30.b bVar) {
        bVar.getClass();
        if (bVar instanceof k90.i) {
            h2.b("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (bVar instanceof k90.d) {
            h2.b("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (bVar instanceof k90.c) {
            h2.b("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String i(SerialDescriptor serialDescriptor, n90.c cVar) {
        serialDescriptor.getClass();
        cVar.getClass();
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof n90.i) {
                return ((n90.i) annotation).discriminator();
            }
        }
        return cVar.f30749a.f30776f;
    }

    public static final int j(SerialDescriptor serialDescriptor, n90.c cVar, String str) {
        serialDescriptor.getClass();
        cVar.getClass();
        str.getClass();
        o(serialDescriptor, cVar);
        int iD = serialDescriptor.d(str);
        if (iD != -3 || !cVar.f30749a.f30777g) {
            return iD;
        }
        h hVar = cVar.f30751c;
        m90.z zVar = new m90.z(19, serialDescriptor, cVar);
        hVar.getClass();
        ConcurrentHashMap concurrentHashMap = hVar.f32168a;
        Map map = (Map) concurrentHashMap.get(serialDescriptor);
        l lVar = f32173a;
        Object obj = map != null ? map.get(lVar) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = zVar.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(lVar, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int k(SerialDescriptor serialDescriptor, n90.c cVar, String str, String str2) {
        serialDescriptor.getClass();
        cVar.getClass();
        str.getClass();
        int iJ = j(serialDescriptor, cVar, str);
        if (iJ != -3) {
            return iJ;
        }
        throw new SerializationException(serialDescriptor.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean l(SerialDescriptor serialDescriptor, n90.c cVar) {
        serialDescriptor.getClass();
        cVar.getClass();
        if (cVar.f30749a.f30772b) {
            return true;
        }
        List annotations = serialDescriptor.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof n90.t) {
                return true;
            }
        }
        return false;
    }

    public static final void m(i0.w wVar, String str) {
        wVar.s(wVar.f22745b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence n(int i11, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i11 != -1) {
                int i12 = i11 - 30;
                int i13 = i11 + 30;
                String str = i12 <= 0 ? "" : ".....";
                String str2 = i13 >= charSequence.length() ? "" : ".....";
                StringBuilder sbO = b3.i.o(str);
                if (i12 < 0) {
                    i12 = 0;
                }
                int length = charSequence.length();
                if (i13 > length) {
                    i13 = length;
                }
                sbO.append(charSequence.subSequence(i12, i13).toString());
                sbO.append(str2);
                return sbO.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void o(SerialDescriptor serialDescriptor, n90.c cVar) {
        serialDescriptor.getClass();
        cVar.getClass();
        Intrinsics.areEqual(serialDescriptor.getKind(), k90.j.f26240j);
    }

    public static final Object p(n90.c cVar, String str, n90.b0 b0Var, i90.b bVar) {
        cVar.getClass();
        str.getClass();
        return new o(cVar, b0Var, str, bVar.getDescriptor()).h(bVar);
    }

    public static final b0 q(SerialDescriptor serialDescriptor, n90.c cVar) {
        serialDescriptor.getClass();
        p30.b kind = serialDescriptor.getKind();
        if (kind instanceof k90.c) {
            return b0.POLY_OBJ;
        }
        if (Intrinsics.areEqual(kind, k90.j.f26241k)) {
            return b0.LIST;
        }
        if (!Intrinsics.areEqual(kind, k90.j.l)) {
            return b0.OBJ;
        }
        SerialDescriptor serialDescriptorF = f(serialDescriptor.h(0), cVar.f30750b);
        p30.b kind2 = serialDescriptorF.getKind();
        if ((kind2 instanceof k90.d) || Intrinsics.areEqual(kind2, k90.i.f26239j)) {
            return b0.MAP;
        }
        throw b(serialDescriptorF);
    }

    public static final void r(i0.w wVar, Number number) {
        i0.w.t(wVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String s(byte b8) {
        return b8 == 1 ? "quotation mark '\"'" : b8 == 2 ? "string escape sequence '\\'" : b8 == 4 ? "comma ','" : b8 == 5 ? "colon ':'" : b8 == 6 ? "start of the object '{'" : b8 == 7 ? "end of the object '}'" : b8 == 8 ? "start of the array '['" : b8 == 9 ? "end of the array ']'" : b8 == 10 ? "end of the input" : b8 == 127 ? "invalid token" : "valid token";
    }

    public static final String t(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) n(-1, str2));
    }
}
