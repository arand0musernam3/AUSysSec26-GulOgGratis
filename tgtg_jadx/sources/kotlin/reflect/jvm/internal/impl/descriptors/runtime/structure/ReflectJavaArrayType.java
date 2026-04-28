package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import m0.i1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {

    @NotNull
    private final Collection<JavaAnnotation> annotations;

    @NotNull
    private final ReflectJavaType componentType;
    private final boolean isDeprecatedInJavaDoc;

    @NotNull
    private final Type reflectType;

    public ReflectJavaArrayType(@NotNull Type type) {
        ReflectJavaType reflectJavaTypeCreate;
        type.getClass();
        this.reflectType = type;
        Type reflectType = getReflectType();
        if (!(reflectType instanceof GenericArrayType)) {
            if (reflectType instanceof Class) {
                Class cls = (Class) reflectType;
                if (cls.isArray()) {
                    ReflectJavaType.Factory factory = ReflectJavaType.Factory;
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    reflectJavaTypeCreate = factory.create(componentType);
                }
            }
            StringBuilder sb2 = new StringBuilder("Not an array type (");
            sb2.append(getReflectType().getClass());
            i1.m(sb2, "): ", getReflectType());
            throw null;
        }
        ReflectJavaType.Factory factory2 = ReflectJavaType.Factory;
        Type genericComponentType = ((GenericArrayType) reflectType).getGenericComponentType();
        genericComponentType.getClass();
        reflectJavaTypeCreate = factory2.create(genericComponentType);
        this.componentType = reflectJavaTypeCreate;
        this.annotations = n0.f26529a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    public Type getReflectType() {
        return this.reflectType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return this.isDeprecatedInJavaDoc;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    @NotNull
    public ReflectJavaType getComponentType() {
        return this.componentType;
    }
}
