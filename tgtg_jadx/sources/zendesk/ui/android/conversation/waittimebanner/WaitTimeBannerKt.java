package zendesk.ui.android.conversation.waittimebanner;

import b0.a0;
import b4.q;
import b4.t;
import g3.i2;
import g3.r9;
import g4.b0;
import g4.z;
import j5.r;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m5.n0;
import m5.y;
import o00.x0;
import o30.f0;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import x5.k;
import zendesk.ui.android.R;
import zendesk.ui.android.compose.theme.ThemeKt;
import zendesk.ui.android.compose.utils.PreviewThemes;
import zendesk.ui.android.compose.utils.ResourceUtilsKt;
import zendesk.ui.android.conversation.waittimebanner.QueuedBannerStatusType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001am\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020!H\u0003¢\u0006\u0004\b\"\u0010#\u001a\u000f\u0010$\u001a\u00020\fH\u0003¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\fH\u0003¢\u0006\u0004\b&\u0010%\"\u001a\u0010'\u001a\u00020\u00138\u0000X\u0080T¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;", "type", "Li4/v;", "iconColor", "borderColor", "focusedBorderColor", "statusColor", "descriptionColor", "backgroundColor", "", "isFocused", "Lkotlin/Function1;", "", "onFocusChange", "Lb4/t;", "modifier", "WaitTimeBanner-cgPJBOs", "(Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;JJJJJJZLkotlin/jvm/functions/Function1;Lb4/t;Lm3/n;II)V", "WaitTimeBanner", "", TextBundle.TEXT_ENTRY, "textColor", "WaitTimeText-M3jwhU8", "(JLjava/lang/String;JLm3/n;I)V", "WaitTimeText", "ClockIcon-ek8zF_U", "(JLm3/n;I)V", "ClockIcon", "", "lowerResponseTime", "upperResponseTime", "queuedBannerText", "(JJLm3/n;I)Ljava/lang/String;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;", "stringForType", "(Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;Lm3/n;I)Ljava/lang/String;", "PreviewBanner", "(Lm3/n;I)V", "PreviewClearedBanner", WaitTimeBannerKt.ZUIWaitTimeBannerTag, "Ljava/lang/String;", "getZUIWaitTimeBannerTag$annotations", "()V", "zendesk.ui_ui-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWaitTimeBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitTimeBanner.kt\nzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,374:1\n1247#2,6:375\n1247#2,6:381\n1247#2,6:462\n1247#2,6:477\n87#3:387\n84#3,9:388\n87#3:424\n83#3,10:425\n94#3:471\n94#3:475\n79#4,6:397\n86#4,3:412\n89#4,2:421\n79#4,6:435\n86#4,3:450\n89#4,2:459\n93#4:470\n93#4:474\n347#5,9:403\n356#5:423\n347#5,9:441\n356#5:461\n357#5,2:468\n357#5,2:472\n4206#6,6:415\n4206#6,6:453\n1565#7:476\n*S KotlinDebug\n*F\n+ 1 WaitTimeBanner.kt\nzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerKt\n*L\n125#1:375,6\n138#1:381,6\n159#1:462,6\n207#1:477,6\n119#1:387\n119#1:388,9\n145#1:424\n145#1:425,10\n145#1:471\n119#1:475\n119#1:397,6\n119#1:412,3\n119#1:421,2\n145#1:435,6\n145#1:450,3\n145#1:459,2\n145#1:470\n119#1:474\n119#1:403,9\n119#1:423\n145#1:441,9\n145#1:461\n145#1:468,2\n119#1:472,2\n119#1:415,6\n145#1:453,6\n186#1:476\n*E\n"})
public final class WaitTimeBannerKt {

    @NotNull
    public static final String ZUIWaitTimeBannerTag = "ZUIWaitTimeBannerTag";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ClockIcon-ek8zF_U, reason: not valid java name */
    public static final void m1009ClockIconek8zF_U(long j9, n nVar, final int i11) {
        int i12;
        final long j11;
        s sVar = (s) nVar;
        sVar.c0(-2021958978);
        if ((i11 & 6) == 0) {
            i12 = (sVar.e(j9) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && sVar.B()) {
            sVar.U();
            j11 = j9;
        } else {
            j11 = j9;
            i2.a(x0.z(R.drawable.zuia_ic_clock, sVar, 0), null, d2.c.k(q.f5711a, ResourceUtilsKt.floatResources(R.dimen.zuia_wait_time_banner_icon_aspect_ratio, sVar, 0)), j11, sVar, ((i12 << 9) & 7168) | 48, 0);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: zendesk.ui.android.conversation.waittimebanner.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return WaitTimeBannerKt.ClockIcon_ek8zF_U$lambda$14(j11, i11, (n) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockIcon_ek8zF_U$lambda$14(long j9, int i11, n nVar, int i12) {
        m1009ClockIconek8zF_U(j9, nVar, i.F(i11 | 1));
        return Unit.f26487a;
    }

    @PreviewThemes
    private static final void PreviewBanner(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1398977200);
        if (i11 == 0 && sVar.B()) {
            sVar.U();
        } else {
            ThemeKt.UiComposeAndroidTheme(false, ComposableSingletons$WaitTimeBannerKt.INSTANCE.m1007getLambda$1734279268$zendesk_ui_ui_android(), sVar, 48, 1);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(i11, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBanner$lambda$15(int i11, n nVar, int i12) {
        PreviewBanner(nVar, i.F(i11 | 1));
        return Unit.f26487a;
    }

    @PreviewThemes
    private static final void PreviewClearedBanner(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-2080279832);
        if (i11 == 0 && sVar.B()) {
            sVar.U();
        } else {
            ThemeKt.UiComposeAndroidTheme(false, ComposableSingletons$WaitTimeBannerKt.INSTANCE.getLambda$111858460$zendesk_ui_ui_android(), sVar, 48, 1);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(i11, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewClearedBanner$lambda$16(int i11, n nVar, int i12) {
        PreviewClearedBanner(nVar, i.F(i11 | 1));
        return Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: WaitTimeBanner-cgPJBOs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1010WaitTimeBannercgPJBOs(@org.jetbrains.annotations.NotNull final zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerType r28, final long r29, final long r31, final long r33, final long r35, final long r37, final long r39, final boolean r41, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r42, @org.jetbrains.annotations.Nullable b4.t r43, @org.jetbrains.annotations.Nullable m3.n r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 1131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerKt.m1010WaitTimeBannercgPJBOs(zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerType, long, long, long, long, long, long, boolean, kotlin.jvm.functions.Function1, b4.t, m3.n, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WaitTimeBanner_cgPJBOs$lambda$0(WaitTimeBannerType waitTimeBannerType, long j9, long j11, long j12, long j13, long j14, long j15, boolean z11, Function1 function1, t tVar, int i11, int i12, n nVar, int i13) {
        m1010WaitTimeBannercgPJBOs(waitTimeBannerType, j9, j11, j12, j13, j14, j15, z11, function1, tVar, nVar, i.F(i11 | 1), i12);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WaitTimeBanner_cgPJBOs$lambda$2$lambda$1(Function1 function1, z zVar) {
        zVar.getClass();
        function1.invoke(Boolean.valueOf(((b0) zVar).c()));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WaitTimeBanner_cgPJBOs$lambda$4$lambda$3(j5.b0 b0Var) {
        b0Var.getClass();
        j5.z.k(b0Var, 1);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WaitTimeBanner_cgPJBOs$lambda$8$lambda$7$lambda$6$lambda$5(String str, j5.b0 b0Var) {
        b0Var.getClass();
        j5.z.h(str, b0Var);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WaitTimeBanner_cgPJBOs$lambda$9(WaitTimeBannerType waitTimeBannerType, long j9, long j11, long j12, long j13, long j14, long j15, boolean z11, Function1 function1, t tVar, int i11, int i12, n nVar, int i13) {
        m1010WaitTimeBannercgPJBOs(waitTimeBannerType, j9, j11, j12, j13, j14, j15, z11, function1, tVar, nVar, i.F(i11 | 1), i12);
        return Unit.f26487a;
    }

    /* JADX INFO: renamed from: WaitTimeText-M3jwhU8, reason: not valid java name */
    private static final void m1011WaitTimeTextM3jwhU8(final long j9, final String str, final long j11, n nVar, final int i11) {
        int i12;
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.c0(176156886);
        int i13 = 4;
        if ((i11 & 6) == 0) {
            i12 = (sVar2.e(j9) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(str) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.e(j11) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && sVar2.B()) {
            sVar2.U();
            sVar = sVar2;
        } else {
            m5.e eVar = new m5.e();
            m5.d dVar = new m5.d(new n0("image"), eVar.f29525a.length(), 0, i13);
            ArrayList arrayList = eVar.f29526b;
            arrayList.add(dVar);
            eVar.f29527c.add(dVar);
            arrayList.size();
            eVar.c("�");
            eVar.f();
            eVar.c(str);
            m5.h hVarJ = eVar.j();
            Map mapB = w0.b(new Pair("image", new m2.x0(new y(a0.F(ResourceUtilsKt.floatResources(R.dimen.zuia_wait_time_banner_icon_relative_width, sVar2, 0), 4294967296L), a0.F(ResourceUtilsKt.floatResources(R.dimen.zuia_wait_time_banner_icon_relative_height, sVar2, 0), 4294967296L)), u3.e.e(1392451830, sVar2, new i80.n() { // from class: zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerKt$WaitTimeText$inlineContentMap$1
                public final void invoke(String str2, n nVar2, int i14) {
                    str2.getClass();
                    if ((i14 & 17) == 16) {
                        s sVar3 = (s) nVar2;
                        if (sVar3.B()) {
                            sVar3.U();
                            return;
                        }
                    }
                    WaitTimeBannerKt.m1009ClockIconek8zF_U(j9, nVar2, 0);
                }

                @Override // i80.n
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((String) obj, (n) obj2, ((Number) obj3).intValue());
                    return Unit.f26487a;
                }
            }))));
            sVar2.a0(5004770);
            boolean z11 = (i12 & 112) == 32;
            Object objM = sVar2.M();
            if (z11 || objM == m.f29332a) {
                objM = new b(str, 0);
                sVar2.k0(objM);
            }
            sVar2.q(false);
            sVar = sVar2;
            r9.c(hVarJ, r.c(q.f5711a, false, (Function1) objM), j11, 0L, 0L, new k(3), 0L, 0, false, 0, 0, mapB, null, null, sVar, i12 & 896);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: zendesk.ui.android.conversation.waittimebanner.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return WaitTimeBannerKt.WaitTimeText_M3jwhU8$lambda$13(j9, str, j11, i11, (n) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WaitTimeText_M3jwhU8$lambda$12$lambda$11(String str, j5.b0 b0Var) {
        b0Var.getClass();
        j5.z.h(str, b0Var);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WaitTimeText_M3jwhU8$lambda$13(long j9, String str, long j11, int i11, n nVar, int i12) {
        m1011WaitTimeTextM3jwhU8(j9, str, j11, nVar, i.F(i11 | 1));
        return Unit.f26487a;
    }

    private static final String queuedBannerText(long j9, long j11, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.a0(-1769123263);
        String strStringForType = stringForType(WaitTimeQueuedBannerUtil.INSTANCE.getType(j9, j11), sVar, 0);
        sVar.q(false);
        return strStringForType;
    }

    private static final String stringForType(QueuedBannerStatusType queuedBannerStatusType, n nVar, int i11) {
        String strT;
        s sVar = (s) nVar;
        sVar.a0(1984271312);
        if (queuedBannerStatusType instanceof QueuedBannerStatusType.AboutDays) {
            sVar.a0(-80744486);
            strT = f0.T(queuedBannerStatusType.getResId(), new Object[]{Integer.valueOf(((QueuedBannerStatusType.AboutDays) queuedBannerStatusType).getUpperDays())}, sVar);
            sVar.q(false);
        } else if (queuedBannerStatusType instanceof QueuedBannerStatusType.AboutHours) {
            sVar.a0(-80741701);
            strT = f0.T(queuedBannerStatusType.getResId(), new Object[]{Integer.valueOf(((QueuedBannerStatusType.AboutHours) queuedBannerStatusType).getUpperHours())}, sVar);
            sVar.q(false);
        } else if (queuedBannerStatusType instanceof QueuedBannerStatusType.AboutMinute) {
            sVar.a0(-80738857);
            strT = f0.T(queuedBannerStatusType.getResId(), new Object[]{Integer.valueOf(((QueuedBannerStatusType.AboutMinute) queuedBannerStatusType).getMinute())}, sVar);
            sVar.q(false);
        } else if (queuedBannerStatusType instanceof QueuedBannerStatusType.AboutMinutes) {
            sVar.a0(-80736099);
            strT = f0.T(queuedBannerStatusType.getResId(), new Object[]{Integer.valueOf(((QueuedBannerStatusType.AboutMinutes) queuedBannerStatusType).getUpperMinutes())}, sVar);
            sVar.q(false);
        } else if (queuedBannerStatusType instanceof QueuedBannerStatusType.DailyRange) {
            sVar.a0(-80733175);
            int resId = queuedBannerStatusType.getResId();
            QueuedBannerStatusType.DailyRange dailyRange = (QueuedBannerStatusType.DailyRange) queuedBannerStatusType;
            strT = f0.T(resId, new Object[]{Integer.valueOf(dailyRange.getLowerDays()), Integer.valueOf(dailyRange.getUpperDays())}, sVar);
            sVar.q(false);
        } else if (queuedBannerStatusType instanceof QueuedBannerStatusType.HourlyRange) {
            sVar.a0(-80728821);
            int resId2 = queuedBannerStatusType.getResId();
            QueuedBannerStatusType.HourlyRange hourlyRange = (QueuedBannerStatusType.HourlyRange) queuedBannerStatusType;
            strT = f0.T(resId2, new Object[]{Integer.valueOf(hourlyRange.getLowerHours()), Integer.valueOf(hourlyRange.getUpperHours())}, sVar);
            sVar.q(false);
        } else if (queuedBannerStatusType instanceof QueuedBannerStatusType.MinuteRange) {
            sVar.a0(-80724401);
            int resId3 = queuedBannerStatusType.getResId();
            QueuedBannerStatusType.MinuteRange minuteRange = (QueuedBannerStatusType.MinuteRange) queuedBannerStatusType;
            strT = f0.T(resId3, new Object[]{Integer.valueOf(minuteRange.getLowerMinutes()), Integer.valueOf(minuteRange.getUpperMinutes())}, sVar);
            sVar.q(false);
        } else if (queuedBannerStatusType instanceof QueuedBannerStatusType.WithinDays) {
            sVar.a0(-80719942);
            strT = f0.T(queuedBannerStatusType.getResId(), new Object[]{Integer.valueOf(((QueuedBannerStatusType.WithinDays) queuedBannerStatusType).getUpperDays())}, sVar);
            sVar.q(false);
        } else if (queuedBannerStatusType instanceof QueuedBannerStatusType.WithinHours) {
            sVar.a0(-80717125);
            strT = f0.T(queuedBannerStatusType.getResId(), new Object[]{Integer.valueOf(((QueuedBannerStatusType.WithinHours) queuedBannerStatusType).getUpperHours())}, sVar);
            sVar.q(false);
        } else if (queuedBannerStatusType instanceof QueuedBannerStatusType.WithinMinute) {
            sVar.a0(-80714249);
            strT = f0.T(queuedBannerStatusType.getResId(), new Object[]{Integer.valueOf(((QueuedBannerStatusType.WithinMinute) queuedBannerStatusType).getMinute())}, sVar);
            sVar.q(false);
        } else {
            if (!(queuedBannerStatusType instanceof QueuedBannerStatusType.WithinMinutes)) {
                throw e0.f.v(sVar, -80745216, false);
            }
            sVar.a0(-80711459);
            strT = f0.T(queuedBannerStatusType.getResId(), new Object[]{Integer.valueOf(((QueuedBannerStatusType.WithinMinutes) queuedBannerStatusType).getUpperMinutes())}, sVar);
            sVar.q(false);
        }
        sVar.q(false);
        return strT;
    }

    public static /* synthetic */ void getZUIWaitTimeBannerTag$annotations() {
    }
}
