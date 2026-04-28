package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ReflectKotlinClassFinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toRuntimeFqName(ClassId classId) {
        String strAsString = classId.getRelativeClassName().asString();
        strAsString.getClass();
        String strReplace = strAsString.replace('.', '$');
        strReplace.getClass();
        if (classId.getPackageFqName().isRoot()) {
            return strReplace;
        }
        return classId.getPackageFqName() + '.' + strReplace;
    }
}
