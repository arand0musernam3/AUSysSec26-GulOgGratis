package zendesk.ui.android.compose.theme;

import g3.p0;
import g3.r0;
import i4.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l3.p;
import l3.q;
import m3.d3;
import m3.i;
import m3.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"", "useDarkTheme", "Lkotlin/Function0;", "", "content", "UiComposeAndroidTheme", "(ZLkotlin/jvm/functions/Function2;Lm3/n;II)V", "Lg3/p0;", "LightColors", "Lg3/p0;", "DarkColors", "zendesk.ui_ui-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ThemeKt {

    @NotNull
    private static final p0 DarkColors;

    @NotNull
    private static final p0 LightColors;

    static {
        long j9 = v.f23310c;
        long j11 = v.f23309b;
        d3 d3Var = r0.f19375a;
        long j12 = q.f27123z;
        LightColors = r0.f(j12, q.f27108j, q.A, q.f27109k, q.f27103e, q.E, q.f27111n, q.F, q.f27112o, q.R, q.f27117t, q.S, q.f27118u, j9, j11, q.I, q.f27115r, q.Q, q.f27116s, j12, q.f27104f, q.f27102d, q.f27100b, q.f27106h, q.f27101c, q.f27107i, q.f27121x, q.f27122y, q.D, q.J, q.K, q.L, q.M, q.N, q.O, q.P, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520);
        long j13 = p.f27092z;
        DarkColors = r0.c(j13, p.f27077j, p.A, p.f27078k, p.f27072e, p.E, p.f27080n, p.F, p.f27081o, p.R, p.f27086t, p.S, p.f27087u, j11, j9, p.I, p.f27084r, p.Q, p.f27085s, j13, p.f27073f, p.f27071d, p.f27069b, p.f27075h, p.f27070c, p.f27076i, p.f27090x, p.f27091y, p.D, p.J, p.K, p.L, p.M, p.N, p.O, p.P, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void UiComposeAndroidTheme(boolean r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r12, @org.jetbrains.annotations.Nullable m3.n r13, int r14, int r15) {
        /*
            r12.getClass()
            r4 = r13
            m3.s r4 = (m3.s) r4
            r0 = -376244190(0xffffffffe992f822, float:-2.2209368E25)
            r4.c0(r0)
            r0 = r14 & 6
            if (r0 != 0) goto L1f
            r0 = r15 & 1
            if (r0 != 0) goto L1c
            boolean r1 = r4.g(r11)
            if (r1 == 0) goto L1c
            r1 = 4
            goto L1d
        L1c:
            r1 = 2
        L1d:
            r1 = r1 | r14
            goto L20
        L1f:
            r1 = r14
        L20:
            r2 = r15 & 2
            if (r2 == 0) goto L27
            r1 = r1 | 48
            goto L37
        L27:
            r2 = r14 & 48
            if (r2 != 0) goto L37
            boolean r2 = r4.h(r12)
            if (r2 == 0) goto L34
            r2 = 32
            goto L36
        L34:
            r2 = 16
        L36:
            r1 = r1 | r2
        L37:
            r2 = r1 & 19
            r5 = 18
            if (r2 != r5) goto L49
            boolean r2 = r4.B()
            if (r2 != 0) goto L44
            goto L49
        L44:
            r4.U()
            r6 = r11
            goto L83
        L49:
            r4.W()
            r2 = r14 & 1
            if (r2 == 0) goto L62
            boolean r2 = r4.z()
            if (r2 == 0) goto L57
            goto L62
        L57:
            r4.U()
            r2 = r15 & 1
            if (r2 == 0) goto L60
            r1 = r1 & (-15)
        L60:
            r7 = r11
            goto L6d
        L62:
            r2 = r15 & 1
            if (r2 == 0) goto L60
            boolean r0 = v1.n.p(r4)
            r1 = r1 & (-15)
            r7 = r0
        L6d:
            r4.r()
            if (r7 != 0) goto L75
            g3.p0 r0 = zendesk.ui.android.compose.theme.ThemeKt.LightColors
            goto L77
        L75:
            g3.p0 r0 = zendesk.ui.android.compose.theme.ThemeKt.DarkColors
        L77:
            int r1 = r1 << 6
            r5 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = 6
            r1 = 0
            r2 = 0
            r3 = r12
            g3.t2.b(r0, r1, r2, r3, r4, r5, r6)
            r6 = r7
        L83:
            m3.w1 r0 = r4.s()
            if (r0 == 0) goto L94
            e.d r5 = new e.d
            r10 = 1
            r7 = r12
            r8 = r14
            r9 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            r0.f29476d = r5
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.ui.android.compose.theme.ThemeKt.UiComposeAndroidTheme(boolean, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UiComposeAndroidTheme$lambda$0(boolean z11, Function2 function2, int i11, int i12, n nVar, int i13) {
        UiComposeAndroidTheme(z11, function2, nVar, i.F(i11 | 1), i12);
        return Unit.f26487a;
    }
}
