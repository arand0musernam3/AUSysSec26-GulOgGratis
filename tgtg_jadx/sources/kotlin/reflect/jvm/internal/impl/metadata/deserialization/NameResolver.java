package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface NameResolver {
    @NotNull
    String getQualifiedClassName(int i11);

    @NotNull
    String getString(int i11);

    boolean isLocalClassName(int i11);
}
