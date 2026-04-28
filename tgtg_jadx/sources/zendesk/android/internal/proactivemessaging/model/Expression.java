package zendesk.android.internal.proactivemessaging.model;

import com.braze.ui.actions.brazeactions.steps.StepData;
import e40.a;
import i90.g;
import i90.h;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import n90.n;
import n90.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import zendesk.android.internal.proactivemessaging.model.ExpressionFunction;
import zendesk.android.internal.proactivemessaging.model.ExpressionTarget;
import zendesk.android.internal.proactivemessaging.model.ExpressionType;
import zendesk.android.internal.proactivemessaging.model.serializer.ExpressionSerializer;
import zendesk.android.pageviewevents.PageView;
import zendesk.conversationkit.android.model.VisitType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h(with = ExpressionSerializer.class)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00152\u00020\u0001:\u0003\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0014\u0010\t\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0002J\u0014\u0010\u000b\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0002J%\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0012\u0082\u0001\u0002\u0016\u0006¨\u0006\u0017"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Expression;", "", "<init>", "()V", "evaluateAsAString", "", "Lzendesk/android/internal/proactivemessaging/model/Expression$ExpressionClass;", "targetValue", "", "evaluateAsALocale", "Ljava/util/Locale;", "evaluateAsAVisitType", "Lzendesk/conversationkit/android/model/VisitType;", "evaluate", "event", "Lzendesk/android/pageviewevents/PageView;", "locale", "visitType", "evaluate$zendesk_zendesk_android", "ExpressionClass", "BoolValue", "Companion", "Lzendesk/android/internal/proactivemessaging/model/Expression$BoolValue;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExpression.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Expression.kt\nzendesk/android/internal/proactivemessaging/model/Expression\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1563#2:150\n1634#2,3:151\n1761#2,3:154\n1563#2:157\n1634#2,3:158\n1761#2,3:161\n*S KotlinDebug\n*F\n+ 1 Expression.kt\nzendesk/android/internal/proactivemessaging/model/Expression\n*L\n55#1:150\n55#1:151,3\n57#1:154,3\n63#1:157\n63#1:158,3\n65#1:161,3\n*E\n"})
public abstract class Expression {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ExpressionFunction.values().length];
            try {
                iArr[ExpressionFunction.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExpressionFunction.NOT_EQUALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExpressionFunction.CONTAINS_ANY_STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ExpressionFunction.CONTAINS_NONE_STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ExpressionFunction.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ExpressionTarget.values().length];
            try {
                iArr2[ExpressionTarget.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ExpressionTarget.PAGE_TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ExpressionTarget.USER_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ExpressionTarget.LANGUAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ExpressionTarget.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ Expression(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean evaluateAsALocale(zendesk.android.internal.proactivemessaging.model.Expression.ExpressionClass r6, java.util.Locale r7) {
        /*
            r5 = this;
            java.util.List r0 = r6.getArgs()
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            boolean r1 = r0 instanceof n90.g0
            r2 = 0
            if (r1 == 0) goto L10
            n90.g0 r0 = (n90.g0) r0
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L20
            m90.g0 r1 = n90.o.f30779a
            boolean r1 = r0 instanceof n90.y
            if (r1 == 0) goto L1a
            goto L1e
        L1a:
            java.lang.String r2 = r0.b()
        L1e:
            if (r2 != 0) goto L22
        L20:
            java.lang.String r2 = ""
        L22:
            r0 = 95
            r1 = 45
            java.lang.String r0 = r2.replace(r0, r1)
            r0.getClass()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r2)
            r0.getClass()
            zendesk.android.internal.proactivemessaging.model.ExpressionFunction r6 = r6.getFunction()
            int[] r2 = zendesk.android.internal.proactivemessaging.model.Expression.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r2[r6]
            r2 = 1
            if (r6 == r2) goto L85
            r3 = 2
            r4 = 0
            if (r6 == r3) goto L57
            r7 = 3
            if (r6 == r7) goto L84
            r7 = 4
            if (r6 == r7) goto L84
            r7 = 5
            if (r6 != r7) goto L53
            goto L84
        L53:
            e40.a.f()
            return r4
        L57:
            boolean r6 = kotlin.text.StringsKt.A(r0, r1)
            if (r6 == 0) goto L79
            java.util.Locale r6 = java.util.Locale.forLanguageTag(r0)
            zendesk.android.internal.proactivemessaging.EvaluationLanguageMapper$Companion r1 = zendesk.android.internal.proactivemessaging.EvaluationLanguageMapper.INSTANCE
            java.lang.String r7 = r7.toLanguageTag()
            r7.getClass()
            java.lang.String r7 = r1.mapLanguage$zendesk_zendesk_android(r7, r0)
            java.util.Locale r7 = java.util.Locale.forLanguageTag(r7)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 != 0) goto L84
            goto L83
        L79:
            java.lang.String r6 = r7.getLanguage()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L84
        L83:
            return r2
        L84:
            return r4
        L85:
            boolean r6 = kotlin.text.StringsKt.A(r0, r1)
            if (r6 == 0) goto La5
            java.util.Locale r6 = java.util.Locale.forLanguageTag(r0)
            zendesk.android.internal.proactivemessaging.EvaluationLanguageMapper$Companion r1 = zendesk.android.internal.proactivemessaging.EvaluationLanguageMapper.INSTANCE
            java.lang.String r7 = r7.toLanguageTag()
            r7.getClass()
            java.lang.String r7 = r1.mapLanguage$zendesk_zendesk_android(r7, r0)
            java.util.Locale r7 = java.util.Locale.forLanguageTag(r7)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            return r6
        La5:
            java.lang.String r6 = r7.getLanguage()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.model.Expression.evaluateAsALocale(zendesk.android.internal.proactivemessaging.model.Expression$ExpressionClass, java.util.Locale):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean evaluateAsAString(zendesk.android.internal.proactivemessaging.model.Expression.ExpressionClass r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.model.Expression.evaluateAsAString(zendesk.android.internal.proactivemessaging.model.Expression$ExpressionClass, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean evaluateAsAVisitType(zendesk.android.internal.proactivemessaging.model.Expression.ExpressionClass r3, zendesk.conversationkit.android.model.VisitType r4) {
        /*
            r2 = this;
            zendesk.android.internal.proactivemessaging.model.ExpressionFunction r0 = r3.getFunction()
            int[] r1 = zendesk.android.internal.proactivemessaging.model.Expression.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L21
            r3 = 2
            r4 = 0
            if (r0 == r3) goto L20
            r3 = 3
            if (r0 == r3) goto L20
            r3 = 4
            if (r0 == r3) goto L20
            r3 = 5
            if (r0 != r3) goto L1d
            goto L20
        L1d:
            e40.a.f()
        L20:
            return r4
        L21:
            java.util.List r3 = r3.getArgs()
            java.lang.Object r3 = kotlin.collections.CollectionsKt.firstOrNull(r3)
            boolean r0 = r3 instanceof n90.g0
            r1 = 0
            if (r0 == 0) goto L31
            n90.g0 r3 = (n90.g0) r3
            goto L32
        L31:
            r3 = r1
        L32:
            if (r3 == 0) goto L41
            m90.g0 r0 = n90.o.f30779a
            boolean r0 = r3 instanceof n90.y
            if (r0 == 0) goto L3b
            goto L3f
        L3b:
            java.lang.String r1 = r3.b()
        L3f:
            if (r1 != 0) goto L43
        L41:
            java.lang.String r1 = ""
        L43:
            java.lang.String r3 = r4.name()
            boolean r3 = r1.equalsIgnoreCase(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.model.Expression.evaluateAsAVisitType(zendesk.android.internal.proactivemessaging.model.Expression$ExpressionClass, zendesk.conversationkit.android.model.VisitType):boolean");
    }

    public final boolean evaluate$zendesk_zendesk_android(@NotNull PageView event, @NotNull Locale locale, @NotNull VisitType visitType) {
        event.getClass();
        locale.getClass();
        visitType.getClass();
        if (this instanceof BoolValue) {
            return ((BoolValue) this).getValue();
        }
        if (!(this instanceof ExpressionClass)) {
            a.f();
            return false;
        }
        ExpressionClass expressionClass = (ExpressionClass) this;
        int i11 = WhenMappings.$EnumSwitchMapping$1[expressionClass.getTarget().ordinal()];
        if (i11 == 1) {
            return evaluateAsAString(expressionClass, event.getUrl());
        }
        if (i11 == 2) {
            return evaluateAsAString(expressionClass, event.getPageTitle());
        }
        if (i11 == 3) {
            return evaluateAsAVisitType(expressionClass, visitType);
        }
        if (i11 == 4) {
            return evaluateAsALocale(expressionClass, locale);
        }
        if (i11 == 5) {
            return false;
        }
        a.f();
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Expression$BoolValue;", "Lzendesk/android/internal/proactivemessaging/model/Expression;", "", "value", "<init>", "(Z)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IZLm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/proactivemessaging/model/Expression$BoolValue;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Z", "getValue", "()Z", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("BoolValue")
    public static final class BoolValue extends Expression {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final boolean value;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ BoolValue(int i11, boolean z11, m1 m1Var) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (1 != (i11 & 1)) {
                c1.j(i11, 1, Expression$BoolValue$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            super(defaultConstructorMarker);
            this.value = z11;
        }

        public final boolean getValue() {
            return this.value;
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Expression$BoolValue$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/model/Expression$BoolValue;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return Expression$BoolValue$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public BoolValue(boolean z11) {
            super(null);
            this.value = z11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002=<B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J>\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b8\u00102\u001a\u0004\b7\u0010 R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\b;\u00102\u001a\u0004\b:\u0010\"¨\u0006>"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Expression$ExpressionClass;", "Lzendesk/android/internal/proactivemessaging/model/Expression;", "Lzendesk/android/internal/proactivemessaging/model/ExpressionType;", "type", "Lzendesk/android/internal/proactivemessaging/model/ExpressionFunction;", "function", "Lzendesk/android/internal/proactivemessaging/model/ExpressionTarget;", "target", "", "Ln90/n;", StepData.ARGS, "<init>", "(Lzendesk/android/internal/proactivemessaging/model/ExpressionType;Lzendesk/android/internal/proactivemessaging/model/ExpressionFunction;Lzendesk/android/internal/proactivemessaging/model/ExpressionTarget;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/android/internal/proactivemessaging/model/ExpressionType;Lzendesk/android/internal/proactivemessaging/model/ExpressionFunction;Lzendesk/android/internal/proactivemessaging/model/ExpressionTarget;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/proactivemessaging/model/Expression$ExpressionClass;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/android/internal/proactivemessaging/model/ExpressionType;", "component2", "()Lzendesk/android/internal/proactivemessaging/model/ExpressionFunction;", "component3", "()Lzendesk/android/internal/proactivemessaging/model/ExpressionTarget;", "component4", "()Ljava/util/List;", "copy", "(Lzendesk/android/internal/proactivemessaging/model/ExpressionType;Lzendesk/android/internal/proactivemessaging/model/ExpressionFunction;Lzendesk/android/internal/proactivemessaging/model/ExpressionTarget;Ljava/util/List;)Lzendesk/android/internal/proactivemessaging/model/Expression$ExpressionClass;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/android/internal/proactivemessaging/model/ExpressionType;", "getType", "getType$annotations", "()V", "Lzendesk/android/internal/proactivemessaging/model/ExpressionFunction;", "getFunction", "getFunction$annotations", "Lzendesk/android/internal/proactivemessaging/model/ExpressionTarget;", "getTarget", "getTarget$annotations", "Ljava/util/List;", "getArgs", "getArgs$annotations", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("ExpressionClass")
    public static final /* data */ class ExpressionClass extends Expression {

        @NotNull
        private final List<n> args;

        @NotNull
        private final ExpressionFunction function;

        @NotNull
        private final ExpressionTarget target;

        @NotNull
        private final ExpressionType type;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {null, null, null, l.a(m.PUBLICATION, new xw.a(19))};

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ExpressionClass(int i11, ExpressionType expressionType, ExpressionFunction expressionFunction, ExpressionTarget expressionTarget, List list, m1 m1Var) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (15 != (i11 & 15)) {
                c1.j(i11, 15, Expression$ExpressionClass$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            super(defaultConstructorMarker);
            this.type = expressionType;
            this.function = expressionFunction;
            this.target = expressionTarget;
            this.args = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new d(q.f30781a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExpressionClass copy$default(ExpressionClass expressionClass, ExpressionType expressionType, ExpressionFunction expressionFunction, ExpressionTarget expressionTarget, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                expressionType = expressionClass.type;
            }
            if ((i11 & 2) != 0) {
                expressionFunction = expressionClass.function;
            }
            if ((i11 & 4) != 0) {
                expressionTarget = expressionClass.target;
            }
            if ((i11 & 8) != 0) {
                list = expressionClass.args;
            }
            return expressionClass.copy(expressionType, expressionFunction, expressionTarget, list);
        }

        public static final /* synthetic */ void write$Self$zendesk_zendesk_android(ExpressionClass self, b output, SerialDescriptor serialDesc) {
            j[] jVarArr = $childSerializers;
            output.i(serialDesc, 0, ExpressionType.ExpressionTypeSerializer.INSTANCE, self.type);
            output.i(serialDesc, 1, ExpressionFunction.ExpressionFunctionSerializer.INSTANCE, self.function);
            output.i(serialDesc, 2, ExpressionTarget.ExpressionTargetSerializer.INSTANCE, self.target);
            output.i(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.args);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ExpressionType getType() {
            return this.type;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ExpressionFunction getFunction() {
            return this.function;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ExpressionTarget getTarget() {
            return this.target;
        }

        @NotNull
        public final List<n> component4() {
            return this.args;
        }

        @NotNull
        public final ExpressionClass copy(@NotNull ExpressionType type, @NotNull ExpressionFunction function, @NotNull ExpressionTarget target, @NotNull List<? extends n> args) {
            type.getClass();
            function.getClass();
            target.getClass();
            args.getClass();
            return new ExpressionClass(type, function, target, args);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpressionClass)) {
                return false;
            }
            ExpressionClass expressionClass = (ExpressionClass) other;
            return this.type == expressionClass.type && this.function == expressionClass.function && this.target == expressionClass.target && Intrinsics.areEqual(this.args, expressionClass.args);
        }

        @NotNull
        public final List<n> getArgs() {
            return this.args;
        }

        @NotNull
        public final ExpressionFunction getFunction() {
            return this.function;
        }

        @NotNull
        public final ExpressionTarget getTarget() {
            return this.target;
        }

        @NotNull
        public final ExpressionType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.args.hashCode() + ((this.target.hashCode() + ((this.function.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "ExpressionClass(type=" + this.type + ", function=" + this.function + ", target=" + this.target + ", args=" + this.args + ")";
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Expression$ExpressionClass$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/model/Expression$ExpressionClass;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return Expression$ExpressionClass$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @g(StepData.ARGS)
        public static /* synthetic */ void getArgs$annotations() {
        }

        @g("function")
        public static /* synthetic */ void getFunction$annotations() {
        }

        @g("target")
        public static /* synthetic */ void getTarget$annotations() {
        }

        @g("type")
        public static /* synthetic */ void getType$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ExpressionClass(@NotNull ExpressionType expressionType, @NotNull ExpressionFunction expressionFunction, @NotNull ExpressionTarget expressionTarget, @NotNull List<? extends n> list) {
            super(null);
            expressionType.getClass();
            expressionFunction.getClass();
            expressionTarget.getClass();
            list.getClass();
            this.type = expressionType;
            this.function = expressionFunction;
            this.target = expressionTarget;
            this.args = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Expression$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/model/Expression;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ExpressionSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private Expression() {
    }
}
