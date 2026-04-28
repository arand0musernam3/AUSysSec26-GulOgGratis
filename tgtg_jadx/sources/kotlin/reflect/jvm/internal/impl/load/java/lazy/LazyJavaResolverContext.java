package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class LazyJavaResolverContext {

    @NotNull
    private final JavaResolverComponents components;

    @NotNull
    private final j defaultTypeQualifiers$delegate;

    @NotNull
    private final j delegateForDefaultTypeQualifiers;

    @NotNull
    private final TypeParameterResolver typeParameterResolver;

    @NotNull
    private final JavaTypeResolver typeResolver;

    public LazyJavaResolverContext(@NotNull JavaResolverComponents javaResolverComponents, @NotNull TypeParameterResolver typeParameterResolver, @NotNull j jVar) {
        javaResolverComponents.getClass();
        typeParameterResolver.getClass();
        jVar.getClass();
        this.components = javaResolverComponents;
        this.typeParameterResolver = typeParameterResolver;
        this.delegateForDefaultTypeQualifiers = jVar;
        this.defaultTypeQualifiers$delegate = jVar;
        this.typeResolver = new JavaTypeResolver(this, typeParameterResolver);
    }

    @NotNull
    public final JavaResolverComponents getComponents() {
        return this.components;
    }

    @Nullable
    public final JavaTypeQualifiersByElementType getDefaultTypeQualifiers() {
        return (JavaTypeQualifiersByElementType) this.defaultTypeQualifiers$delegate.getValue();
    }

    @NotNull
    public final j getDelegateForDefaultTypeQualifiers$descriptors_jvm() {
        return this.delegateForDefaultTypeQualifiers;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.components.getModule();
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.components.getStorageManager();
    }

    @NotNull
    public final TypeParameterResolver getTypeParameterResolver() {
        return this.typeParameterResolver;
    }

    @NotNull
    public final JavaTypeResolver getTypeResolver() {
        return this.typeResolver;
    }
}
