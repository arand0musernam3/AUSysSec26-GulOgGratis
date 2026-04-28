package k;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.core.os.LocaleListCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static LocaleListCompat b(Configuration configuration) {
        return LocaleListCompat.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(LocaleListCompat localeListCompat) {
        LocaleList.setDefault(LocaleList.forLanguageTags(localeListCompat.g()));
    }

    public static void d(Configuration configuration, LocaleListCompat localeListCompat) {
        configuration.setLocales(LocaleList.forLanguageTags(localeListCompat.g()));
    }
}
