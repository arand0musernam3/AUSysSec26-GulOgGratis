package kotlin.text;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0002\u0014\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "<init>", "(Ljava/lang/String;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "b", "kotlin/text/o", "kotlin/text/m", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,420:1\n24#2,3:421\n1#3:424\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n105#1:421,3\n*E\n"})
public final class Regex implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final m f26586b = new m(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f26587a;

    public Regex(String str, q qVar) {
        str.getClass();
        qVar.getClass();
        m mVar = f26586b;
        int iA = qVar.a();
        mVar.getClass();
        Pattern patternCompile = Pattern.compile(str, (iA & 2) != 0 ? iA | 64 : iA);
        patternCompile.getClass();
        this.f26587a = patternCompile;
    }

    public static l b(Regex regex, CharSequence charSequence) {
        regex.getClass();
        charSequence.getClass();
        Matcher matcher = regex.f26587a.matcher(charSequence);
        matcher.getClass();
        if (matcher.find(0)) {
            return new l(matcher, charSequence);
        }
        return null;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.f26587a;
        String strPattern = pattern.pattern();
        strPattern.getClass();
        return new o(strPattern, pattern.flags());
    }

    public final boolean a(CharSequence charSequence) {
        charSequence.getClass();
        return this.f26587a.matcher(charSequence).find();
    }

    public final l c(int i11, String str) {
        str.getClass();
        Matcher matcherRegion = this.f26587a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i11, str.length());
        if (matcherRegion.lookingAt()) {
            return new l(matcherRegion, str);
        }
        return null;
    }

    public final l d(String str) {
        str.getClass();
        Matcher matcher = this.f26587a.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new l(matcher, str);
        }
        return null;
    }

    public final boolean e(CharSequence charSequence) {
        charSequence.getClass();
        return this.f26587a.matcher(charSequence).matches();
    }

    public final String f(String str, Function1 function1) {
        str.getClass();
        l lVarB = b(this, str);
        if (lVarB == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        do {
            sb2.append((CharSequence) str, i11, lVarB.b().f26553a);
            sb2.append((CharSequence) function1.invoke(lVarB));
            i11 = lVarB.b().f26554b + 1;
            lVarB = lVarB.next();
            if (i11 >= length) {
                break;
            }
        } while (lVarB != null);
        if (i11 < length) {
            sb2.append((CharSequence) str, i11, length);
        }
        return sb2.toString();
    }

    public final List g(int i11, CharSequence charSequence) {
        charSequence.getClass();
        StringsKt__StringsKt.t(i11);
        Matcher matcher = this.f26587a.matcher(charSequence);
        if (i11 == 1 || !matcher.find()) {
            return kotlin.collections.c0.c(charSequence.toString());
        }
        int i12 = 10;
        if (i11 > 0 && i11 <= 10) {
            i12 = i11;
        }
        ArrayList arrayList = new ArrayList(i12);
        int i13 = i11 - 1;
        int iEnd = 0;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i13 >= 0 && arrayList.size() == i13) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        input.getClass();
        replacement.getClass();
        String strReplaceAll = this.f26587a.matcher(input).replaceAll(replacement);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f26587a.toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this(patternCompile);
    }

    public Regex(Pattern pattern) {
        pattern.getClass();
        this.f26587a = pattern;
    }
}
