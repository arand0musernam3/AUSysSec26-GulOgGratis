package zendesk.android.messaging;

import a80.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lzendesk/android/messaging/UrlSource;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT", "CAROUSEL", "FILE", "IMAGE", "LINK_MESSAGE_ACTION", "WEBVIEW_MESSAGE_ACTION", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UrlSource {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UrlSource[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final UrlSource TEXT = new UrlSource("TEXT", 0);
    public static final UrlSource CAROUSEL = new UrlSource("CAROUSEL", 1);
    public static final UrlSource FILE = new UrlSource("FILE", 2);
    public static final UrlSource IMAGE = new UrlSource("IMAGE", 3);
    public static final UrlSource LINK_MESSAGE_ACTION = new UrlSource("LINK_MESSAGE_ACTION", 4);
    public static final UrlSource WEBVIEW_MESSAGE_ACTION = new UrlSource("WEBVIEW_MESSAGE_ACTION", 5);

    private static final /* synthetic */ UrlSource[] $values() {
        return new UrlSource[]{TEXT, CAROUSEL, FILE, IMAGE, LINK_MESSAGE_ACTION, WEBVIEW_MESSAGE_ACTION};
    }

    static {
        UrlSource[] urlSourceArr$values = $values();
        $VALUES = urlSourceArr$values;
        $ENTRIES = n.w(urlSourceArr$values);
        INSTANCE = new Companion(null);
    }

    private UrlSource(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static UrlSource valueOf(String str) {
        return (UrlSource) Enum.valueOf(UrlSource.class, str);
    }

    public static UrlSource[] values() {
        return (UrlSource[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lzendesk/android/messaging/UrlSource$Companion;", "", "<init>", "()V", "findByValue", "Lzendesk/android/messaging/UrlSource;", "value", "", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Nullable
        public final UrlSource findByValue(@NotNull String value) {
            value.getClass();
            switch (value.hashCode()) {
                case -280175948:
                    if (value.equals("WEBVIEW_MESSAGE_ACTION")) {
                        return UrlSource.WEBVIEW_MESSAGE_ACTION;
                    }
                    return null;
                case 2157948:
                    if (value.equals("FILE")) {
                        return UrlSource.FILE;
                    }
                    return null;
                case 2571565:
                    if (value.equals("TEXT")) {
                        return UrlSource.TEXT;
                    }
                    return null;
                case 69775675:
                    if (value.equals("IMAGE")) {
                        return UrlSource.IMAGE;
                    }
                    return null;
                case 785535328:
                    if (value.equals("CAROUSEL")) {
                        return UrlSource.CAROUSEL;
                    }
                    return null;
                case 1432458355:
                    if (value.equals("LINK_MESSAGE_ACTION")) {
                        return UrlSource.LINK_MESSAGE_ACTION;
                    }
                    return null;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
