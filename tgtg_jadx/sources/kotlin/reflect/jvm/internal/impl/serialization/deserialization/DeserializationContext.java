package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionSpecificBehaviorKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class DeserializationContext {

    @NotNull
    private final DeserializationComponents components;

    @Nullable
    private final DeserializedContainerSource containerSource;

    @NotNull
    private final DeclarationDescriptor containingDeclaration;

    @NotNull
    private final MemberDeserializer memberDeserializer;

    @NotNull
    private final BinaryVersion metadataVersion;

    @NotNull
    private final NameResolver nameResolver;

    @NotNull
    private final TypeDeserializer typeDeserializer;

    @NotNull
    private final TypeTable typeTable;

    @NotNull
    private final VersionRequirementTable versionRequirementTable;

    public DeserializationContext(@NotNull DeserializationComponents deserializationComponents, @NotNull NameResolver nameResolver, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion binaryVersion, @Nullable DeserializedContainerSource deserializedContainerSource, @Nullable TypeDeserializer typeDeserializer, @NotNull List<ProtoBuf.TypeParameter> list) {
        String presentableString;
        deserializationComponents.getClass();
        nameResolver.getClass();
        declarationDescriptor.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        binaryVersion.getClass();
        list.getClass();
        this.components = deserializationComponents;
        this.nameResolver = nameResolver;
        this.containingDeclaration = declarationDescriptor;
        this.typeTable = typeTable;
        this.versionRequirementTable = versionRequirementTable;
        this.metadataVersion = binaryVersion;
        this.containerSource = deserializedContainerSource;
        this.typeDeserializer = new TypeDeserializer(this, typeDeserializer, list, "Deserializer for \"" + declarationDescriptor.getName() + '\"', (deserializedContainerSource == null || (presentableString = deserializedContainerSource.getPresentableString()) == null) ? "[container not found]" : presentableString);
        this.memberDeserializer = new MemberDeserializer(this);
    }

    public static /* synthetic */ DeserializationContext childContext$default(DeserializationContext deserializationContext, DeclarationDescriptor declarationDescriptor, List list, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion binaryVersion, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            nameResolver = deserializationContext.nameResolver;
        }
        NameResolver nameResolver2 = nameResolver;
        if ((i11 & 8) != 0) {
            typeTable = deserializationContext.typeTable;
        }
        TypeTable typeTable2 = typeTable;
        if ((i11 & 16) != 0) {
            versionRequirementTable = deserializationContext.versionRequirementTable;
        }
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        if ((i11 & 32) != 0) {
            binaryVersion = deserializationContext.metadataVersion;
        }
        return deserializationContext.childContext(declarationDescriptor, list, nameResolver2, typeTable2, versionRequirementTable2, binaryVersion);
    }

    @NotNull
    public final DeserializationContext childContext(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull List<ProtoBuf.TypeParameter> list, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion binaryVersion) {
        declarationDescriptor.getClass();
        list.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        binaryVersion.getClass();
        DeserializationComponents deserializationComponents = this.components;
        if (!VersionSpecificBehaviorKt.isVersionRequirementTableWrittenCorrectly(binaryVersion)) {
            versionRequirementTable = this.versionRequirementTable;
        }
        return new DeserializationContext(deserializationComponents, nameResolver, declarationDescriptor, typeTable, versionRequirementTable, binaryVersion, this.containerSource, this.typeDeserializer, list);
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        return this.components;
    }

    @Nullable
    public final DeserializedContainerSource getContainerSource() {
        return this.containerSource;
    }

    @NotNull
    public final DeclarationDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @NotNull
    public final MemberDeserializer getMemberDeserializer() {
        return this.memberDeserializer;
    }

    @NotNull
    public final NameResolver getNameResolver() {
        return this.nameResolver;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.components.getStorageManager();
    }

    @NotNull
    public final TypeDeserializer getTypeDeserializer() {
        return this.typeDeserializer;
    }

    @NotNull
    public final TypeTable getTypeTable() {
        return this.typeTable;
    }

    @NotNull
    public final VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable;
    }
}
