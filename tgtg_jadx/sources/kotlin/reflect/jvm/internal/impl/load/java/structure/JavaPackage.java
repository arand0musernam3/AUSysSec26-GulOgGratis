package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface JavaPackage extends JavaAnnotationOwner, JavaElement {
    @NotNull
    Collection<JavaClass> getClasses(@NotNull Function1<? super Name, Boolean> function1);

    @NotNull
    FqName getFqName();

    @NotNull
    Collection<JavaPackage> getSubPackages();
}
