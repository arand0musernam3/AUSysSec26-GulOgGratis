package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnnotationUtilKt {

    @NotNull
    private static final Name DEPRECATED_LEVEL_NAME;

    @NotNull
    private static final Name DEPRECATED_MESSAGE_NAME;

    @NotNull
    private static final Name DEPRECATED_REPLACE_WITH_NAME;

    @NotNull
    private static final Name REPLACE_WITH_EXPRESSION_NAME;

    @NotNull
    private static final Name REPLACE_WITH_IMPORTS_NAME;

    static {
        Name nameIdentifier = Name.identifier(InAppMessageBase.MESSAGE);
        nameIdentifier.getClass();
        DEPRECATED_MESSAGE_NAME = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("replaceWith");
        nameIdentifier2.getClass();
        DEPRECATED_REPLACE_WITH_NAME = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("level");
        nameIdentifier3.getClass();
        DEPRECATED_LEVEL_NAME = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("expression");
        nameIdentifier4.getClass();
        REPLACE_WITH_EXPRESSION_NAME = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("imports");
        nameIdentifier5.getClass();
        REPLACE_WITH_IMPORTS_NAME = nameIdentifier5;
    }

    @NotNull
    public static final AnnotationDescriptor createDeprecatedAnnotation(@NotNull final KotlinBuiltIns kotlinBuiltIns, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        kotlinBuiltIns.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.replaceWith, x0.e(new Pair(REPLACE_WITH_EXPRESSION_NAME, new StringValue(str2)), new Pair(REPLACE_WITH_IMPORTS_NAME, new ArrayValue(n0.f26529a, new Function1<ModuleDescriptor, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final KotlinType invoke(@NotNull ModuleDescriptor moduleDescriptor) {
                moduleDescriptor.getClass();
                SimpleType arrayType = moduleDescriptor.getBuiltIns().getArrayType(Variance.INVARIANT, kotlinBuiltIns.getStringType());
                arrayType.getClass();
                return arrayType;
            }
        }))));
        FqName fqName = StandardNames.FqNames.deprecated;
        Pair pair = new Pair(DEPRECATED_MESSAGE_NAME, new StringValue(str));
        Pair pair2 = new Pair(DEPRECATED_REPLACE_WITH_NAME, new AnnotationValue(builtInAnnotationDescriptor));
        Name name = DEPRECATED_LEVEL_NAME;
        ClassId classId = ClassId.topLevel(StandardNames.FqNames.deprecationLevel);
        classId.getClass();
        Name nameIdentifier = Name.identifier(str3);
        nameIdentifier.getClass();
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, x0.e(pair, pair2, new Pair(name, new EnumValue(classId, nameIdentifier))));
    }

    public static /* synthetic */ AnnotationDescriptor createDeprecatedAnnotation$default(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        if ((i11 & 4) != 0) {
            str3 = "WARNING";
        }
        return createDeprecatedAnnotation(kotlinBuiltIns, str, str2, str3);
    }
}
