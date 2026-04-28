package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface JavaClass extends JavaClassifier, JavaModifierListOwner, JavaTypeParameterListOwner {
    @NotNull
    Collection<JavaConstructor> getConstructors();

    @NotNull
    Collection<JavaField> getFields();

    @Nullable
    FqName getFqName();

    @NotNull
    Collection<Name> getInnerClassNames();

    @Nullable
    LightClassOriginKind getLightClassOriginKind();

    @NotNull
    Collection<JavaMethod> getMethods();

    @Nullable
    JavaClass getOuterClass();

    @NotNull
    Collection<JavaClassifierType> getPermittedTypes();

    @NotNull
    Collection<JavaRecordComponent> getRecordComponents();

    @NotNull
    Collection<JavaClassifierType> getSupertypes();

    boolean hasDefaultConstructor();

    boolean isAnnotationType();

    boolean isEnum();

    boolean isInterface();

    boolean isRecord();

    boolean isSealed();
}
