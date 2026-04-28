package kotlin.reflect.jvm.internal.impl.renderer;

import b3.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRenderingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,75:1\n1083#2,2:76\n*S KotlinDebug\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n*L\n29#1:76,2\n*E\n"})
public final class RenderingUtilsKt {
    @NotNull
    public static final String render(@NotNull Name name) {
        name.getClass();
        boolean zShouldBeEscaped = shouldBeEscaped(name);
        String strAsString = name.asString();
        strAsString.getClass();
        if (!zShouldBeEscaped) {
            return strAsString;
        }
        return ("`" + strAsString).concat("`");
    }

    @NotNull
    public static final String renderFqName(@NotNull List<Name> list) {
        list.getClass();
        StringBuilder sb2 = new StringBuilder();
        for (Name name : list) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(render(name));
        }
        return sb2.toString();
    }

    @Nullable
    public static final String replacePrefixesInTypeRepresentations(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        i.B(str, str2, str3, str4, str5);
        if (!y.p(str, str2, false) || !y.p(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        String strSubstring2 = str3.substring(str4.length());
        String strConcat = str5.concat(strSubstring);
        if (Intrinsics.areEqual(strSubstring, strSubstring2)) {
            return strConcat;
        }
        if (typeStringsDifferOnlyInNullability(strSubstring, strSubstring2)) {
            return strConcat.concat("!");
        }
        return null;
    }

    private static final boolean shouldBeEscaped(Name name) {
        String strAsString = name.asString();
        strAsString.getClass();
        if (KeywordStringsGenerated.KEYWORDS.contains(strAsString)) {
            return true;
        }
        for (int i11 = 0; i11 < strAsString.length(); i11++) {
            char cCharAt = strAsString.charAt(i11);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return false;
    }

    public static final boolean typeStringsDifferOnlyInNullability(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        if (Intrinsics.areEqual(str, y.n(str2, "?", "", false))) {
            return true;
        }
        if (y.j(str2, "?", false) && Intrinsics.areEqual(str.concat("?"), str2)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(str);
        sb2.append(")?");
        return Intrinsics.areEqual(sb2.toString(), str2);
    }

    @NotNull
    public static final String render(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        List<Name> listPathSegments = fqNameUnsafe.pathSegments();
        listPathSegments.getClass();
        return renderFqName(listPathSegments);
    }
}
