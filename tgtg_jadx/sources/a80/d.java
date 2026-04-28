package a80;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final c f997b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f998a;

    public d(Enum[] enumArr) {
        enumArr.getClass();
        Class<?> componentType = enumArr.getClass().getComponentType();
        componentType.getClass();
        this.f998a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f998a.getEnumConstants();
        enumConstants.getClass();
        return new b((Enum[]) enumConstants);
    }
}
