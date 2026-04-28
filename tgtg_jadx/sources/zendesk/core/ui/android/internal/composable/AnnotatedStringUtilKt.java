package zendesk.core.ui.android.internal.composable;

import android.util.Patterns;
import i4.u0;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.e;
import m5.h;
import m5.l0;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import q5.i;
import q5.n;
import q5.o;
import q5.r;
import t5.c;
import x5.a;
import x5.l;
import x5.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a%\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u0011\u001a\u00020\u0010*\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", TextBundle.TEXT_ENTRY, "Li4/v;", "defaultTextColor", "linkTextColor", "Lm5/h;", "formatTextAsAnnotatedString-WkMS-hQ", "(Ljava/lang/String;JJ)Lm5/h;", "formatTextAsAnnotatedString", "Lm5/e;", "annotation", "Ljava/util/regex/Matcher;", "matcher", "Lm5/l0;", "spanStyle", "tag", "", "addStyleAndAnnotation", "(Lm5/e;Ljava/lang/String;Ljava/util/regex/Matcher;Lm5/l0;Ljava/lang/String;)V", "", "MINIMUM_PHONE_NUMBER_DIGITS", "I", "zendesk.core.ui_core-ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnnotatedStringUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringUtil.kt\nzendesk/core/ui/android/internal/composable/AnnotatedStringUtilKt\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,150:1\n1565#2:151\n1359#2,6:152\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringUtil.kt\nzendesk/core/ui/android/internal/composable/AnnotatedStringUtilKt\n*L\n39#1:151\n48#1:152,6\n*E\n"})
public final class AnnotatedStringUtilKt {
    private static final int MINIMUM_PHONE_NUMBER_DIGITS = 6;

    private static final void addStyleAndAnnotation(e eVar, String str, Matcher matcher, l0 l0Var, String str2) {
        int iStart = matcher.start();
        int iEnd = matcher.end();
        eVar.b(l0Var, iStart, iEnd);
        eVar.a(str2, iStart, iEnd, str);
    }

    @NotNull
    /* JADX INFO: renamed from: formatTextAsAnnotatedString-WkMS-hQ, reason: not valid java name */
    public static final h m993formatTextAsAnnotatedStringWkMShQ(@NotNull String str, long j9, long j11) {
        str.getClass();
        e eVar = new e();
        l0 l0Var = new l0(j9, 0L, (r) null, (n) null, (o) null, (i) null, (String) null, 0L, (a) null, (p) null, (c) null, 0L, (l) null, (u0) null, 65534);
        l0 l0Var2 = new l0(j11, 0L, (r) null, (n) null, (o) null, (i) null, (String) null, 0L, (a) null, (p) null, (c) null, 0L, l.f43854c, (u0) null, 61438);
        Matcher matcher = Patterns.WEB_URL.matcher(str);
        Matcher matcher2 = Patterns.EMAIL_ADDRESS.matcher(str);
        Matcher matcher3 = Patterns.PHONE.matcher(str);
        int i11 = eVar.i(l0Var);
        try {
            eVar.c(str);
            while (matcher.find()) {
                String strGroup = matcher.group();
                strGroup.getClass();
                addStyleAndAnnotation(eVar, strGroup, matcher, l0Var2, "URL");
            }
            while (matcher2.find()) {
                String strGroup2 = matcher2.group();
                strGroup2.getClass();
                addStyleAndAnnotation(eVar, strGroup2, matcher2, l0Var2, "EMAIL");
            }
            while (matcher3.find()) {
                String strGroup3 = matcher3.group();
                if (strGroup3.length() >= 6) {
                    addStyleAndAnnotation(eVar, strGroup3, matcher3, l0Var2, "PHONE");
                }
            }
            eVar.g(i11);
            return eVar.j();
        } catch (Throwable th2) {
            eVar.g(i11);
            throw th2;
        }
    }
}
