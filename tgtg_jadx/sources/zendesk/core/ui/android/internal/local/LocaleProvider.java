package zendesk.core.ui.android.internal.local;

import android.content.Context;
import androidx.core.os.LocaleListCompat;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.core.ui.android.internal.InternalZendeskUIApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzendesk/core/ui/android/internal/local/LocaleProvider;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalZendeskUIApi
public final class LocaleProvider {
    public static final int $stable = 8;

    @NotNull
    private final Context context;

    public LocaleProvider(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    @NotNull
    public final Locale getLocale() {
        try {
            Locale localeC = LocaleListCompat.i(this.context.getResources().getConfiguration().getLocales()).c(0);
            if (localeC == null) {
                localeC = Locale.getDefault();
            }
            localeC.getClass();
            return localeC;
        } catch (Exception unused) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            return locale;
        }
    }
}
