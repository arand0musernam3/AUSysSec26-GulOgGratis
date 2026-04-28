package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ClassData {

    @NotNull
    private final ProtoBuf.Class classProto;

    @NotNull
    private final BinaryVersion metadataVersion;

    @NotNull
    private final NameResolver nameResolver;

    @NotNull
    private final SourceElement sourceElement;

    public ClassData(@NotNull NameResolver nameResolver, @NotNull ProtoBuf.Class r22, @NotNull BinaryVersion binaryVersion, @NotNull SourceElement sourceElement) {
        nameResolver.getClass();
        r22.getClass();
        binaryVersion.getClass();
        sourceElement.getClass();
        this.nameResolver = nameResolver;
        this.classProto = r22;
        this.metadataVersion = binaryVersion;
        this.sourceElement = sourceElement;
    }

    @NotNull
    public final NameResolver component1() {
        return this.nameResolver;
    }

    @NotNull
    public final ProtoBuf.Class component2() {
        return this.classProto;
    }

    @NotNull
    public final BinaryVersion component3() {
        return this.metadataVersion;
    }

    @NotNull
    public final SourceElement component4() {
        return this.sourceElement;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj;
        return Intrinsics.areEqual(this.nameResolver, classData.nameResolver) && Intrinsics.areEqual(this.classProto, classData.classProto) && Intrinsics.areEqual(this.metadataVersion, classData.metadataVersion) && Intrinsics.areEqual(this.sourceElement, classData.sourceElement);
    }

    public int hashCode() {
        return this.sourceElement.hashCode() + ((this.metadataVersion.hashCode() + ((this.classProto.hashCode() + (this.nameResolver.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ClassData(nameResolver=" + this.nameResolver + ", classProto=" + this.classProto + ", metadataVersion=" + this.metadataVersion + ", sourceElement=" + this.sourceElement + ')';
    }
}
