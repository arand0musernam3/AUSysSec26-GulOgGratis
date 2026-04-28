package kotlin.reflect.jvm.internal.impl.util;

import java.util.Set;
import kotlin.collections.i1;
import kotlin.collections.y;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class OperatorNameConventions {

    @NotNull
    public static final Set<Name> ALL_BINARY_OPERATION_NAMES;

    @NotNull
    public static final Name AND;

    @NotNull
    public static final Set<Name> ASSIGNMENT_OPERATIONS;

    @NotNull
    public static final Set<Name> BINARY_OPERATION_NAMES;

    @NotNull
    public static final Set<Name> BITWISE_OPERATION_NAMES;

    @NotNull
    public static final Name COMPARE_TO;

    @NotNull
    public static final Regex COMPONENT_REGEX;

    @NotNull
    public static final Name CONTAINS;

    @NotNull
    public static final Name DEC;

    @NotNull
    public static final Set<Name> DELEGATED_PROPERTY_OPERATORS;

    @NotNull
    public static final Name DIV;

    @NotNull
    public static final Name DIV_ASSIGN;

    @NotNull
    public static final Name EQUALS;

    @NotNull
    public static final Name GET;

    @NotNull
    public static final Name GET_VALUE;

    @NotNull
    public static final Name HASH_CODE;

    @NotNull
    public static final Name HAS_NEXT;

    @NotNull
    public static final Name INC;

    @NotNull
    public static final OperatorNameConventions INSTANCE = new OperatorNameConventions();

    @NotNull
    public static final Name INV;

    @NotNull
    public static final Name INVOKE;

    @NotNull
    public static final Name ITERATOR;

    @NotNull
    public static final Name MINUS;

    @NotNull
    public static final Name MINUS_ASSIGN;

    @NotNull
    public static final Name MOD;

    @NotNull
    public static final Name MOD_ASSIGN;

    @NotNull
    public static final Name NEXT;

    @NotNull
    public static final Name NOT;

    @NotNull
    public static final Name OR;

    @NotNull
    public static final Name PLUS;

    @NotNull
    public static final Name PLUS_ASSIGN;

    @NotNull
    public static final Name PROVIDE_DELEGATE;

    @NotNull
    public static final Name RANGE_TO;

    @NotNull
    public static final Name RANGE_UNTIL;

    @NotNull
    public static final Name REM;

    @NotNull
    public static final Name REM_ASSIGN;

    @NotNull
    public static final Name SET;

    @NotNull
    public static final Name SET_VALUE;

    @NotNull
    public static final Name SHL;

    @NotNull
    public static final Name SHR;

    @NotNull
    public static final Set<Name> SIMPLE_UNARY_OPERATION_NAMES;

    @NotNull
    public static final Name TIMES;

    @NotNull
    public static final Name TIMES_ASSIGN;

    @NotNull
    public static final Name TO_STRING;

    @NotNull
    public static final Name UNARY_MINUS;

    @NotNull
    public static final Set<Name> UNARY_OPERATION_NAMES;

    @NotNull
    public static final Name UNARY_PLUS;

    @NotNull
    public static final Name USHR;

    @NotNull
    public static final Name XOR;

    static {
        Name nameIdentifier = Name.identifier("getValue");
        nameIdentifier.getClass();
        GET_VALUE = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("setValue");
        nameIdentifier2.getClass();
        SET_VALUE = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("provideDelegate");
        nameIdentifier3.getClass();
        PROVIDE_DELEGATE = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("equals");
        nameIdentifier4.getClass();
        EQUALS = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("hashCode");
        nameIdentifier5.getClass();
        HASH_CODE = nameIdentifier5;
        Name nameIdentifier6 = Name.identifier("compareTo");
        nameIdentifier6.getClass();
        COMPARE_TO = nameIdentifier6;
        Name nameIdentifier7 = Name.identifier("contains");
        nameIdentifier7.getClass();
        CONTAINS = nameIdentifier7;
        Name nameIdentifier8 = Name.identifier("invoke");
        nameIdentifier8.getClass();
        INVOKE = nameIdentifier8;
        Name nameIdentifier9 = Name.identifier("iterator");
        nameIdentifier9.getClass();
        ITERATOR = nameIdentifier9;
        Name nameIdentifier10 = Name.identifier("get");
        nameIdentifier10.getClass();
        GET = nameIdentifier10;
        Name nameIdentifier11 = Name.identifier("set");
        nameIdentifier11.getClass();
        SET = nameIdentifier11;
        Name nameIdentifier12 = Name.identifier("next");
        nameIdentifier12.getClass();
        NEXT = nameIdentifier12;
        Name nameIdentifier13 = Name.identifier("hasNext");
        nameIdentifier13.getClass();
        HAS_NEXT = nameIdentifier13;
        Name nameIdentifier14 = Name.identifier("toString");
        nameIdentifier14.getClass();
        TO_STRING = nameIdentifier14;
        COMPONENT_REGEX = new Regex("component\\d+");
        Name nameIdentifier15 = Name.identifier("and");
        nameIdentifier15.getClass();
        AND = nameIdentifier15;
        Name nameIdentifier16 = Name.identifier("or");
        nameIdentifier16.getClass();
        OR = nameIdentifier16;
        Name nameIdentifier17 = Name.identifier("xor");
        nameIdentifier17.getClass();
        XOR = nameIdentifier17;
        Name nameIdentifier18 = Name.identifier("inv");
        nameIdentifier18.getClass();
        INV = nameIdentifier18;
        Name nameIdentifier19 = Name.identifier("shl");
        nameIdentifier19.getClass();
        SHL = nameIdentifier19;
        Name nameIdentifier20 = Name.identifier("shr");
        nameIdentifier20.getClass();
        SHR = nameIdentifier20;
        Name nameIdentifier21 = Name.identifier("ushr");
        nameIdentifier21.getClass();
        USHR = nameIdentifier21;
        Name nameIdentifier22 = Name.identifier("inc");
        nameIdentifier22.getClass();
        INC = nameIdentifier22;
        Name nameIdentifier23 = Name.identifier("dec");
        nameIdentifier23.getClass();
        DEC = nameIdentifier23;
        Name nameIdentifier24 = Name.identifier("plus");
        nameIdentifier24.getClass();
        PLUS = nameIdentifier24;
        Name nameIdentifier25 = Name.identifier("minus");
        nameIdentifier25.getClass();
        MINUS = nameIdentifier25;
        Name nameIdentifier26 = Name.identifier("not");
        nameIdentifier26.getClass();
        NOT = nameIdentifier26;
        Name nameIdentifier27 = Name.identifier("unaryMinus");
        nameIdentifier27.getClass();
        UNARY_MINUS = nameIdentifier27;
        Name nameIdentifier28 = Name.identifier("unaryPlus");
        nameIdentifier28.getClass();
        UNARY_PLUS = nameIdentifier28;
        Name nameIdentifier29 = Name.identifier("times");
        nameIdentifier29.getClass();
        TIMES = nameIdentifier29;
        Name nameIdentifier30 = Name.identifier("div");
        nameIdentifier30.getClass();
        DIV = nameIdentifier30;
        Name nameIdentifier31 = Name.identifier("mod");
        nameIdentifier31.getClass();
        MOD = nameIdentifier31;
        Name nameIdentifier32 = Name.identifier("rem");
        nameIdentifier32.getClass();
        REM = nameIdentifier32;
        Name nameIdentifier33 = Name.identifier("rangeTo");
        nameIdentifier33.getClass();
        RANGE_TO = nameIdentifier33;
        Name nameIdentifier34 = Name.identifier("rangeUntil");
        nameIdentifier34.getClass();
        RANGE_UNTIL = nameIdentifier34;
        Name nameIdentifier35 = Name.identifier("timesAssign");
        nameIdentifier35.getClass();
        TIMES_ASSIGN = nameIdentifier35;
        Name nameIdentifier36 = Name.identifier("divAssign");
        nameIdentifier36.getClass();
        DIV_ASSIGN = nameIdentifier36;
        Name nameIdentifier37 = Name.identifier("modAssign");
        nameIdentifier37.getClass();
        MOD_ASSIGN = nameIdentifier37;
        Name nameIdentifier38 = Name.identifier("remAssign");
        nameIdentifier38.getClass();
        REM_ASSIGN = nameIdentifier38;
        Name nameIdentifier39 = Name.identifier("plusAssign");
        nameIdentifier39.getClass();
        PLUS_ASSIGN = nameIdentifier39;
        Name nameIdentifier40 = Name.identifier("minusAssign");
        nameIdentifier40.getClass();
        MINUS_ASSIGN = nameIdentifier40;
        UNARY_OPERATION_NAMES = y.W(new Name[]{nameIdentifier22, nameIdentifier23, nameIdentifier28, nameIdentifier27, nameIdentifier26, nameIdentifier18});
        SIMPLE_UNARY_OPERATION_NAMES = y.W(new Name[]{nameIdentifier28, nameIdentifier27, nameIdentifier26, nameIdentifier18});
        Set<Name> setW = y.W(new Name[]{nameIdentifier29, nameIdentifier24, nameIdentifier25, nameIdentifier30, nameIdentifier31, nameIdentifier32, nameIdentifier33, nameIdentifier34});
        BINARY_OPERATION_NAMES = setW;
        Set<Name> setW2 = y.W(new Name[]{nameIdentifier15, nameIdentifier16, nameIdentifier17, nameIdentifier18, nameIdentifier19, nameIdentifier20, nameIdentifier21});
        BITWISE_OPERATION_NAMES = setW2;
        ALL_BINARY_OPERATION_NAMES = i1.h(i1.h(setW, setW2), y.W(new Name[]{nameIdentifier4, nameIdentifier7, nameIdentifier6}));
        ASSIGNMENT_OPERATIONS = y.W(new Name[]{nameIdentifier35, nameIdentifier36, nameIdentifier37, nameIdentifier38, nameIdentifier39, nameIdentifier40});
        DELEGATED_PROPERTY_OPERATORS = y.W(new Name[]{nameIdentifier, nameIdentifier2, nameIdentifier3});
    }

    private OperatorNameConventions() {
    }
}
