package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class JvmMetadataVersion extends BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final JvmMetadataVersion INSTANCE;

    @NotNull
    public static final JvmMetadataVersion INSTANCE_NEXT;

    @NotNull
    public static final JvmMetadataVersion INVALID_VERSION;
    private final boolean isStrictSemantics;

    static {
        JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(1, 8, 0);
        INSTANCE = jvmMetadataVersion;
        INSTANCE_NEXT = jvmMetadataVersion.next();
        INVALID_VERSION = new JvmMetadataVersion(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(@NotNull int[] iArr, boolean z11) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.isStrictSemantics = z11;
    }

    private final boolean isCompatibleInternal(JvmMetadataVersion jvmMetadataVersion) {
        if ((getMajor() == 1 && getMinor() == 0) || getMajor() == 0) {
            return false;
        }
        return !newerThan(jvmMetadataVersion);
    }

    private final boolean newerThan(JvmMetadataVersion jvmMetadataVersion) {
        if (getMajor() > jvmMetadataVersion.getMajor()) {
            return true;
        }
        return getMajor() >= jvmMetadataVersion.getMajor() && getMinor() > jvmMetadataVersion.getMinor();
    }

    public final boolean isCompatible(@NotNull JvmMetadataVersion jvmMetadataVersion) {
        jvmMetadataVersion.getClass();
        if (getMajor() == 2 && getMinor() == 0) {
            JvmMetadataVersion jvmMetadataVersion2 = INSTANCE;
            if (jvmMetadataVersion2.getMajor() == 1 && jvmMetadataVersion2.getMinor() == 8) {
                return true;
            }
        }
        return isCompatibleInternal(jvmMetadataVersion.lastSupportedVersionWithThisLanguageVersion(this.isStrictSemantics));
    }

    public final boolean isStrictSemantics() {
        return this.isStrictSemantics;
    }

    @NotNull
    public final JvmMetadataVersion lastSupportedVersionWithThisLanguageVersion(boolean z11) {
        JvmMetadataVersion jvmMetadataVersion = z11 ? INSTANCE : INSTANCE_NEXT;
        return jvmMetadataVersion.newerThan(this) ? jvmMetadataVersion : this;
    }

    @NotNull
    public final JvmMetadataVersion next() {
        return (getMajor() == 1 && getMinor() == 9) ? new JvmMetadataVersion(2, 0, 0) : new JvmMetadataVersion(getMajor(), getMinor() + 1, 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(@NotNull int... iArr) {
        this(iArr, false);
        iArr.getClass();
    }
}
