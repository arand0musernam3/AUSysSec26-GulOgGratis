package zendesk.core.android.internal.serializer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.x;
import kotlin.text.y;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import n90.b0;
import n90.e;
import n90.g0;
import n90.n;
import n90.o;
import o90.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln90/n;", "", "toKotlinType", "(Ln90/n;)Ljava/lang/Object;", "Ln90/g0;", "toKotlinPrimitiveType", "(Ln90/g0;)Ljava/lang/Object;", "zendesk.core_core-utilities"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnySerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnySerializer.kt\nzendesk/core/android/internal/serializer/AnySerializerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,103:1\n1563#2:104\n1634#2,3:105\n1252#2,4:110\n465#3:108\n415#3:109\n*S KotlinDebug\n*F\n+ 1 AnySerializer.kt\nzendesk/core/android/internal/serializer/AnySerializerKt\n*L\n66#1:104\n66#1:105,3\n67#1:110,4\n67#1:108\n67#1:109\n*E\n"})
public final class AnySerializerKt {
    private static final Object toKotlinPrimitiveType(g0 g0Var) {
        Long lValueOf;
        Long lValueOf2;
        String strB = g0Var.b();
        if (g0Var.d()) {
            return strB;
        }
        Integer numValueOf = null;
        try {
            lValueOf = Long.valueOf(o.i(g0Var));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            try {
                return Long.valueOf(o.i(g0Var));
            } catch (JsonDecodingException e5) {
                throw new NumberFormatException(e5.getMessage());
            }
        }
        try {
            lValueOf2 = Long.valueOf(o.i(g0Var));
        } catch (JsonDecodingException unused2) {
            lValueOf2 = null;
        }
        if (lValueOf2 != null) {
            long jLongValue = lValueOf2.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                numValueOf = Integer.valueOf((int) jLongValue);
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(o.e(g0Var));
        }
        if (x.f(g0Var.b()) == null) {
            return a0.b(g0Var.b()) != null ? Boolean.valueOf(o.d(g0Var)) : strB;
        }
        if (!StringsKt.z(strB, ".", false)) {
            return strB;
        }
        String strZ = StringsKt.Z(strB, ".");
        return (strZ.length() <= 1 || !y.p(strZ, "0", false)) ? Double.valueOf(Double.parseDouble(g0Var.b())) : strB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object toKotlinType(n nVar) {
        if (nVar instanceof g0) {
            return toKotlinPrimitiveType((g0) nVar);
        }
        if (nVar instanceof e) {
            Iterable iterable = (Iterable) nVar;
            ArrayList arrayList = new ArrayList(e0.o(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(toKotlinType((n) it.next()));
            }
            return arrayList;
        }
        if (!(nVar instanceof b0)) {
            throw new SerializationException("Unsupported JsonElement type: " + Reflection.getOrCreateKotlinClass(nVar.getClass()));
        }
        Map map = (Map) nVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap(w0.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), toKotlinType((n) entry.getValue()));
        }
        return linkedHashMap;
    }
}
