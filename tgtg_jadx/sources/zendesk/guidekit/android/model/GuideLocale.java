package zendesk.guidekit.android.model;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import w.a0;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lzendesk/guidekit/android/model/GuideLocale;", "", "locale", "", "<init>", "(Ljava/lang/String;)V", "getLocale", "()Ljava/lang/String;", "Companion", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuideLocale {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String locale;

    private GuideLocale(String str) {
        this.locale = str;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\n\u0010\b\u001a\u00020\t*\u00020\nJ\n\u0010\b\u001a\u00020\t*\u00020\u0007¨\u0006\u000b"}, d2 = {"Lzendesk/guidekit/android/model/GuideLocale$Companion;", "", "<init>", "()V", "isValidGuideLocale", "", "input", "", "toGuideLocale", "Lzendesk/guidekit/android/model/GuideLocale;", "Ljava/util/Locale;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isValidGuideLocale(String input) {
            return new Regex("[a-z]{2,3}(-[a-z0-9]{2,3})?").e(input);
        }

        @NotNull
        public final GuideLocale toGuideLocale(@NotNull String str) {
            String lowerCase;
            str.getClass();
            if (Intrinsics.areEqual(str, "zh-Hans")) {
                lowerCase = "zh-cn";
            } else if (Intrinsics.areEqual(str, "zh-Hant")) {
                lowerCase = "zh-tw";
            } else {
                Locale locale = Locale.ROOT;
                locale.getClass();
                lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (isValidGuideLocale(lowerCase)) {
                return new GuideLocale(lowerCase, defaultConstructorMarker);
            }
            Logger.e("GuideLocale", a0.p("Unable to convert ", lowerCase, " to a GuideLocale returning en-us as default fallback"), new Object[0]);
            String languageTag = Locale.US.toLanguageTag();
            languageTag.getClass();
            Locale locale2 = Locale.ROOT;
            locale2.getClass();
            String lowerCase2 = languageTag.toLowerCase(locale2);
            lowerCase2.getClass();
            return new GuideLocale(lowerCase2, defaultConstructorMarker);
        }

        private Companion() {
        }

        @NotNull
        public final GuideLocale toGuideLocale(@NotNull Locale locale) {
            locale.getClass();
            String languageTag = locale.toLanguageTag();
            languageTag.getClass();
            return toGuideLocale(languageTag);
        }
    }

    public /* synthetic */ GuideLocale(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
