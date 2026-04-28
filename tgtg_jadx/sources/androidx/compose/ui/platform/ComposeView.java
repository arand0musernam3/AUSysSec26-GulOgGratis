package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import b4.p;
import c5.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.i;
import m3.k1;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f2254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2255j;

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(420213850);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Function2 function2 = (Function2) this.f2254i.getValue();
            if (function2 == null) {
                sVar.a0(-1238823553);
            } else {
                sVar.a0(98585282);
                function2.invoke(sVar, 0);
            }
            sVar.q(false);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p(this, i11, 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // c5.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2255j;
    }

    public final void setContent(@NotNull Function2<? super n, ? super Integer, Unit> function2) {
        this.f2255j = true;
        this.f2254i.setValue(function2);
        if (isAttachedToWindow()) {
            c();
        }
    }

    public ComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2254i = i.w(null);
    }

    public ComposeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
