package zendesk.ui.android.conversation.imagecell;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lzendesk/ui/android/conversation/imagecell/ImageCellDirection;", "", "<init>", "(Ljava/lang/String;I)V", "INBOUND_SINGLE", "INBOUND_TOP", "INBOUND_MIDDLE", "INBOUND_BOTTOM", "OUTBOUND_SINGLE", "OUTBOUND_TOP", "OUTBOUND_MIDDLE", "OUTBOUND_BOTTOM", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageCellDirection {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ ImageCellDirection[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ImageCellDirection INBOUND_SINGLE = new ImageCellDirection("INBOUND_SINGLE", 0);
    public static final ImageCellDirection INBOUND_TOP = new ImageCellDirection("INBOUND_TOP", 1);
    public static final ImageCellDirection INBOUND_MIDDLE = new ImageCellDirection("INBOUND_MIDDLE", 2);
    public static final ImageCellDirection INBOUND_BOTTOM = new ImageCellDirection("INBOUND_BOTTOM", 3);
    public static final ImageCellDirection OUTBOUND_SINGLE = new ImageCellDirection("OUTBOUND_SINGLE", 4);
    public static final ImageCellDirection OUTBOUND_TOP = new ImageCellDirection("OUTBOUND_TOP", 5);
    public static final ImageCellDirection OUTBOUND_MIDDLE = new ImageCellDirection("OUTBOUND_MIDDLE", 6);
    public static final ImageCellDirection OUTBOUND_BOTTOM = new ImageCellDirection("OUTBOUND_BOTTOM", 7);

    private static final /* synthetic */ ImageCellDirection[] $values() {
        return new ImageCellDirection[]{INBOUND_SINGLE, INBOUND_TOP, INBOUND_MIDDLE, INBOUND_BOTTOM, OUTBOUND_SINGLE, OUTBOUND_TOP, OUTBOUND_MIDDLE, OUTBOUND_BOTTOM};
    }

    static {
        ImageCellDirection[] imageCellDirectionArr$values = $values();
        $VALUES = imageCellDirectionArr$values;
        $ENTRIES = n.w(imageCellDirectionArr$values);
        INSTANCE = new Companion(null);
    }

    private ImageCellDirection(String str, int i11) {
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static ImageCellDirection valueOf(String str) {
        return (ImageCellDirection) Enum.valueOf(ImageCellDirection.class, str);
    }

    public static ImageCellDirection[] values() {
        return (ImageCellDirection[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/ui/android/conversation/imagecell/ImageCellDirection$Companion;", "", "<init>", "()V", "isInbound", "", "Lzendesk/ui/android/conversation/imagecell/ImageCellDirection;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isInbound(@NotNull ImageCellDirection imageCellDirection) {
            imageCellDirection.getClass();
            return imageCellDirection == ImageCellDirection.INBOUND_SINGLE || imageCellDirection == ImageCellDirection.INBOUND_TOP || imageCellDirection == ImageCellDirection.INBOUND_MIDDLE || imageCellDirection == ImageCellDirection.INBOUND_BOTTOM;
        }

        private Companion() {
        }
    }
}
