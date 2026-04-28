package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnnotationsKt {
    @NotNull
    public static final Annotations composeAnnotations(@NotNull Annotations annotations, @NotNull Annotations annotations2) {
        annotations.getClass();
        annotations2.getClass();
        return annotations.isEmpty() ? annotations2 : annotations2.isEmpty() ? annotations : new CompositeAnnotations(annotations, annotations2);
    }
}
