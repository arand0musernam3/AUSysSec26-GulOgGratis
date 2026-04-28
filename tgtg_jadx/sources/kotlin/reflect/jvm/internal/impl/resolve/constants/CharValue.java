package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import zendesk.core.ui.android.internal.xml.richtext.codeblock.CodeBlockHandler;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class CharValue extends IntegerValueConstant<Character> {
    public CharValue(char c3) {
        super(Character.valueOf(c3));
    }

    private final String getPrintablePart(char c3) {
        return c3 == '\b' ? "\\b" : c3 == '\t' ? "\\t" : c3 == '\n' ? CodeBlockHandler.NEWLINE_REGEX : c3 == '\f' ? "\\f" : c3 == '\r' ? "\\r" : isPrintableUnicode(c3) ? String.valueOf(c3) : "?";
    }

    private final boolean isPrintableUnicode(char c3) {
        byte type = (byte) Character.getType(c3);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public SimpleType getType(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType charType = moduleDescriptor.getBuiltIns().getCharType();
        charType.getClass();
        return charType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(getValue().charValue()), getPrintablePart(getValue().charValue())}, 2));
    }
}
