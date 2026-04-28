package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class VersionSpecificBehaviorKt {
    public static final boolean isKotlin1Dot4OrLater(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return (binaryVersion.getMajor() == 1 && binaryVersion.getMinor() >= 4) || binaryVersion.getMajor() > 1;
    }

    public static final boolean isVersionRequirementTableWrittenCorrectly(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return isKotlin1Dot4OrLater(binaryVersion);
    }
}
