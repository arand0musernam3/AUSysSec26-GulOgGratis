package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class JvmDescriptorTypeWriter<T> {

    @Nullable
    private T jvmCurrentType;
    private int jvmCurrentTypeArrayLevel;

    @NotNull
    private final JvmTypeFactory<T> jvmTypeFactory;

    public void writeArrayType() {
        if (this.jvmCurrentType == null) {
            this.jvmCurrentTypeArrayLevel++;
        }
    }

    public void writeClass(@NotNull T t9) {
        t9.getClass();
        writeJvmTypeAsIs(t9);
    }

    public final void writeJvmTypeAsIs(@NotNull T t9) {
        t9.getClass();
        if (this.jvmCurrentType == null) {
            if (this.jvmCurrentTypeArrayLevel > 0) {
                t9 = this.jvmTypeFactory.createFromString(y.m(this.jvmCurrentTypeArrayLevel, "[") + this.jvmTypeFactory.toString(t9));
            }
            this.jvmCurrentType = t9;
        }
    }

    public void writeTypeVariable(@NotNull Name name, @NotNull T t9) {
        name.getClass();
        t9.getClass();
        writeJvmTypeAsIs(t9);
    }

    public void writeArrayEnd() {
    }
}
