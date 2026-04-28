package com.tgtg.componentlibrary.component.spinner;

import c60.c;
import com.braze.Constants;
import com.tgtg.componentlibrary.component.spinner.model.SpinnerSize;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/tgtg/componentlibrary/component/spinner/PantrySpinnerDoc;", "", "<init>", "()V", "", "PantrySpinner", "(Lm3/n;I)V", "Lcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;", "getSize", "()Lcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;", "getSize$annotations", "size", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PantrySpinnerDoc {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final SpinnerSize size = (SpinnerSize) ((Pair) y.x(new Pair[]{new Pair("Small", SpinnerSize.Small), new Pair("Medium", SpinnerSize.Medium), new Pair("Large", SpinnerSize.Large)})).f26486b;

    public final void PantrySpinner(@Nullable n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-1052815908);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            PantrySpinnerKt.m939PantrySpinneriJQMabo(this.size, 0L, sVar, 0, 2);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(this, i11, 25);
        }
    }

    @NotNull
    public final SpinnerSize getSize() {
        return this.size;
    }

    public static /* synthetic */ void getSize$annotations() {
    }
}
