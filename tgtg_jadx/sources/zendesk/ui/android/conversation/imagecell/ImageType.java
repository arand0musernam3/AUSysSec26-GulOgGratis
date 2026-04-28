package zendesk.ui.android.conversation.imagecell;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lzendesk/ui/android/conversation/imagecell/ImageType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue$zendesk_ui_ui_android", "()Ljava/lang/String;", "JPEG", "JPG", "PNG", "GIF", "WEBP", "SVG", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageType {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ ImageType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final ImageType JPEG = new ImageType("JPEG", 0, "image/jpeg");
    public static final ImageType JPG = new ImageType("JPG", 1, "image/jpg");
    public static final ImageType PNG = new ImageType("PNG", 2, "image/png");
    public static final ImageType GIF = new ImageType("GIF", 3, "image/gif");
    public static final ImageType WEBP = new ImageType("WEBP", 4, "image/webp");
    public static final ImageType SVG = new ImageType("SVG", 5, "image/svg+xml");

    private static final /* synthetic */ ImageType[] $values() {
        return new ImageType[]{JPEG, JPG, PNG, GIF, WEBP, SVG};
    }

    static {
        ImageType[] imageTypeArr$values = $values();
        $VALUES = imageTypeArr$values;
        $ENTRIES = n.w(imageTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private ImageType(String str, int i11, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static ImageType valueOf(String str) {
        return (ImageType) Enum.valueOf(ImageType.class, str);
    }

    public static ImageType[] values() {
        return (ImageType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue$zendesk_ui_ui_android, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lzendesk/ui/android/conversation/imagecell/ImageType$Companion;", "", "<init>", "()V", "isSupported", "", "value", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nImageType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageType.kt\nzendesk/ui/android/conversation/imagecell/ImageType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,55:1\n12637#2,2:56\n*S KotlinDebug\n*F\n+ 1 ImageType.kt\nzendesk/ui/android/conversation/imagecell/ImageType$Companion\n*L\n51#1:56,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSupported(@Nullable String value) {
            for (ImageType imageType : ImageType.values()) {
                if (Intrinsics.areEqual(imageType.getValue(), value)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }
}
