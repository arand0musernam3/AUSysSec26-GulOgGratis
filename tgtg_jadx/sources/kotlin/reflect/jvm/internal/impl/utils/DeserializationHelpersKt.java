package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class DeserializationHelpersKt {
    @NotNull
    public static final JvmMetadataVersion jvmMetadataVersionOrDefault(@NotNull DeserializationConfiguration deserializationConfiguration) {
        deserializationConfiguration.getClass();
        BinaryVersion binaryVersion = deserializationConfiguration.getBinaryVersion();
        JvmMetadataVersion jvmMetadataVersion = binaryVersion instanceof JvmMetadataVersion ? (JvmMetadataVersion) binaryVersion : null;
        return jvmMetadataVersion == null ? JvmMetadataVersion.INSTANCE : jvmMetadataVersion;
    }
}
