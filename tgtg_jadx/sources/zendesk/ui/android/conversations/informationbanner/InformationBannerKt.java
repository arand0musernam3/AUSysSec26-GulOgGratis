package zendesk.ui.android.conversations.informationbanner;

import b4.t;
import kotlin.Metadata;
import kotlin.Unit;
import m3.i;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.i18n.TextBundle;
import zendesk.ui.android.compose.theme.ThemeKt;
import zendesk.ui.android.compose.utils.PreviewThemes;
import zendesk.ui.android.conversation.waittimebanner.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a)\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", TextBundle.TEXT_ENTRY, "Li4/v;", "textColor", "Lb4/t;", "modifier", "", "InformationBanner-3IgeMak", "(Ljava/lang/String;JLb4/t;Lm3/n;II)V", "InformationBanner", "InformationBannerPreview", "(Lm3/n;I)V", "zendesk.ui_ui-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class InformationBannerKt {
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: InformationBanner-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1017InformationBanner3IgeMak(@org.jetbrains.annotations.NotNull java.lang.String r13, long r14, @org.jetbrains.annotations.Nullable b4.t r16, @org.jetbrains.annotations.Nullable m3.n r17, int r18, int r19) {
        /*
            r5 = r18
            r13.getClass()
            r10 = r17
            m3.s r10 = (m3.s) r10
            r0 = 1599794004(0x5f5aeb54, float:1.5774794E19)
            r10.c0(r0)
            r0 = r19 & 1
            if (r0 == 0) goto L16
            r0 = r5 | 6
            goto L26
        L16:
            r0 = r5 & 6
            if (r0 != 0) goto L25
            boolean r0 = r10.f(r13)
            if (r0 == 0) goto L22
            r0 = 4
            goto L23
        L22:
            r0 = 2
        L23:
            r0 = r0 | r5
            goto L26
        L25:
            r0 = r5
        L26:
            r1 = r19 & 2
            if (r1 == 0) goto L2d
            r0 = r0 | 48
            goto L3d
        L2d:
            r1 = r5 & 48
            if (r1 != 0) goto L3d
            boolean r1 = r10.e(r14)
            if (r1 == 0) goto L3a
            r1 = 32
            goto L3c
        L3a:
            r1 = 16
        L3c:
            r0 = r0 | r1
        L3d:
            r1 = r19 & 4
            if (r1 == 0) goto L46
            r0 = r0 | 384(0x180, float:5.38E-43)
        L43:
            r2 = r16
            goto L58
        L46:
            r2 = r5 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L43
            r2 = r16
            boolean r3 = r10.f(r2)
            if (r3 == 0) goto L55
            r3 = 256(0x100, float:3.59E-43)
            goto L57
        L55:
            r3 = 128(0x80, float:1.8E-43)
        L57:
            r0 = r0 | r3
        L58:
            r3 = r0 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L6a
            boolean r3 = r10.B()
            if (r3 != 0) goto L65
            goto L6a
        L65:
            r10.U()
            r4 = r2
            goto L7a
        L6a:
            if (r1 == 0) goto L70
            b4.q r1 = b4.q.f5711a
            r9 = r1
            goto L71
        L70:
            r9 = r2
        L71:
            r11 = r0 & 1022(0x3fe, float:1.432E-42)
            r12 = 0
            r6 = r13
            r7 = r14
            zendesk.ui.android.common.noticemessage.NoticeMessageKt.m1003NoticeMessage3IgeMak(r6, r7, r9, r10, r11, r12)
            r4 = r9
        L7a:
            m3.w1 r8 = r10.s()
            if (r8 == 0) goto L8c
            zendesk.ui.android.common.noticemessage.a r0 = new zendesk.ui.android.common.noticemessage.a
            r7 = 2
            r1 = r13
            r2 = r14
            r6 = r19
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r8.f29476d = r0
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.ui.android.conversations.informationbanner.InformationBannerKt.m1017InformationBanner3IgeMak(java.lang.String, long, b4.t, m3.n, int, int):void");
    }

    @PreviewThemes
    private static final void InformationBannerPreview(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1046827103);
        if (i11 == 0 && sVar.B()) {
            sVar.U();
        } else {
            ThemeKt.UiComposeAndroidTheme(false, ComposableSingletons$InformationBannerKt.INSTANCE.getLambda$1500178157$zendesk_ui_ui_android(), sVar, 48, 1);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(i11, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InformationBannerPreview$lambda$1(int i11, n nVar, int i12) {
        InformationBannerPreview(nVar, i.F(i11 | 1));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InformationBanner_3IgeMak$lambda$0(String str, long j9, t tVar, int i11, int i12, n nVar, int i13) {
        m1017InformationBanner3IgeMak(str, j9, tVar, nVar, i.F(i11 | 1), i12);
        return Unit.f26487a;
    }
}
