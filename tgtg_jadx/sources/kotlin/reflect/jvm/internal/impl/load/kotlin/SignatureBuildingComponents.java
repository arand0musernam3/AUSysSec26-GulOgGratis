package kotlin.reflect.jvm.internal.impl.load.kotlin;

import e0.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSignatureBuildingComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponents\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,39:1\n11335#2:40\n11670#2,3:41\n11670#2,3:46\n37#3,2:44\n*S KotlinDebug\n*F\n+ 1 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponents\n*L\n20#1:40\n20#1:41,3\n25#1:46,3\n20#1:44,2\n*E\n"})
public final class SignatureBuildingComponents {

    @NotNull
    public static final SignatureBuildingComponents INSTANCE = new SignatureBuildingComponents();

    private SignatureBuildingComponents() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String escapeClassName(String str) {
        return str.length() > 1 ? f.g(';', "L", str) : str;
    }

    @NotNull
    public final String[] constructors(@NotNull String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NotNull
    public final Set<String> inClass(@NotNull String str, @NotNull String... strArr) {
        str.getClass();
        strArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    @NotNull
    public final Set<String> inJavaLang(@NotNull String str, @NotNull String... strArr) {
        str.getClass();
        strArr.getClass();
        return inClass(javaLang(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final Set<String> inJavaUtil(@NotNull String str, @NotNull String... strArr) {
        str.getClass();
        strArr.getClass();
        return inClass(javaUtil(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final String javaFunction(@NotNull String str) {
        str.getClass();
        return "java/util/function/" + str;
    }

    @NotNull
    public final String javaLang(@NotNull String str) {
        str.getClass();
        return "java/lang/" + str;
    }

    @NotNull
    public final String javaUtil(@NotNull String str) {
        str.getClass();
        return "java/util/" + str;
    }

    @NotNull
    public final String jvmDescriptor(@NotNull String str, @NotNull List<String> list, @NotNull String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        return str + '(' + CollectionsKt.U(list, "", null, null, new Function1<String, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.jvmDescriptor.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull String str3) {
                str3.getClass();
                return SignatureBuildingComponents.INSTANCE.escapeClassName(str3);
            }
        }, 30) + ')' + escapeClassName(str2);
    }

    @NotNull
    public final String signature(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return str + '.' + str2;
    }
}
