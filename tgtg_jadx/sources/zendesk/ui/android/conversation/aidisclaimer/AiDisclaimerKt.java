package zendesk.ui.android.conversation.aidisclaimer;

import b4.t;
import i3.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.c3;
import m3.i;
import m3.n;
import m3.s;
import m3.w1;
import m5.s0;
import m5.u0;
import on.j;
import org.jetbrains.annotations.NotNull;
import z4.l1;
import z4.m1;
import z4.t0;
import z4.v0;
import z4.w0;
import z5.a;
import zendesk.ui.android.compose.theme.ThemeKt;
import zendesk.ui.android.compose.utils.FontUtilsKt;
import zendesk.ui.android.compose.utils.PreviewThemes;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\u001a=\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\u000e\"\u001a\u0010\u000f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Li4/v;", "textColor", "imageColor", "Lb4/t;", "modifier", "", "textDisclaimer", "Lm5/u0;", "textStyle", "", "AiDisclaimer-vc5YOHI", "(JJLb4/t;Ljava/lang/String;Lm5/u0;Lm3/n;II)V", "AiDisclaimer", "PreviewAiDisclaimer", "(Lm3/n;I)V", AiDisclaimerKt.ZuicIcAiTag, "Ljava/lang/String;", "getZuicIcAiTag$annotations", "()V", "", "textHeight", "zendesk.ui_ui-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAiDisclaimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiDisclaimer.kt\nzendesk/ui/android/conversation/aidisclaimer/AiDisclaimerKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,142:1\n99#2:143\n96#2,9:144\n106#2:197\n79#3,6:153\n86#3,3:168\n89#3,2:177\n93#3:196\n347#4,9:159\n356#4:179\n357#4,2:194\n4206#5,6:171\n1247#6,6:180\n1247#6,6:188\n75#7:186\n1#8:187\n59#9:198\n90#10:199\n85#11:200\n*S KotlinDebug\n*F\n+ 1 AiDisclaimer.kt\nzendesk/ui/android/conversation/aidisclaimer/AiDisclaimerKt\n*L\n57#1:143\n57#1:144,9\n57#1:197\n57#1:153,6\n57#1:168,3\n57#1:177,2\n57#1:196\n57#1:159,9\n57#1:179\n57#1:194,2\n57#1:171,6\n64#1:180,6\n82#1:188,6\n73#1:186\n69#1:198\n69#1:199\n64#1:200\n*E\n"})
public final class AiDisclaimerKt {

    @NotNull
    public static final String ZuicIcAiTag = "ZuicIcAiTag";

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0175  */
    /* JADX INFO: renamed from: AiDisclaimer-vc5YOHI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1005AiDisclaimervc5YOHI(long r31, long r33, @org.jetbrains.annotations.Nullable b4.t r35, @org.jetbrains.annotations.Nullable java.lang.String r36, @org.jetbrains.annotations.Nullable m5.u0 r37, @org.jetbrains.annotations.Nullable m3.n r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.ui.android.conversation.aidisclaimer.AiDisclaimerKt.m1005AiDisclaimervc5YOHI(long, long, b4.t, java.lang.String, m5.u0, m3.n, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AiDisclaimer_vc5YOHI$lambda$7$lambda$1$lambda$0(s0 s0Var, String str, u0 u0Var) {
        return (int) (s0.a(s0Var, str, FontUtilsKt.applyFontPadding(u0.a(u0Var, 0L, 0L, null, null, 0L, null, 3, 0L, null, null, 16744447)), 0L, null, 1020).f29619c & 4294967295L);
    }

    private static final int AiDisclaimer_vc5YOHI$lambda$7$lambda$2(c3 c3Var) {
        return ((Number) c3Var.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v0 AiDisclaimer_vc5YOHI$lambda$7$lambda$6$lambda$5(float f11, w0 w0Var, t0 t0Var, a aVar) {
        w0Var.getClass();
        t0Var.getClass();
        m1 m1VarD = t0Var.D(a.b(aVar.f47271a, ((int) w0Var.c0(f11)) / 2, 0, 0, 0, 14));
        int iC0 = ((int) w0Var.c0(f11)) / 2;
        int i11 = m1VarD.f47184b;
        return w0.f(w0Var, m1VarD.f47183a, i11, new b(iC0 - (i11 / 2), 2, m1VarD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiDisclaimer_vc5YOHI$lambda$7$lambda$6$lambda$5$lambda$4(m1 m1Var, int i11, l1 l1Var) {
        l1Var.getClass();
        l1.o(l1Var, m1Var, 0, i11);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiDisclaimer_vc5YOHI$lambda$8(long j9, long j11, t tVar, String str, u0 u0Var, int i11, int i12, n nVar, int i13) {
        m1005AiDisclaimervc5YOHI(j9, j11, tVar, str, u0Var, nVar, i.F(i11 | 1), i12);
        return Unit.f26487a;
    }

    @PreviewThemes
    private static final void PreviewAiDisclaimer(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(2014565885);
        if (i11 == 0 && sVar.B()) {
            sVar.U();
        } else {
            ThemeKt.UiComposeAndroidTheme(false, ComposableSingletons$AiDisclaimerKt.INSTANCE.getLambda$1911825737$zendesk_ui_ui_android(), sVar, 48, 1);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j(i11, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewAiDisclaimer$lambda$9(int i11, n nVar, int i12) {
        PreviewAiDisclaimer(nVar, i.F(i11 | 1));
        return Unit.f26487a;
    }

    public static /* synthetic */ void getZuicIcAiTag$annotations() {
    }
}
