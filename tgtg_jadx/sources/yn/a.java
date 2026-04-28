package yn;

import com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoBorderKt;
import com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoColorKt;
import com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoRadiusKt;
import com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoShadowKt;
import com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoSizeKt;
import com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoSpacingKt;
import com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoTypographyKt;
import com.tgtg.componentlibrary.theme.demo.DemoBorderKt;
import com.tgtg.componentlibrary.theme.demo.DemoColorKt;
import com.tgtg.componentlibrary.theme.demo.DemoRadiusKt;
import com.tgtg.componentlibrary.theme.demo.DemoShadowKt;
import com.tgtg.componentlibrary.theme.demo.DemoSizeKt;
import com.tgtg.componentlibrary.theme.demo.DemoSpacingKt;
import com.tgtg.componentlibrary.theme.demo.DemoTypographyKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.jetbrains.annotations.NotNull;
import u3.d;
import yn.a;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenRendering;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogListenersKt;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.ui.android.conversation.actionbutton.ActionButtonRendering;
import zendesk.ui.android.conversation.form.DisplayedField;
import zendesk.ui.android.conversation.form.FormRendering;
import zendesk.ui.android.conversation.imagecell.ImageCellRendering;
import zendesk.ui.android.conversation.textcell.TextCellRendering;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46274a;

    public /* synthetic */ a(int i11) {
        this.f46274a = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f46274a) {
            case 0:
                ((Integer) obj2).getClass();
                f0.l((m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 1:
                ((Integer) obj2).getClass();
                f0.c((m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 2:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ComposableSingletons$DemoBorderKt composableSingletons$DemoBorderKt = new Object() { // from class: com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoBorderKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13351a = new d(new a(2), false, 2025352418);

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$2025352418$app_release() {
                        return f13351a;
                    }
                };
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    DemoBorderKt.DemoBorder(sVar, 0);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 3:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoColorKt composableSingletons$DemoColorKt = new Object() { // from class: com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoColorKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13352a = new d(new a(3), false, -2044829869);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f13353b = new d(new a(4), false, 2071432419);

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-2044829869$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m954getLambda$2044829869$app_release() {
                        return f13352a;
                    }

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$2071432419$app_release() {
                        return f13353b;
                    }
                };
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    DemoColorKt.DemoColor(sVar2, 0);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            case 4:
                m3.n nVar3 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoColorKt composableSingletons$DemoColorKt2 = new Object() { // from class: com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoColorKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13352a = new d(new a(3), false, -2044829869);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f13353b = new d(new a(4), false, 2071432419);

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-2044829869$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m954getLambda$2044829869$app_release() {
                        return f13352a;
                    }

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$2071432419$app_release() {
                        return f13353b;
                    }
                };
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    DemoColorKt.DemoColor(sVar3, 0);
                } else {
                    sVar3.U();
                }
                return Unit.f26487a;
            case 5:
                m3.n nVar4 = (m3.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoRadiusKt composableSingletons$DemoRadiusKt = new Object() { // from class: com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoRadiusKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13354a = new d(new a(5), false, 683481506);

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$683481506$app_release() {
                        return f13354a;
                    }
                };
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    DemoRadiusKt.DemoRadius(sVar4, 0);
                } else {
                    sVar4.U();
                }
                return Unit.f26487a;
            case 6:
                m3.n nVar5 = (m3.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoShadowKt composableSingletons$DemoShadowKt = new Object() { // from class: com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoShadowKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13355a = new d(new a(6), false, 1848220072);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f13356b = new d(new a(7), false, 740744440);

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$1848220072$app_release() {
                        return f13355a;
                    }

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$740744440$app_release() {
                        return f13356b;
                    }
                };
                m3.s sVar5 = (m3.s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    DemoShadowKt.DemoShadow(sVar5, 0);
                } else {
                    sVar5.U();
                }
                return Unit.f26487a;
            case 7:
                m3.n nVar6 = (m3.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoShadowKt composableSingletons$DemoShadowKt2 = new Object() { // from class: com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoShadowKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13355a = new d(new a(6), false, 1848220072);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f13356b = new d(new a(7), false, 740744440);

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$1848220072$app_release() {
                        return f13355a;
                    }

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$740744440$app_release() {
                        return f13356b;
                    }
                };
                m3.s sVar6 = (m3.s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    DemoShadowKt.DemoShadow(sVar6, 0);
                } else {
                    sVar6.U();
                }
                return Unit.f26487a;
            case 8:
                m3.n nVar7 = (m3.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoSizeKt composableSingletons$DemoSizeKt = new Object() { // from class: com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoSizeKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13357a = new d(new a(8), false, 1648658562);

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$1648658562$app_release() {
                        return f13357a;
                    }
                };
                m3.s sVar7 = (m3.s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    DemoSizeKt.DemoSize(sVar7, 0);
                } else {
                    sVar7.U();
                }
                return Unit.f26487a;
            case 9:
                m3.n nVar8 = (m3.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoSpacingKt composableSingletons$DemoSpacingKt = new Object() { // from class: com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoSpacingKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13358a = new d(new a(9), false, -1734479146);

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-1734479146$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m955getLambda$1734479146$app_release() {
                        return f13358a;
                    }
                };
                m3.s sVar8 = (m3.s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    DemoSpacingKt.DemoSpacing(sVar8, 0);
                } else {
                    sVar8.U();
                }
                return Unit.f26487a;
            case 10:
                m3.n nVar9 = (m3.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoTypographyKt composableSingletons$DemoTypographyKt = new Object() { // from class: com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoTypographyKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13359a = new d(new a(10), false, -140152100);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f13360b = new d(new a(11), false, -677034317);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public static final d f13361c = new d(new a(12), false, 1042678107);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public static final d f13362d = new d(new a(13), false, -689536535);

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-140152100$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m956getLambda$140152100$app_release() {
                        return f13359a;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-677034317$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m957getLambda$677034317$app_release() {
                        return f13360b;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-689536535$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m958getLambda$689536535$app_release() {
                        return f13362d;
                    }

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$1042678107$app_release() {
                        return f13361c;
                    }
                };
                m3.s sVar9 = (m3.s) nVar9;
                if (sVar9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    DemoTypographyKt.DemoTypography(sVar9, 0);
                } else {
                    sVar9.U();
                }
                return Unit.f26487a;
            case 11:
                m3.n nVar10 = (m3.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoTypographyKt composableSingletons$DemoTypographyKt2 = new Object() { // from class: com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoTypographyKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13359a = new d(new a(10), false, -140152100);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f13360b = new d(new a(11), false, -677034317);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public static final d f13361c = new d(new a(12), false, 1042678107);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public static final d f13362d = new d(new a(13), false, -689536535);

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-140152100$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m956getLambda$140152100$app_release() {
                        return f13359a;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-677034317$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m957getLambda$677034317$app_release() {
                        return f13360b;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-689536535$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m958getLambda$689536535$app_release() {
                        return f13362d;
                    }

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$1042678107$app_release() {
                        return f13361c;
                    }
                };
                m3.s sVar10 = (m3.s) nVar10;
                if (sVar10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    DemoTypographyKt.DemoTypography(sVar10, 0);
                } else {
                    sVar10.U();
                }
                return Unit.f26487a;
            case 12:
                m3.n nVar11 = (m3.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoTypographyKt composableSingletons$DemoTypographyKt3 = new Object() { // from class: com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoTypographyKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13359a = new d(new a(10), false, -140152100);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f13360b = new d(new a(11), false, -677034317);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public static final d f13361c = new d(new a(12), false, 1042678107);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public static final d f13362d = new d(new a(13), false, -689536535);

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-140152100$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m956getLambda$140152100$app_release() {
                        return f13359a;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-677034317$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m957getLambda$677034317$app_release() {
                        return f13360b;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-689536535$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m958getLambda$689536535$app_release() {
                        return f13362d;
                    }

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$1042678107$app_release() {
                        return f13361c;
                    }
                };
                m3.s sVar11 = (m3.s) nVar11;
                if (sVar11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    DemoTypographyKt.DemoTypography(sVar11, 0);
                } else {
                    sVar11.U();
                }
                return Unit.f26487a;
            case 13:
                m3.n nVar12 = (m3.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoTypographyKt composableSingletons$DemoTypographyKt4 = new Object() { // from class: com.tgtg.componentlibrary.theme.demo.ComposableSingletons$DemoTypographyKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13359a = new d(new a(10), false, -140152100);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f13360b = new d(new a(11), false, -677034317);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public static final d f13361c = new d(new a(12), false, 1042678107);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public static final d f13362d = new d(new a(13), false, -689536535);

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-140152100$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m956getLambda$140152100$app_release() {
                        return f13359a;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-677034317$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m957getLambda$677034317$app_release() {
                        return f13360b;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-689536535$app_release, reason: not valid java name */
                    public final Function2<n, Integer, Unit> m958getLambda$689536535$app_release() {
                        return f13362d;
                    }

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$1042678107$app_release() {
                        return f13361c;
                    }
                };
                m3.s sVar12 = (m3.s) nVar12;
                if (sVar12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    DemoTypographyKt.DemoTypography(sVar12, 0);
                } else {
                    sVar12.U();
                }
                return Unit.f26487a;
            case 14:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ConversationScreenCoordinator.onLoadMoreMessages$lambda$27((ConversationScreenViewModel) obj, (String) obj2);
            case 16:
                return ConversationScreenCoordinator.onReplyActionSelectedProvider$lambda$5((ConversationScreenViewModel) obj, (String) obj2);
            case 17:
                return ConversationScreenCoordinator.onFailedMessageClicked$lambda$8((ConversationScreenViewModel) obj, (String) obj2);
            case 18:
                return ConversationScreenCoordinator.onFormCompletedProvider$lambda$13((ConversationScreenViewModel) obj, (String) obj2);
            case 19:
                return ConversationScreenCoordinator.onComposerTextChanged$lambda$18((ConversationScreenViewModel) obj, (String) obj2);
            case 20:
                return ConversationScreenRendering.Builder.onFormDisplayedFieldsChanged$lambda$8((DisplayedField) obj, (String) obj2);
            case 21:
                return MessageLogListenersKt.NOOP_ON_FORM_COMPLETED$lambda$2((List) obj, (MessageLogEntry.FormMessageContainer) obj2);
            case 22:
                return MessageLogListenersKt.NOOP_ON_SEND_POSTBACK_MESSAGE$lambda$4((String) obj, (String) obj2);
            case 23:
                return MessageLogListenersKt.NOOP_ON_FORM_DISPLAYED_FIELDS_CHANGED$lambda$8((DisplayedField) obj, (String) obj2);
            case 24:
                return ActionButtonRendering.Builder.onPostbackButtonClicked$lambda$2((String) obj, (String) obj2);
            case 25:
                return FormRendering._init_$lambda$3((DisplayedField) obj, (String) obj2);
            case 26:
                return ImageCellRendering.Builder.onPostbackButtonClicked$lambda$1((String) obj, (String) obj2);
            case 27:
                return TextCellRendering.Builder.onPostbackButtonClicked$lambda$2((String) obj, (String) obj2);
            default:
                m3.n nVar13 = (m3.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                m3.s sVar13 = (m3.s) nVar13;
                if (!sVar13.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    sVar13.U();
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ a(int i11, int i12) {
        this.f46274a = i12;
    }
}
