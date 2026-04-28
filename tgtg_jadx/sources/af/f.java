package af;

import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f1285a = new f(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strValueOf = String.valueOf(str.charAt(0));
        strValueOf.getClass();
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        sb2.append((Object) upperCase);
        sb2.append(str.substring(1));
        return sb2.toString();
    }
}
