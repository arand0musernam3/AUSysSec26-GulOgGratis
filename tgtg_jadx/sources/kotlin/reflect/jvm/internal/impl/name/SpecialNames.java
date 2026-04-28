package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSpecialNames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialNames.kt\norg/jetbrains/kotlin/name/SpecialNames\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class SpecialNames {

    @NotNull
    public static final Name ANONYMOUS;

    @NotNull
    public static final Name ARRAY;

    @NotNull
    public static final Name DEFAULT_NAME_FOR_COMPANION_OBJECT;

    @NotNull
    public static final Name DESTRUCT;

    @NotNull
    public static final Name ENUM_GET_ENTRIES;

    @NotNull
    public static final Name IMPLICIT_SET_PARAMETER;

    @NotNull
    public static final Name INIT;

    @NotNull
    public static final SpecialNames INSTANCE = new SpecialNames();

    @NotNull
    public static final Name ITERATOR;

    @NotNull
    public static final Name LOCAL;

    @NotNull
    public static final Name NO_NAME_PROVIDED;

    @NotNull
    public static final Name RECEIVER;

    @NotNull
    public static final Name ROOT_PACKAGE;

    @NotNull
    public static final Name SAFE_IDENTIFIER_FOR_NO_NAME;

    @NotNull
    public static final Name THIS;

    @NotNull
    public static final Name UNARY;

    @NotNull
    public static final Name UNARY_RESULT;

    @NotNull
    public static final Name UNDERSCORE_FOR_UNUSED_VAR;

    static {
        Name nameSpecial = Name.special("<no name provided>");
        nameSpecial.getClass();
        NO_NAME_PROVIDED = nameSpecial;
        Name nameSpecial2 = Name.special("<root package>");
        nameSpecial2.getClass();
        ROOT_PACKAGE = nameSpecial2;
        Name nameIdentifier = Name.identifier("Companion");
        nameIdentifier.getClass();
        DEFAULT_NAME_FOR_COMPANION_OBJECT = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        nameIdentifier2.getClass();
        SAFE_IDENTIFIER_FOR_NO_NAME = nameIdentifier2;
        Name nameSpecial3 = Name.special("<anonymous>");
        nameSpecial3.getClass();
        ANONYMOUS = nameSpecial3;
        Name nameSpecial4 = Name.special("<unary>");
        nameSpecial4.getClass();
        UNARY = nameSpecial4;
        Name nameSpecial5 = Name.special("<unary-result>");
        nameSpecial5.getClass();
        UNARY_RESULT = nameSpecial5;
        Name nameSpecial6 = Name.special("<this>");
        nameSpecial6.getClass();
        THIS = nameSpecial6;
        Name nameSpecial7 = Name.special("<init>");
        nameSpecial7.getClass();
        INIT = nameSpecial7;
        Name nameSpecial8 = Name.special("<iterator>");
        nameSpecial8.getClass();
        ITERATOR = nameSpecial8;
        Name nameSpecial9 = Name.special("<destruct>");
        nameSpecial9.getClass();
        DESTRUCT = nameSpecial9;
        Name nameSpecial10 = Name.special("<local>");
        nameSpecial10.getClass();
        LOCAL = nameSpecial10;
        Name nameSpecial11 = Name.special("<unused var>");
        nameSpecial11.getClass();
        UNDERSCORE_FOR_UNUSED_VAR = nameSpecial11;
        Name nameSpecial12 = Name.special("<set-?>");
        nameSpecial12.getClass();
        IMPLICIT_SET_PARAMETER = nameSpecial12;
        Name nameSpecial13 = Name.special("<array>");
        nameSpecial13.getClass();
        ARRAY = nameSpecial13;
        Name nameSpecial14 = Name.special("<receiver>");
        nameSpecial14.getClass();
        RECEIVER = nameSpecial14;
        Name nameSpecial15 = Name.special("<get-entries>");
        nameSpecial15.getClass();
        ENUM_GET_ENTRIES = nameSpecial15;
    }

    private SpecialNames() {
    }

    @NotNull
    public static final Name safeIdentifier(@Nullable Name name) {
        return (name == null || name.isSpecial()) ? SAFE_IDENTIFIER_FOR_NO_NAME : name;
    }

    public final boolean isSafeIdentifier(@NotNull Name name) {
        name.getClass();
        String strAsString = name.asString();
        strAsString.getClass();
        return strAsString.length() > 0 && !name.isSpecial();
    }
}
