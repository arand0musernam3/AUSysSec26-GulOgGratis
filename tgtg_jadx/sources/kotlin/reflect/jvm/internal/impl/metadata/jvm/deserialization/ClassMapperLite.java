package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import b80.c;
import e0.f;
import j4.s;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ClassMapperLite {

    @NotNull
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* JADX INFO: renamed from: kotlin, reason: collision with root package name */
    @NotNull
    private static final String f26567kotlin = CollectionsKt.U(d0.h('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    @NotNull
    private static final Map<String, String> map;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listH = d0.h("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iA = c.a(0, listH.size() - 1, 2);
        if (iA >= 0) {
            int i11 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f26567kotlin;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listH.get(i11));
                int i12 = i11 + 1;
                linkedHashMap.put(sb2.toString(), listH.get(i12));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(k.p(sb3, (String) listH.get(i11), "Array"), "[" + ((String) listH.get(i12)));
                if (i11 == iA) {
                    break;
                } else {
                    i11 += 2;
                }
            }
        }
        linkedHashMap.put(f26567kotlin + "/Unit", "V");
        map$lambda$0$add(linkedHashMap, "Any", "java/lang/Object");
        map$lambda$0$add(linkedHashMap, "Nothing", "java/lang/Void");
        map$lambda$0$add(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : d0.h("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            map$lambda$0$add(linkedHashMap, str2, f.k("java/lang/", str2));
        }
        for (String str3 : d0.h("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            map$lambda$0$add(linkedHashMap, f.k("collections/", str3), f.k("java/util/", str3));
            map$lambda$0$add(linkedHashMap, f.k("collections/Mutable", str3), f.k("java/util/", str3));
        }
        map$lambda$0$add(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        map$lambda$0$add(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i13 = 0; i13 < 23; i13++) {
            String strF = s.f(i13, "Function");
            StringBuilder sb4 = new StringBuilder();
            String str4 = f26567kotlin;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i13);
            map$lambda$0$add(linkedHashMap, strF, sb4.toString());
            map$lambda$0$add(linkedHashMap, s.f(i13, "reflect/KFunction"), k.l(str4, "/reflect/KFunction"));
        }
        for (String str5 : d0.h("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            map$lambda$0$add(linkedHashMap, k.l(str5, ".Companion"), f.o(new StringBuilder(), f26567kotlin, "/jvm/internal/", str5, "CompanionObject"));
        }
        map = linkedHashMap;
    }

    private ClassMapperLite() {
    }

    private static final void map$lambda$0$add(Map<String, String> map2, String str, String str2) {
        map2.put(f26567kotlin + '/' + str, "L" + str2 + ';');
    }

    @NotNull
    public static final String mapClass(@NotNull String str) {
        str.getClass();
        String str2 = map.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb2 = new StringBuilder("L");
        String strReplace = str.replace('.', '$');
        strReplace.getClass();
        sb2.append(strReplace);
        sb2.append(';');
        return sb2.toString();
    }
}
