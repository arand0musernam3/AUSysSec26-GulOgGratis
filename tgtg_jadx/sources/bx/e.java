package bx;

import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static void a(String str) {
        boolean zContains;
        str.getClass();
        if (str.length() == 0 || str.length() > 40) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2)));
        }
        HashSet hashSet = g.f6717f;
        synchronized (hashSet) {
            zContains = hashSet.contains(str);
        }
        if (zContains) {
            return;
        }
        if (!new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").e(str)) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1)));
        }
        synchronized (hashSet) {
            hashSet.add(str);
        }
    }
}
